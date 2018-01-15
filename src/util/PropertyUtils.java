package util;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtils {
    static String fileName = "./db.properties";
    static Properties propertie = null;

    static String dbDriver;
    static String dbUrl;
    static String dbUserName;
    static String dbPassword;

    static {
        try {
            propertie = new Properties();
            InputStream is = PropertyUtils.class.getResourceAsStream(fileName);
            propertie.load(is);
            dbDriver = propertie.getProperty("dbDriver");
            dbUrl = propertie.getProperty("dbUrl");
            dbUserName = propertie.getProperty("dbUserName");
            dbPassword = propertie.getProperty("dbPassword");
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getDbDriver() {
        return dbDriver;
    }

    public static void setDbDriver(String dbDriver) {
        PropertyUtils.dbDriver = dbDriver;
    }

    public static String getDbUrl() {
        return dbUrl;
    }

    public static void setDbUrl(String dbUrl) {
        PropertyUtils.dbUrl = dbUrl;
    }

    public static String getDbUserName() {
        return dbUserName;
    }

    public static void setDbUserName(String dbUserName) {
        PropertyUtils.dbUserName = dbUserName;
    }

    public static String getDbPassword() {
        return dbPassword;
    }

    public static void setDbPassword(String dbPassword) {
        PropertyUtils.dbPassword = dbPassword;
    }

}

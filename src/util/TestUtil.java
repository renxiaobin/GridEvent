package util;

import eo.*;

import java.util.List;

public class TestUtil {
    public static void main(String[] args) {
        DaoUtils daoUtils = new DaoUtils();
        //daoUtils.update("insert into and_rule values (2,1,1) ");
        List<AndRule> alist = daoUtils.getForList(AndRule.class,"select * from and_rule");
        System.out.println("args = [" + alist.size() + "]");

        //daoUtils.update("insert into or_rule values (1,1,1,1,1,1,'1') ");
        List<OrRule> olist = daoUtils.getForList(OrRule.class,"select * from or_rule");
        System.out.println("args = [" + olist.size() + "]");

        long count = daoUtils.getForValue("select count(*) from `signal`");
        System.out.println(count);
        List<Signal> slist = daoUtils.getForList(Signal.class,"select * from `signal`");
        System.out.println(slist.size());

        List<Menu> mlist = daoUtils.getForList(Menu.class,"select * from event_menu_info");
        System.out.println(mlist.size());

        List<SignalEvent> selist = daoUtils.getForList(SignalEvent.class,"select * from event_history_data");
        System.out.println(selist.size());

        List<Event> elist = daoUtils.getForList(Event.class,"select * from event");
        System.out.println(elist.size());
    }
}

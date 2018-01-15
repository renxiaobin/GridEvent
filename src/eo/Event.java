package eo;

/**
*事件类
*@author toti
*@time 2017-11-5 11:55:36
*
*/ 
 
public class Event {
	int eid;
	int interval;
	int voltage;
	int equipment;
	int infomation;
	int type;
	int rank;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	public int getEquipment() {
		return equipment;
	}
	public void setEquipment(int equipment) {
		this.equipment = equipment;
	}
	public int getInfomation() {
		return infomation;
	}
	public void setInfomation(int infomation) {
		this.infomation = infomation;
	}

}

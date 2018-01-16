package rule;

import eo.AndRule;
import eo.Event;
import eo.OrRule;
import eo.HistoryData;
import util.DaoUtils;

import java.util.List;

public class RuleOptimizer {
    DaoUtils daoUtils;
    public RuleOptimizer(){
        daoUtils = new DaoUtils();
    }

    public List<HistoryData> getSignalEventList(){

        List<HistoryData> list = daoUtils.getForList(HistoryData.class,"select * from history_data order by id desc limit 100");
        System.out.println(list.size());
        return list;
    }

    public Event getEvent(int eid){
        List<Event> list = daoUtils.getForList(Event.class,"select * from event where eid="+eid);
        System.out.println(list.size());
        return list.get(0);
    }

    public List<AndRule> getAndRuleByEid(int eid){
        List<AndRule> list = daoUtils.getForList(AndRule.class,"select * from and_rule where eid="+eid);
        System.out.println(list.size());
        return list;
    }

    public List<OrRule> getOrRuleByEid(int eid){
        List<OrRule> list = daoUtils.getForList(OrRule.class,"select * from or_rule where eid="+eid);
        System.out.println(list.size());
        return list;
    }
    public void dealSeList(){

    }
    public void optimizeRule(Event event,int eid){

    }
}

package rule;

public class TestRule {
    public static void main(String[] args) {
        RuleOptimizer ro = new RuleOptimizer();
        ro.getSignalEventList();
        ro.getEvent(1);
        ro.getAndRuleByEid(1);
        ro.getOrRuleByEid(1);
    }
}

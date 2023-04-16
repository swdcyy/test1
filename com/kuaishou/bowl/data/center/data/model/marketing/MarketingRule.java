package com.kuaishou.bowl.data.center.data.model.marketing.MarketingRule;
import java.io.Serializable;
import gv.k;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.bowl.data.center.data.model.RuleMatcherInfo;

public class MarketingRule implements Serializable, k	// class@0011e2
{
    public RuleEventModel ruleEventInfo;
    public String ruleId;
    public RuleMatcherInfo ruleMatcherInfo;
    public String ruleSource;
    public String token;
    public static final long serialVersionUID = 0x97c68af367449c7c;

    public void MarketingRule(){
       super();
    }
    public String getId(){
       return this.ruleId;
    }
    public RuleMatcherInfo getRuleMatcherModel(){
       return this.ruleMatcherInfo;
    }
    public String getToken(){
       return this.token;
    }
    public String getVersion(){
       return "";
    }
}

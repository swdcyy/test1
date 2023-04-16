package com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$RuleEventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsCalendarParams$RuleEventType extends Enum	// class@0015bf
{
    public static final JsCalendarParams$RuleEventType[] $VALUES;
    public static final JsCalendarParams$RuleEventType WEEK;
    public static final JsCalendarParams$RuleEventType WEEKEND;
    public static final JsCalendarParams$RuleEventType WORKING_DAY;

    static {
       JsCalendarParams$RuleEventType ruleEventTyp = new JsCalendarParams$RuleEventType("WEEK", 0);
       JsCalendarParams$RuleEventType.WEEK = ruleEventTyp;
       JsCalendarParams$RuleEventType ruleEventTyp1 = new JsCalendarParams$RuleEventType("WORKING_DAY", 1);
       JsCalendarParams$RuleEventType.WORKING_DAY = ruleEventTyp1;
       JsCalendarParams$RuleEventType ruleEventTyp2 = new JsCalendarParams$RuleEventType("WEEKEND", 2);
       JsCalendarParams$RuleEventType.WEEKEND = ruleEventTyp2;
       JsCalendarParams$RuleEventType[] ruleEventTyp3 = new JsCalendarParams$RuleEventType[]{ruleEventTyp,ruleEventTyp1,ruleEventTyp2};
       JsCalendarParams$RuleEventType.$VALUES = ruleEventTyp3;
    }
    public void JsCalendarParams$RuleEventType(String p0,int p1){
       super(p0, p1);
    }
    public static JsCalendarParams$RuleEventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsCalendarParams$RuleEventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsCalendarParams$RuleEventType.class, p0);
    }
    public static JsCalendarParams$RuleEventType[] values(){
       Object obj = PatchProxy.apply(null, null, JsCalendarParams$RuleEventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsCalendarParams$RuleEventType.$VALUES.clone();
    }
}

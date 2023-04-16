package com.kwai.framework.krn.bridges.model.calendar.a$a;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$RuleEventType;
import java.lang.Enum;

public class a$a	// class@0015c2
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsCalendarParams$RuleEventType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[JsCalendarParams$RuleEventType.WORKING_DAY.ordinal()] = 1;
          try{
             a$a.a[JsCalendarParams$RuleEventType.WEEKEND.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

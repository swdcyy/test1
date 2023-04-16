package com.kwai.framework.krn.bridges.basic.KsRCTBridge$b;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$EventType;
import java.lang.Enum;

public class KsRCTBridge$b	// class@0015a8
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsCalendarParams$EventType.values().length];
       try{
          KsRCTBridge$b.a = ointArray;
          ointArray[JsCalendarParams$EventType.ADD.ordinal()] = 1;
          try{
             KsRCTBridge$b.a[JsCalendarParams$EventType.SEARCH.ordinal()] = 2;
             try{
                KsRCTBridge$b.a[JsCalendarParams$EventType.DELETE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

package com.yxcorp.gifshow.homepage.functions.e$e;
import com.kwai.feature.api.feed.misc.bridge.JsCalendarParams$EventType;
import java.lang.Enum;

public class e$e	// class@0016dc
{
    public static final int[] a;

    static {
       int[] ointArray = new int[JsCalendarParams$EventType.values().length];
       try{
          e$e.a = ointArray;
          ointArray[JsCalendarParams$EventType.ADD.ordinal()] = 1;
          try{
             e$e.a[JsCalendarParams$EventType.SEARCH.ordinal()] = 2;
             try{
                e$e.a[JsCalendarParams$EventType.DELETE.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

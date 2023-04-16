package com.yxcorp.gifshow.relation.inapp.b$a;
import com.kwai.library.push.model.InAppEvent$Event;
import java.lang.Enum;

public class b$a	// class@0018d7
{
    public static final int[] a;

    static {
       int[] ointArray = new int[InAppEvent$Event.values().length];
       try{
          b$a.a = ointArray;
          ointArray[InAppEvent$Event.SHOW_NOTICE.ordinal()] = 1;
          try{
             b$a.a[InAppEvent$Event.CLICK_NOTICE.ordinal()] = 2;
             try{
                b$a.a[InAppEvent$Event.CLICK_BTN.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

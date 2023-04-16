package com.yxcorp.gifshow.page.cost.list.g$b;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle$Event;
import java.lang.Enum;

public class g$b	// class@000e2e
{
    public static final int[] a;

    static {
       int[] ointArray = new int[ListReqLifecycle$Event.values().length];
       try{
          g$b.a = ointArray;
          ointArray[ListReqLifecycle$Event.START_REQ.ordinal()] = 1;
          try{
             g$b.a[ListReqLifecycle$Event.END_REQ.ordinal()] = 2;
             try{
                g$b.a[ListReqLifecycle$Event.DATA_INITED.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

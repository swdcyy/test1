package com.kuaishou.bizmonitor.framework.funnel.a$a;
import com.kuaishou.bizmonitor.framework.funnel.FunnelLifecycle;
import java.lang.Enum;

public class a$a	// class@001144
{
    public static final int[] a;

    static {
       int[] ointArray = new int[FunnelLifecycle.values().length];
       try{
          a$a.a = ointArray;
          ointArray[FunnelLifecycle.AutoEnd.ordinal()] = 1;
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

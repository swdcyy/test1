package com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$a;
import com.kwai.nearby.local.trace.NearbyZeroPlayTraceHelper$Stage;
import java.lang.Enum;

public class NearbyZeroPlayTraceHelper$a	// class@000fff
{
    public static final int[] a;

    static {
       int[] ointArray = new int[NearbyZeroPlayTraceHelper$Stage.values().length];
       try{
          NearbyZeroPlayTraceHelper$a.a = ointArray;
          ointArray[NearbyZeroPlayTraceHelper$Stage.ENTER.ordinal()] = 1;
          try{
             NearbyZeroPlayTraceHelper$a.a[NearbyZeroPlayTraceHelper$Stage.DATA_INIT.ordinal()] = 2;
             try{
                NearbyZeroPlayTraceHelper$a.a[NearbyZeroPlayTraceHelper$Stage.USER_INTERACT.ordinal()] = 3;
                try{
                   NearbyZeroPlayTraceHelper$a.a[NearbyZeroPlayTraceHelper$Stage.CLICK.ordinal()] = 4;
                   try{
                      NearbyZeroPlayTraceHelper$a.a[NearbyZeroPlayTraceHelper$Stage.PLAY.ordinal()] = 5;
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

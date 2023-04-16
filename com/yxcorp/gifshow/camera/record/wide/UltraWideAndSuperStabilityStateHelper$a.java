package com.yxcorp.gifshow.camera.record.wide.UltraWideAndSuperStabilityStateHelper$a;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.Enum;

public class UltraWideAndSuperStabilityStateHelper$a	// class@000fa6
{
    public static final int[] a;

    static {
       int[] ointArray = new int[StabilityType.values().length];
       try{
          UltraWideAndSuperStabilityStateHelper$a.a = ointArray;
          ointArray[StabilityType.DISABLED.ordinal()] = 1;
          try{
             UltraWideAndSuperStabilityStateHelper$a.a[StabilityType.OFF.ordinal()] = 2;
             try{
                UltraWideAndSuperStabilityStateHelper$a.a[StabilityType.SUPER.ordinal()] = 3;
                try{
                   UltraWideAndSuperStabilityStateHelper$a.a[StabilityType.SUPER_PRO.ordinal()] = 4;
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

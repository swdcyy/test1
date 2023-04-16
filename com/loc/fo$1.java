package com.loc.fo$1;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.Enum;

public final class fo$1	// class@001434
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AMapLocationClientOption$AMapLocationMode.values().length];
       try{
          fo$1.a = ointArray;
          ointArray[AMapLocationClientOption$AMapLocationMode.Battery_Saving.ordinal()] = 1;
          try{
             fo$1.a[AMapLocationClientOption$AMapLocationMode.Device_Sensors.ordinal()] = 2;
             try{
                fo$1.a[AMapLocationClientOption$AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

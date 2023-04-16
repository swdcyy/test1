package com.loc.d$3;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.Enum;

public final class d$3	// class@0013d5
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AMapLocationClientOption$AMapLocationMode.values().length];
       try{
          d$3.a = ointArray;
          ointArray[AMapLocationClientOption$AMapLocationMode.Battery_Saving.ordinal()] = 1;
          try{
             d$3.a[AMapLocationClientOption$AMapLocationMode.Device_Sensors.ordinal()] = 2;
             try{
                d$3.a[AMapLocationClientOption$AMapLocationMode.Hight_Accuracy.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

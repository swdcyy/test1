package com.amap.api.location.AMapLocationClientOption$2;
import com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose;
import java.lang.Enum;

public final class AMapLocationClientOption$2	// class@000eca
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AMapLocationClientOption$AMapLocationPurpose.values().length];
       try{
          AMapLocationClientOption$2.a = ointArray;
          ointArray[AMapLocationClientOption$AMapLocationPurpose.SignIn.ordinal()] = 1;
          try{
             AMapLocationClientOption$2.a[AMapLocationClientOption$AMapLocationPurpose.Transport.ordinal()] = 2;
             try{
                AMapLocationClientOption$2.a[AMapLocationClientOption$AMapLocationPurpose.Sport.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

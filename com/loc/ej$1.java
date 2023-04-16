package com.loc.ej$1;
import com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import java.lang.Enum;

public final class ej$1	// class@001406
{
    public static final int[] a;

    static {
       int[] ointArray = new int[AMapLocationClientOption$GeoLanguage.values().length];
       try{
          ej$1.a = ointArray;
          ointArray[AMapLocationClientOption$GeoLanguage.DEFAULT.ordinal()] = 1;
          try{
             ej$1.a[AMapLocationClientOption$GeoLanguage.ZH.ordinal()] = 2;
             try{
                ej$1.a[AMapLocationClientOption$GeoLanguage.EN.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}

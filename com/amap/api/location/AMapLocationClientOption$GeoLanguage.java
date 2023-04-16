package com.amap.api.location.AMapLocationClientOption$GeoLanguage;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AMapLocationClientOption$GeoLanguage extends Enum	// class@000ece
{
    public static final AMapLocationClientOption$GeoLanguage DEFAULT;
    public static final AMapLocationClientOption$GeoLanguage EN;
    public static final AMapLocationClientOption$GeoLanguage ZH;
    public static final AMapLocationClientOption$GeoLanguage[] a;

    static {
       AMapLocationClientOption$GeoLanguage geoLanguage = new AMapLocationClientOption$GeoLanguage("DEFAULT", 0);
       AMapLocationClientOption$GeoLanguage.DEFAULT = geoLanguage;
       AMapLocationClientOption$GeoLanguage geoLanguage1 = new AMapLocationClientOption$GeoLanguage("ZH", 1);
       AMapLocationClientOption$GeoLanguage.ZH = geoLanguage1;
       AMapLocationClientOption$GeoLanguage geoLanguage2 = new AMapLocationClientOption$GeoLanguage("EN", 2);
       AMapLocationClientOption$GeoLanguage.EN = geoLanguage2;
       AMapLocationClientOption$GeoLanguage[] geoLanguageA = new AMapLocationClientOption$GeoLanguage[]{geoLanguage,geoLanguage1,geoLanguage2};
       AMapLocationClientOption$GeoLanguage.a = geoLanguageA;
    }
    public void AMapLocationClientOption$GeoLanguage(String p0,int p1){
       super(p0, p1);
    }
    public static AMapLocationClientOption$GeoLanguage valueOf(String p0){
       return Enum.valueOf(AMapLocationClientOption$GeoLanguage.class, p0);
    }
    public static AMapLocationClientOption$GeoLanguage[] values(){
       return AMapLocationClientOption$GeoLanguage.a.clone();
    }
}

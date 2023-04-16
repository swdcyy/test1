package com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AMapLocationClientOption$AMapLocationMode extends Enum	// class@000ecb
{
    public static final AMapLocationClientOption$AMapLocationMode Battery_Saving;
    public static final AMapLocationClientOption$AMapLocationMode Device_Sensors;
    public static final AMapLocationClientOption$AMapLocationMode Hight_Accuracy;
    public static final AMapLocationClientOption$AMapLocationMode[] a;

    static {
       AMapLocationClientOption$AMapLocationMode uAMapLocatio = new AMapLocationClientOption$AMapLocationMode("Battery_Saving", 0);
       AMapLocationClientOption$AMapLocationMode.Battery_Saving = uAMapLocatio;
       AMapLocationClientOption$AMapLocationMode uAMapLocatio1 = new AMapLocationClientOption$AMapLocationMode("Device_Sensors", 1);
       AMapLocationClientOption$AMapLocationMode.Device_Sensors = uAMapLocatio1;
       AMapLocationClientOption$AMapLocationMode uAMapLocatio2 = new AMapLocationClientOption$AMapLocationMode("Hight_Accuracy", 2);
       AMapLocationClientOption$AMapLocationMode.Hight_Accuracy = uAMapLocatio2;
       AMapLocationClientOption$AMapLocationMode[] uAMapLocatio3 = new AMapLocationClientOption$AMapLocationMode[]{uAMapLocatio,uAMapLocatio1,uAMapLocatio2};
       AMapLocationClientOption$AMapLocationMode.a = uAMapLocatio3;
    }
    public void AMapLocationClientOption$AMapLocationMode(String p0,int p1){
       super(p0, p1);
    }
    public static AMapLocationClientOption$AMapLocationMode valueOf(String p0){
       return Enum.valueOf(AMapLocationClientOption$AMapLocationMode.class, p0);
    }
    public static AMapLocationClientOption$AMapLocationMode[] values(){
       return AMapLocationClientOption$AMapLocationMode.a.clone();
    }
}

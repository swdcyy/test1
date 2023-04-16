package com.amap.api.location.AMapLocationClientOption$AMapLocationPurpose;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AMapLocationClientOption$AMapLocationPurpose extends Enum	// class@000ecd
{
    public static final AMapLocationClientOption$AMapLocationPurpose SignIn;
    public static final AMapLocationClientOption$AMapLocationPurpose Sport;
    public static final AMapLocationClientOption$AMapLocationPurpose Transport;
    public static final AMapLocationClientOption$AMapLocationPurpose[] a;

    static {
       AMapLocationClientOption$AMapLocationPurpose uAMapLocatio = new AMapLocationClientOption$AMapLocationPurpose("SignIn", 0);
       AMapLocationClientOption$AMapLocationPurpose.SignIn = uAMapLocatio;
       AMapLocationClientOption$AMapLocationPurpose uAMapLocatio1 = new AMapLocationClientOption$AMapLocationPurpose("Transport", 1);
       AMapLocationClientOption$AMapLocationPurpose.Transport = uAMapLocatio1;
       AMapLocationClientOption$AMapLocationPurpose uAMapLocatio2 = new AMapLocationClientOption$AMapLocationPurpose("Sport", 2);
       AMapLocationClientOption$AMapLocationPurpose.Sport = uAMapLocatio2;
       AMapLocationClientOption$AMapLocationPurpose[] uAMapLocatio3 = new AMapLocationClientOption$AMapLocationPurpose[]{uAMapLocatio,uAMapLocatio1,uAMapLocatio2};
       AMapLocationClientOption$AMapLocationPurpose.a = uAMapLocatio3;
    }
    public void AMapLocationClientOption$AMapLocationPurpose(String p0,int p1){
       super(p0, p1);
    }
    public static AMapLocationClientOption$AMapLocationPurpose valueOf(String p0){
       return Enum.valueOf(AMapLocationClientOption$AMapLocationPurpose.class, p0);
    }
    public static AMapLocationClientOption$AMapLocationPurpose[] values(){
       return AMapLocationClientOption$AMapLocationPurpose.a.clone();
    }
}

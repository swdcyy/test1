package com.amap.api.location.AMapLocationClientOption$AMapLocationProtocol;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AMapLocationClientOption$AMapLocationProtocol extends Enum	// class@000ecc
{
    public int a;
    public static final AMapLocationClientOption$AMapLocationProtocol HTTP;
    public static final AMapLocationClientOption$AMapLocationProtocol HTTPS;
    public static final AMapLocationClientOption$AMapLocationProtocol[] b;

    static {
       AMapLocationClientOption$AMapLocationProtocol uAMapLocatio = new AMapLocationClientOption$AMapLocationProtocol("HTTP", 0, 0);
       AMapLocationClientOption$AMapLocationProtocol.HTTP = uAMapLocatio;
       AMapLocationClientOption$AMapLocationProtocol uAMapLocatio1 = new AMapLocationClientOption$AMapLocationProtocol("HTTPS", 1, 1);
       AMapLocationClientOption$AMapLocationProtocol.HTTPS = uAMapLocatio1;
       AMapLocationClientOption$AMapLocationProtocol[] uAMapLocatio2 = new AMapLocationClientOption$AMapLocationProtocol[]{uAMapLocatio,uAMapLocatio1};
       AMapLocationClientOption$AMapLocationProtocol.b = uAMapLocatio2;
    }
    public void AMapLocationClientOption$AMapLocationProtocol(String p0,int p1,int p2){
       this.a = p2;
    }
    public static AMapLocationClientOption$AMapLocationProtocol valueOf(String p0){
       return Enum.valueOf(AMapLocationClientOption$AMapLocationProtocol.class, p0);
    }
    public static AMapLocationClientOption$AMapLocationProtocol[] values(){
       return AMapLocationClientOption$AMapLocationProtocol.b.clone();
    }
    public final int getValue(){
       return this.a;
    }
}

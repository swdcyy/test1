package com.tencent.map.geolocation.TencentLocationUtils;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import com.tencent.map.geolocation.TencentLocation;
import c.t.m.g.ej;
import java.lang.String;
import android.content.Context;
import java.util.Objects;
import c.t.m.g.ec;

public class TencentLocationUtils	// class@000e61
{

    public void TencentLocationUtils(){
       super();
       throw new UnsupportedOperationException();
    }
    public static boolean contains(TencentLocation p0,double p1,TencentLocation p2){
       if (p0 == null || p2 == null) {
          throw false;
       }
       boolean b = (TencentLocationUtils.distanceBetween(p0, p2) - p1 <= 0)? true: false;
       return b;
    }
    public static double distanceBetween(double p0,double p1,double p2,double p3){
       return ej.a(p0, p1, p2, p3);
    }
    public static double distanceBetween(TencentLocation p0,TencentLocation p1){
       if (p0 != null && p1 != null) {
          return ej.a(p0.getLatitude(), p0.getLongitude(), p1.getLatitude(), p1.getLongitude());
       }
       throw 0;
    }
    public static boolean isFromGps(TencentLocation p0){
       if (p0 == null) {
          return false;
       }
       return ("gps").equals(p0.getProvider());
    }
    public static boolean isFromNetwork(TencentLocation p0){
       if (p0 == null) {
          return false;
       }
       return ("network").equals(p0.getProvider());
    }
    public static boolean isSupportGps(Context p0){
       Objects.requireNonNull(p0);
       boolean b = (!(ec.a().a(p0) & 0x10))? true: false;
       return b;
    }
}

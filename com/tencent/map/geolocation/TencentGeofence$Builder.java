package com.tencent.map.geolocation.TencentGeofence$Builder;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.map.geolocation.TencentGeofence;
import com.tencent.map.geolocation.TencentGeofence$1;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TencentGeofence$Builder	// class@000e57
{
    public double a;
    public double b;
    public float c;
    public long d;
    public String e;

    public void TencentGeofence$Builder(){
       super();
    }
    public static void a(double p0,double p1){
       if (p0 - 0x4056800000000000 > 0 || p0 - 0xc056800000000000 < 0) {
          throw new IllegalArgumentException("invalid latitude: "+p0);
       }
       if (p1 - 0x4066800000000000 <= 0 && p1 - 0xc066800000000000 >= 0) {
          return;
       }
       throw new IllegalArgumentException("invalid longitude: "+p1);
    }
    public static void a(float p0){
       if (p0 > 0) {
          return;
       }
       throw new IllegalArgumentException("invalid radius: "+p0);
    }
    public static void a(long p0){
       if (p0 - null >= 0) {
          return;
       }
       throw new IllegalArgumentException("invalid duration: "+p0);
    }
    public TencentGeofence build(){
       TencentGeofence tencentGeofe = new TencentGeofence(0, this.a, this.b, this.c, this.d, this.e, null);
       return v11;
    }
    public TencentGeofence$Builder setCircularRegion(double p0,double p1,float p2){
       TencentGeofence$Builder.a(p2);
       TencentGeofence$Builder.a(p0, p1);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return this;
    }
    public TencentGeofence$Builder setExpirationDuration(long p0){
       TencentGeofence$Builder.a(p0);
       this.d = p0;
       return this;
    }
    public TencentGeofence$Builder setTag(String p0){
       if (TextUtils.isEmpty(p0)) {
          throw null;
       }
       this.e = p0;
       return this;
    }
}

package com.tencent.map.geolocation.TencentGeofence;
import java.lang.String;
import java.lang.Object;
import android.os.SystemClock;
import com.tencent.map.geolocation.TencentGeofence$1;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Double;
import java.util.Locale;
import java.lang.Float;

public class TencentGeofence	// class@000e58
{
    public final int a;
    public final double b;
    public final double c;
    public final float d;
    public final long e;
    public final String f;
    public final long g;

    public void TencentGeofence(int p0,double p1,double p2,float p3,long p4,String p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.g = p4;
       this.e = SystemClock.elapsedRealtime() + p4;
       this.f = p5;
    }
    public void TencentGeofence(int p0,double p1,double p2,float p3,long p4,String p5,TencentGeofence$1 p6){
       super(p0, p1, p2, p3, p4, p5);
    }
    public static void a(int p0){
       if (!p0) {
          return;
       }
       throw new IllegalArgumentException("invalid type: "+p0);
    }
    public static String b(int p0){
       if (!p0) {
          return "CIRCLE";
       }
       TencentGeofence.a(p0);
       return null;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (this.getClass() != p0.getClass()) {
          return false;
       }
       if (Double.doubleToLongBits(this.b) - Double.doubleToLongBits(p0.b)) {
          return false;
       }
       if (Double.doubleToLongBits(this.c) - Double.doubleToLongBits(p0.c)) {
          return false;
       }
       TencentGeofence tf = this.f;
       if (tf == null) {
          if (p0.f != null) {
             return false;
          }
       }else if(!tf.equals(p0.f)){
          return false;
       }
       return true;
    }
    public long getDuration(){
       return this.g;
    }
    public long getExpireAt(){
       return this.e;
    }
    public double getLatitude(){
       return this.b;
    }
    public double getLongitude(){
       return this.c;
    }
    public float getRadius(){
       return this.d;
    }
    public String getTag(){
       return this.f;
    }
    public int hashCode(){
       long l = Double.doubleToLongBits(this.b);
       long l1 = Double.doubleToLongBits(this.c);
       int i = ((((int)(l ^ (l >> 32)) + 31) * 31) + (int)(l1 ^ (l1 >> 32))) * 31;
       TencentGeofence tf = this.f;
       int i1 = (tf == null)? 0: tf.hashCode();
       return (i + i1);
    }
    public String toString(){
       Object[] objArray = new Object[]{this.f,TencentGeofence.b(this.a),Double.valueOf(this.b),Double.valueOf(this.c),Float.valueOf(this.d),Double.valueOf(((double)(this.e - SystemClock.elapsedRealtime()) / 0x408f400000000000))};
       return String.format(Locale.US, "TencentGeofence[tag=%s, type=%s, loc=\(%.6f, %.6f\), radius=%.2fm life=%.2fs]", objArray);
    }
}

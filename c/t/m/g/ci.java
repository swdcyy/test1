package c.t.m.g.ci;
import com.tencent.map.geolocation.TencentGeofence;
import java.lang.String;
import android.app.PendingIntent;
import java.lang.Object;
import android.location.Location;
import java.lang.Double;
import java.lang.Math;
import c.t.m.g.ej;
import java.util.Locale;
import java.lang.Float;

public class ci	// class@000c0f
{
    public final TencentGeofence a;
    public final long b;
    public final String c;
    public final PendingIntent d;
    public int e;
    public double f;
    public final Location g;
    public Object h;

    public void ci(TencentGeofence p0,long p1,String p2,PendingIntent p3){
       super();
       this.e = 0;
       this.f = Double.MAX_VALUE;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       Location location = new Location("");
       this.g = location;
       location.setLatitude(p0.getLatitude());
       location.setLongitude(p0.getLongitude());
       location.setTime(0);
       location.setSpeed(-0.00f);
    }
    public double a(){
       double d = Double.MAX_VALUE;
       if (!Double.compare(this.f, d)) {
          return d;
       }
       return Math.abs(((double)this.a.getRadius() - this.f));
    }
    public final double a(double p0,double p1,long p2,long p3){
       if (!p2) {
          return 0xbf50624de0000000;
       }
       if (p1 - p0 >= 0) {
          return 0;
       }
       p2 = Math.abs((p3 - p2)) / 1000;
       p0 = Math.abs((p0 - p1));
       if (!p2) {
          p2 = p2 + 1;
       }
       return (p0 / (double)p2);
    }
    public int a(Location p0){
       ci uoci = this;
       ci obj = p0;
       if (obj == uoci.h) {
          return 0;
       }
       uoci.h = obj;
       double d = ej.a(p0.getLatitude(), p0.getLongitude(), uoci.g.getLatitude(), uoci.g.getLongitude());
       long time = p0.getTime();
       uoci.g.setTime(time);
       uoci.g.setSpeed((float)this.a(uoci.f, d, uoci.g.getTime(), time));
       uoci.f = d;
       obj = uoci.e;
       int i = (d - (double)uoci.a.getRadius() <= 0)? 1: 0;
       if (i) {
          uoci.e = 1;
          if (obj != 1) {
             return 1;
          }
       }else {
          uoci.e = 2;
          if (obj == 1) {
             return 2;
          }
       }
       return 0;
    }
    public float b(){
       float speed = this.g.getSpeed();
       float f = -0.00f;
       if (speed - f <= 0) {
          return f;
       }
       f = 25.00f;
       if (speed - f > 0) {
          return f;
       }
       if (speed - 0x3f800000 < 0) {
          return 0x3f800000;
       }
       return speed;
    }
    public boolean c(){
       boolean b = true;
       if (this.e == b || this.g.getSpeed() < 0) {
          b = false;
       }
       return b;
    }
    public String toString(){
       String str;
       ci te = this.e;
       int i = 2;
       int i1 = 1;
       if (te != i1) {
          str = (te != i)? "?": "OUT";
       }else {
          str = "IN";
       }
       Object[] objArray = new Object[]{this.a.toString(),Double.valueOf(this.f),Float.valueOf(this.b()),str};
       return String.format(Locale.US, "%s dist=%5gm speed=%.2fm/s state=%s", objArray);
    }
}

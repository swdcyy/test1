package q0.j;
import android.content.Context;
import android.location.LocationManager;
import java.lang.Object;
import q0.j$a;
import java.lang.String;
import android.location.Location;
import vk7.g0;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import java.util.Calendar;
import java.lang.System;
import q0.i;

public class j	// class@002948
{
    public final Context a;
    public final LocationManager b;
    public final j$a c;
    public static j d;

    public void j(Context p0,LocationManager p1){
       super();
       this.c = new j$a();
       this.a = p0;
       this.b = p1;
    }
    public static j a(Context p0){
       if (j.d == null) {
          p0 = p0.getApplicationContext();
          j.d = new j(p0, p0.getSystemService("location"));
       }
       return j.d;
    }
    public final Location b(){
       String str = null;
       Location location = (!g0.a(this.a, "android.permission.ACCESS_COARSE_LOCATION"))? this.c("network"): str;
       if (!g0.a(this.a, "android.permission.ACCESS_FINE_LOCATION")) {
          str = this.c("gps");
       }
       if (str != null && location != null) {
          if (str.getTime() - location.getTime() > 0) {
             location = str;
          }
          return location;
       }else if(str != null){
          location = str;
       }
       return location;
    }
    public final Location c(String p0){
       try{
          if (this.b.isProviderEnabled(p0)) {
             return LocationInterceptor.getLastKnownLocation(this.b, p0);
          }
          return null;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean d(){
       j tc = this.c;
       if (this.e()) {
          return tc.a;
       }
       Location location = this.b();
       if (location != null) {
          this.f(location);
          return tc.a;
       }else {
          boolean i = Calendar.getInstance().get(11);
          i = (i < 6 || i >= 22)? true: false;
          return i;
       }
    }
    public final boolean e(){
       boolean b = (this.c.f - System.currentTimeMillis() > 0)? true: false;
       return b;
    }
    public final void f(Location p0){
       int i;
       boolean this;
       j c = this.c;
       long l = System.currentTimeMillis();
       i oi = i.b();
       long l1 = 0x5265c00;
       i oi1 = oi;
       oi1.a((l - l1), p0.getLatitude(), p0.getLongitude());
       i a = oi.a;
       oi1.a(l, p0.getLatitude(), p0.getLongitude());
       i = (oi.c == 1)? 1: 0;
       i oi2 = a;
       a = oi.a;
       i oi3 = oi.b;
       this = i;
       oi.a((l1 + l), p0.getLatitude(), p0.getLongitude());
       oi1 = oi.b;
       long l2 = 0;
       i oi4 = -1;
       if (!oi3 - oi4 || !a - oi4) {
          l2 = 0x2932e00 + l;
       }else if(l - a > 0){
          l2 = l2 + oi1;
       }else if(l - oi3 > 0){
          l2 = l2 + a;
       }else {
          l2 = l2 + oi3;
       }
       l2 = l2 + 0xea60;
       c.a = this;
       c.b = oi2;
       c.c = oi3;
       c.d = a;
       c.e = oi1;
       c.f = l2;
       return;
    }
}

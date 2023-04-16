package c.t.m.g.cj;
import com.tencent.map.geolocation.TencentLocation;
import android.location.Location;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.ej;
import c.t.m.g.dv;
import java.lang.System;
import java.lang.CharSequence;
import android.text.format.DateFormat;
import java.lang.StringBuilder;

public class cj	// class@000c10
{

    public static Location a(TencentLocation p0,boolean p1){
       if (p0 == null) {
          return null;
       }
       String provider = p0.getProvider();
       Location location = new Location(provider);
       location.setLatitude(p0.getLatitude());
       location.setLongitude(p0.getLongitude());
       location.setAccuracy(p0.getAccuracy());
       location.setTime(p0.getTime());
       if (p1 && ("gps").equals(provider)) {
          double[] uodoubleArra = new double[2];
          ej.a(location, uodoubleArra);
          location.setLatitude(uodoubleArra[0]);
          location.setLongitude(uodoubleArra[1]);
          p0.a(location);
       }
       return location;
    }
    public static String a(TencentLocation p0,int p1){
       long l = (p0 == null)? System.currentTimeMillis(): p0.getTime();
       return DateFormat.format("yyyy-MM-dd kk:mm:ss", l)+" error="+p1+p0+"\n";
    }
    public static void a(Location p0){
       if (p0.getAccuracy() - 0x43fa0000 > 0) {
          p0.setAccuracy(0x43fa0000);
       }
       return;
    }
}

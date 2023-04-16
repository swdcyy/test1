package c.t.m.g.ec;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import android.net.wifi.WifiManager;
import android.location.LocationManager;
import android.content.ContentResolver;
import android.provider.Settings$Secure;
import java.util.List;
import android.telephony.TelephonyManager;

public class ec	// class@000c65
{
    public int b;
    public int c;
    public int d;
    public static ec a;

    public void ec(){
       super();
       this.b = -1;
       this.c = -1;
       this.d = 1;
    }
    public static ec a(){
       if (ec.a == null) {
          ec.a = new ec();
       }
       return ec.a;
    }
    public int a(Context p0){
       boolean b2;
       int i;
       boolean i1;
       int i2;
       String str = "gps";
       if (p0 == null) {
          return -1;
       }
       int b = this.b(p0);
       boolean b1 = false;
       WifiManager systemServic = p0.getSystemService("wifi");
       if (systemServic != null) {
          b2 = systemServic.isWifiEnabled();
          systemServic = (systemServic.isScanAlwaysAvailable())? 1: 0;
          i = 1;
       }else {
          systemServic = 0;
          b2 = false;
          i = 0;
       }
       try{
          LocationManager systemServic1 = p0.getSystemService("location");
          if (systemServic1 != null) {
             i1 = Settings$Secure.getInt(p0.getContentResolver(), "location_mode");
             try{
                boolean b3 = systemServic1.isProviderEnabled(str);
                List allProviders = systemServic1.getAllProviders();
                if (allProviders != null) {
                   b1 = allProviders.contains(str);
                }
                i2 = i1;
                i1 = b1;
                b1 = b3;
             }catch(java.lang.Exception e0){
                i2 = i1;
                i1 = false;
             }
          }else {
             i1 = false;
             i2 = 0;
          }
       }catch(java.lang.Exception e0){
          i1 = 0;
          goto label_0058 ;
       }
       b = b ^ 1;
       if (!b2) {
          b = b + 2;
       }
       if (!b1) {
          b = b + 4;
       }
       if (!i) {
          b = b + 8;
       }
       if (!i1) {
          b = b + 16;
       }
       if (!systemServic) {
          b = b + 32;
       }
       if (i2) {
          if (i2 != 1) {
             if (i2 != 2) {
                if (i2 == 3) {
                   b = b + 512;
                }
             }else {
                b = b + 256;
             }
          }else {
             b = b + 128;
          }
       }else {
          b = b + 64;
       }
       return b;
    }
    public boolean b(Context p0){
       boolean b = false;
       try{
          TelephonyManager systemServic = p0.getSystemService("phone");
          if (systemServic == null) {
             return b;
          }
          if (systemServic.getSimState() == 5) {
             return true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}

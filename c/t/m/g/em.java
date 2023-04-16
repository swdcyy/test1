package c.t.m.g.em;
import c.t.m.g.em$1;
import android.net.wifi.WifiManager;
import c.t.m.g.ce;
import java.lang.System;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings$Secure;
import java.lang.SecurityException;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.NetworkInfo;
import com.kwai.framework.deviceid.a;
import java.lang.CharSequence;
import java.util.List;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import c.t.m.g.cd;
import java.util.Collections;

public class em	// class@000c70
{
    public static boolean a;
    public static long b;
    public static final Comparator c;
    public static boolean d;

    static {
       em.c = new em$1();
    }
    public static int a(WifiManager p0){
       if (p0 != null) {
          return p0.getWifiState();
       }
       return 4;
    }
    public static boolean a(ce p0){
       boolean b = false;
       WifiManager wifiManager = p0.c();
       if (wifiManager != null && wifiManager.isWifiEnabled()) {
          b = true;
       }
       return b;
    }
    public static synchronized boolean b(WifiManager p0){
       boolean b;
       _monitor_enter(em.class);
       long l = 0;
       if (p0 != null) {
          try{
             if ((System.currentTimeMillis() - em.b) - 3000 > 0) {
                b = p0.startScan();
                try{
                   em.d = b;
                   if (b) {
                      em.b = System.currentTimeMillis();
                   }
                   if (ed.a) {
                      String str = "wifis";
                      StringBuilder str1 = "force scan ";
                      String str2 = (b)? "success": "failed";
                      ed.b(str, str1+str2);
                   }
                }catch(java.lang.Exception e0){
                   l = b;
                label_0056 :
                   em.a = true;
                }
             }else if(ed.a){
                ed.b("wifis", "force scan reject");
             }
             b = em.d;
          }catch(java.lang.Exception e0){
          }
             l = b;
       }
    }
    public static boolean b(ce p0){
       WifiManager wifiManager = p0.c();
       boolean b = false;
       if (wifiManager != null) {
          if (Build$VERSION.SDK_INT >= 23 && !Settings$Secure.getInt(p0.a.getContentResolver(), "location_mode")) {
             return b;
          }else {
             boolean b1 = wifiManager.isWifiEnabled();
             if (!b1) {
                b1 = wifiManager.isScanAlwaysAvailable();
             }
             b = b1;
          }
       }
       return b;
    }
    public static String c(ce p0){
       String str = "";
       p0 = p0.a;
       if (p0 == null) {
          return "{}";
       }
       try{
          WifiManager systemServic = p0.getSystemService("wifi");
          ConnectivityManager systemServic1 = p0.getSystemService("connectivity");
          if (systemServic != null && systemServic1 != null) {
             WifiInfo connectionIn = systemServic.getConnectionInfo();
             NetworkInfo networkInfo = systemServic1.getNetworkInfo(1);
             if (connectionIn != null && (networkInfo != null && networkInfo.isConnected())) {
                String str1 = a.a(connectionIn);
                if (str1 != null && (!str1.equals("000000000000") && (!str1.equals("00-00-00-00-00-00") && (str1.equals("00:00:00:00:00:00") || str1.equals("02:00:00:00:00:00"))))) {
                   ed.b("Wifis", str1);
                }else {
                   return "{"+"\"mac\":\""+str1.replace(":", str)+"\",\"rssi\":"+connectionIn.getRssi()+",\"ssid\":\""+((a.f(connectionIn)).replace("\"", str)).replace("|", str)+"\"}";
                }
             }
          }
          return "{}";
       }catch(java.lang.Exception e0){
       }
    }
    public static List c(WifiManager p0){
       List list = null;
       if (p0 != null) {
          try{
             list = LocationInterceptor.getScanResults(p0);
             em.a = false;
          }catch(java.lang.Exception e0){
             em.a = true;
             cd.c().a("WIFI", "denied");
          }
       }
    }
}

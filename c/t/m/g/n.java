package c.t.m.g.n;
import java.util.HashMap;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import c.t.m.g.cc;
import com.kwai.framework.deviceid.a;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.List;
import android.net.wifi.ScanResult;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.Throwable;
import c.t.m.g.bt;

public class n	// class@000c9e
{
    public static HashMap a;

    static {
       n.a = new HashMap();
    }
    public static int a(Context p0){
       return n.a(p0.getSystemService("wifi"));
    }
    public static int a(WifiManager p0){
       int i = 4;
       if (p0 == null) {
       }else {
          i = p0.getWifiState();
       }
       return i;
    }
    public static String a(){
       String str = "";
       WifiInfo wifiInfo = cc.a();
       if (wifiInfo != null) {
          String str1 = a.a(wifiInfo);
          if (str1 == null || (str1.equals("000000000000") || (!str1.equals("00-00-00-00-00-00") && !str1.equals("00:00:00:00:00:00")))) {
             int rssi = wifiInfo.getRssi();
             if (rssi >= -100 && rssi <= -20) {
                return "{"+"\"mac\":\""+str1+"\",\"rssi\":"+rssi+",\"ssid\":\""+((a.f(wifiInfo)).replace("\"", str)).replace("|", str)+"\"}";
             }
          }
       }
    label_0072 :
       return "{}";
    }
    public static boolean a(List p0){
       if (p0 != null && p0.size() > 1) {
          ScanResult bSSID = p0.get(0).BSSID;
          int i = 1;
          while (i < p0.size()) {
             if (!bSSID.equals(p0.get(i).BSSID)) {
                return 0;
             }
             i = i + 1;
          }
       }
       return true;
    }
    public static synchronized boolean a(List p0,List p1){
       HashMap hashMap;
       _monitor_enter(n.class);
       if (p0 == p1) {
          _monitor_exit(n.class);
          return true;
       }else if(p0 == null){
          hashMap = null;
       }else {
          hashMap = p0.size();
       }
       boolean b = (p1 == null)? false: p1.size();
       if (hashMap != b) {
          _monitor_exit(n.class);
          return false;
       }else if(!hashMap){
          _monitor_exit(n.class);
          return true;
       }else {
          hashMap = n.a;
          hashMap.clear();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             ScanResult scanResult = iterator.next();
             hashMap.put(scanResult.BSSID, Integer.valueOf(scanResult.level));
          }
          iterator = p1.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ScanResult scanResult1 = iterator.next();
                if (!hashMap.containsKey(scanResult1.BSSID) || scanResult1.level != hashMap.get(scanResult1.BSSID).intValue()) {
                   break ;
                }
             }else {
                _monitor_exit(n.class);
                return true;
             }
          }
          _monitor_exit(n.class);
          return false;
       }
    }
}

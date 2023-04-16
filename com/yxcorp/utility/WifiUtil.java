package com.yxcorp.utility.WifiUtil;
import android.content.Context;
import com.yxcorp.utility.WifiUtil$WifiInfo;
import android.net.wifi.WifiInfo;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.String;
import java.lang.Object;
import android.net.wifi.WifiManager;
import java.util.List;
import com.kwai.privacykit.interceptor.LocationInterceptor;
import java.util.Iterator;
import android.net.wifi.ScanResult;
import com.kwai.framework.deviceid.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import com.yxcorp.utility.WifiUtil$a;
import ekd.r0;
import android.net.DhcpInfo;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.l;
import ekd.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Exception;

public class WifiUtil	// class@0009b2
{

    public static WifiUtil$WifiInfo a(Context p0){
       WifiUtil$WifiInfo wifiInfo = new WifiUtil$WifiInfo();
       WifiInfo wifiInfo1 = b.e();
       if (wifiInfo1 == null) {
          return wifiInfo;
       }
       WifiManager systemServic = p0.getSystemService("wifi");
       if (systemServic == null) {
          return wifiInfo;
       }
       List scanResults = LocationInterceptor.getScanResults(systemServic);
       if (scanResults != null) {
          Iterator iterator = scanResults.iterator();
          while (iterator.hasNext()) {
             ScanResult scanResult = iterator.next();
             if (a.a(wifiInfo1) != null && scanResult.BSSID != null) {
                String str = "\"";
                if (TextUtils.equals((a.a(wifiInfo1)).replace(str, ""), (scanResult.BSSID).replace(str, "")) && (a.f(wifiInfo1) != null && (scanResult.SSID != null && TextUtils.equals((a.f(wifiInfo1)).replace(str, ""), (scanResult.SSID).replace(str, ""))))) {
                   wifiInfo.mSsid = scanResult.SSID;
                   wifiInfo.mBssid = scanResult.BSSID;
                   wifiInfo.mCapabilities = scanResult.capabilities;
                   wifiInfo.mLevel = scanResult.level;
                   wifiInfo.mFrequency = scanResult.frequency;
                   wifiInfo.mTimestamp = scanResult.timestamp;
                }
             }
          }
       }
       return wifiInfo;
    }
    public static List b(Context p0){
       ArrayList uArrayList = new ArrayList();
       WifiManager systemServic = p0.getSystemService("wifi");
       if (systemServic == null) {
          return uArrayList;
       }
       List scanResults = LocationInterceptor.getScanResults(systemServic);
       if (scanResults != null) {
          Iterator iterator = scanResults.iterator();
          while (iterator.hasNext()) {
             ScanResult scanResult = iterator.next();
             WifiUtil$WifiInfo wifiInfo = new WifiUtil$WifiInfo();
             wifiInfo.mSsid = scanResult.SSID;
             wifiInfo.mBssid = scanResult.BSSID;
             wifiInfo.mCapabilities = scanResult.capabilities;
             wifiInfo.mLevel = scanResult.level;
             wifiInfo.mFrequency = scanResult.frequency;
             wifiInfo.mTimestamp = scanResult.timestamp;
             uArrayList.add(wifiInfo);
          }
       }
       return uArrayList;
    }
    public static WifiUtil$a c(Context p0){
       String str1;
       boolean b1;
       boolean b = false;
       try{
          if (!r0.e(p0)) {
             return new WifiUtil$a("", b, "");
          }
          DhcpInfo gateway = p0.getSystemService("wifi").getDhcpInfo().gateway;
          int i = 4;
          Object[] objArray = new Object[i];
          objArray[b] = Integer.valueOf((gateway & 0x00ff));
          int i1 = 1;
          objArray[i1] = Integer.valueOf(((gateway >> 8) & 0x00ff));
          objArray[2] = Integer.valueOf(((gateway >> 16) & 0x00ff));
          objArray[3] = Integer.valueOf(((gateway >> 24) & 0x00ff));
          String str = l.b("ip neigh show "+String.format("%d.%d.%d.%d", objArray));
          if (str != null) {
             String[] stringArray = str.split("\\s+");
             if (stringArray.length >= 5) {
                object oobject = stringArray[i];
                oobject = (oobject == null)? 0: t0.b.matcher(oobject).matches();
                if (oobject) {
                   str1 = stringArray[i];
                label_008c :
                   if (TextUtils.x(str1)) {
                      i1 = false;
                   }
                   return new WifiUtil$a(str1, i1, str);
                }
             }
          }
          str1 = "";
          goto label_008c ;
       }catch(java.lang.Exception e7){
          return new WifiUtil$a("", b, e7.getMessage());
       }
    }
}

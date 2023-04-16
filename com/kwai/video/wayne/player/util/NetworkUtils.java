package com.kwai.video.wayne.player.util.NetworkUtils;
import java.lang.Object;
import android.content.Context;
import android.net.NetworkInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.ConnectivityManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.util.Objects;
import android.net.wifi.WifiInfo;
import com.kwai.framework.deviceid.a;
import android.net.Uri;
import java.util.Locale;
import java.lang.StringBuilder;
import com.kwai.video.wayne.player.util.DebugLog;
import android.telephony.TelephonyManager;
import android.net.wifi.WifiManager;
import java.lang.Boolean;
import java.lang.Integer;

public class NetworkUtils	// class@000dc0
{

    public void NetworkUtils(){
       super();
    }
    public static NetworkInfo getActiveNetworkInfo(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return null;
       }
       try{
          return systemServic.getActiveNetworkInfo();
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
    public static String getActiveNetworkTypeName(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       NetworkInfo activeNetwor = NetworkUtils.getActiveNetworkInfo(p0);
       if (activeNetwor != null) {
          int type = activeNetwor.getType();
          if (type) {
             if (type == 1) {
                return activeNetwor.getTypeName();
             }
          }else {
             obj = activeNetwor.getSubtypeName();
             if (TextUtils.isEmpty(obj)) {
                obj = activeNetwor.getTypeName();
             }
             return obj;
          }
       }
       return "unknown";
    }
    public static int getAdaptiveNetType(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       if (NetworkUtils.isWifiConnected(p0)) {
          return i;
       }
       String networkType = NetworkUtils.getNetworkType(p0);
       Objects.requireNonNull(networkType);
       switch (networkType.hashCode()){
           case 1653:
             if (networkType.equals("2g")) {
                i = 0;
             }else {
             }
             break;
           case 1684:
             if (networkType.equals("3g")) {
             }else {
             }
             break;
           case 1715:
             if (networkType.equals("4g")) {
                i = 2;
             }else {
             }
             break;
           default:
             i = -1;
       }
       switch (i){
           case 0:
             return 4;
           case 1:
             return 3;
           case 2:
             return 2;
           default:
             return 0;
       }
    }
    public static String getCurrentWifiName(Context p0){
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, NetworkUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       WifiInfo wifiInfo = NetworkUtils.getWifiInfo(p0);
       if (wifiInfo != null) {
          str = a.f(wifiInfo);
       }
       return str;
    }
    public static String getHost(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (!TextUtils.isEmpty(p0) && (p0.startsWith("http") || p0.startsWith("https"))) {
          label_0029 :
             return (Uri.parse(p0).getHost()).toLowerCase(Locale.US);
          }
       }catch(java.lang.Exception e0){
          DebugLog.e("NetworkUtils", "getHost exception, url:"+p0);
       }
       return "";
    }
    public static String getNetworkType(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "Notfound";
       }
       try{
          switch (p0.getSystemService("phone").getNetworkType()){
              case 1:
              case 4:
              case 7:
              case 11:
              case 2:
                return "2g";
              case 3:
              case 6:
              case 8:
              case 9:
              case 10:
              case 12:
              case 14:
              case 15:
              case 5:
                return "3g";
              case 13:
                return "4g";
              default:
                return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static WifiInfo getWifiInfo(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       try{
          WifiManager systemServic = p0.getApplicationContext().getSystemService("wifi");
          if (systemServic == null) {
             return null;
          }
          return systemServic.getConnectionInfo();
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static boolean isIp(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       p0 = p0.trim();
       if (p0.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
          String[] stringArray = p0.split("\\.");
          if (Integer.parseInt(stringArray[b]) < 255 && (Integer.parseInt(stringArray[1]) < 255 && (Integer.parseInt(stringArray[2]) < 255 && Integer.parseInt(stringArray[3]) < 255))) {
             b = true;
          }
       }
    label_0054 :
       return b;
    }
    public static boolean isMobileNetworkConnected(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       boolean b = false;
       if (systemServic == null) {
          return b;
       }
       NetworkInfo networkInfo = systemServic.getNetworkInfo(b);
       if (networkInfo != null && networkInfo.isConnected()) {
          b = true;
       }
       return b;
    }
    public static boolean isNetworkConnected(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       try{
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          if (systemServic == null) {
             return b;
          }
          NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
          if (activeNetwor != null && activeNetwor.isConnected()) {
             b = true;
          }
       label_0030 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean isWifiConnected(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       try{
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          if (systemServic == null) {
             return b;
          }
          NetworkInfo networkInfo = systemServic.getNetworkInfo(1);
          if (networkInfo != null && networkInfo.isConnected()) {
             b = true;
          }
       label_0031 :
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
}

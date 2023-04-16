package com.kwai.video.krtc.NetworkUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.NetworkInfo;
import java.lang.StringBuilder;
import android.net.ConnectivityManager;
import java.lang.Exception;
import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.lang.CharSequence;
import android.util.Pair;
import android.text.TextUtils;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiInfo;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import java.lang.Number;
import android.net.DhcpInfo;
import java.lang.Boolean;

public final class NetworkUtils	// class@000767
{

    public void NetworkUtils(){
       super();
    }
    public static String getActiveNetworkDesc(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "Null";
       if (p0 == null) {
          return obj;
       }
       NetworkInfo activeNetwor = NetworkUtils.getActiveNetworkInfo(p0);
       if (activeNetwor != null) {
          int type = activeNetwor.getType();
          if (type) {
             obj = (type != 1)? "Unknown": "WiFi";
          }else {
             obj = NetworkUtils.getIsp(p0)+" "+NetworkUtils.getNetworkType(p0);
          }
       }
       return obj;
    }
    public static NetworkInfo getActiveNetworkInfo(Context p0){
       NetworkInfo activeNetwor;
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          activeNetwor = p0.getSystemService("connectivity").getActiveNetworkInfo();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return activeNetwor;
    }
    public static List getActiveNetworkInterfaces(){
       ArrayList obj = PatchProxy.apply(null, null, NetworkUtils.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ArrayList();
          Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
          while (iterator.hasNext()) {
             NetworkInterface networkInter = iterator.next();
             Iterator iterator1 = Collections.list(a.c(networkInter)).iterator();
             while (iterator1.hasNext()) {
                InetAddress inetAddress = iterator1.next();
                if (!inetAddress.isLoopbackAddress() && !(inetAddress.getHostAddress()).contains(":")) {
                   obj.add(new Pair(networkInter.getDisplayName(), inetAddress.getHostAddress()));
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String getActiveNetworkTypeName(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "3");
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
       return "Unknown";
    }
    public static String getCurrentWifiName(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       WifiInfo connectionIn = p0.getSystemService("wifi").getConnectionInfo();
       if (connectionIn != null) {
          return a.f(connectionIn);
       }
       return null;
    }
    public static String getIsp(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String simOperator = p0.getSystemService("phone").getSimOperator();
       if (simOperator != null) {
          if (!simOperator.equals("46000") && (simOperator.equals("46002") || simOperator.equals("46007"))) {
             simOperator = "CMCC";
          }else if(simOperator.equals("46001") || simOperator.equals("46009")){
             simOperator = "CUC";
          }else if(simOperator.equals("46003¡å")){
             simOperator = "CTC";
          }else {
          label_0059 :
             simOperator = "";
          }
       }else {
          goto label_0059 ;
       }
       return simOperator;
    }
    public static String getLocalIpV4Address(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Formatter.formatIpAddress(a.e(p0.getSystemService("wifi").getConnectionInfo()));
    }
    public static String getNetworkType(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (p0.getSystemService("phone").getNetworkType()){
           case 1:
           case 4:
           case 7:
           case 11:
           case 2:
             return "2G";
           case 3:
           case 6:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 5:
             return "3G";
           case 13:
             return "4G";
           default:
             return "";
       }
    }
    public static int getNetworkTypeInt(Context p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       switch (p0.getSystemService("phone").getNetworkType()){
           case 1:
           case 4:
           case 7:
           case 11:
           case 2:
             i = 3;
             break;
           case 3:
           case 6:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 5:
             i = 4;
             break;
           case 13:
             i = 5;
             break;
           default:
             i = 6;
       }
       return i;
    }
    public static String getWifiRouterIpV4Address(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Formatter.formatIpAddress(p0.getSystemService("wifi").getDhcpInfo().gateway);
    }
    public static boolean isMobileNetworkConnected(Context p0){
       NetworkInfo networkInfo;
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       try{
          obj = 0;
          networkInfo = systemServic.getNetworkInfo(obj);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (networkInfo != null && networkInfo.isConnected()) {
          b = true;
       }
       return b;
    }
    public static boolean isNetworkConnected(Context p0){
       NetworkInfo activeNetwor;
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       try{
          activeNetwor = systemServic.getActiveNetworkInfo();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       boolean b = (activeNetwor != null && activeNetwor.isConnected())? true: false;
       return b;
    }
    public static boolean isWifiClosed(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0.getSystemService("wifi").getWifiState() != b) {
          b = false;
       }
       return b;
    }
    public static boolean isWifiConnected(Context p0){
       NetworkInfo networkInfo;
       Object obj = PatchProxy.applyOneRefs(p0, null, NetworkUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       try{
          obj = 1;
          networkInfo = systemServic.getNetworkInfo(obj);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (networkInfo == null || !networkInfo.isConnected()) {
          boolean b = false;
       }
       return obj;
    }
}

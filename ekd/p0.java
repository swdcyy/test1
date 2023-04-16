package ekd.p0;
import ekd.e0;
import android.content.Context;
import java.lang.String;
import skd.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Throwable;
import android.net.NetworkInfo;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.CharSequence;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.lang.Object;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.net.Inet4Address;
import android.telephony.TelephonyManager;
import skd.a$a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.os.Build$VERSION;
import android.telephony.ServiceState;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import com.yxcorp.utility.RomUtils;
import ukd.a;
import java.net.URLDecoder;
import java.lang.RuntimeException;
import ekd.r0;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.yxcorp.utility.uri.Uri;
import java.util.Locale;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.NumberFormatException;
import java.lang.Boolean;
import android.telephony.SubscriptionManager;

public final class p0	// class@001563
{
    public static boolean a;
    public static boolean b;

    static {
       String str = "ENABLE_CONNECTION_INFO_CACHE";
       String str1 = "OpenNetworkTypeCache";
       try{
          p0.b = a.b(e0.b, str1).getBoolean(str1, true);
          Log.b("UtilityBaseNetworkUtils", "sOpenNetworkTypeCache is: "+p0.b);
          p0.a = a.b(e0.b, str).getBoolean(str, false);
       }catch(java.lang.Exception e0){
          Log.e("UtilityBaseNetworkUtils", "static initializer: ", e0);
       }
    }
    public static boolean A(Context p0){
       return p0.B(p0, false);
    }
    public static boolean B(Context p0,boolean p1){
       int i = 0;
       NetworkInfo networkInfo = p0.t(p0, i, p1);
       if (networkInfo != null && networkInfo.isConnected()) {
          i = true;
       }
       return i;
    }
    public static boolean C(Context p0){
       return NetworkUtilsCached.k();
    }
    public static boolean D(){
       return p0.b;
    }
    public static boolean E(String p0){
       boolean b = (p0.contains("nrState=NOT_RESTRICTED") || p0.contains("nrState=CONNECTED"))? true: false;
       return b;
    }
    public static boolean F(Context p0){
       int i = 1;
       NetworkInfo networkInfo = p0.t(p0, i, false);
       if (networkInfo == null || !networkInfo.isConnected()) {
          i = false;
       }
       return i;
    }
    public static String G(){
       String str = null;
       try{
          Enumeration networkInter = NetworkInterface.getNetworkInterfaces();
          while (true) {
             if (networkInter.hasMoreElements()) {
                Enumeration uEnumeration = a.c(networkInter.nextElement());
                while (true) {
                   if (uEnumeration.hasMoreElements()) {
                      InetAddress inetAddress = uEnumeration.nextElement();
                      String hostAddress = inetAddress.getHostAddress();
                      if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                         return hostAddress;
                      }
                   }else {
                      continue ;
                   }
                }
                return e0;
             }else {
                goto label_0030 ;
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static int H(TelephonyManager p0){
       return p0.getNetworkType();
    }
    public static void I(boolean p0){
       p0.a = p0;
       a$a uoa = a.b(e0.b, "ENABLE_CONNECTION_INFO_CACHE").a();
       uoa.putBoolean("ENABLE_CONNECTION_INFO_CACHE", p0);
       g.a(uoa);
    }
    public static int a(Context p0,int p1){
       ServiceState serviceState;
       try{
          if (Build$VERSION.SDK_INT >= 26 && !p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
             TelephonyManager systemServic = p0.getSystemService("phone");
             if (systemServic == null) {
                return p1;
             }else {
                int i = p0.x();
                int i1 = 1;
                if (i == -1) {
                   serviceState = systemServic.getServiceState();
                }else {
                   Class[] uClassArray = new Class[i1];
                   uClassArray[0] = Integer.TYPE;
                   Method declaredMeth = TelephonyManager.class.getDeclaredMethod("getServiceStateForSubscriber", uClassArray);
                   declaredMeth.setAccessible(i1);
                   Object[] objArray1 = new Object[i1];
                   objArray1[0] = Integer.valueOf(i);
                   serviceState = declaredMeth.invoke(systemServic, objArray1);
                }
                if (serviceState == null) {
                   return p1;
                }else if(RomUtils.n()){
                   Object[] objArray = new Object[i1];
                   objArray[0] = serviceState;
                   Integer integer = a.b("com.huawei.android.telephony.ServiceStateEx", "getConfigRadioTechnology", objArray);
                   if (integer != null) {
                      p1 = integer.intValue();
                   }
                }else if(p0.E(serviceState.toString())){
                   p1 = 20;
                }
             }
          }
       label_0076 :
          return p1;
       }catch(java.lang.Exception e0){
       }
    }
    public static String b(int p0){
       switch (p0){
           case 1:
           case 4:
           case 7:
           case 11:
           case 16:
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
           case 17:
           case 5:
             return "3g";
           case 13:
           case 19:
           case 18:
             return "4g";
           case 20:
             return "5g";
           default:
             return "Notfound";
       }
    }
    public static String c(String p0){
       try{
          return URLDecoder.decode(p0, "utf-8");
       }catch(java.io.UnsupportedEncodingException e2){
          throw new RuntimeException("Error decoding url", e2);
       }
    }
    public static String d(Context p0){
       String str;
       if (p0.b) {
          return NetworkUtilsCached.a(p0);
       }
       NetworkInfo networkInfo = p0.e(p0);
       if (networkInfo != null && networkInfo.isConnected()) {
          int type = networkInfo.getType();
          if (type) {
             if (type != 1) {
             label_0029 :
                str = "unknown";
             }else {
                str = networkInfo.getTypeName();
             }
          }else {
             str = p0.h(p0);
          }
       }else {
          goto label_0029 ;
       }
       return str;
    }
    public static NetworkInfo e(Context p0){
       return p0.f(p0, false);
    }
    public static NetworkInfo f(Context p0,boolean p1){
       if (p1) {
          return r0.a(p0);
       }
       return NetworkUtilsCached.b(p0);
    }
    public static String g(Context p0){
       return p0.w(p0.e(p0));
    }
    public static String h(Context p0){
       if (p0.b) {
          return NetworkUtilsCached.d();
       }
       return p0.i(p0);
    }
    public static String i(Context p0){
       if (Build$VERSION.SDK_INT >= 29 && p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
          Log.g("UtilityBaseNetworkUtils", "getCellularGenerationInternal: NO READ_PHONE_STATE PERMISSION");
          return p0.j(p0);
       }else {
          TelephonyManager systemServic = p0.getSystemService("phone");
          if (systemServic == null) {
             return "";
          }
          int i = p0.H(systemServic);
          int i1 = p0.a(p0, i);
          if (i1 != 20) {
             return p0.b(i1);
          }
          String str = (i == 13)? "5g\(nsa\)": "5g\(sa\)";
          return str;
       }
    }
    public static String j(Context p0){
       NetworkInfo networkInfo = p0.t(p0, 0, 0);
       if (networkInfo != null && networkInfo.isConnected()) {
          return p0.b(networkInfo.getSubtype());
       }
       return "Notfound";
    }
    public static ConnectivityManager k(Context p0){
       Context applicationC = p0.getApplicationContext();
       if (applicationC == null) {
       }else {
          p0 = applicationC;
       }
       try{
          return p0.getSystemService("connectivity");
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String l(Context p0){
       WifiInfo wifiInfo = NetworkUtilsCached.e(p0);
       if (wifiInfo != null && !TextUtils.isEmpty(a.a(wifiInfo))) {
          return a.a(wifiInfo);
       }
       return "";
    }
    public static String m(Context p0){
       WifiInfo wifiInfo = NetworkUtilsCached.e(p0);
       if (wifiInfo != null) {
          return a.f(wifiInfo);
       }
       return null;
    }
    public static String n(String p0){
       try{
          return (Uri.f(p0).d()).toLowerCase(Locale.US);
       }catch(java.lang.Exception e0){
          throw new RuntimeException("Illegal url:"+p0, e0);
       }
    }
    public static String o(String p0){
       String str = "";
       if (TextUtils.isEmpty(p0)) {
          return str;
       }
       return InetAddress.getByName(p0.n(p0)).getHostAddress();
    }
    public static String p(Context p0){
       String str = "";
       try{
          String str1 = b.q();
          if (str1 != null) {
             if (!str1.equals("46000") && (str1.equals("46002") || str1.equals("46007"))) {
                str = "中国移动";
             }else if(str1.equals("46001") || str1.equals("46009")){
                str = "中国联通";
             }else if(!str1.equals("46003") && (str1.equals("46005") || str1.equals("46011"))){
                str = "中国电信";
             }else {
                str = b.r();
             }
          }
          return str;
       }catch(java.lang.Exception e0){
       }
    }
    public static int q(Context p0){
       int i = -1;
       if (!p0.A(p0)) {
          return i;
       }
       String str = b.l();
       if (!TextUtils.isEmpty(str)) {
          int i1 = 3;
          try{
             i = Integer.parseInt(str.substring(0, i1));
          }catch(java.lang.NumberFormatException e3){
             e3.printStackTrace();
          }
       }
    }
    public static int r(Context p0){
       int i = -1;
       if (!p0.A(p0)) {
          return i;
       }
       String str = b.l();
       if (!TextUtils.isEmpty(str)) {
          int i1 = 3;
          try{
             i = Integer.parseInt(str.substring(i1));
          }catch(java.lang.NumberFormatException e2){
             e2.printStackTrace();
          }
       }
    }
    public static boolean s(Context p0){
       int i = 0;
       try{
          if (Build$VERSION.SDK_INT >= 26) {
             return p0.getSystemService("phone").isDataEnabled();
          }
          Object[] objArray = new Object[i];
          return a.a(p0.k(p0), "getMobileDataEnabled", objArray).booleanValue();
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static NetworkInfo t(Context p0,int p1,boolean p2){
       if (p2) {
          return r0.b(p0, p1);
       }
       return NetworkUtilsCached.g(p1);
    }
    public static String u(Context p0){
       return p0.h(p0);
    }
    public static String v(Context p0){
       int i;
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic == null) {
          return "";
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30 && p0.checkSelfPermission("android.permission.READ_PHONE_STATE")) {
          return "";
       }
       if (sDK_INT >= 26 && RomUtils.n()) {
          try{
             Object[] objArray = new Object[0];
             i = a.a(systemServic.getServiceState(), "getHwNetworkType", objArray).intValue();
          }catch(java.lang.Exception e0){
             i = e0.getNetworkType();
          }
       }else {
          i = systemServic.getNetworkType();
       }
    }
    public static String w(NetworkInfo p0){
       if (p0 != null && p0.isConnected()) {
          int type = p0.getType();
          if (type) {
             if (type == 1) {
                return p0.getTypeName();
             }
          }else {
             String subtypeName = p0.getSubtypeName();
             if (TextUtils.isEmpty(subtypeName)) {
                subtypeName = p0.getTypeName();
             }
             return subtypeName;
          }
       }
       return "unknown";
    }
    public static int x(){
       int defaultDataS = (Build$VERSION.SDK_INT >= 24)? SubscriptionManager.getDefaultDataSubscriptionId(): -1;
       return defaultDataS;
    }
    public static int y(Context p0){
       WifiInfo wifiInfo = NetworkUtilsCached.e(p0);
       if (wifiInfo != null) {
          return wifiInfo.getRssi();
       }
       return Integer.MAX_VALUE;
    }
    public static boolean z(){
       return p0.a;
    }
}

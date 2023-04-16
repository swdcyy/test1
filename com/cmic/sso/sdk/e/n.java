package com.cmic.sso.sdk.e.n;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.g;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Boolean;
import android.os.Build$VERSION;

public class n	// class@000f68
{

    public static int a(Context p0,String p1){
       int i = 0;
       try{
          ConnectivityManager systemServic = p0.getApplicationContext().getSystemService("connectivity");
          NetworkInfo networkInfo = null;
          if (systemServic != null) {
             networkInfo = systemServic.getActiveNetworkInfo();
          }
          if (networkInfo == null || !networkInfo.isAvailable()) {
             return i;
          }else {
             int type = networkInfo.getType();
             String str = 1;
             if (type == str) {
                c.b("TelephonyUtils", "WIFI");
                boolean b = g.a(p0, "android.permission.CHANGE_NETWORK_STATE");
                c.a("TelephonyUtils", "CHANGE_NETWORK_STATE="+b);
                if (b && (!TextUtils.isEmpty(p1) && n.a(systemServic))) {
                   c.b("TelephonyUtils", "流量数据 WIFI 同开");
                   return 3;
                }else {
                   return 2;
                }
             }else if(!type){
                c.b("TelephonyUtils", "流量");
                return str;
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return i;
    }
    public static String a(){
       return Build.BRAND;
    }
    public static boolean a(Context p0){
       TelephonyManager systemServic = p0.getSystemService("phone");
       boolean b = true;
       if (systemServic != null && b == systemServic.getSimState()) {
          b = false;
       }
       return b;
    }
    public static boolean a(ConnectivityManager p0){
       int i = 0;
       try{
          Class[] uClassArray = new Class[i];
          Method declaredMeth = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", uClassArray);
          declaredMeth.setAccessible(true);
          Object[] objArray = new Object[i];
          boolean b = declaredMeth.invoke(p0, objArray).booleanValue();
          c.b("TelephonyUtils", "data is on ---------"+b);
          return b;
       }catch(java.lang.Exception e0){
          c.a(e0, "isMobileEnabled ----反射出错-----");
          return i;
       }
    }
    public static String b(){
       return Build.MODEL;
    }
    public static String c(){
       return "android"+Build$VERSION.RELEASE;
    }
    public static boolean d(){
       boolean b = (Build$VERSION.SDK_INT <= 28)? true: false;
       return b;
    }
    public static boolean e(){
       String mANUFACTURER = Build.MANUFACTURER;
       c.a("brand", mANUFACTURER);
       return ("HUAWEI").equalsIgnoreCase(mANUFACTURER);
    }
}

package com.meizu.cloud.pushsdk.b.c;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.b.i;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.b.a;
import java.lang.Class;
import com.meizu.cloud.pushsdk.b.b.c;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.b.d;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import java.lang.Exception;
import android.os.Build;

public class c	// class@0014ac
{
    public static String a = "";

    public static String a(Context p0){
       if (!TextUtils.isEmpty(c.a)) {
          return c.a;
       }
       String str = (!c.a())? c.d(p0): c.b(p0);
       c.a = str;
       return c.a;
    }
    public static boolean a(){
       String str = i.a("ro.target.product");
       if (!TextUtils.isEmpty(str)) {
          DebugLogger.i("DeviceUtils", "current product is "+str);
          return false;
       }else {
          DebugLogger.i("DeviceUtils", "current product is phone");
          return true;
       }
    }
    public static String b(Context p0){
       d b;
       String str = null;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          d uod = a.a("android.telephony.MzTelephonyManager").a("getDeviceId", uClassArray).a(objArray);
          if (uod.a != null && !TextUtils.isEmpty(uod.b)) {
             b = uod.b;
          label_0037 :
             str = b;
          }else {
             TelephonyManager systemServic = p0.getSystemService("phone");
             if (systemServic != null) {
                b = ImeiInterceptor.getDeviceId(systemServic);
                goto label_0037 ;
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return str;
    }
    public static String c(Context p0){
       return null;
    }
    public static String d(Context p0){
       StringBuilder str = "";
       String sERIAL = Build.SERIAL;
       DebugLogger.i("DeviceUtils", "device serial "+sERIAL);
       if (!TextUtils.isEmpty(sERIAL)) {
          str = str+sERIAL;
          String str1 = c.c(p0);
          DebugLogger.e("DeviceUtils", "mac address "+str1);
          if (!TextUtils.isEmpty(str1)) {
             return str+(str1.replace(":", "")).toUpperCase();
          }
       }
       return null;
    }
}

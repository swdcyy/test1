package com.ta.utdid2.a.a.e;
import java.lang.String;
import java.lang.System;
import java.util.Random;
import com.ta.utdid2.a.a.d;
import java.lang.Object;
import com.ta.utdid2.a.a.b;
import android.content.Context;
import com.ta.utdid2.a.a.c;
import android.telephony.TelephonyManager;
import com.kwai.privacykit.interceptor.ImeiInterceptor;
import com.ta.utdid2.a.a.g;
import com.ta.utdid2.a.a.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.ContentResolver;
import com.kwai.framework.deviceid.a;
import java.lang.Class;
import java.lang.reflect.Method;
import com.kwai.privacykit.interceptor.ImsiInterceptor;

public class e	// class@000cc2
{

    public static String a(){
       byte[] uobyteArray = new byte[16];
       System.arraycopy(d.getBytes((int)(System.currentTimeMillis() / 1000)), 0, uobyteArray, 0, 4);
       System.arraycopy(d.getBytes((int)System.nanoTime()), 0, uobyteArray, 4, 4);
       System.arraycopy(d.getBytes(new Random().nextInt()), 0, uobyteArray, 8, 4);
       System.arraycopy(d.getBytes(new Random().nextInt()), 0, uobyteArray, 12, 4);
       return b.encodeToString(uobyteArray, 2);
    }
    public static String a(Context p0){
       String str;
       if (!c.a() && p0 != null) {
          try{
             TelephonyManager systemServic = p0.getSystemService("phone");
             if (systemServic != null) {
                str = ImeiInterceptor.getDeviceId(systemServic);
             }
          }catch(java.lang.Exception e0){
          }
       }
       str = null;
    }
    public static String b(){
       String str = "";
       String str1 = h.get("ro.aliyun.clouduuid", str);
       if (TextUtils.isEmpty(str1)) {
          str1 = h.get("ro.sys.aliyun.clouduuid", str);
       }
       if (TextUtils.isEmpty(str1)) {
          str1 = e.c();
       }
       return str1;
    }
    public static String b(Context p0){
       String str = a.g(p0.getContentResolver(), "android_id");
       if (!TextUtils.isEmpty(str) && (!str.equalsIgnoreCase("a5f5faddde9e9f02") && (str.equalsIgnoreCase("8e17f7422b35fbea") || str.equalsIgnoreCase("0000000000000000")))) {
          return "";
       }
       return str;
    }
    public static String c(){
       String str;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          str = Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", uClassArray).invoke(null, objArray);
       }catch(java.lang.Exception e0){
          str = "";
       }
       return str;
    }
    public static String c(Context p0){
       String str;
       if (p0 != null) {
          try{
             TelephonyManager systemServic = p0.getSystemService("phone");
             if (systemServic != null) {
                str = ImsiInterceptor.getSubscriberId(systemServic);
             }
          }catch(java.lang.Exception e0){
          }
       }
       str = null;
    }
}

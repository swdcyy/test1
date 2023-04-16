package com.cmic.sso.sdk.a.d;
import java.lang.String;
import com.cmic.sso.sdk.e.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.Object;

public class d	// class@000f23
{

    public static int a(int p0){
       return k.a("sso_config_xf", "maxFailedLogTimes", p0);
    }
    public static String a(String p0){
       String str = k.a("sso_config_xf", "config_host", null);
       if (TextUtils.isEmpty(str)) {
       }else {
          p0 = str;
       }
       return p0;
    }
    public static boolean a(){
       boolean b = (System.currentTimeMillis() - k.a("sso_config_xf", "client_valid", 0) >= 0)? true: false;
       return b;
    }
    public static boolean a(boolean p0){
       String str = (!p0)? "0": "1";
       return "1".equals(k.a("sso_config_xf", "CLOSE_IPV4_LIST", str));
    }
    public static int b(int p0){
       return k.a("sso_config_xf", "pauseTime", p0);
    }
    public static String b(String p0){
       String str = k.a("sso_config_xf", "https_get_phone_scrip_host", null);
       if (TextUtils.isEmpty(str)) {
       }else {
          p0 = str;
       }
       return p0;
    }
    public static boolean b(boolean p0){
       String str = (!p0)? "0": "1";
       return "1".equals(k.a("sso_config_xf", "CLOSE_IPV6_LIST", str));
    }
    public static String c(String p0){
       String str = k.a("sso_config_xf", "logHost", "");
       if (TextUtils.isEmpty(str)) {
       }else {
          p0 = str;
       }
       return p0;
    }
    public static boolean c(boolean p0){
       String str = (!p0)? "0": "1";
       str = ("1".equals(k.a("sso_config_xf", "CLOSE_M008_APPID_LIST", str)) || "1".equals(k.a("sso_config_xf", "CLOSE_M008_SDKVERSION_LIST", str)))? true: false;
       return str;
    }
    public static boolean d(boolean p0){
       String str = (p0)? "CU": "";
       return (k.a("sso_config_xf", "CLOSE_FRIEND_WAPKS", str)).contains("CU");
    }
    public static boolean e(boolean p0){
       String str = (p0)? "CT": "";
       return (k.a("sso_config_xf", "CLOSE_FRIEND_WAPKS", str)).contains("CT");
    }
    public static boolean f(boolean p0){
       String str = (p0)? "1": "0";
       return "1".equals(k.a("sso_config_xf", "CLOSE_LOGS_VERSION", str));
    }
}

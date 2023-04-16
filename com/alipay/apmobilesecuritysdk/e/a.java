package com.alipay.apmobilesecuritysdk.e.a;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.e.b;
import x6.a;
import org.json.JSONObject;
import java.lang.Throwable;
import com.alipay.apmobilesecuritysdk.c.a;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.a;
import java.lang.Object;

public final class a	// class@000e6c
{

    public static b a(String p0){
       b uob;
       try{
          if (!a.c(p0)) {
             JSONObject jSONObject = new JSONObject(p0);
             String str = jSONObject.optString("apdid");
             String str1 = jSONObject.optString("deviceInfoHash");
             uob = new b(str, str1, jSONObject.optString("timestamp"));
          label_0028 :
             return uob;
          }
       }catch(java.lang.Exception e4){
          a.a(e4);
       }
       uob = null;
       goto label_0028 ;
    }
    public static synchronized void a(){
       _monitor_enter(a.class);
       _monitor_exit(a.class);
    }
    public static synchronized void a(Context p0){
       _monitor_enter(a.class);
       a.a(p0, "vkeyid_profiles_v3", "deviceid", "");
       a.a("wxcasxx_v3", "wxcasxx", "");
       _monitor_exit(a.class);
    }
    public static synchronized void a(Context p0,b p1){
       _monitor_enter(a.class);
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("apdid", p1.a);
          jSONObject.put("deviceInfoHash", p1.b);
          jSONObject.put("timestamp", p1.c);
          String str = jSONObject.toString();
          a.a(p0, "vkeyid_profiles_v3", "deviceid", str);
          a.a("wxcasxx_v3", "wxcasxx", str);
          _monitor_exit(a.class);
          return;
       }catch(java.lang.Exception e4){
          a.a(e4);
          _monitor_exit(v0);
          return;
       }
    }
    public static synchronized b b(){
       _monitor_enter(a.class);
       String str = a.a("wxcasxx_v3", "wxcasxx");
       if (a.c(str)) {
          _monitor_exit(a.class);
          return null;
       }else {
          _monitor_exit(a.class);
          return a.a(str);
       }
    }
    public static synchronized b b(Context p0){
       _monitor_enter(a.class);
       String str = a.a(p0, "vkeyid_profiles_v3", "deviceid");
       if (a.c(str)) {
          str = a.a("wxcasxx_v3", "wxcasxx");
       }
       _monitor_exit(a.class);
       return a.a(str);
    }
    public static synchronized b c(Context p0){
       _monitor_enter(a.class);
       String str = a.a(p0, "vkeyid_profiles_v3", "deviceid");
       if (a.c(str)) {
          _monitor_exit(a.class);
          return null;
       }else {
          _monitor_exit(a.class);
          return a.a(str);
       }
    }
}

package com.alipay.apmobilesecuritysdk.e.d;
import java.lang.String;
import com.alipay.apmobilesecuritysdk.e.c;
import x6.a;
import org.json.JSONObject;
import java.lang.Throwable;
import com.alipay.apmobilesecuritysdk.c.a;
import android.content.Context;
import com.alipay.apmobilesecuritysdk.f.a;
import java.lang.Object;

public final class d	// class@000e6f
{

    public static c a(String p0){
       c uoc;
       try{
          if (!a.c(p0)) {
             JSONObject jSONObject = new JSONObject(p0);
             c uoc1 = new c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString("tid"), jSONObject.optString("utdid"));
          label_0035 :
             return uoc;
          }
       }catch(java.lang.Exception e7){
          a.a(e7);
       }
       uoc = null;
       goto label_0035 ;
    }
    public static synchronized void a(){
       _monitor_enter(d.class);
       _monitor_exit(d.class);
    }
    public static synchronized void a(Context p0){
       _monitor_enter(d.class);
       a.a(p0, "vkeyid_profiles_v4", "key_deviceid_v4", "");
       a.a("wxcasxx_v4", "key_wxcasxx_v4", "");
       _monitor_exit(d.class);
    }
    public static synchronized void a(Context p0,c p1){
       _monitor_enter(d.class);
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("apdid", p1.a);
          jSONObject.put("deviceInfoHash", p1.b);
          try{
             String str = "timestamp";
             jSONObject.put(str, p1.c);
             jSONObject.put("tid", p1.d);
             jSONObject.put("utdid", p1.e);
             String str1 = jSONObject.toString();
             a.a(p0, "vkeyid_profiles_v4", "key_deviceid_v4", str1);
             a.a("wxcasxx_v4", "key_wxcasxx_v4", str1);
             _monitor_exit(d.class);
             return;
          }catch(java.lang.Exception e4){
             a.a(e4);
             _monitor_exit(d.class);
             return;
          }
       }catch(java.lang.Exception e4){
       }
    }
    public static synchronized c b(){
       _monitor_enter(d.class);
       String str = a.a("wxcasxx_v4", "key_wxcasxx_v4");
       if (a.c(str)) {
          _monitor_exit(d.class);
          return null;
       }else {
          _monitor_exit(d.class);
          return d.a(str);
       }
    }
    public static synchronized c b(Context p0){
       _monitor_enter(d.class);
       String str = a.a(p0, "vkeyid_profiles_v4", "key_deviceid_v4");
       if (a.c(str)) {
          str = a.a("wxcasxx_v4", "key_wxcasxx_v4");
       }
       _monitor_exit(d.class);
       return d.a(str);
    }
    public static synchronized c c(Context p0){
       _monitor_enter(d.class);
       String str = a.a(p0, "vkeyid_profiles_v4", "key_deviceid_v4");
       if (a.c(str)) {
          _monitor_exit(d.class);
          return null;
       }else {
          _monitor_exit(d.class);
          return d.a(str);
       }
    }
}

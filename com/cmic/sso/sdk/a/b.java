package com.cmic.sso.sdk.a.b;
import java.lang.Object;
import com.cmic.sso.sdk.a.a$a;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.a;
import org.json.JSONObject;
import com.cmic.sso.sdk.a.b$a;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.a.d;
import com.cmic.sso.sdk.a.b$2;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.e.o;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.e.k;
import java.lang.Integer;
import java.lang.System;
import com.cmic.sso.sdk.e.c;
import java.lang.Exception;
import com.cmic.sso.sdk.c.c.a;
import com.cmic.sso.sdk.a.b$1;
import com.cmic.sso.sdk.c.c.d;

public class b	// class@000f21
{
    public a a;
    public final a b;
    public boolean d;
    public b$a e;
    public static b c;

    public void b(boolean p0){
       super();
       this.d = false;
       a uoa = new a$a().a();
       this.b = uoa;
       this.a = (!p0)? this.d(): uoa;
       return;
    }
    public static a a(b p0){
       return p0.d();
    }
    public static a a(b p0,a p1){
       p0.a = p1;
       return p1;
    }
    public static b a(boolean p0){
       if (b.c == null) {
          _monitor_enter(b.class);
          if (b.c == null) {
             b.c = new b(p0);
          }
          _monitor_exit(b.class);
       }
       return b.c;
    }
    public static void a(b p0,a p1){
       p0.b(p1);
    }
    public static void a(b p0,JSONObject p1){
       p0.a(p1);
    }
    public static boolean a(b p0,boolean p1){
       p0.d = p1;
       return p1;
    }
    public static b$a b(b p0){
       return p0.e;
    }
    public static a c(b p0){
       return p0.a;
    }
    public a a(){
       return this.b;
    }
    public final String a(String p0,String p1){
       object oobject;
       String[] stringArray = p0.split("&");
       int len = stringArray.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = stringArray[i];
             if (oobject.contains(p1)) {
             label_0018 :
                if (!TextUtils.isEmpty(oobject)) {
                   oobject = oobject.substring((oobject.lastIndexOf("=") + 1));
                   break ;
                }
                break ;
             }else {
                i = i + 1;
             }
          }else {
             oobject = "";
             goto label_0018 ;
          }
       }
       return oobject;
    }
    public void a(b$a p0){
       this.e = p0;
    }
    public void a(a p0){
       if (d.a()) {
          o.a(new b$2(this, p0));
       }
       return;
    }
    public final void a(JSONObject p0){
       b uob = this;
       JSONObject jSONObject = p0;
       String str = "LOGS_CONTROL";
       String str1 = "M009";
       String str2 = "M008";
       String str3 = "M007";
       String str4 = "CHANGE_HOST";
       String str5 = "Configlist";
       String str6 = "client_valid";
       k$a uoa = k.a("sso_config_xf");
       try{
          if (jSONObject.has(str6)) {
             uoa.a(str6, (System.currentTimeMillis() + ((((long)Integer.parseInt(jSONObject.getString(str6)) * 60) * 60) * 1000)));
          }
          if (jSONObject.has(str5)) {
             jSONObject = jSONObject.getJSONObject(str5);
             if (jSONObject.has(str4)) {
                str4 = jSONObject.getString(str4);
                if (str4.contains(str3)) {
                   str3 = uob.a(str4, str3);
                   if (!TextUtils.isEmpty(str3)) {
                      uoa.a("logHost", str3);
                   }
                }
                if (str4.contains(str2)) {
                   str2 = uob.a(str4, str2);
                   if (!TextUtils.isEmpty(str2)) {
                      uoa.a("https_get_phone_scrip_host", str2);
                   }
                }
                if (str4.contains(str1)) {
                   str1 = uob.a(str4, str1);
                   if (!TextUtils.isEmpty(str1)) {
                      uoa.a("config_host", str1);
                   }
                }
             }else {
                uoa.a("logHost");
                uoa.a("https_get_phone_scrip_host");
                uoa.a("config_host");
             }
             uob.a(jSONObject, "CLOSE_FRIEND_WAPKS", "0", uoa);
             uob.a(jSONObject, "CLOSE_LOGS_VERSION", "0", uoa);
             uob.a(jSONObject, "CLOSE_IPV4_LIST", "0", uoa);
             uob.a(jSONObject, "CLOSE_IPV6_LIST", "0", uoa);
             uob.a(jSONObject, "CLOSE_M008_SDKVERSION_LIST", "0", uoa);
             uob.a(jSONObject, "CLOSE_M008_APPID_LIST", "0", uoa);
             if (jSONObject.has(str)) {
                String[] stringArray = ((jSONObject.getString(str)).replace("h", "")).split("&");
                if (stringArray.length == 2) {
                   int i = 0;
                   if (!TextUtils.isEmpty(stringArray[i]) && !TextUtils.isEmpty(stringArray[1])) {
                      try{
                         uoa.a("maxFailedLogTimes", Integer.parseInt(stringArray[i]));
                         uoa.a("pauseTime", Integer.parseInt(stringArray[1]));
                      }catch(java.lang.Exception e0){
                         c.a("UmcConfigHandle", "解析日志上报限制时间次数异常");
                      }
                   }
                }
             }else {
                uoa.a("maxFailedLogTimes");
                uoa.a("pauseTime");
             }
          }
       }catch(java.lang.Exception e0){
          c.a("UmcConfigHandle", "配置项异常，配置失效");
          e0.printStackTrace();
       }
       return;
    }
    public final void a(JSONObject p0,String p1,String p2,k$a p3){
       if (p0.has(p1)) {
          String str = p0.optString(p1, p2);
          if (!("CLOSE_FRIEND_WAPKS").equals(p1)) {
             if (!("0").equals(str) && !("1").equals(str)) {
                return;
             }
          }else if(TextUtils.isEmpty(str) || (!str.contains("CU") && (!str.contains("CT") && !str.contains("CM")))){
             return;
          }
          p3.a(p1, p0.optString(p1, p2));
       }else {
          p3.a(p1);
       }
       return;
    }
    public a b(){
       return this.a;
    }
    public final void b(a p0){
       if (this.d != null) {
          c.a("UmcConfigHandle", "正在获取配置中...");
          return;
       }else {
          this.d = true;
          a.a().a(false, p0, new b$1(this));
          return;
       }
    }
    public void c(){
       k$a uoa = k.a("sso_config_xf");
       uoa.c();
       uoa.b();
    }
    public final a d(){
       return new a$a().a(d.b(this.b.a())).c(d.a(this.b.c())).b(d.b(this.b.b())).d(d.c(this.b.d())).d(d.a(this.b.h())).e(d.b(this.b.i())).a(d.e(this.b.e())).b(d.d(this.b.f())).c(d.c(this.b.g())).f(d.f(this.b.j())).a(d.a(this.b.k())).b(d.b(this.b.l())).a();
    }
}

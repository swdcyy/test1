package com.cmic.sso.sdk.auth.a;
import android.content.Context;
import java.lang.Object;
import com.cmic.sso.sdk.c.c.a;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.auth.b;
import java.lang.String;
import org.json.JSONObject;
import com.cmic.sso.sdk.e.l;
import com.cmic.sso.sdk.e.d;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.auth.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.b$a;
import com.cmic.sso.sdk.e.a;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.e.k;
import org.json.JSONException;
import java.lang.StringBuilder;
import java.lang.Long;
import com.cmic.sso.sdk.e.h;
import java.util.UUID;
import java.lang.Exception;
import com.cmic.sso.sdk.auth.a$1;
import com.cmic.sso.sdk.c.c.d;

public class a	// class@000f30
{
    public final a a;
    public final Context b;
    public static a c;

    public void a(Context p0){
       super();
       this.b = p0.getApplicationContext();
       this.a = a.a();
    }
    public static a a(Context p0){
       if (a.c == null) {
          _monitor_enter(a.class);
          if (a.c == null) {
             a.c = new a(p0);
          }
          _monitor_exit(a.class);
       }
       return a.c;
    }
    public static void a(a p0,a p1,b p2,String p3,String p4,JSONObject p5){
       p0.a(p1, p2, p3, p4, p5);
    }
    public final void a(a p0){
       String packageName = this.b.getPackageName();
       p0.a("apppackage", packageName);
       p0.a("appsign", d.a(l.a(this.b, packageName)));
    }
    public void a(a p0,b p1){
       c.b("AuthnBusiness", "LoginCheck method start");
       int i = p0.c("logintype");
       if (p0.b("isCacheScrip", false)) {
          String str = p0.b("securityphone", "");
          if (i == 3) {
             p1.a("103000", "true", p0, c.a(str));
          }else {
             this.b(p0, p1);
          }
          return;
       }else {
          this.b(p0, p1);
          return;
       }
    }
    public final void a(a p0,b p1,String p2,String p3,JSONObject p4){
       JSONException jSONExceptio;
       int i;
       int i1;
       int i2;
       JSONObject jSONObject1;
       String str6;
       int i3;
       a uoa = p0;
       b uob = p1;
       Object obj = p2;
       String str = p3;
       JSONObject jSONObject = p4;
       String str1 = "phonescrip";
       String str2 = "openId";
       String str3 = "securityphone";
       if (("103000").equals(obj)) {
          String str4 = jSONObject.optString("resultdata");
          String str5 = (TextUtils.isEmpty(str4))? p4.toString(): a.b(uoa.a(b$a.a), str4);
          str4 = null;
          try{
             try{
                jSONObject1 = new JSONObject(str5);
                c.a("resultJson", jSONObject1.toString());
                i1 = jSONObject1.optString(str1);
                try{
                   k$a uoa1 = k.a();
                   str6 = jSONObject1.optString(str3);
                   try{
                      uoa1.a(str3, str6);
                      str4 = jSONObject1.optString(str2);
                      if (TextUtils.isEmpty(str4)) {
                         str4 = jSONObject1.optString("pcid");
                      }
                      uoa1.b();
                   }catch(org.json.JSONException e0){
                      jSONExceptio = e0;
                      i = str4;
                      i3 = jSONObject1;
                   }
                }catch(org.json.JSONException e0){
                   i2 = str4;
                }
                i3 = jSONObject1;
                jSONExceptio = e0;
                i = i2;
             }catch(org.json.JSONException e0){
                i1 = str4;
                i2 = i1;
                goto label_0078 ;
             }
          }catch(org.json.JSONException e0){
             jSONExceptio = e0;
             i = str4;
             i1 = i;
             i2 = i1;
          }
          str5 = i2;
          str6 = i1;
          String str7 = "AuthnBusiness";
          c.b(str7, "securityPhone  = "+str5);
          uoa.a(str2, str4);
          uoa.a(str1, str6);
          uoa.a(str3, str5);
          if (jSONObject1) {
             h.a(this.b, str6, Long.parseLong(jSONObject1.optString("scripExpiresIn", "0")), uoa.b("scripKey", ""), uoa.b("scripType", ""));
             if (uoa.c("logintype") == 3) {
                uob.a(obj, "true", uoa, c.a(str5));
             }else {
                uob.a(obj, str, uoa, jSONObject1);
             }
          }else {
             c.a(str7, "返回103000，但是数据解析出错");
             uob.a(String.valueOf(0x18f4f), "数据解析异常", uoa, c.a(String.valueOf(0x18f4f), "数据解析异常"));
             return;
          }
       }else if(uoa.c("logintype") == 3){
          uob.a(obj, "true", uoa, c.b(p2, p3));
       }else {
          uob.a(obj, str, uoa, jSONObject);
       }
       return;
    }
    public final void b(a p0){
       int i = 0;
       byte[] uobyteArray = new byte[i];
       String str = "AuthnBusiness";
       if (p0.b("use2048PublicKey", i)) {
          c.a(str, "使用2048公钥对应的对称秘钥生成方式");
          uobyteArray = a.a();
       }else {
          String str1 = "使用1024公钥对应的对称秘钥生成方式";
          try{
             c.a(str, str1);
             uobyteArray = ((UUID.randomUUID().toString()).substring(i, 16)).getBytes("utf-8");
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
    public final void b(a p0,b p1){
       c.b("AuthnBusiness", "getScripAndToken start");
       this.a(p0);
       if (!p0.b("isCacheScrip", false)) {
          this.b(p0);
       }
       String str = "logintype";
       if (p0.c(str) == 1) {
          p0.a("userCapaid", "200");
       }else if(!p0.c(str)){
          p0.a("userCapaid", "50");
       }
       this.a.a(p0, new a$1(this, p0, p1));
       return;
    }
}

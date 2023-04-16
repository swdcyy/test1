package com.cmic.sso.sdk.auth.AuthnHelper;
import android.content.Context;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.cmic.sso.sdk.auth.a;
import com.cmic.sso.sdk.e.s;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.e.j;
import com.cmic.sso.sdk.auth.AuthnHelper$1;
import com.cmic.sso.sdk.e.o$a;
import com.cmic.sso.sdk.e.o;
import java.lang.String;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.auth.TokenListener;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.r;
import com.cmic.sso.sdk.d.a;
import com.cmic.sso.sdk.e.e;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.k$a;
import com.cmic.sso.sdk.auth.AuthnHelper$7;
import com.cmic.sso.sdk.auth.AuthnHelper$a;
import java.lang.Runnable;
import com.cmic.sso.sdk.auth.AuthnHelper$5;
import com.cmic.sso.sdk.auth.b;
import com.cmic.sso.sdk.a.c;
import com.cmic.sso.sdk.a.a;
import android.os.SystemClock;
import com.cmic.sso.sdk.e.p;
import com.cmic.sso.sdk.e.g;
import com.cmic.sso.sdk.b.b;
import com.cmic.sso.sdk.b.b$b;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.cmic.sso.sdk.e.n;
import com.cmic.sso.sdk.e.h;
import org.json.JSONObject;
import com.cmic.sso.sdk.auth.c;
import com.cmic.sso.sdk.auth.AuthnHelper$6;
import java.lang.Exception;
import org.json.JSONException;
import com.cmic.sso.sdk.auth.AuthnHelper$4;
import com.cmic.sso.sdk.auth.AuthnHelper$2;
import com.cmic.sso.sdk.auth.AuthnHelper$3;

public class AuthnHelper	// class@000f2d
{
    public final a a;
    public final Context b;
    public long d;
    public final Handler e;
    public String f;
    public final Object g;
    public static AuthnHelper c;

    public void AuthnHelper(Context p0){
       super();
       this.d = 8000;
       this.g = new Object();
       p0 = p0.getApplicationContext();
       this.b = p0;
       this.e = new Handler(p0.getMainLooper());
       this.a = a.a(p0);
       s.a(p0);
       k.a(p0);
       j.a(p0);
       o.a(new AuthnHelper$1(this));
    }
    public void AuthnHelper(Context p0,String p1){
       super(p0);
       this.f = p1;
    }
    public static void a(AuthnHelper p0){
       p0.a();
    }
    public static void a(AuthnHelper p0,a p1){
       p0.a(p1);
    }
    public static boolean a(AuthnHelper p0,a p1,String p2,String p3,String p4,int p5,TokenListener p6){
       return p0.a(p1, p2, p3, p4, p5, p6);
    }
    public static Context b(AuthnHelper p0){
       return p0.b;
    }
    public static Handler c(AuthnHelper p0){
       return p0.e;
    }
    public static AuthnHelper getInstance(Context p0){
       if (AuthnHelper.c == null) {
          _monitor_enter(AuthnHelper.class);
          if (AuthnHelper.c == null) {
             AuthnHelper.c = new AuthnHelper(p0);
          }
          _monitor_exit(AuthnHelper.class);
       }
       return AuthnHelper.c;
    }
    public static AuthnHelper getInstance(Context p0,String p1){
       if (AuthnHelper.c == null) {
          _monitor_enter(AuthnHelper.class);
          if (AuthnHelper.c == null) {
             AuthnHelper.c = new AuthnHelper(p0, p1);
          }
          _monitor_exit(AuthnHelper.class);
       }
       return AuthnHelper.c;
    }
    public static void setDebugMode(boolean p0){
       c.a(p0);
    }
    public final a a(TokenListener p0){
       a uoa = new a(64);
       String str = r.b();
       uoa.a(new a());
       uoa.a("traceId", str);
       c.a("traceId", str);
       if (p0 != null) {
          e.a(str, p0);
       }
       return uoa;
    }
    public final void a(){
       String str = "%"+r.a();
       c.b("AuthnHelper", "generate aid = "+str);
       k$a uoa = k.a();
       uoa.a("AID", str);
       uoa.b();
    }
    public final void a(Context p0,String p1,a p2){
       o.a(new AuthnHelper$7(this, p1, p0, p2));
    }
    public final void a(a p0){
       AuthnHelper$a uoa = new AuthnHelper$a(this, p0);
       this.e.postDelayed(uoa, this.d);
       this.a.a(p0, new AuthnHelper$5(this, uoa));
    }
    public final boolean a(a p0,String p1,String p2,String p3,int p4,TokenListener p5){
       a uoa = c.a(this.b).a();
       p0.a(uoa);
       p0.a("use2048PublicKey", ("rsa2048").equals(this.f));
       p0.a("systemStartTime", SystemClock.elapsedRealtime());
       p0.a("starttime", p.a());
       p0.a("loginMethod", p3);
       p0.a("appkey", p2);
       p0.a("appid", p1);
       p0.a("timeOut", String.valueOf(this.d));
       int b = g.a(this.b, "android.permission.READ_PHONE_STATE");
       c.a("AuthnHelper", "有READ_PHONE_STATE权限？"+b);
       p0.a("hsaReadPhoneStatePermission", b);
       b.a().a(this.b, b);
       p0.a("networkClass", b.a().a(this.b));
       p0.a("simCardNum", String.valueOf(b.a().b().h()));
       b = j.a().b();
       String str = j.a().e();
       String str1 = j.a().c();
       String str2 = j.a().a(false);
       p0.a("imsi", b);
       p0.a("operatortype", str2);
       p0.a("iccid", str);
       p0.a("logintype", p4);
       c.b("AuthnHelper", "iccid = "+str);
       c.b("AuthnHelper", "imsi = "+b);
       c.b("AuthnHelper", "subId = "+str1);
       if (!TextUtils.isEmpty(b)) {
          c.a("AuthnHelper", "使用imsi作为缓存key = "+b);
          p0.a("scripType", "imsi");
          p0.a("scripKey", b);
       }else if(!TextUtils.isEmpty(str)){
          c.a("AuthnHelper", "使用iccid作为缓存key = "+str);
          p0.a("scripType", "iccid");
          p0.a("scripKey", str);
       }else if(!TextUtils.isEmpty(str1)){
          c.a("AuthnHelper", "使用subId作为缓存key = "+str1);
          p0.a("scripType", "subid");
          p0.a("scripKey", str1);
       }else if(!TextUtils.isEmpty(str2)){
          c.a("AuthnHelper", "使用operator作为缓存key = "+str2);
          p0.a("scripType", "operator");
          p0.a("scripKey", str2);
       }
       b = n.a(this.b, str2);
       p0.a("networktype", b);
       AuthnHelper tg = this.g;
       _monitor_enter(tg);
       boolean b1 = h.a(p0);
       if (b1) {
          p0.a("securityphone", k.b("securityphone", ""));
          if (3 != p4 && b) {
             String str3 = h.a(this.b);
             String str4 = "AuthnHelper";
             StringBuilder str5 = "解密phoneScript ";
             boolean b2 = (!TextUtils.isEmpty(str3))? true: false;
             c.b(str4, str5+b2);
             if (!TextUtils.isEmpty(str3)) {
                p0.a("phonescrip", str3);
             }else {
                b1 = false;
             }
             h.a(true, false);
          }
       }
       p0.a("isCacheScrip", b1);
       c.b("AuthnHelper", "isCachePhoneScrip = "+b1);
       _monitor_exit(tg);
       if (p5 == null) {
          this.callBackResult("102203", "listener不能为空", p0, null);
          return false;
       }else if(uoa.g()){
          this.callBackResult("200082", "服务器繁忙，请稍后重试", p0, null);
          return false;
       }else if(p1 == null){
          p1 = "";
       }else {
          p1 = p1.trim();
       }
       if (TextUtils.isEmpty(p1)) {
          this.callBackResult("102203", "appId 不能为空", p0, null);
          return false;
       }else if(p2 == null){
          p1 = "";
       }else {
          p1 = p2.trim();
       }
       if (TextUtils.isEmpty(p1)) {
          this.callBackResult("102203", "appkey不能为空", p0, null);
          return false;
       }else if(!b){
          this.callBackResult("102101", "未检测到网络", p0, null);
          return false;
       }else if(TextUtils.isEmpty(str2)){
          p0.a("authType", String.valueOf(false));
          this.callBackResult("200010", "无法识别sim卡或没有sim卡", p0, null);
          return false;
       }else if(b == 2 && !b1){
          this.callBackResult("102103", "无数据网络", p0, null);
          return false;
       }else if(("2").equals(str2) && uoa.f()){
          this.callBackResult("200082", "服务器繁忙，请稍后重试", p0, null);
          return false;
       }else if(("3").equals(str2) && uoa.e()){
          this.callBackResult("200082", "服务器繁忙，请稍后重试", p0, null);
          return false;
       }else {
          return true;
       }
    }
    public void callBackResult(String p0,String p1,a p2,JSONObject p3){
       try{
          String str = p2.b("traceId");
          if (!e.a(str)) {
             _monitor_enter(this);
             TokenListener tokenListene = e.c(str);
             e.b(str);
             if (tokenListene == null) {
                _monitor_exit(this);
                return;
             }else {
                _monitor_exit(this);
                p2.a("systemEndTime", SystemClock.elapsedRealtime());
                p2.a("endtime", p.a());
                int i = p2.c("logintype");
                if (p3 == null) {
                   p3 = c.a(p0, p1);
                }
                JSONObject jSONObject = (i == 3)? c.a(p0, p2, p3): c.a(p0, p1, p2, p3);
                jSONObject.put("scripExpiresIn", String.valueOf(h.b()));
                this.e.post(new AuthnHelper$6(this, tokenListene, jSONObject));
                c.a(this.b).a(p2);
                if (!p2.b().j() && !r.a(p2.b())) {
                   this.a(this.b, p0, p2);
                }
                if (e.a()) {
                   s.a(this.b).b();
                }
             }
          }
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
    public void delScrip(){
       boolean b = true;
       try{
          h.a(b, b);
          c.b("AuthnHelper", "删除scrip");
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public JSONObject getNetworkType(Context p0){
       JSONObject jSONObject;
       String str = "AuthnHelper";
       try{
          jSONObject = new JSONObject();
          b.a().a(p0, g.a(p0, "android.permission.READ_PHONE_STATE"));
          String str1 = j.a().a(true);
          int i = n.a(p0, str1);
          jSONObject.put("operatortype", str1);
          jSONObject.put("networktype", i+"");
          c.b(str, "网络类型: "+i);
          c.b(str, "运营商类型: "+str1);
          return jSONObject;
       }catch(java.lang.Exception e0){
          try{
             jSONObject.put("errorDes", "发生未知错误");
          }catch(org.json.JSONException e7){
             e7.printStackTrace();
          }
          return jSONObject;
       }
    }
    public void getPhoneInfo(String p0,String p1,TokenListener p2){
       a uoa = this.a(p2);
       AuthnHelper$4 u4 = new AuthnHelper$4(this, this.b, uoa, uoa, p0, p1, p2);
       o.a(v8);
    }
    public void loginAuth(String p0,String p1,TokenListener p2){
       a uoa = this.a(p2);
       AuthnHelper$2 u2 = new AuthnHelper$2(this, this.b, uoa, uoa, p0, p1, p2);
       o.a(v8);
    }
    public void mobileAuth(String p0,String p1,TokenListener p2){
       a uoa = this.a(p2);
       AuthnHelper$3 u3 = new AuthnHelper$3(this, this.b, uoa, uoa, p0, p1, p2);
       o.a(v8);
    }
    public void setOverTime(long p0){
       this.d = p0;
    }
}

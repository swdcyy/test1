package com.cmic.sso.sdk.d.a;
import com.cmic.sso.sdk.c.b.g;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.String;
import org.json.JSONArray;
import org.json.JSONObject;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONException;

public class a extends g	// class@000f56
{
    public String A;
    public String B;
    public String C;
    public String D;
    public CopyOnWriteArrayList a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public JSONArray o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public String z;

    public void a(){
       super();
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = null;
       this.j = null;
       this.k = "";
       this.l = null;
       this.m = null;
       this.n = null;
       this.p = null;
       this.q = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = null;
       this.v = null;
       this.w = null;
       this.x = null;
       this.y = null;
       this.a = new CopyOnWriteArrayList();
    }
    public void A(String p0){
       this.A = p0;
    }
    public void B(String p0){
       this.B = p0;
    }
    public void C(String p0){
       this.C = p0;
    }
    public void D(String p0){
       this.D = p0;
    }
    public String a(){
       return null;
    }
    public String a(String p0){
       return null;
    }
    public void a(JSONArray p0){
       this.o = p0;
    }
    public JSONObject b(){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("appid", this.b);
          jSONObject.put("traceId", this.c);
          jSONObject.put("appName", this.d);
          jSONObject.put("appVersion", this.e);
          jSONObject.put("sdkVersion", "quick_login_android_9.5.1");
          jSONObject.put("clientType", "android");
          jSONObject.put("timeOut", this.f);
          jSONObject.put("requestTime", this.g);
          jSONObject.put("responseTime", this.h);
          jSONObject.put("elapsedTime", this.i);
          jSONObject.put("requestType", this.j);
          jSONObject.put("interfaceType", this.k);
          jSONObject.put("interfaceCode", this.l);
          jSONObject.put("interfaceElasped", this.m);
          jSONObject.put("loginType", this.n);
          jSONObject.put("exceptionStackTrace", this.o);
          jSONObject.put("operatorType", this.p);
          jSONObject.put("networkType", this.q);
          jSONObject.put("networkClass", this.r);
          jSONObject.put("brand", this.s);
          jSONObject.put("reqDevice", this.t);
          jSONObject.put("reqSystem", this.u);
          jSONObject.put("simCardNum", this.v);
          jSONObject.put("imsiState", this.w);
          jSONObject.put("resultCode", this.x);
          jSONObject.put("is_root", this.y);
          jSONObject.put("is_phoneStatePermission", this.z);
          jSONObject.put("AID", this.A);
          jSONObject.put("sysOperType", this.B);
          jSONObject.put("scripType", this.C);
          if (!TextUtils.isEmpty(this.D)) {
             jSONObject.put("eip", this.D);
          }
       }catch(org.json.JSONException e1){
          e1.printStackTrace();
       }
       return jSONObject;
    }
    public void b(String p0){
       this.b = p0;
    }
    public void c(String p0){
       this.z = p0;
    }
    public void d(String p0){
       this.w = p0;
    }
    public void e(String p0){
       this.x = p0;
    }
    public void f(String p0){
       this.y = p0;
    }
    public void g(String p0){
       this.s = p0;
    }
    public void h(String p0){
       this.m = p0;
    }
    public void i(String p0){
       this.l = p0;
    }
    public void j(String p0){
       this.k = p0;
    }
    public void k(String p0){
       this.d = p0;
    }
    public void l(String p0){
       this.e = p0;
    }
    public void m(String p0){
       this.f = p0;
    }
    public void n(String p0){
       this.i = p0;
    }
    public void o(String p0){
       this.v = p0;
    }
    public void p(String p0){
       this.p = p0;
    }
    public void q(String p0){
       this.t = p0;
    }
    public void r(String p0){
       this.u = p0;
    }
    public void s(String p0){
       this.n = p0;
    }
    public void t(String p0){
       this.c = p0;
    }
    public void u(String p0){
       this.g = p0;
    }
    public void v(String p0){
       this.r = p0;
    }
    public void x(String p0){
       this.h = p0;
    }
    public void y(String p0){
       this.j = p0;
    }
    public void z(String p0){
       this.q = p0;
    }
}

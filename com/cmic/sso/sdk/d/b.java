package com.cmic.sso.sdk.d.b;
import java.lang.Object;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.d.a;
import java.lang.String;
import com.cmic.sso.sdk.e.h;
import com.cmic.sso.sdk.e.n;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.e.j;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.c;
import android.content.Context;
import com.cmic.sso.sdk.e.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import java.util.Iterator;
import java.lang.Throwable;
import java.lang.StringBuffer;
import org.json.JSONObject;
import java.lang.StackTraceElement;
import java.lang.Exception;
import com.cmic.sso.sdk.c.c.a;
import com.cmic.sso.sdk.d.b$1;
import com.cmic.sso.sdk.c.c.d;

public class b	// class@000f58
{
    public a a;

    public void b(){
       super();
    }
    public static a a(b p0){
       return p0.a;
    }
    public static void a(a p0,a p1){
       if (p0 != null && p1 != null) {
          String str = "";
          p0.b(p1.b("appid", str));
          String str1 = (h.a())? "1": "0";
          p0.f(str1);
          p0.g(n.a());
          p0.j(p1.b("interfaceType", str));
          p0.i(p1.b("interfaceCode", str));
          p0.h(p1.b("interfaceElasped", str));
          p0.m(p1.b("timeOut"));
          p0.t(p1.b("traceId"));
          p0.v(p1.b("networkClass"));
          p0.o(p1.b("simCardNum"));
          p0.p(p1.b("operatortype"));
          p0.q(n.b());
          p0.r(n.c());
          p0.z(String.valueOf(p1.b("networktype", 0)));
          p0.u(p1.b("starttime"));
          p0.x(p1.b("endtime"));
          p0.n(String.valueOf((p1.b("systemEndTime", 0) - p1.b("systemStartTime", 0))));
          p0.d(p1.b("imsiState"));
          p0.A(k.b("AID", str));
          p0.B(j.a().f());
          p0.C(p1.b("scripType"));
          p0.D(p1.b("eipKey"));
          c.a("SendLog", "traceId"+p1.b("traceId"));
       }
       return;
    }
    public void a(Context p0,String p1,a p2){
       String str = "";
       try{
          a uoa = p2.a();
          StringBuffer str1 = f.b(p0);
          uoa.e(p1);
          uoa.y(p2.b("loginMethod", str));
          if (p2.b("isCacheScrip", false)) {
             uoa.s("scrip");
          }else {
             uoa.s("pgw");
          }
          uoa.k(f.a(p0));
          if (!TextUtils.isEmpty(str1)) {
             str = str1;
          }
          uoa.l(str);
          String str2 = (p2.b("hsaReadPhoneStatePermission", false))? "1": "0";
          uoa.c(str2);
          b.a(uoa, p2);
          JSONArray jSONArray = null;
          if (uoa.a.size() > 0) {
             jSONArray = new JSONArray();
             Iterator iterator = uoa.a.iterator();
             while (iterator.hasNext()) {
                Throwable throwable = iterator.next();
                str1 = "";
                JSONObject jSONObject = new JSONObject();
                StackTraceElement[] stackTrace = throwable.getStackTrace();
                int len = stackTrace.length;
                for (int i = 0; i < len; i = i + 1) {
                   str1 = str1+"\n"+stackTrace[i].toString();
                }
                jSONObject.put("message", throwable.toString());
                jSONObject.put("stack", str1);
                jSONArray.put(jSONObject);
             }
             uoa.a.clear();
          }
          if (jSONArray != null && jSONArray.length() > 0) {
             uoa.a(jSONArray);
          }
          c.a("SendLog", "µÇÂ¼ÈÕÖ¾");
          this.a(uoa.b(), p2);
       }catch(java.lang.Exception e11){
          e11.printStackTrace();
       }
       return;
    }
    public final void a(JSONObject p0){
       a.a().a(p0, this.a, new b$1(this));
    }
    public final void a(JSONObject p0,a p1){
       this.a = p1;
       this.a(p0);
    }
}

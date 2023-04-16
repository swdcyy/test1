package com.cmic.sso.sdk.c.c.a;
import java.lang.Object;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.c.c.d;
import java.lang.String;
import com.cmic.sso.sdk.c.b.h;
import com.cmic.sso.sdk.c.b.a;
import java.lang.StringBuilder;
import com.cmic.sso.sdk.e.n;
import com.cmic.sso.sdk.e.r;
import com.cmic.sso.sdk.e.p;
import com.cmic.sso.sdk.e.j;
import com.cmic.sso.sdk.e.k;
import com.cmic.sso.sdk.a.a;
import com.cmic.sso.sdk.e.q;
import com.cmic.sso.sdk.c.b.g;
import com.cmic.sso.sdk.c.c.c;
import com.cmic.sso.sdk.c.b.e;
import com.cmic.sso.sdk.b$a;
import com.cmic.sso.sdk.e.c;
import com.cmic.sso.sdk.e.i;
import com.cmic.sso.sdk.c.c.b;
import com.cmic.sso.sdk.c.a.d;
import com.cmic.sso.sdk.c.a.c;
import com.cmic.sso.sdk.c.a.a;
import com.cmic.sso.sdk.c.a.b;
import android.os.SystemClock;
import com.cmic.sso.sdk.c.c.a$1;
import com.cmic.sso.sdk.c.d.c;
import org.json.JSONObject;
import com.cmic.sso.sdk.c.b.f;
import com.cmic.sso.sdk.c.b.f$a;
import com.cmic.sso.sdk.c.b.f$b;
import com.cmic.sso.sdk.c.b.b;

public class a	// class@000f4f
{
    public static a a;

    public void a(){
       super();
    }
    public static a a(){
       if (a.a == null) {
          a uoa = a.class;
          _monitor_enter(uoa);
          if (a.a == null) {
             a.a = new a();
          }
          _monitor_exit(uoa);
       }
       return a.a;
    }
    public void a(a p0,d p1){
       c uoc;
       a uoa = p0;
       int i = uoa.c("networktype");
       h oh = new h();
       oh.b("1.0");
       oh.c("quick_login_android_9.5.1");
       oh.d(uoa.b("appid"));
       oh.e(uoa.b("imsi"));
       oh.f(uoa.b("operatortype"));
       oh.g(i+"");
       oh.h(n.a());
       oh.i(n.b());
       oh.j(n.c());
       String str = "0";
       oh.k(str);
       oh.l("1.0");
       oh.m(r.a());
       oh.n(p.a());
       oh.o(j.a().d());
       oh.q(uoa.b("apppackage"));
       oh.r(uoa.b("appsign"));
       oh.a_(k.b("AID", ""));
       String str1 = "logintype";
       if (uoa.c(str1) == 3) {
          oh.u("pre");
       }else {
          oh.y(uoa.b("userCapaid"));
          if (uoa.c(str1) == 1) {
             oh.y("200");
          }else {
             oh.y("50");
          }
          oh.u("authz");
       }
       r.a(uoa, "scripAndTokenForHttps");
       a uoa1 = p0.b();
       if (uoa.b("isCacheScrip", false)) {
          oh.s(q.a(false));
          oh.t(q.b(false));
          oh.x(uoa.b("phonescrip"));
          oh.p(oh.w(uoa.b("appkey")));
          uoc = new c("https://"+uoa1.a()+"/unisdk/rs/scripAndTokenForHttps", oh, "POST", uoa.b("traceId"));
          uoc.a("defendEOF", str);
       }else {
          e uoe = new e();
          uoe.a(uoa.a(b$a.a));
          uoe.a(oh);
          uoe.a(false);
          uoa.a("isCloseIpv4", uoa1.h());
          uoa.a("isCloseIpv6", uoa1.i());
          String str2 = "https://"+uoa1.b()+"/unisdk/rs/scripAndTokenForHttps";
          if (uoa.b("use2048PublicKey", false)) {
             c.a("BaseRequest", "使用2对应的编码");
             uoe.b("2");
             str1 = i.a().b(uoa.a(b$a.a));
          }else {
             str1 = i.a().a(uoa.a(b$a.a));
          }
          uoe.c(str1);
          uoc = new b(str2, uoe, "POST", uoa.b("traceId"));
          uoc.a("defendEOF", "1");
          str2 = "doNetworkSwitch";
          if (i == 3) {
             uoc.a(true);
             uoa.a(str2, true);
          }else {
             uoc.a(false);
             uoa.a(str2, false);
          }
       }
       uoc.a("interfaceVersion", "1.0");
       this.a(uoc, p1, uoa);
       return;
    }
    public final void a(c p0,d p1,a p2){
       d uod = new d();
       c uoc = new c();
       uod.a(uoc);
       uoc.a(new a());
       p0.a(SystemClock.elapsedRealtime());
       uod.a(p0, new a$1(this, p0, p2, p1), p2);
    }
    public void a(JSONObject p0,a p1,d p2){
       f uof = new f();
       f$a uoa = new f$a();
       f$b uob = new f$b();
       uob.e(r.a());
       uob.f(p.a());
       uob.b("2.0");
       uob.c(p1.b("appid", ""));
       uob.d(uob.w(""));
       uoa.a(p0);
       uof.a(uoa);
       uof.a(uob);
       this.a(new c("https://"+p1.b().d()+"/log/logReport", uof, "POST", p1.b("traceId")), p2, p1);
    }
    public void a(boolean p0,a p1,d p2){
       b uob = new b();
       uob.b("1.0");
       uob.c("Android");
       uob.d(k.b("AID", ""));
       String str = (p0)? "1": "0";
       uob.e(str);
       uob.f("quick_login_android_9.5.1");
       uob.g(p1.b("appid"));
       uob.h(uob.w("iYm0HAnkxQtpvN44"));
       this.a(new c("https://"+p1.b().c()+"/client/uniConfig", uob, "POST", p1.b("traceId")), p2, p1);
       return;
    }
}

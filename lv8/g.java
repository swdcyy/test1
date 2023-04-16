package lv8.g;
import r97.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import r97.o$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c97.d;
import r97.a0;
import r97.t$a;
import r97.t;
import r97.h0;
import r97.h0$a;
import android.app.Activity;
import r97.i0$a;
import r97.i0;
import com.yxcorp.utility.Log;
import r97.g0$a;
import r97.g0;
import java.lang.Boolean;
import com.yxcorp.gateway.pay.api.PayManager;
import java.util.HashMap;
import lv8.d;
import com.google.gson.Gson;

public final class g	// class@002db1
{

    public static o a(){
       Object obj = PatchProxy.apply(null, null, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o.builder().i("gatewaypay").f(true).b();
    }
    public static void b(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidFourRefs(p0, p1, p2, null, null, g.class, "3")) {
          if (TextUtils.x(null)) {
             t$a uoa = t.b();
             uoa.d(g.a());
             uoa.a(p0);
             uoa.g(TextUtils.k(p1));
             uoa.e(TextUtils.k(p2));
             d.a().g().C(uoa.c(), null);
          }else {
             h0.b().j(null);
             throw null;
          }
       }
       return;
    }
    public static void c(String p0,String p1,String p2,String p3,String p4){
       g og = g.class;
       h0 oh0 = null;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, oh0, og, "10")) {
             return;
          }
       }
       if (!TextUtils.x(p4)) {
          h0$a uoa = h0.b();
          uoa.j(p4);
          oh0 = uoa.c(oh0);
       }
       i0$a uoa1 = i0.b();
       uoa1.d(g.a());
       uoa1.a(p0);
       uoa1.l(TextUtils.k(p2));
       uoa1.e(TextUtils.k(p3));
       uoa1.p("BACKGROUND_TASK_EVENT");
       uoa1.k("UNKNOWN_OPERATION");
       uoa1.o(p1);
       d.a().g().B(uoa1.c(), oh0);
       return;
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "12")) {
          return;
       }
       if (g.h()) {
          Log.g("KwaiPaySdk", p0);
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "4")) {
          return;
       }
       g.g(p0, p1, null, null);
       return;
    }
    public static void f(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "6")) {
          return;
       }
       g0$a uoa = g0.b();
       uoa.m(p0);
       uoa.n(p1);
       uoa.o(p2);
       uoa.f(g.a());
       d.a().g().u(uoa.c());
       return;
    }
    public static void g(String p0,String p1,String p2,String p3){
       h0 oh0;
       if (PatchProxy.applyVoidFourRefs(p0, p1, null, p3, null, g.class, "5")) {
          return;
       }
       if (!TextUtils.x(p3)) {
          h0$a uoa = h0.b();
          uoa.j(p3);
          oh0 = uoa.c(null);
       }else {
          oh0 = null;
       }
       i0$a uoa1 = i0.b();
       uoa1.d(g.a());
       uoa1.a(p0);
       uoa1.l(TextUtils.k(p1));
       uoa1.e(TextUtils.k(null));
       uoa1.p("USER_OPERATION");
       uoa1.k("CLICK");
       d.a().g().B(uoa1.c(), oh0);
       return;
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, g.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (PayManager.getInstance().isEnableLogger() || PayManager.getInstance().isDebug())? true: false;
       return b;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, g.class, "7")) {
          return;
       }
       g.j(p0, p1, null);
       return;
    }
    public static void j(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "8")) {
          return;
       }
       g.k(p0, p1, p2, null);
       return;
    }
    public static void k(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, g.class, "9")) {
          return;
       }
       g.c(p0, p1, p2, p3, null);
       return;
    }
    public static String l(String p0,String p1,String p2){
       HashMap obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, g.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("provider", p0);
       obj.put("provider_config", p1);
       if (!TextUtils.x(p2)) {
          obj.put("method", p2);
       }
       return d.a.q(obj);
    }
    public static void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, g.class, "15")) {
          return;
       }
       if (g.h()) {
          Log.d("KwaiPaySdk", p0);
       }
       return;
    }
}

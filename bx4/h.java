package bx4.h;
import java.util.concurrent.ConcurrentHashMap;
import tx4.s;
import java.lang.Object;
import bx4.c;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import bx4.i;
import org.json.JSONObject;
import tx4.w;
import bx4.a;
import com.kuaishou.tachikoma.api.g;
import java.util.Objects;
import oo8.t;
import no8.e;
import java.lang.Boolean;
import com.tachikoma.core.bridge.a;
import com.kuaishou.tachikoma.api.container.TKContainer;
import zp8.a;
import bx4.b;
import java.lang.Integer;
import bx4.d;
import java.lang.Runnable;
import t45.c;
import bx4.g;

public class h	// class@0003e8
{
    public final c a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public long g;
    public boolean h;
    public boolean i;
    public String j;
    public final s k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public float q;
    public boolean r;
    public Boolean s;
    public int t;
    public int u;
    public int v;
    public long w;
    public int x;
    public boolean y;
    public Map z;
    public static final ConcurrentHashMap A;
    public static boolean B;
    public static boolean C;
    public static boolean D;

    static {
       h.A = new ConcurrentHashMap();
       h.B = true;
       h.C = true;
       h.D = false;
    }
    public void h(s p0){
       super();
       this.a = new c();
       this.d = 0;
       this.e = "";
       this.f = "";
       this.g = -1;
       this.h = true;
       this.i = false;
       this.j = "";
       this.l = false;
       this.m = false;
       this.n = false;
       this.o = false;
       this.p = 0;
       this.q = 0;
       this.r = false;
       this.s = null;
       this.t = -1;
       this.u = 0;
       this.v = 0;
       this.w = 0;
       this.x = 0;
       this.y = false;
       this.z = new HashMap();
       this.k = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.a.f = System.currentTimeMillis();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.a.h = System.currentTimeMillis();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       this.a.g = System.currentTimeMillis();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       this.a.i = System.currentTimeMillis();
       return;
    }
    public String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return this.j;
       }
       i oi = this.z.get(p0);
       if (oi != null) {
          return oi.a;
       }
       return this.j;
    }
    public final void f(JSONObject p0,String p1){
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "17")) {
          return;
       }
       c a = this.a.a;
       if (a > 0) {
          p0.put("beginInitContainerTime", a);
       }
       a = this.a.f;
       if (a > 0) {
          p0.put("beginContextInitTime", a);
       }
       a = this.a.g;
       if (a > 0) {
          p0.put("endContextInitTime", a);
       }
       a = this.a.h;
       if (a > 0) {
          p0.put("beginBundleLoadTime", a);
       }
       a = this.a.i;
       if (a > 0) {
          p0.put("endBundleLoadTime", a);
       }
       a = this.a.j;
       if (a > 0) {
          p0.put("beginEvaluateScriptTime", a);
       }
       a = this.a.l;
       if (a > 0) {
          p0.put("endEvaluateScriptTime", a);
       }
       a = this.a.b;
       if (a > 0) {
          p0.put("beginPreInitTime", a);
       }
       a = this.a.c;
       if (a > 0) {
          p0.put("preInitSuccessTime", a);
       }
       a = this.a.d;
       if (a > 0) {
          p0.put("preInitFailTime", a);
       }
       a = this.a.p;
       if (a != null && !TextUtils.isEmpty(a.b)) {
          a uoa = h.A.get(a.b);
          if (uoa != null) {
             a a1 = uoa.a;
             if (a1 > 0) {
                p0.put("beginPreloadTime", a1);
             }
             a1 = uoa.b;
             if (a1 > 0) {
                p0.put("preloadSuccessTime", a1);
             }
             uoa = uoa.c;
             if (uoa > 0) {
                p0.put("preloadFailTime", uoa);
             }
          }
       }
       p0.put("useSharedIsolate", this.i);
       p0.put("isSyncInit", this.h);
       p0.put("isFirstTimeInit", this.l);
       p0.put("isFirstTimeRender", this.m);
       p0.put("isCreateView", this.n);
       p0.put("isSync", this.o);
       a = this.a.k;
       if (a > 0) {
          p0.put("firstToNativeTime", a);
       }
       p0.put("useCleanContext", this.r);
       p0.put("v8SoType", this.d);
       g og = g.b();
       Objects.requireNonNull(og);
       t ot = PatchProxy.apply(null, og, g.class, "19");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = e.b().a();
       }
       p0.put("appColdLaunchTime", ot.d());
       h ts = this.s;
       if (ts != null) {
          p0.put("isCompile", ts.booleanValue());
       }
       p0.put("jsonproxyNotLoadNum", this.p);
       p0.put("onpropcallcosttime", (double)this.q);
       p0.put("cliValue", this.t);
       p0.put("repetitionCompileCount", this.u);
       p0.put("totalCompileCount", this.v);
       p0.put("totalCompileSize", this.w);
       p0.put("destroyCompileCount", this.x);
       p0.put("destroyRepetitionCompileRes", a.d());
       Boolean s = TKContainer.S;
       int i = (s != null && s.booleanValue())? 1: 0;
       p0.put("isUseChoreographer", i);
       p0.put("isPreloadFinish", this.y);
       if (!PatchProxy.applyVoidTwoRefs(p1, p0, this, oh, "18")) {
          if (p1 == null) {
             a.f("TKTraceReporter", "view session ID is null");
          }
          i oi = this.z.get(p1);
          if (oi != null) {
             p0.put("isFirstCreateView", oi.f);
             if (oi.a() > 0) {
                p0.put("beginCreateViewTime", oi.a());
             }
             if (oi.c() > 0) {
                p0.put("endCreateViewTime", oi.c());
             }
             if (oi.d() > 0) {
                p0.put("endRenderTime", oi.d());
             }
             if (oi.b() > 0) {
                p0.put("beginRenderTime", oi.b());
             }
          }
       }
    label_01ff :
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, h.class, "11")) {
          return;
       }
       this.a.d = System.currentTimeMillis();
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, h.class, "10")) {
          return;
       }
       this.a.c = System.currentTimeMillis();
       return;
    }
    public final void i(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "12")) {
          return;
       }
       if (this.k == null) {
          return;
       }
       if (b.a().b(p0, p2)) {
          this.k.report(p0, p1);
       }else {
          a.i("TKTraceReporter", "Sample fail, not need to report");
       }
       return;
    }
    public void j(String p0,int p1,int p2,String p3,String p4){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oh, "15")) {
             return;
          }
       }
       if (this.k == null) {
          return;
       }else {
          d uod = new d(this, p1, p2, p3, p0, p4);
          c.a(oh);
          return;
       }
    }
    public void k(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "14")) {
          return;
       }
       if (this.k == null) {
          return;
       }
       c.a(new g(this, p0));
       return;
    }
    public final void l(w p0){
       this.a.p = p0;
    }
    public final void m(String p0){
       this.b = p0;
    }
    public void n(boolean p0){
       this.n = p0;
    }
    public final void o(String p0){
       this.j = p0;
    }
    public void p(boolean p0){
       this.l = p0;
    }
    public final void q(boolean p0){
       this.h = p0;
    }
    public final void r(String p0){
       this.c = p0;
    }
    public void s(boolean p0){
       this.o = p0;
    }
    public final void t(boolean p0){
       this.r = p0;
    }
    public final void u(boolean p0){
       this.i = p0;
    }
    public final void v(long p0){
       this.g = p0;
    }
}

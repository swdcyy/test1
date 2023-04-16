package zj0.u;
import zj0.v;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zj0.c;
import zj0.u$a;
import com.facebook.base.tracing.TracingManager;
import zj0.f;
import lj0.c;
import zj0.q;
import zj0.x;
import java.util.List;
import zj0.k;
import com.facebook.react.bridge.UiThreadUtil;
import java.lang.Runnable;
import zj0.g;
import zj0.i;
import rj0.c;
import rj0.a;
import java.lang.Long;
import zj0.s;
import zj0.m;
import zj0.a;
import zj0.p;
import zj0.o;
import zj0.d;
import zj0.j;
import zj0.h;
import fk0.l;
import zj0.b;
import rj0.b;
import zj0.r;
import zj0.e;
import zj0.n;
import zj0.l;
import com.kuaishou.krn.model.LaunchModel;
import zj0.t;

public class u extends v	// class@004a5a
{
    public final List c;
    public static final int d;

    public void u(){
       super();
       this.c = new CopyOnWriteArrayList();
    }
    public void A(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "11")) {
          return;
       }
       this.F(new c(p0));
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, u.class, "12")) {
          return;
       }
       TracingManager.e("onJSPageStart");
       this.F(f.a);
       return;
    }
    public void C(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "3")) {
          return;
       }
       TracingManager.e("SDK attach");
       this.F(new q(p0));
       return;
    }
    public void E(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "1")) {
          return;
       }
       if (p0 != null && !this.c.contains(p0)) {
          this.c.add(p0);
       }
       return;
    }
    public final void F(u$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "22")) {
          return;
       }
       k ok = new k(this, p0);
       if (!PatchProxy.applyVoidOneRefs(ok, this, u.class, "24")) {
          if (UiThreadUtil.isOnUiThread()) {
             ok.run();
          }else {
             UiThreadUtil.runOnUiThread(ok);
          }
       }
       return;
    }
    public void G(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.c.remove(p0);
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, u.class, "16")) {
          return;
       }
       this.F(g.a);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, u.class, "6")) {
          return;
       }
       TracingManager.e("SDK onPageResume");
       this.F(i.a);
       return;
    }
    public void a(c p0,a p1,long p2){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, u.class, "18")) {
          return;
       }
       this.F(new s(p0, p1, p2));
       return;
    }
    public void b(long p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ou, "20")) {
          return;
       }
       this.F(new m(p0));
       return;
    }
    public void d(long p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ou, "13")) {
          return;
       }
       TracingManager.e("onJSPageSuccess");
       this.F(new a(p0));
       return;
    }
    public void e(long p0,Throwable p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ou, "14")) {
          return;
       }
       this.F(new p(p0, p1));
       return;
    }
    public void g(long p0,Throwable p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, ou, "8")) {
          return;
       }
       TracingManager.e("SDK onEngineReady");
       this.F(new o(p0, p1));
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, u.class, "9")) {
          return;
       }
       TracingManager.e("onBundleLoadStart");
       this.F(d.a);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, u.class, "5")) {
          return;
       }
       this.F(j.a);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, u.class, "15")) {
          return;
       }
       this.F(h.a);
       return;
    }
    public void o(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "21")) {
          return;
       }
       TracingManager.e("onPageRenderTime");
       this.F(new b(p0));
       return;
    }
    public void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u.class, "17")) {
          return;
       }
       this.F(new r(p0));
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, u.class, "10")) {
          return;
       }
       TracingManager.e("onBundleLoadSuccess");
       this.F(e.a);
       return;
    }
    public void t(long p0,long p1){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, ou, "7")) {
          return;
       }
       TracingManager.e("SDK onEngineStart");
       this.F(new n(p0, p1));
       return;
    }
    public void u(long p0){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, ou, "19")) {
          return;
       }
       this.F(new l(p0));
       return;
    }
    public void y(LaunchModel p0,long p1,long p2){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, u.class, "4")) {
          return;
       }
       TracingManager.e("SDK onPageCreated");
       t ot = new t(p0, p1, p2);
       this.F(v0);
       return;
    }
}

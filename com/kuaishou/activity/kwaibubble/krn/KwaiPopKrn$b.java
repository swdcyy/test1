package com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$b;
import zj0.x;
import android.app.Activity;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn;
import java.lang.Object;
import java.lang.Throwable;
import zj0.w;
import rj0.c;
import rj0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import java.lang.StringBuilder;
import xn.a$c;
import xn.a;
import vn.d;
import zn.a;
import com.kuaishou.activity.kwaibubble.krn.KwaiPopKrn$b$a;
import qn.j;
import rn.b;
import qn.h;
import rn.a;
import qn.l;
import kotlin.jvm.internal.a;
import xn.a$b;
import fk0.l;
import rj0.b;
import com.kuaishou.krn.model.LaunchModel;

public final class KwaiPopKrn$b implements x	// class@000778
{
    public final Activity a;
    public final KwaiPopKrn b;

    public void KwaiPopKrn$b(Activity p0,KwaiPopKrn p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void A(Throwable p0){
       w.a(this, p0);
    }
    public void B(){
       w.k(this);
    }
    public void H(){
       w.s(this);
    }
    public void J(){
       w.v(this);
    }
    public void a(c p0,a p1,long p2){
       w.w(this, p0, p1, p2);
    }
    public void b(long p0){
       w.n(this, p0);
    }
    public void c(){
       w.l(this);
    }
    public void d(long p0){
       if (PatchProxy.isSupport2(KwaiPopKrn$b.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(p0), this, KwaiPopKrn$b.class, "1")) {
          return;
       }
       w.m(this, p0);
       KwaiPopLog e = KwaiPopLog.e;
       Object[] objArray = new Object[0];
       e.D("onJSPageSuccess "+this.b.g(), objArray);
       KwaiPopKrn$b tb = this.b;
       tb.h(e, a$c.b, Long.valueOf(tb.c), this.b.d);
       a uoa = this.b.a().p();
       if (uoa != null) {
          uoa.onSuccess();
       }
       this.b.a().j(new KwaiPopKrn$b$a(this));
       uoa.a = new h(this.b).a().d(this.b);
       PatchProxy.onMethodExit(KwaiPopKrn$b.class, "1");
       return;
    }
    public void e(long p0,Throwable p1){
       if (PatchProxy.isSupport2(KwaiPopKrn$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(Long.valueOf(p0), p1, this, KwaiPopKrn$b.class, "2")) {
          return;
       }
       a.p(p1, "throwable");
       w.i(this, p0, p1);
       KwaiPopLog e = KwaiPopLog.e;
       e.C("onJSPageError "+this.b.g(), p1);
       KwaiPopKrn$b tb = this.b;
       tb.h(e, a$b.b, Long.valueOf(tb.c), this.b.d);
       a uoa = this.b.a().p();
       if (uoa != null) {
          uoa.a(-1, p1);
       }
       PatchProxy.onMethodExit(KwaiPopKrn$b.class, "2");
       return;
    }
    public void f(long p0){
       w.f(this, p0);
    }
    public void g(long p0,Throwable p1){
       w.e(this, p0, p1);
    }
    public void i(){
       w.b(this);
    }
    public void j(){
       w.p(this);
    }
    public void m(){
       w.t(this);
    }
    public void o(l p0){
       w.u(this, p0);
    }
    public void p(b p0){
       w.d(this, p0);
    }
    public void r(){
       w.c(this);
    }
    public void s(LaunchModel p0){
       w.r(this, p0);
    }
    public void t(long p0,long p1){
       w.h(this, p0, p1);
    }
    public void u(long p0){
       w.o(this, p0);
    }
    public void v(Throwable p0){
       w.j(this, p0);
    }
    public void w(){
       w.g(this);
    }
    public void y(LaunchModel p0,long p1,long p2){
       w.q(this, p0, p1, p2);
    }
}

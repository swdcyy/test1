package com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3;
import java.lang.Runnable;
import eh5.v;
import android.util.SparseArray;
import java.lang.String;
import com.kwai.slide.play.detail.base.BasePage;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eh5.l;
import java.util.LinkedHashMap;
import java.lang.Long;
import java.lang.StringBuilder;
import com.kwai.component.taskdispatcher.utils.DispatchLogger;
import fq7.e;
import qp7.t0;
import qp7.e;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.a;
import java.util.List;
import bs7.a;
import ys7.a;
import dq7.a;
import sp7.b;
import fq7.b;
import qp7.b;
import ds7.b;
import qp7.w0;
import sq7.a;
import android.view.ViewGroup;
import jq7.m;
import tr7.a;
import pq7.a;
import com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3$lambda$1;
import msd.l;
import java.util.ArrayList;
import com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3$lambda$2;
import com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3$lambda$3;
import com.kwai.slide.play.detail.base.BasePage$createGroup$$inlined$dispatchRun$3$lambda$4;

public final class BasePage$createGroup$$inlined$dispatchRun$3 implements Runnable	// class@00173e
{
    public final v b;
    public final SparseArray c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final BasePage h;

    public void BasePage$createGroup$$inlined$dispatchRun$3(v p0,SparseArray p1,String p2,long p3,String p4,int p5,BasePage p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BasePage$createGroup$$inlined$dispatchRun$3.class, "1")) {
          return;
       }
       LinkedHashMap linkedHashMa = this.c.get(this.b.getStage());
       if (linkedHashMa != null) {
          Long longx = linkedHashMa.remove(this.d);
       }
       DispatchLogger.D("BatchDispatchTaskController", this.e+" :taskRun-> type:"+this.b.getStage()+", taskBelong:"+this.d+", "+"taskName:"+this.f);
       this.h.i0().v(this.h.U());
       RelativeLayout relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.i0().l(relativeLayo);
       BasePage$createGroup$$inlined$dispatchRun$3 th = this.h;
       this.h.i0().a(th.h0(th.U()));
       this.h.P().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.P().l(relativeLayo);
       th = this.h;
       this.h.P().a(th.Q(th.U()));
       this.h.k0().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.k0().l(relativeLayo);
       th = this.h;
       this.h.k0().a(th.m0(th.U()));
       this.h.A().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.A().l(relativeLayo);
       th = this.h;
       this.h.A().a(th.B(th.U()));
       this.h.v().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.v().l(relativeLayo);
       th = this.h;
       this.h.v().a(th.w(th.U()));
       this.h.W().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.W().l(relativeLayo);
       th = this.h;
       this.h.W().a(th.X(th.U()));
       b uob = this.h.R();
       if (uob != null) {
          b uob1 = this.h.S();
          if (uob1 != null) {
             uob1.k(this.h.U());
          }
          uob1 = this.h.S();
          if (uob1 != null) {
             uob1.i();
          }
          uob1 = this.h.S();
          if (uob1 != null) {
             uob1.c(uob);
          }
       }
       BasePage$createGroup$$inlined$dispatchRun$3 th1 = this.h;
       RelativeLayout relativeLayo1 = th1.V();
       a.m(relativeLayo1);
       th1.N0(new a(relativeLayo1));
       a uoa = this.h.I();
       if (uoa != null) {
          uoa.k(this.h.U());
       }
       uoa = this.h.I();
       if (uoa != null) {
          uoa.i();
       }
       uoa = this.h.I();
       if (uoa != null) {
          uoa.c(this.h.J());
       }
       th1 = this.h;
       relativeLayo1 = th1.V();
       a.m(relativeLayo1);
       th1.U0(new m(relativeLayo1));
       m om = this.h.f0();
       if (om != null) {
          om.k(this.h.U());
       }
       om = this.h.f0();
       if (om != null) {
          om.i();
       }
       om = this.h.f0();
       if (om != null) {
          om.c(this.h.g0());
       }
       this.h.M().v(this.h.U());
       relativeLayo = this.h.V();
       a.m(relativeLayo);
       this.h.M().l(relativeLayo);
       th = this.h;
       this.h.M().a(th.K(th.U()));
       uob = this.h.E();
       if (uob != null) {
          th = this.h;
          RelativeLayout relativeLayo2 = th.V();
          a.m(relativeLayo2);
          th.M0(new a(relativeLayo2));
          a uoa1 = this.h.F();
          a.m(uoa1);
          uoa1.k(this.h.U());
          uoa1 = this.h.F();
          a.m(uoa1);
          uoa1.i();
          uoa1 = this.h.F();
          a.m(uoa1);
          uoa1.c(uob);
       }
       th1 = this.h;
       th1.q0(th1.D(th1.U()), new BasePage$createGroup$$inlined$dispatchRun$3$lambda$1(this));
       th1 = this.h;
       th1.q0(th1.p0(), new BasePage$createGroup$$inlined$dispatchRun$3$lambda$2(this));
       th1 = this.h;
       th1.q0(th1.Z(th1.U()), new BasePage$createGroup$$inlined$dispatchRun$3$lambda$3(this));
       th1 = this.h;
       th1.q0(th1.y(), new BasePage$createGroup$$inlined$dispatchRun$3$lambda$4(this));
       return;
    }
}

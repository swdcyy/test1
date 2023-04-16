package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.a;
import msd.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.m0;
import w6a.a;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import h6a.m;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import h6a.s;
import h6a.b;
import h6a.t;
import h6a.u;
import h6a.v;
import h6a.w;
import h6a.x;
import v6a.o0;
import h6a.g;
import h6a.h;
import h6a.i;
import jf5.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import h6a.j;
import h6a.k;
import uw9.v3;
import h6a.l;
import h6a.n;
import h6a.o;
import h6a.p;
import h6a.q;
import h6a.r;
import h6a.f;
import h6a.y;
import h6a.z;
import h6a.c;
import h6a.d;
import h6a.e;

public final class a implements l	// class@001731
{
    public final NasaGrootDetailVMFragment b;

    public void a(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       a tb = this.b;
       NasaGrootDetailVMFragment v0 = tb.V0;
       if (v0 != null) {
          v0.a(tb.F.X);
       }
       g e = Functions.e;
       p0.j(p0.c.n1.subscribe(new m(tb), e));
       p0.j(p0.c.o1.subscribe(new s(tb), e));
       p0.j(p0.c.p1.subscribe(new b(tb), e));
       p0.j(p0.c.q1.subscribe(new t(tb), e));
       p0.j(p0.c.r1.subscribe(new u(tb), e));
       p0.j(p0.c.t1.subscribe(new v(tb), e));
       p0.j(p0.c.u1.subscribe(new w(tb), e));
       p0.j(p0.c.v1.subscribe(new x(tb), e));
       p0.j(tb.N.m2.subscribe(new g(p0), e));
       p0.j(tb.N.t2.subscribe(new h(p0), e));
       p0.j(tb.N.s.subscribe(new i(p0), e));
       p0.j(tb.N.E.X.r.subscribe(new j(p0), e));
       p0.j(tb.N.g2.subscribe(new k(p0), e));
       p0.j(tb.N.E.F.subscribe(new l(p0), e));
       p0.j(tb.N.E.G.subscribe(new n(p0), e));
       p0.j(tb.N.I2.subscribe(new o(p0), e));
       p0.j(tb.N.D.subscribe(new p(p0), e));
       p0.j(tb.N.L3.subscribe(new q(p0), e));
       p0.j(tb.N.M3.subscribe(new r(p0), e));
       p0.j(tb.N.E.O.subscribe(new f(tb, p0), e));
       tb.F.j(tb.N.i2.subscribe(new y(tb), e));
       p0.j(p0.c.P1.subscribe(new z(tb), e));
       p0.j(p0.c.Q1.subscribe(new c(tb), e));
       p0.j(p0.c.R1.subscribe(new d(tb), e));
       p0.j(p0.c.S1.subscribe(new e(tb), e));
       return null;
    }
}

package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.b;
import msd.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import v6a.m0;
import w6a.a;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import h6a.s0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import h6a.t0;
import h6a.e0;
import h6a.u0;
import h6a.v0;
import h6a.w0;
import h6a.x0;
import h6a.y0;
import v6a.o0;
import h6a.p0;
import h6a.r0;
import h6a.n0;
import h6a.o0;
import h6a.f0;
import h6a.g0;
import jf5.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import h6a.h0;
import uw9.v3;
import h6a.i0;
import h6a.j0;
import h6a.m0;
import h6a.k0;
import uw9.l0;
import h6a.q0;
import h6a.l0;

public final class b implements l	// class@001732
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void b(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       b tb = this.b;
       NasaGrootHorizontalDetailVMFragment w = tb.W;
       if (w != null) {
          w.a(tb.F.X);
       }
       SlidePlayHorizontalPhotosVMFragment f = tb.F;
       g e = Functions.e;
       f.j(f.c.n1.subscribe(new s0(tb), e));
       f = tb.F;
       f.j(f.c.o1.subscribe(new t0(tb), e));
       f = tb.F;
       f.j(f.c.p1.subscribe(new e0(tb), e));
       f = tb.F;
       f.j(f.c.q1.subscribe(new u0(tb), e));
       f = tb.F;
       f.j(f.c.r1.subscribe(new v0(tb), e));
       f = tb.F;
       f.j(f.c.t1.subscribe(new w0(tb), e));
       f = tb.F;
       f.j(f.c.u1.subscribe(new x0(tb), e));
       f = tb.F;
       f.j(f.c.w1.subscribe(new y0(tb), e));
       tb.F.j(tb.J.m2.subscribe(new p0(tb), e));
       tb.F.j(tb.J.t2.subscribe(new r0(tb), e));
       p0.j(tb.J.p2.subscribe(new n0(p0), e));
       p0.j(tb.J.q2.subscribe(new o0(p0), e));
       f = tb.F;
       f.j(f.c.H1.subscribe(new f0(tb), e));
       tb.F.j(tb.J.s.subscribe(new g0(tb), e));
       h0 oh0 = new h0(tb);
       tb.F.j(tb.J.E.X.r.subscribe(oh0, e));
       i0 oi0 = new i0(tb);
       tb.F.j(tb.J.E.F.subscribe(oi0, e));
       j0 oj0 = new j0(tb);
       tb.F.j(tb.J.E.G.subscribe(oj0, e));
       tb.F.j(tb.J.E.O.subscribe(new m0(tb, p0), e));
       p0.j(p0.c.P1.subscribe(new k0(tb), e));
       p0.j(tb.J.E.z1.subscribe(new q0(p0), e));
       p0.j(p0.c.Q1.subscribe(new l0(tb), e));
       return null;
    }
}

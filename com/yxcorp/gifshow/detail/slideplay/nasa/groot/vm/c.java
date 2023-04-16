package com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.c;
import msd.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.m0;
import w6a.a;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import h6a.o1;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import h6a.p1;
import h6a.d1;
import h6a.q1;
import h6a.r1;
import h6a.s1;
import h6a.t1;
import h6a.u1;
import v6a.o0;
import h6a.m1;
import h6a.n1;
import h6a.e1;
import jf5.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import h6a.f1;
import uw9.v3;
import h6a.g1;
import h6a.h1;
import h6a.l1;
import h6a.i1;
import h6a.j1;

public final class c implements l	// class@001733
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void c(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       c tb = this.b;
       NasaGrootVerticalDetailVMFragment x = tb.X;
       if (x != null) {
          x.a(tb.F.X);
       }
       SlidePlayVerticalPhotosVMFragment f = tb.F;
       g e = Functions.e;
       f.j(f.c.n1.subscribe(new o1(tb), e));
       f = tb.F;
       f.j(f.c.o1.subscribe(new p1(tb), e));
       f = tb.F;
       f.j(f.c.p1.subscribe(new d1(tb), e));
       f = tb.F;
       f.j(f.c.q1.subscribe(new q1(tb), e));
       f = tb.F;
       f.j(f.c.r1.subscribe(new r1(tb), e));
       f = tb.F;
       f.j(f.c.t1.subscribe(new s1(tb), e));
       f = tb.F;
       f.j(f.c.u1.subscribe(new t1(tb), e));
       f = tb.F;
       f.j(f.c.w1.subscribe(new u1(tb), e));
       tb.F.j(tb.L.m2.subscribe(new m1(tb), e));
       tb.F.j(tb.L.t2.subscribe(new n1(tb), e));
       tb.F.j(tb.L.s.subscribe(new e1(tb), e));
       f1 uof1 = new f1(tb);
       tb.F.j(tb.L.E.X.r.subscribe(uof1, e));
       g1 og1 = new g1(tb);
       tb.F.j(tb.L.E.F.subscribe(og1, e));
       h1 oh1 = new h1(tb);
       tb.F.j(tb.L.E.G.subscribe(oh1, e));
       tb.F.j(tb.L.E.O.subscribe(new l1(tb, p0), e));
       p0.j(p0.c.P1.subscribe(new i1(tb), e));
       p0.j(p0.c.Q1.subscribe(new j1(tb), e));
       return null;
    }
}

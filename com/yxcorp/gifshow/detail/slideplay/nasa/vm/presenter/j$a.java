package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jta.c;
import r7a.f;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import tw6.e;
import java.util.BitSet;
import bf5.d;
import bf5.d$a;
import uw9.o;
import q87.c;
import crd.a;
import com.kwai.robust.PatchProxyResult;
import m9a.y;
import androidx.fragment.app.Fragment;
import bf5.r;
import com.yxcorp.gifshow.entity.QPhoto;
import uy6.f;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import p5a.e;
import de5.a;
import j06.a;
import java.lang.Number;
import java.util.Objects;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.Window;
import android.view.View;
import m9a.k;
import y6a.b0;
import erd.g;
import crd.b;
import brd.t;
import y6a.v;
import com.kwai.framework.player.core.b;
import y6a.a0;
import io.reactivex.internal.functions.Functions;
import xx9.a;
import y6a.s;
import y6a.w;
import y6a.x;
import xl8.b;
import java.lang.Integer;
import y6a.y;
import y6a.t;
import y6a.z;
import y6a.u;
import rf5.u;

public class j$a extends a	// class@00181a
{
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, j$a.class, "2")) {
          return;
       }
       j$a tb = this.b;
       boolean b = false;
       tb.M = b;
       tb.t.c(tb.e1);
       tb = this.b;
       tb.L.g(tb.f1);
       tb = this.b;
       tb.L.d0(tb.g1);
       this.b.Z.clear();
       j p = this.b.p;
       if (p != null) {
          p.b();
          this.b.p.q(objArray);
          this.b.p.f();
          this.b.p = objArray;
       }
       Object[] objArray1 = new Object[b];
       o.C().w("NasaMilanoRedesignProgressPresenter", "becomesDetachedOnPageSelected", objArray1);
       p = this.b.U;
       if (p != null) {
          p.dispose();
          this.b.U = objArray;
       }
       this.b.X8(true);
       PatchProxy.onMethodExit(j$a.class, "2");
       return;
    }
    public void i2(){
       String obj1;
       boolean b1;
       float f2;
       j$a b3;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, obj, j$a.class, "1")) {
          return;
       }
       j$a b = obj.b;
       b.M = true;
       Fragment parentFragme = b.s.getParentFragment();
       if (parentFragme instanceof r) {
          obj.b.p = parentFragme.j6();
       }
       b = obj.b;
       if (b.p == null) {
          PatchProxy.onMethodExit(j$a.class, "1");
          return;
       }else if(!y.a(b.q)){
          obj.b.p.f();
          PatchProxy.onMethodExit(j$a.class, "1");
          return;
       }else {
          obj.b.p.a();
          obj.b.p.o(0x2710);
          if (SlidePerformanceExp.d().disableProgressBar != null) {
             b = obj.b;
             j p = b.p;
             j q = b.q;
             obj1 = PatchProxy.applyOneRefs(q, objArray, oy, "5");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(q != null && (q.isVideoType() || (!q.isSinglePhoto() || (!j.h(b.b(q)) || (q.isKtv() && r1.L0(q.mEntity) - SlidePerformanceExp.d().progressBarLimit <= 0))))){
                b1 = true;
             }else {
                b1 = false;
             }
             p.j(b1);
          }
          float f = y.d(obj.b.w.getPlayer());
          obj1 = null;
          float f1 = (a.a(obj.b.q.getEntity()))? y.e(obj.b.q): 0;
          obj.b.p.p(f1);
          j q1 = obj.b.q;
          j obj2 = PatchProxy.applyOneRefs(q1, objArray, oy, "7");
          if (obj2 != patchProxyRe) {
             f2 = obj2.floatValue();
          }else {
             f2 = (float)y.c(q1);
             float f3 = (float)q1.getVideoDuration();
             f2 = (f2 - obj1 > 0)? f2 / f3: 0;
          }
          obj.b.p.l(f2);
          obj2 = 0x3f800000;
          if (f1 - obj1 <= 0 || (f1 - obj2 >= 0 && (f2 - obj2 >= 0 || f2 - obj1 <= 0))) {
             obj.b.Y0 = false;
          }else {
             b3 = obj.b;
             b3.Y0 = true;
             long l = y.c(b3.q);
             Objects.requireNonNull(b3);
             obj2 = j.class;
             String str = "16";
             if (!PatchProxy.isSupport2(obj2, str) || !PatchProxy.applyVoidOneRefsWithListener(Long.valueOf(l), b3, obj2, str)) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PROGRESS_HIGHLIGHT_POINT";
                i3 oi3 = i3.f();
                oi3.c("highlight_photo_duration", Long.valueOf(l));
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.photoPackage = w1.f(b3.q.getEntity());
                u1.D0("", b3.s, 0, uElementPack, uContentPack, null);
                PatchProxy.onMethodExit(obj2, str);
             }
          }
          if (!SlidePerformanceExp.d().c()) {
             j$a b2 = obj.b;
             b2.p.d(true, y.f(obj.b.q, f), y.b(b2.q));
          }
          b3 = obj.b;
          b3.p.q(b3.h1);
          b3 = obj.b;
          b3.Q = b3.getActivity().getWindow().getDecorView().findViewById(0x7f0a047d);
          b3 = obj.b;
          b3.R = k.a(b3.getActivity(), obj.b.s, 0x7f0a0477);
          b3 = obj.b;
          b3.S = b3.getActivity().getWindow().getDecorView().findViewById(0x7f0a04ee);
          obj.b.p.k(false);
          b3 = obj.b;
          b3.t.a(b3.e1);
          b3 = obj.b;
          b3.O = true;
          a uoa = new a();
          b3.U = uoa;
          uoa.c(b3.v.subscribe(new b0(obj)));
          b3 = obj.b;
          obj2 = b3.B;
          if (obj2 != null) {
             b3.U.c(obj2.subscribe(new v(obj)));
          }
          b3 = obj.b;
          b3.S8(b3.w.getPlayer().isPaused());
          b3 = obj.b;
          b3.L.i(b3.f1);
          b3 = obj.b;
          b3.L.c0(b3.g1);
          Object[] objArray1 = new Object[false];
          o.C().w("NasaMilanoRedesignProgressPresenter", "becomesAttachedOnPageSelected", objArray1);
          b3 = obj.b;
          g e = Functions.e;
          b3.U.c(b3.z.i(new a0(obj), e));
          b3 = obj.b;
          b3.U.c(b3.C.subscribe(new s(obj), e));
          b3 = obj.b;
          b3.U.c(b3.W.subscribe(new w(obj), e));
          b3 = obj.b;
          b3.U.c(b3.X.subscribe(new x(obj), e));
          b3 = obj.b;
          obj2 = b3.Y;
          if (obj2 != null) {
             b3.Y8((obj2.a().booleanValue() ^ true), Integer.valueOf(6));
             b3 = obj.b;
             b3.U.c(b3.Y.c().subscribe(new y(obj), e));
          }
          b3 = obj.b;
          b3.U.c(b3.F.subscribe(new t(obj), e));
          b3 = obj.b;
          b3.U.c(b3.J.subscribe(new z(obj), e));
          b3 = obj.b;
          b3.U.c(b3.I.subscribe(new u(obj), Functions.d()));
          obj.b.X8(false);
          b3 = obj.b;
          b3.Y8(b3.x.v(), Integer.valueOf(true));
          PatchProxy.onMethodExit(j$a.class, "1");
          return;
       }
    }
}

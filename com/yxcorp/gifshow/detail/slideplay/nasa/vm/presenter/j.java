package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import c7a.c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$c;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$d;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$e;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$f;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import e1a.l$a;
import e1a.l;
import p5a.e;
import de5.a;
import gc6.k;
import y6a.n;
import erd.g;
import crd.b;
import brd.t;
import y6a.o;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.f;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.g;
import y6a.p;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.h;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.i;
import java.lang.Boolean;
import kzc.c;
import cg6.b;
import android.app.Activity;
import java.util.List;
import com.yxcorp.gifshow.widget.popup.c;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import kzc.e;
import android.os.SystemClock;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.player.core.b;
import bf5.d;
import java.lang.Integer;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import rh5.a;
import rh5.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Long;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import m9a.y;
import rf5.u;
import android.view.View;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import xl8.b;
import brd.y;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import r7a.f;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import xx9.a;
import mrd.c;

public class j extends PresenterV2	// class@001821
{
    public y A;
    public c B;
    public t C;
    public l D;
    public y E;
    public t F;
    public y G;
    public y H;
    public t I;
    public t J;
    public MilanoContainerEventBus K;
    public SlidePlayViewModel L;
    public boolean M;
    public boolean N;
    public boolean O;
    public long P;
    public View Q;
    public View R;
    public View S;
    public TextView T;
    public a U;
    public View U0;
    public long V;
    public int V0;
    public PublishSubject W;
    public PublishSubject W0;
    public PublishSubject X;
    public PublishSubject X0;
    public b Y;
    public boolean Y0;
    public final BitSet Z;
    public PublishSubject Z0;
    public PublishSubject a1;
    public PublishSubject b1;
    public final c c1;
    public final a d1;
    public final c e1;
    public final ViewPager$l f1;
    public final e g1;
    public final d$a h1;
    public final l$a i1;
    public final k j1;
    public d p;
    public QPhoto q;
    public PhotoDetailParam r;
    public BaseFragment s;
    public f t;
    public f u;
    public PublishSubject v;
    public a w;
    public u x;
    public PublishSubject y;
    public a z;

    public void j(){
       super();
       this.O = false;
       this.P = 0;
       this.Z = new BitSet();
       this.c1 = new c();
       this.d1 = new j$a(this);
       this.e1 = new j$b(this);
       this.f1 = new j$c(this);
       this.g1 = new j$d(this);
       this.h1 = new j$e(this);
       this.i1 = new j$f(this);
       this.j1 = new j$g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, j.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.s.getParentFragment());
       this.L = slidePlayVie;
       slidePlayVie.P(this.s, this.d1);
       j tD = this.D;
       if (tD != null) {
          tD.b(this.i1);
       }
       this.w.getPlayer().c(this.j1);
       tD = this.W0;
       if (tD != null) {
          this.X7(tD.subscribe(new n(this)));
       }
       tD = this.X0;
       if (tD != null) {
          this.X7(tD.subscribe(new o(this)));
       }
       this.X7(this.a1.subscribe(new f(this), g.b));
       this.X7(this.Z0.subscribe(new p(this), h.b));
       this.X7(this.b1.subscribe(new e(this), i.b));
       PatchProxy.onMethodExit(j.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, j.class, "4")) {
          return;
       }
       this.L.D(this.s, this.d1);
       j tD = this.D;
       if (tD != null) {
          tD.a(this.i1);
       }
       this.w.getPlayer().f(this.j1);
       this.P = 0;
       PatchProxy.onMethodExit(j.class, "4");
       return;
    }
    public void P8(boolean p0){
       if (PatchProxy.isSupport2(j.class, "13") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, j.class, "13")) {
          return;
       }
       if (p0) {
          List list = b.a().l(this.getActivity());
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
                if (uoa.K()) {
                   uoa.o();
                }
             }
          }
          b.a().u(7);
          b.b().u(7);
       }else {
          b.a().v(7);
          b.b().v(7);
       }
       PatchProxy.onMethodExit(j.class, "13");
       return;
    }
    public void R8(boolean p0){
       int i;
       if (PatchProxy.isSupport2(j.class, "12") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, j.class, "12")) {
          return;
       }
       if (this.p == null) {
          PatchProxy.onMethodExit(j.class, "12");
          return;
       }else {
          long l = SystemClock.currentThreadTimeMillis();
          String str = "10";
          Object obj = PatchProxy.applyWithListener(null, this, j.class, str);
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             long currentPosit = this.w.getPlayer().getCurrentPosition();
             long duration = this.w.getPlayer().getDuration();
             if (!currentPosit || !duration) {
                PatchProxy.onMethodExit(j.class, str);
                i = 0;
             }else {
                i = (int)((((float)currentPosit * 0x3f800000) * 10000.00f) / (float)duration);
                PatchProxy.onMethodExit(j.class, str);
             }
          }
          if (p0) {
             this.p.u(i);
          }
          this.Y8(p0, Integer.valueOf(1));
          Object[] objArray = new Object[0];
          o.C().w("NasaMilanoRedesignProgressPresenter", " showIdleProgressBar = "+p0, objArray);
          a uoa = new a();
          uoa.mFunctionName = "NasaProgressV3VMPresenter - changeSeekBarShown";
          uoa.mContainer = "NasaProgressV3VMPresenter";
          uoa.mStartTime = l;
          uoa.mEndTime = SystemClock.currentThreadTimeMillis();
          b.b("FEATURED_PAGE").a(uoa);
          PatchProxy.onMethodExit(j.class, "12");
          return;
       }
    }
    public void S8(boolean p0){
       if (PatchProxy.isSupport2(j.class, "9") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, j.class, "9")) {
          return;
       }
       j tp = this.p;
       if (tp == null) {
          PatchProxy.onMethodExit(j.class, "9");
          return;
       }else {
          tp.r(p0);
          if (p0 && !PatchProxy.applyVoidWithListener(null, this, j.class, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PROGRESS_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("progress_type", "VERTICAL_SCREE");
             oi3.c("photo_duration", Long.valueOf(this.q.getVideoDuration()));
             oi3.c("time_start", Long.valueOf(this.w.getPlayer().getCurrentPosition()));
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.q.getEntity());
             u1.D0("", this.s, 0, uElementPack, uContentPack, null);
             PatchProxy.onMethodExit(j.class, "15");
          }
          PatchProxy.onMethodExit(j.class, "9");
          return;
       }
    }
    public final String V8(long p0){
       if (PatchProxy.isSupport2(j.class, "21")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Long.valueOf(p0), this, j.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = p0 / 1000;
       Object[] objArray = new Object[]{Integer.valueOf((int)(p0 / 60)),Integer.valueOf((int)(p0 % 60))};
       PatchProxy.onMethodExit(j.class, "21");
       return String.format("%02d:%02d", objArray);
    }
    public boolean W8(){
       j oj = j.class;
       Object obj = PatchProxy.applyWithListener(null, this, oj, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (y.a(this.q) && this.x.v())? true: false;
       PatchProxy.onMethodExit(oj, "14");
       return b;
    }
    public void X8(boolean p0){
       int i1;
       if (PatchProxy.isSupport2(j.class, "8") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, j.class, "8")) {
          return;
       }
       j tQ = this.Q;
       int i = 0;
       if (tQ != null) {
          i1 = (p0)? 0: 8;
          tQ.setVisibility(i1);
       }
       tQ = this.S;
       if (tQ != null) {
          i1 = (p0)? 0: 8;
          tQ.setVisibility(i1);
       }
       tQ = this.R;
       if (tQ != null) {
          if (!p0) {
             i = 8;
          }
          tQ.setVisibility(i);
       }
       PatchProxy.onMethodExit(j.class, "8");
       return;
    }
    public void Y8(boolean p0,Integer p1){
       if (PatchProxy.isSupport2(j.class, "19") && PatchProxy.applyVoidTwoRefsWithListener(Boolean.valueOf(p0), p1, this, j.class, "19")) {
          return;
       }
       this.Z8(p0, p1, false);
       PatchProxy.onMethodExit(j.class, "19");
       return;
    }
    public final void Z8(boolean p0,Integer p1,boolean p2){
       if (PatchProxy.isSupport2(j.class, "20") && PatchProxy.applyVoidThreeRefsWithListener(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, j.class, "20")) {
          return;
       }
       if (!this.K.o.a().booleanValue()) {
          PatchProxy.onMethodExit(j.class, "20");
          return;
       }else if(p1 != null){
          if (p0) {
             this.Z.clear(p1.intValue());
          }else {
             this.Z.set(p1.intValue());
          }
       }
       if (this.p == null) {
          PatchProxy.onMethodExit(j.class, "20");
          return;
       }else if(this.Z.isEmpty()){
          this.p.s();
          this.H.onNext(Boolean.TRUE);
       }else if(p2 || this.N == null){
          this.p.f();
       }
       PatchProxy.onMethodExit(j.class, "20");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, j.class, "2")) {
          return;
       }
       this.T = m1.f(p0, 0x7f0a2ec7);
       this.U0 = this.getActivity().findViewById(0x7f0a048d);
       PatchProxy.onMethodExit(j.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, j.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(PhotoDetailParam.class);
       this.t = this.r8("NASA_SIDEBAR_STATUS");
       this.u = this.x8("SLIDE_PLAY_CLOSE_STATE");
       this.v = this.r8("DETAIL_PROCESS_EVENT");
       this.w = this.q8(a.class);
       this.x = this.q8(u.class);
       this.y = this.r8("DETAIL_POSTER_EVENT");
       this.z = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.B = this.t8("DETAIL_VIDEO_LOADING_HIDE_PROGRESS_BAR_OBSERVABLE");
       this.C = this.r8("MORE_VIEW_SHOW_OBSERVABLE");
       this.D = this.s8(l.class);
       this.E = this.t8("DETAIL_VIDEO_PROGRESS_IS_SEEK_OBSERVER");
       this.A = this.r8("DETAIL_PROGRESSBAR_DRAG_POSITION_EVENT");
       this.W = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.X = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       this.Y = this.t8("MORE_TRENDING_LIST_SHOW_EVENT");
       this.F = this.r8("NASA_DETAIL_PLAY_PAUSE_SHOW_OBSERVABLE");
       this.H = this.r8("PROGRESS_BAR_SHOW_OBSERVER");
       this.K = this.q8(MilanoContainerEventBus.class);
       this.J = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       this.I = this.r8("PROGRESS_BAR_ENHANCE_OBSERVABLE");
       this.W0 = this.t8("CORONA_PAY_PANEL_SHOW");
       this.X0 = this.t8("SERIAL_PAY_PANEL_SHOW");
       this.G = this.r8("DETAIL_CANCEL_GUIDE_OBSERVER");
       this.Z0 = this.r8("LOADING_BAN_PROGRESS_BAR_INTERCEPT_MOVE");
       this.a1 = this.r8("LOADING_STATE_SHOW_PROGRESS_BAR");
       this.b1 = this.r8("LOADING_STATE_RESET");
       PatchProxy.onMethodExit(j.class, "1");
       return;
    }
}

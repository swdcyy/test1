package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$c;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$e;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$d;
import de5.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import p5a.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import jta.c;
import g19.l;
import vy6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$onBind$1;
import r19.m;
import msd.l;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import android.view.GestureDetector;
import android.content.Context;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$onBind$2;
import lnc.y0;
import wl9.x;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$onBind$3;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.commercial.splash.SplashUtils;
import android.view.ViewPropertyAnimator;
import es7.a0;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import org.greenrobot.eventbus.a;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.ThanosAdPlayerPausePresenter$a;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosAdPlayerPausePresenter extends PresenterV2	// class@0016d5
{
    public final b$b A;
    public final ThanosAdPlayerPausePresenter$b B;
    public final ThanosAdPlayerPausePresenter$e C;
    public final c D;
    public final String p;
    public QPhoto q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public l t;
    public a u;
    public View v;
    public ScaleHelpView w;
    public GestureDetector x;
    public boolean y;
    public boolean z;

    public void ThanosAdPlayerPausePresenter(){
       super();
       this.p = "ThanosAdPlayerPausePresenter";
       this.A = new ThanosAdPlayerPausePresenter$c(this);
       this.B = new ThanosAdPlayerPausePresenter$b(this);
       this.C = new ThanosAdPlayerPausePresenter$e(this);
       this.D = new ThanosAdPlayerPausePresenter$d(this);
    }
    public static final a P8(ThanosAdPlayerPausePresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public static final View R8(ThanosAdPlayerPausePresenter p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPlayPauseBtn");
       }
       return p0;
    }
    public void E8(){
       z a;
       if (PatchProxy.applyVoid(null, this, ThanosAdPlayerPausePresenter.class, "3")) {
          return;
       }
       ThanosAdPlayerPausePresenter tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.s = slidePlayVie;
       tr = this.u;
       if (tr == null) {
          a.S("mPlayModule");
       }
       e player = tr.getPlayer();
       if (player != null) {
          player.w(this.A);
       }
       tr = this.t;
       if (tr == null) {
          a.S("mSidebarStatusHelper");
       }
       tr.a(this.D);
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       slidePlayVie = SlidePlayViewModel.S0(tr.getParentFragment());
       if (slidePlayVie != null) {
          ThanosAdPlayerPausePresenter tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tr1, this.B);
       }
       RxBus f = RxBus.f;
       a = d.a;
       this.X7(f.f(s.class).observeOn(a).subscribe(new m(new ThanosAdPlayerPausePresenter$onBind$1(this))));
       ThanosAdPlayerPausePresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (s.b(tq)) {
          GestureDetector gestureDetec = new GestureDetector(this.getContext(), this.C);
          this.x = gestureDetec;
          ThanosAdPlayerPausePresenter tw = this.w;
          if (tw != null) {
             tw.e(gestureDetec);
          }
          tq = this.v;
          if (tq == null) {
             a.S("mPlayPauseBtn");
          }
          y0.a(tq, new ThanosAdPlayerPausePresenter$onBind$2(this));
       }
       this.X7(f.f(x.class).observeOn(a).subscribe(new m(new ThanosAdPlayerPausePresenter$onBind$3(this))));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdPlayerPausePresenter.class, "4")) {
          return;
       }
       ThanosAdPlayerPausePresenter tv = this.v;
       if (tv == null) {
          a.S("mPlayPauseBtn");
       }
       tv.setVisibility(8);
       tv = this.u;
       if (tv == null) {
          a.S("mPlayModule");
       }
       e player = tv.getPlayer();
       if (player != null) {
          player.O(this.A);
       }
       tv = this.q;
       if (tv == null) {
          a.S("mPhoto");
       }
       if (s.b(tv)) {
          tv = this.w;
          if (tv != null) {
             tv.j(this.x);
          }
       }
       tv = this.t;
       if (tv == null) {
          a.S("mSidebarStatusHelper");
       }
       tv.c(this.D);
       return;
    }
    public final void S8(){
       boolean b;
       e player;
       ThanosAdPlayerPausePresenter tv;
       ThanosAdPlayerPausePresenter thanosAdPlay = ThanosAdPlayerPausePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosAdPlay, "5")) {
          return;
       }
       ThanosAdPlayerPausePresenter obj = PatchProxy.apply(objArray, this, thanosAdPlay, "6");
       String str = "mPlayModule";
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.q;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (obj.isEyeMax()) {
             if (SplashUtils.I()) {
                obj = this.u;
                if (obj == null) {
                   a.S(str);
                }
                player = obj.getPlayer();
                if (player != null && player.isPrepared() == true) {
                label_0049 :
                   b = true;
                }
             }else if(this.z == null){
             label_0052 :
                obj = this.u;
                if (obj == null) {
                   a.S(str);
                }
                player = obj.getPlayer();
                if (player != null && player.isPrepared() == true) {
                   goto label_0049 ;
                }
             }
          }else {
             goto label_0052 ;
          }
          b = false;
       }
       if (b) {
          obj = this.u;
          if (obj == null) {
             a.S(str);
          }
          player = obj.getPlayer();
          b = (player != null && player.isPaused() == true)? true: false;
          if (!b) {
             tv = this.v;
             str = "mPlayPauseBtn";
             if (tv == null) {
                a.S(str);
             }
             tv.setVisibility(i);
             if (!PatchProxy.applyVoid(objArray, this, thanosAdPlay, "8")) {
                thanosAdPlay = this.v;
                if (thanosAdPlay == null) {
                   a.S(str);
                }
                thanosAdPlay.setAlpha(0);
                thanosAdPlay = this.v;
                if (thanosAdPlay == null) {
                   a.S(str);
                }
                ViewPropertyAnimator viewProperty = thanosAdPlay.animate();
                float f = 0x3f800000;
                viewProperty.alpha(f);
                viewProperty.setDuration(50);
                viewProperty.setInterpolator(new a0()).start();
                thanosAdPlay = this.v;
                if (thanosAdPlay == null) {
                   a.S(str);
                }
                float f1 = 2.00f;
                thanosAdPlay.setScaleX(f1);
                thanosAdPlay = this.v;
                if (thanosAdPlay == null) {
                   a.S(str);
                }
                thanosAdPlay.setScaleY(f1);
                thanosAdPlay = this.v;
                if (thanosAdPlay == null) {
                   a.S(str);
                }
                viewProperty = thanosAdPlay.animate();
                viewProperty.scaleX(f);
                viewProperty.scaleY(f);
                viewProperty.setDuration(100);
                viewProperty.setInterpolator(new a0()).start();
             }
          }
          PlayEvent$Status rESUME = (b)? PlayEvent$Status.RESUME: PlayEvent$Status.PAUSE;
          a uoa = a.d();
          ThanosAdPlayerPausePresenter tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          uoa.k(new PlayEvent(tq, rESUME, 1, "ThanosAdPlayerPause"));
          j0 oj0 = o.z();
          int i1 = 141;
          tv = this.q;
          if (tv == null) {
             a.S("mPhoto");
          }
          oj0.e(i1, tv.mEntity).d(new ThanosAdPlayerPausePresenter$a(this, b)).a();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdPlayerPausePresenter.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       View view = m1.f(p0, R.id.ad_play_pause_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­, R.id.ad_play_pause_btn\)");
       this.v = view;
       this.w = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdPlayerPausePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.u = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(AccessIds.NASA_SIDEBAR_STATUS\)");
       this.t = obj;
       return;
    }
}

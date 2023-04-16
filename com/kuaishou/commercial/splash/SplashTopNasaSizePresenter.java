package com.kuaishou.commercial.splash.SplashTopNasaSizePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$onBind$1;
import yy.r1;
import msd.l;
import erd.g;
import crd.b;
import ujc.e;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$onBind$2;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import yx.j0;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.animation.ValueAnimator;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.commercial.splash.SplashTopNasaSizePresenter$b;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import yy.q1;
import java.lang.Runnable;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public final class SplashTopNasaSizePresenter extends PresenterV2	// class@001595
{
    public int A;
    public View B;
    public View C;
    public final long p;
    public View q;
    public View r;
    public QPhoto s;
    public BaseFragment t;
    public NasaBizParam u;
    public SlidePlayViewModel v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    public void SplashTopNasaSizePresenter(){
       super();
       this.p = 300;
       this.z = -1;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SplashTopNasaSizePresenter.class, "11")) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(x.class).observeOn(a).subscribe(new r1(new SplashTopNasaSizePresenter$onBind$1(this))));
       t ot = f.f(e.class).observeOn(a);
       this.X7(ot.subscribe(new r1(new SplashTopNasaSizePresenter$onBind$2(this))));
       this.x = false;
       SplashTopNasaSizePresenter ts = this.s;
       if (ts == null) {
          a.S("mPhoto");
       }
       if (!l.j(ts.mEntity)) {
          return;
       }else {
          ts = this.t;
          if (ts != null) {
             objArray = ts.getParentFragment();
          }
          this.v = SlidePlayViewModel.B0(objArray);
          this.W8();
          return;
       }
    }
    public final void P8(){
       Object[] objArray1;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, SplashTopNasaSizePresenter.class, "19")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "SplashTopNasaSizePresenter";
       j0.f(str, "animationTextureViewSize", objArray);
       if (this.y != null && (this.w != null || this.x == null)) {
          objArray1 = new Object[i];
          j0.f(str, "animationTextureViewSize did not adapte", objArray1);
          return;
       }else {
          SplashTopNasaSizePresenter tB = this.B;
          if (tB == null || this.C == null) {
             objArray1 = new Object[i];
             j0.f(str, "animationTextureViewSize view error", objArray1);
             return;
          }else if(this.z <= null){
             return;
          }else if(tB != null){
             layoutParams = tB.getLayoutParams();
             if (layoutParams != null) {
                layoutParams = layoutParams.height;
             label_003d :
                SplashTopNasaSizePresenter tC = this.C;
                if (tC != null) {
                   i = tC.getPaddingBottom();
                }
                if (layoutParams < null) {
                   return;
                }else {
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                   a.o(valueAnimato, "valueAnimator");
                   valueAnimato.setDuration(this.p);
                   valueAnimato.start();
                   valueAnimato.addUpdateListener(new SplashTopNasaSizePresenter$a(this, layoutParams, i));
                   valueAnimato.addListener(new SplashTopNasaSizePresenter$b(this));
                   return;
                }
             }
          }
          layoutParams = -1;
          goto label_003d ;
       }
    }
    public final View R8(){
       SplashTopNasaSizePresenter obj = PatchProxy.apply(null, this, SplashTopNasaSizePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mPlayerView");
       }
       return obj;
    }
    public final View S8(){
       SplashTopNasaSizePresenter obj = PatchProxy.apply(null, this, SplashTopNasaSizePresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mTextureViewFrame");
       }
       return obj;
    }
    public final VerticalViewPager V8(){
       SplashTopNasaSizePresenter obj = PatchProxy.apply(null, this, SplashTopNasaSizePresenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v;
       if (obj == null) {
          return null;
       }
       a.m(obj);
       return obj.s2();
    }
    public final void W8(){
       SplashTopNasaSizePresenter splashTopNas = SplashTopNasaSizePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, splashTopNas, "14")) {
          return;
       }
       if (PatchProxy.applyVoid(objArray, this, splashTopNas, "17") || (this.w != null || (this.y == null && this.x != null))) {
          this.m8().post(new q1(this));
       }
    label_002e :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashTopNasaSizePresenter.class, "10")) {
          return;
       }
       View view = m1.f(p0, R.id.player_view);
       a.o(view, "ViewBindUtils.bindWidget¡­>\(view, R.id.player_view\)");
       this.q = view;
       p0 = m1.f(p0, R.id.texture_view_frame);
       a.o(p0, "ViewBindUtils.bindWidget¡­ R.id.texture_view_frame\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SplashTopNasaSizePresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.s = obj;
       this.t = this.t8("DETAIL_FRAGMENT");
       obj = this.q8(NasaBizParam.class);
       a.o(obj, "inject\(NasaBizParam::class.java\)");
       this.u = obj;
       return;
    }
    public final void onHomeSplashStateEvent(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashTopNasaSizePresenter.class, "12")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.a;
       if (p0 != 3) {
          if (p0 == 4 && !PatchProxy.applyVoid(null, this, SplashTopNasaSizePresenter.class, "15")) {
             this.P8();
             this.w = true;
          }
       }else {
          this.W8();
       }
       return;
    }
    public final void onHomeSplashStateEvent(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashTopNasaSizePresenter.class, "13")) {
          return;
       }
       a.p(p0, "event");
       if (!PatchProxy.applyVoid(null, this, SplashTopNasaSizePresenter.class, "16")) {
          this.P8();
          this.w = true;
       }
       return;
    }
}

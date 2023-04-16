package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$a;
import nsd.u;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import oe6.n;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$b;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$c;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import joc.z;
import com.yxcorp.gifshow.widget.SwipeLayout;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import wq6.h;
import java.lang.Float;
import fr6.b;
import fr6.e;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$d;
import erd.r;
import brd.t;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabGuidePresenter$e;
import erd.g;
import crd.b;
import java.lang.Runnable;
import ekd.k1;
import android.animation.AnimatorSet;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import java.lang.Long;
import android.util.Property;
import java.lang.Number;
import android.animation.AnimatorSet$Builder;
import ekd.m1;
import wra.b;
import android.app.Activity;
import lnc.w9;

public final class KCubeBlockTabGuidePresenter extends PresenterV2	// class@001667
{
    public final KCubeBlockTabGuidePresenter$c A;
    public KCubeTabActionBar p;
    public b q;
    public IContainerDecorator r;
    public View s;
    public final a t;
    public final SharedPreferences u;
    public boolean v;
    public SwipeLayout w;
    public boolean x;
    public final p y;
    public final Runnable z;
    public static final KCubeBlockTabGuidePresenter$a B;

    static {
       KCubeBlockTabGuidePresenter.B = new KCubeBlockTabGuidePresenter$a(null);
    }
    public void KCubeBlockTabGuidePresenter(){
       super();
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Float>\(\)");
       this.t = uoa;
       SharedPreferences sharedPrefer = n.b();
       a.o(sharedPrefer, "PreferenceUtil.getPreferences\(\)");
       this.u = sharedPrefer;
       this.y = s.c(new KCubeBlockTabGuidePresenter$mTabSelfPageOffsetListener$2(this));
       this.z = new KCubeBlockTabGuidePresenter$b(this);
       this.A = new KCubeBlockTabGuidePresenter$c(this);
    }
    public static final KCubeTabActionBar P8(KCubeBlockTabGuidePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mTabLayout");
       }
       return p0;
    }
    public static final View R8(KCubeBlockTabGuidePresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mTopView");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabGuidePresenter.class, "4")) {
          return;
       }
       KCubeBlockTabGuidePresenter tw = this.w;
       if (tw != null) {
          tw.c(this.A);
       }
       tw = this.r;
       String str = "mContainerDecorator";
       if (tw == null) {
          a.S(str);
       }
       if (tw.c().isSelected()) {
          this.t.onNext(Float.valueOf(0x3f800000));
       }
       tw = this.r;
       if (tw == null) {
          a.S(str);
       }
       tw.c().b0().e(this.X8());
       this.X7(this.t.filter(new KCubeBlockTabGuidePresenter$d(this)).subscribe(new KCubeBlockTabGuidePresenter$e(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabGuidePresenter.class, "5")) {
          return;
       }
       k1.m(this.z);
       KCubeBlockTabGuidePresenter tr = this.r;
       if (tr == null) {
          a.S("mContainerDecorator");
       }
       tr.c().b0().m(this.X8());
       tr = this.w;
       if (tr != null) {
          tr.m(this.A);
       }
       return;
    }
    public final AnimatorSet S8(View p0,float p1,float p2,int p3){
       AnimatorSet obj;
       if (PatchProxy.isSupport(KCubeBlockTabGuidePresenter.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, KCubeBlockTabGuidePresenter.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AnimatorSet();
       p0.setPivotX(((float)p0.getWidth() / 2.00f));
       p0.setPivotY(((float)p0.getHeight() / 2.00f));
       float[] uofloatArray = new float[]{p1,p2};
       float[] uofloatArray1 = new float[]{p1,p2};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray),ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray1)};
       obj.playTogether(uAnimatorArr);
       obj.setDuration((long)p3);
       return obj;
    }
    public final Animator V8(View p0,float p1,float p2,long p3){
       if (PatchProxy.isSupport(KCubeBlockTabGuidePresenter.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Long.valueOf(p3), this, KCubeBlockTabGuidePresenter.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float[] uofloatArray = new float[]{p1,p2};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray).setDuration(p3);
       a.o(objectAnimat, "ObjectAnimator.ofFloat\(v¡­to\).setDuration\(duration\)");
       return objectAnimat;
    }
    public final int W8(){
       Object obj = PatchProxy.apply(null, this, KCubeBlockTabGuidePresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.u.getInt("TAB_GUIDE_COUNT", 0);
    }
    public final e X8(){
       Object obj = PatchProxy.apply(null, this, KCubeBlockTabGuidePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final AnimatorSet Y8(View p0,float p1,float p2,int p3){
       AnimatorSet obj;
       if (PatchProxy.isSupport(KCubeBlockTabGuidePresenter.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, KCubeBlockTabGuidePresenter.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new AnimatorSet();
       View view = this.m8();
       a.o(view, "rootView");
       p0.setPivotX(((float)view.getWidth() / 2.00f));
       view = this.m8();
       a.o(view, "rootView");
       p0.setPivotY(((float)view.getWidth() / 2.00f));
       float[] uofloatArray = new float[]{p1,p2};
       obj.play(ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray));
       obj.setDuration((long)p3);
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabGuidePresenter.class, "3")) {
          return;
       }
       View view = m1.f(p0, R.id.block_tabs);
       a.o(view, "ViewBindUtils.bindWidget¡­ootView, R.id.block_tabs\)");
       this.p = view;
       p0 = m1.f(p0, R.id.title_root);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.title_root\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabGuidePresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.q = obj;
       this.w = w9.c(this.getActivity());
       obj = this.q8(IContainerDecorator.class);
       a.o(obj, "inject\(IContainerDecorator::class.java\)");
       this.r = obj;
       return;
    }
}

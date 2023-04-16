package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$a;
import nsd.u;
import mrd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$mTabSelfPageOffsetListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kcube.decorator.IContainerDecorator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wq6.f;
import fr6.b;
import fr6.e;
import brd.t;
import wra.b;
import pr6.d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$b;
import brd.w;
import erd.c;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$c;
import erd.g;
import crd.b;
import java.lang.Float;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$d;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$e;
import erd.r;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$f;
import zq6.b;
import pn5.a;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$g;
import zq6.p;
import zq6.u;
import zq6.s;
import android.animation.ValueAnimator;
import xq6.b;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.Log;
import zq6.r;
import bo5.a;
import co5.p$b;
import co5.p;
import java.lang.Number;
import wq6.h;
import wq6.g;
import android.content.Context;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import lnc.a1;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$i;
import android.animation.Animator$AnimatorListener;

public final class KCubeBlockTabTriangleAlphaPresenter extends PresenterV2	// class@001688
{
    public boolean p;
    public s q;
    public IContainerDecorator r;
    public b s;
    public final a t;
    public final p u;
    public ValueAnimator v;
    public final int w;
    public static final KCubeBlockTabTriangleAlphaPresenter$a x;

    static {
       KCubeBlockTabTriangleAlphaPresenter.x = new KCubeBlockTabTriangleAlphaPresenter$a(null);
    }
    public void KCubeBlockTabTriangleAlphaPresenter(int p0){
       super();
       this.w = p0;
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<Float>\(\)");
       this.t = uoa;
       this.u = s.c(new KCubeBlockTabTriangleAlphaPresenter$mTabSelfPageOffsetListener$2(this));
    }
    public static final IContainerDecorator P8(KCubeBlockTabTriangleAlphaPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mContainerDecorator");
       }
       return p0;
    }
    public void E8(){
       KCubeBlockTabTriangleAlphaPresenter tr1;
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabTriangleAlphaPresenter.class, "3")) {
          return;
       }
       KCubeBlockTabTriangleAlphaPresenter tr = this.r;
       String str = "mContainerDecorator";
       if (tr == null) {
          a.S(str);
       }
       tr.c().b0().e(this.R8());
       if (this.w == 1) {
          tr = this.s;
          if (tr == null) {
             a.S("mHomeBlockViewState");
          }
          t ot = tr.b();
          tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          this.X7(t.combineLatest(ot, tr1.e().h().i(), KCubeBlockTabTriangleAlphaPresenter$b.a).distinctUntilChanged().subscribe(new KCubeBlockTabTriangleAlphaPresenter$c(this)));
       }else {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          if (tr.e().K0()) {
             this.t.onNext(Float.valueOf(0x3f800000));
          }
          tr = this.t;
          tr1 = this.r;
          if (tr1 == null) {
             a.S(str);
          }
          this.X7(t.combineLatest(tr, tr1.e().h().i(), KCubeBlockTabTriangleAlphaPresenter$d.a).skipUntil(this.t.filter(KCubeBlockTabTriangleAlphaPresenter$e.b)).distinctUntilChanged().subscribe(new KCubeBlockTabTriangleAlphaPresenter$f(this)));
       }
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       p e = a.e;
       a.o(e, "HomeBlockTopStateId.BLOCK_TAB_TRIANGLE_COLOR");
       this.q = tr.a().b(e, new KCubeBlockTabTriangleAlphaPresenter$g(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabTriangleAlphaPresenter.class, "8")) {
          return;
       }
       KCubeBlockTabTriangleAlphaPresenter tv = this.v;
       if (tv != null) {
          tv.cancel();
       }
       tv = this.r;
       if (tv == null) {
          a.S("mContainerDecorator");
       }
       tv.c().b0().m(this.R8());
       tv = this.q;
       if (tv == null) {
          a.S("mWatcher");
       }
       tv.release();
       return;
    }
    public final e R8(){
       Object obj = PatchProxy.apply(null, this, KCubeBlockTabTriangleAlphaPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u.getValue();
    }
    public final void S8(float p0){
       int i;
       int b1;
       KCubeBlockTabTriangleAlphaPresenter kCubeBlockTa = KCubeBlockTabTriangleAlphaPresenter.class;
       if (PatchProxy.isSupport(kCubeBlockTa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, kCubeBlockTa, "5")) {
          return;
       }
       Log.b("BLOCK_TAB_TRIANGLE_ALPHA", "notify triangle show");
       KCubeBlockTabTriangleAlphaPresenter tr = this.r;
       String str = "mContainerDecorator";
       if (tr == null) {
          a.S(str);
       }
       r or = tr.c().e0();
       p b = a.B;
       a.o(b, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
       p$b uob = p.c();
       Object obj = PatchProxy.apply(null, this, kCubeBlockTa, "6");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          kCubeBlockTa = this.r;
          if (kCubeBlockTa == null) {
             a.S(str);
          }
          i = HomeActionBarSkinHelper.l(kCubeBlockTa.c().j(), this.getContext());
       }
       uob.b(i);
       uob.a(p0);
       uob.d((float)a1.e(0x3f000000));
       KCubeBlockTabTriangleAlphaPresenter ts = this.s;
       if (ts == null) {
          a.S("mHomeBlockViewState");
       }
       if (ts.c()) {
          ts = this.s;
          if (ts == null) {
             a.S("mHomeBlockViewState");
          }
          if (!ts.d()) {
             b1 = IconifyTextViewNew$a.a;
          label_0093 :
             uob.c(b1);
             or.a(b, p.d(uob));
             return;
          }
       }
       b1 = IconifyTextViewNew$a.b;
       goto label_0093 ;
    }
    public final void V8(boolean p0){
       ValueAnimator valueAnimato;
       KCubeBlockTabTriangleAlphaPresenter kCubeBlockTa = KCubeBlockTabTriangleAlphaPresenter.class;
       if (PatchProxy.isSupport(kCubeBlockTa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, kCubeBlockTa, "4")) {
          return;
       }
       Log.b("BLOCK_TAB_TRIANGLE_ALPHA", "triangleAlphaAnim show: "+p0);
       kCubeBlockTa = this.v;
       if (kCubeBlockTa != null) {
          kCubeBlockTa.end();
       }
       float[] uofloatArray = new float[2];
       if (p0) {
          uofloatArray = {0,0x3f800000};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }else {
          uofloatArray = {0x3f800000,0};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }
       this.v = valueAnimato;
       if (valueAnimato != null) {
          valueAnimato.setDuration(150);
          valueAnimato.addUpdateListener(new KCubeBlockTabTriangleAlphaPresenter$h(this, p0));
          valueAnimato.addListener(new KCubeBlockTabTriangleAlphaPresenter$i(this, p0));
          valueAnimato.start();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabTriangleAlphaPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(IContainerDecorator.class);
       a.o(obj, "inject\(IContainerDecorator::class.java\)");
       this.r = obj;
       obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.s = obj;
       return;
    }
}

package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter$h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabTriangleAlphaPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.util.Objects;
import wq6.f;
import com.kwai.kcube.decorator.IContainerDecorator;
import zq6.r;
import bo5.a;
import co5.c;
import wra.b;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;
import zq6.p;
import java.lang.NullPointerException;

public final class KCubeBlockTabTriangleAlphaPresenter$h implements ValueAnimator$AnimatorUpdateListener	// class@001684
{
    public final KCubeBlockTabTriangleAlphaPresenter a;
    public final boolean b;

    public void KCubeBlockTabTriangleAlphaPresenter$h(KCubeBlockTabTriangleAlphaPresenter p0,boolean p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       int b;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, KCubeBlockTabTriangleAlphaPresenter$h.class, "1")) {
          return;
       }
       KCubeBlockTabTriangleAlphaPresenter$h ta = this.a;
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          Objects.requireNonNull(ta);
          KCubeBlockTabTriangleAlphaPresenter kCubeBlockTa = KCubeBlockTabTriangleAlphaPresenter.class;
          if (!PatchProxy.isSupport(kCubeBlockTa) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), ta, kCubeBlockTa, "7")) {
             kCubeBlockTa = ta.r;
             if (kCubeBlockTa == null) {
                a.S("mContainerDecorator");
             }
             r or = kCubeBlockTa.c().e0();
             p f1 = a.F;
             a.o(f1, "HomeTopStateId.TAB_TRIANGLE_ALPHA_WITH_DIRECTION");
             KCubeBlockTabTriangleAlphaPresenter s = ta.s;
             if (s == null) {
                a.S("mHomeBlockViewState");
             }
             if (s.c()) {
                KCubeBlockTabTriangleAlphaPresenter s1 = ta.s;
                if (s1 == null) {
                   a.S("mHomeBlockViewState");
                }
                if (!s1.d()) {
                   b = IconifyTextViewNew$a.a;
                label_0072 :
                   or.a(f1, new c(f, b));
                }
             }
             b = IconifyTextViewNew$a.b;
             goto label_0072 ;
          }
          PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$h.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(KCubeBlockTabTriangleAlphaPresenter$h.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}

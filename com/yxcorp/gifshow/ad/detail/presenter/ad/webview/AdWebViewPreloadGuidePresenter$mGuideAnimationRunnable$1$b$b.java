package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import yx.j0;

public final class AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b implements ValueAnimator$AnimatorUpdateListener	// class@00163c
{
    public final AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b a;
    public final Ref$ObjectRef b;

    public void AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b(AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b p0,Ref$ObjectRef p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       AdWebViewPreloadGuidePresenter v = this.a.a.this$0.v;
       float f1 = 0;
       if (v != null) {
          Ref$ObjectRef element = this.b.element;
          Float uFloat = (element != null)? Float.valueOf((element.floatValue() + f)): f1;
          a.m(uFloat);
          v.setTranslationX(uFloat.floatValue());
       }
       StringBuilder str = "root webview transitionX: ";
       AdWebViewPreloadGuidePresenter v1 = this.a.a.this$0.v;
       if (v1 != null) {
          f1 = Float.valueOf(v1.getTranslationX());
       }
       Object[] objArray = new Object[0];
       j0.a("AdWebViewPreloadGuidePresenter", str+f1+", "+"animatedValue: "+f, objArray);
       return;
    }
}

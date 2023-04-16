package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import android.view.ViewGroup;
import java.lang.Float;
import java.lang.StringBuilder;
import yx.j0;
import android.animation.Animator$AnimatorListener;
import android.view.ViewPropertyAnimator;
import lnc.a1;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public final class AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b extends AnimatorListenerAdapter	// class@00163d
{
    public final AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1 a;

    public void AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b(AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b.class, "1")) {
          return;
       }
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       AdWebViewPreloadGuidePresenter v = this.a.this$0.v;
       Animator$AnimatorListener uAnimatorLis = null;
       Float uFloat = (v != null)? Float.valueOf(v.getTranslationX()): uAnimatorLis;
       objectRef.element = uFloat;
       int i = 0;
       Object[] objArray = new Object[i];
       j0.a("AdWebViewPreloadGuidePresenter", "onAnimationEnd slide in, translationX: "+objectRef.element, objArray);
       v = this.a.this$0.z;
       if (v != null) {
          v.setListener(uAnimatorLis);
       }
       float[] uofloatArray = new float[]{0,(float)a1.d(0x7f0702b8)};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray).setDuration(400);
       this.a.this$0.A = valueAnimato;
       a.o(valueAnimato, "loopTransitionAnimator");
       valueAnimato.setRepeatMode(2);
       valueAnimato.setRepeatCount(5);
       valueAnimato.addListener(new AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a(this, valueAnimato));
       valueAnimato.addUpdateListener(new AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$b(this, objectRef));
       valueAnimato.start();
       return;
    }
}

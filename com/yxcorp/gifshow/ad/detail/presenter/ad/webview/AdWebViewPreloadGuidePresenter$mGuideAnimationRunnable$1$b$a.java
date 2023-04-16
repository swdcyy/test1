package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b;
import android.animation.ValueAnimator;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1;
import android.view.ViewGroup;
import java.lang.Float;
import yx.j0;

public final class AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a extends AnimatorListenerAdapter	// class@00163b
{
    public final AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b a;
    public final ValueAnimator b;

    public void AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a(AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b p0,ValueAnimator p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, AdWebViewPreloadGuidePresenter$mGuideAnimationRunnable$1$b$a.class, "1")) {
          return;
       }
       StringBuilder str = "onAnimationEnd loop transition, translationX: ";
       AdWebViewPreloadGuidePresenter v = this.a.a.this$0.v;
       Float uFloat = (v != null)? Float.valueOf(v.getTranslationX()): null;
       Object[] objArray = new Object[0];
       j0.a("AdWebViewPreloadGuidePresenter", str+uFloat, objArray);
       this.b.removeAllListeners();
       return;
    }
}

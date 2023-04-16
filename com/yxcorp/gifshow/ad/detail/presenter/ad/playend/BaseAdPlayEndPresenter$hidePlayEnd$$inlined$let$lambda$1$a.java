package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1;
import msd.a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;

public final class BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a extends AnimatorListenerAdapter	// class@0015e0
{
    public final BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1 a;
    public final a b;

    public void BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a(BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1 p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.$it.getMLottieAnimationView().v(this);
       this.b.invoke();
       PatchProxy.onMethodExit(BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a.class, "1");
       return;
    }
}

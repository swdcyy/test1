package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import a09.a;
import java.lang.Object;
import msd.a;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.ThanosPlayMixLottieEndView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a;
import android.animation.Animator$AnimatorListener;

public final class BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1 extends Lambda implements l	// class@0015e1
{
    public final AdPlayEndBaseView $it;
    public final a this$0;

    public void BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1(AdPlayEndBaseView p0,a p1){
       this.$it = p0;
       this.this$0 = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "complete");
       BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1 t$it = this.$it;
       if (t$it instanceof ThanosPlayMixLottieEndView) {
          t$it.getMLottieAnimationView().a(new BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1$a(this, p0));
       }else {
          p0.invoke();
       }
       PatchProxy.onMethodExit(BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1.class, "1");
       return;
    }
}

package com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import android.view.ViewGroup$LayoutParams;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.widget.TextView;

public final class AwardVideoH5CountDownPresenter$b implements ValueAnimator$AnimatorUpdateListener	// class@001524
{
    public final AwardVideoH5CountDownPresenter a;
    public final ViewGroup$LayoutParams b;

    public void AwardVideoH5CountDownPresenter$b(AwardVideoH5CountDownPresenter p0,ViewGroup$LayoutParams p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwardVideoH5CountDownPresenter$b.class, "1")) {
          return;
       }
       AwardVideoH5CountDownPresenter$b tb = this.b;
       if (tb != null) {
          a.o(p0, "it");
          p0 = p0.getAnimatedValue();
          Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
          tb.width = p0.intValue();
       }
       AwardVideoH5CountDownPresenter q = this.a.q;
       if (q != null) {
          q.setLayoutParams(this.b);
       }
       return;
    }
}

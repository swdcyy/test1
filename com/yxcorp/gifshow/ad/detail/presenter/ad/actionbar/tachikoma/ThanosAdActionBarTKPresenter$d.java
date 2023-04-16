package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;

public final class ThanosAdActionBarTKPresenter$d implements ValueAnimator$AnimatorUpdateListener	// class@001570
{
    public final ThanosAdActionBarTKPresenter a;

    public void ThanosAdActionBarTKPresenter$d(ThanosAdActionBarTKPresenter p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       float f = p0.floatValue();
       ThanosAdActionBarTKPresenter z = this.a.z;
       if (z != null) {
          ViewGroup$LayoutParams layoutParams = z.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = (int)(f * (float)this.a.M);
          }
       }
       ThanosAdActionBarTKPresenter z1 = this.a.z;
       if (z1 != null) {
          z1.requestLayout();
       }
       return;
    }
}

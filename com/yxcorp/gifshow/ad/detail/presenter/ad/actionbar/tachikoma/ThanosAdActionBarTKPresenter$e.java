package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$e;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;

public final class ThanosAdActionBarTKPresenter$e extends AnimatorListenerAdapter	// class@001571
{
    public final ThanosAdActionBarTKPresenter a;

    public void ThanosAdActionBarTKPresenter$e(ThanosAdActionBarTKPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter$e.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       ThanosAdActionBarTKPresenter z = this.a.z;
       if (z != null) {
          ViewGroup$LayoutParams layoutParams = z.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = this.a.M;
          }
       }
       z = this.a.z;
       if (z != null) {
          z.requestLayout();
       }
       return;
    }
}

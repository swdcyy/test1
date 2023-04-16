package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$f;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cm9.a;

public final class ThanosAdActionBarTKPresenter$f extends AnimatorListenerAdapter	// class@001572
{
    public final ThanosAdActionBarTKPresenter a;

    public void ThanosAdActionBarTKPresenter$f(ThanosAdActionBarTKPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdActionBarTKPresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       ThanosAdActionBarTKPresenter o = this.a.O;
       if (o != null) {
          o.start();
       }
       return;
    }
}

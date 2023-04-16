package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$e$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import android.widget.ImageView;

public final class VerticalAtlasExpandPresenter$e$a extends AnimatorListenerAdapter	// class@001bd2
{
    public final VerticalAtlasExpandPresenter$e a;

    public void VerticalAtlasExpandPresenter$e$a(VerticalAtlasExpandPresenter$e p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$e$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationCancel(p0);
       VerticalAtlasExpandPresenter$e$a ta = this.a;
       ta.b.a9(ta.c, this);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$e$a.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       VerticalAtlasExpandPresenter$e$a ta = this.a;
       ta.b.a9(ta.c, this);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VerticalAtlasExpandPresenter$e$a.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationStart(p0);
       VerticalAtlasExpandPresenter$e$a ta = this.a;
       VerticalAtlasExpandPresenter$e b = ta.b;
       b.M = b.M + 1;
       ta.c.setVisibility(0);
       this.a.c.bringToFront();
       return;
    }
}

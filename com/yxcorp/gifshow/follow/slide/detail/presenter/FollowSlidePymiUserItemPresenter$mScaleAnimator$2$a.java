package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlidePymiUserItemPresenter$mScaleAnimator$2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import com.yxcorp.gifshow.image.KwaiImageView;
import yha.a;
import android.widget.ImageView;
import com.yxcorp.gifshow.follow.common.widget.wave.WaveView;
import java.lang.NullPointerException;

public final class FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a implements ValueAnimator$AnimatorUpdateListener	// class@00112a
{
    public final FollowSlidePymiUserItemPresenter$mScaleAnimator$2 a;

    public void FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a(FollowSlidePymiUserItemPresenter$mScaleAnimator$2 p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       Object animatedValu = p0.getAnimatedValue();
       if (animatedValu != null) {
          float f = animatedValu.floatValue();
          this.a.this$0.R8().setScaleX(f);
          this.a.this$0.R8().setScaleY(f);
          if (p0.getAnimatedFraction() - 0x3e99999a > 0) {
             this.a.this$0.W8().b();
          }
          PatchProxy.onMethodExit(FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(FollowSlidePymiUserItemPresenter$mScaleAnimator$2$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}

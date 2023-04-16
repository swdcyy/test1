package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving$mRingScaleAnimRunnable$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving$mRingScaleAnimRunnable$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import android.view.View;
import lnc.a1;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.animation.AnimatorSet;
import sf5.g;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import qrd.l1;

public final class AvatarWithLiving$mRingScaleAnimRunnable$2$a implements Runnable	// class@001780
{
    public final AvatarWithLiving$mRingScaleAnimRunnable$2 b;

    public void AvatarWithLiving$mRingScaleAnimRunnable$2$a(AvatarWithLiving$mRingScaleAnimRunnable$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, AvatarWithLiving$mRingScaleAnimRunnable$2$a.class, "1")) {
          return;
       }
       AvatarWithLiving$mRingScaleAnimRunnable$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidWithListener(objArray, this$0, AvatarWithLiving.class, "10")) {
          AvatarWithLiving b = this$0.b;
          if (b != null) {
             b.clearAnimation();
             b.setVisibility(0);
          }
          if (this$0.d == null) {
             AnimatorSet uAnimatorSet = g.b(this$0.b, (float)a1.e(26.00f), (float)a1.e(35.00f), (float)a1.e(0x3fc00000));
             uAnimatorSet.setDuration(830);
             uAnimatorSet.setInterpolator(new LinearInterpolator());
             this$0.d = uAnimatorSet;
          }
          AvatarWithLiving d = this$0.d;
          if (d != null) {
             d.start();
          }
          PatchProxy.onMethodExit(AvatarWithLiving.class, "10");
       }
       PatchProxy.onMethodExit(AvatarWithLiving$mRingScaleAnimRunnable$2$a.class, "1");
       return;
    }
}

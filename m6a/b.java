package m6a.b;
import ekd.f$i;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.AvatarWithLiving;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.View;
import sf5.g;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import m6a.a;
import android.animation.Animator$AnimatorListener;
import qrd.l1;
import java.lang.Runnable;
import ekd.k1;
import android.view.animation.ScaleAnimation;
import m6a.c;
import android.view.animation.Animation$AnimationListener;

public final class b extends f$i	// class@002f4a
{
    public final AvatarWithLiving b;

    public void b(AvatarWithLiving p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, AvatarWithLiving.class, "9")) {
          tb.g.clearAnimation();
          if (tb.c == null) {
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(830);
             uAnimatorSet.setInterpolator(new LinearInterpolator());
             uAnimatorSet.play(g.a(tb.g, 0x3f800000, 0x3f5eb852));
             uAnimatorSet.addListener(new a(tb));
             tb.c = uAnimatorSet;
          }
          AvatarWithLiving c = tb.c;
          if (c != null) {
             c.start();
          }
          PatchProxy.onMethodExit(AvatarWithLiving.class, "9");
       }
       k1.o(this.b.getMRingScaleAnimRunnable());
       PatchProxy.onMethodExit(b.class, "2");
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, AvatarWithLiving.class, "8")) {
          ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f5eb852, 0x3f800000, 0x3f5eb852, 0x3f800000, ((float)tb.g.getWidth() / 2.00f), ((float)tb.g.getHeight() / 2.00f));
          v0.setDuration(300);
          v0.setFillAfter(true);
          v0.setAnimationListener(new c(tb));
          tb.g.startAnimation(v0);
          PatchProxy.onMethodExit(AvatarWithLiving.class, "8");
       }
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}

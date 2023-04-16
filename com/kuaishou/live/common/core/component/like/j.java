package com.kuaishou.live.common.core.component.like.j;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import java.util.Objects;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.LottieAnimationView;
import ko1.b0;
import lo1.c;
import com.kuaishou.live.common.core.component.like.b;
import go1.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.common.core.component.like.j$a;
import android.animation.Animator$AnimatorListener;

public class j extends AnimatorListenerAdapter	// class@00146d
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.B.setScaleX(0.20f);
       this.a.B.setScaleY(0.20f);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.a.B, View.ALPHA, new float[2]{0,0x3f800000}).setDuration(100);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.a.B, View.SCALE_X, new float[2]{0x3e4ccccd,0x3f99999a}).setDuration(200);
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(this.a.B, View.SCALE_Y, new float[2]{0x3e4ccccd,0x3f99999a}).setDuration(200);
       j ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "17")) {
          ta.F.setVisibility(0);
          ta.F.setAlpha(0x3f800000);
          ta.F.setRenderMode(RenderMode.HARDWARE);
          ta.F.k(1);
          k0.b(ta.W.d(), b.a, new e(ta));
       }
       uAnimatorSet.addListener(new j$a(this));
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
}

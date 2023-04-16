package com.kuaishou.live.common.core.component.like.i$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.like.i$b$a;
import android.animation.Animator$AnimatorListener;

public class i$b extends AnimatorListenerAdapter	// class@001469
{
    public final i a;

    public void i$b(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       p0.M = new AnimatorSet();
       long l = 600;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.a.B, View.SCALE_X, new float[3]{0x3f000000,0x3fb33333,0x3f800000}).setDuration(l);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.a.B, View.SCALE_Y, new float[3]{0x3f000000,0x3fb33333,0x3f800000}).setDuration(l);
       i f = this.a.F;
       if (f != null) {
          f.s();
       }
       this.a.M.addListener(new i$b$a(this));
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.a.M.playTogether(uAnimatorArr);
       this.a.M.start();
       return;
    }
}

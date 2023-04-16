package com.kwai.slide.play.detail.negative.feedback.content.k;
import android.view.View$OnAttachStateChangeListener;
import com.kwai.slide.play.detail.negative.feedback.content.l$a;
import com.kwai.slide.play.detail.negative.feedback.content.l$a$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;

public class k implements View$OnAttachStateChangeListener	// class@00183c
{
    public AnimatorSet b;
    public final l$a$a c;
    public final l$a d;

    public void k(l$a p0,l$a$a p1){
       this.d = p0;
       this.c = p1;
       super();
       this.b = null;
    }
    public void onViewAttachedToWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       this.b = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.c.a, "scaleX", new float[2]{0x3f733333,0x3f866666});
       objectAnimat.setDuration(400);
       objectAnimat.setRepeatCount(-1);
       objectAnimat.setRepeatMode(2);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.c.a, "scaleY", new float[2]{0x3f733333,0x3f866666});
       objectAnimat1.setDuration(400);
       objectAnimat1.setRepeatCount(-1);
       objectAnimat1.setRepeatMode(2);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.b.playTogether(uAnimatorArr);
       this.b.start();
       return;
    }
    public void onViewDetachedFromWindow(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       k tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       p0.removeOnAttachStateChangeListener(this);
       return;
    }
}

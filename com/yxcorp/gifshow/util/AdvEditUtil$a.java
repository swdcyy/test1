package com.yxcorp.gifshow.util.AdvEditUtil$a;
import android.animation.AnimatorListenerAdapter;
import java.lang.Runnable;
import android.animation.Animator;

public class AdvEditUtil$a extends AnimatorListenerAdapter	// class@001ecb
{
    public final Runnable a;

    public void AdvEditUtil$a(Runnable p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       super.onAnimationCancel(p0);
       AdvEditUtil$a ta = this.a;
       if (ta != null) {
          ta.run();
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       super.onAnimationEnd(p0);
       AdvEditUtil$a ta = this.a;
       if (ta != null) {
          ta.run();
       }
       return;
    }
}

package com.hhh.smartwidget.bubble.b;
import com.hhh.smartwidget.popup.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.OvershootInterpolator;
import android.animation.TimeInterpolator;
import com.hhh.smartwidget.bubble.d;

public final class b implements PopupInterface$b	// class@00057d
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000}),ObjectAnimator.ofFloat(p0, View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),ObjectAnimator.ofFloat(p0, View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(300);
       uAnimatorSet.setInterpolator(new OvershootInterpolator(0x3fdeb852));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       d.a(p0);
       uAnimatorSet.start();
       return;
    }
}

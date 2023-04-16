package com.hhh.smartwidget.bubble.c;
import com.hhh.smartwidget.popup.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.hhh.smartwidget.bubble.d;

public final class c implements PopupInterface$b	// class@00057e
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(p0, View.SCALE_X, new float[2]{0x3f800000,0x3f4ccccd}),ObjectAnimator.ofFloat(p0, View.SCALE_Y, new float[2]{0x3f800000,0x3f4ccccd})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.setDuration(240);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       if (p1 != null) {
          uAnimatorSet.addListener(p1);
       }
       d.a(p0);
       uAnimatorSet.start();
       return;
    }
}

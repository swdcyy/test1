package com.google.android.material.circularreveal.a;
import com.google.android.material.circularreveal.c;
import android.animation.Animator;
import com.google.android.material.circularreveal.c$c;
import com.google.android.material.circularreveal.c$b;
import com.google.android.material.circularreveal.c$e;
import java.lang.Object;
import android.util.Property;
import android.animation.TypeEvaluator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.animation.AnimatorSet;
import java.lang.IllegalStateException;
import java.lang.String;
import android.animation.Animator$AnimatorListener;
import com.google.android.material.circularreveal.a$a;

public final class a	// class@00167e
{

    public static Animator a(c p0,float p1,float p2,float p3){
       c$e[] uoeArray = new c$e[]{new c$e(p1, p2, p3)};
       ObjectAnimator objectAnimat = ObjectAnimator.ofObject(p0, c$c.a, c$b.b, uoeArray);
       c$e revealInfo = p0.getRevealInfo();
       if (revealInfo == null) {
          throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,ViewAnimationUtils.createCircularReveal(p0, (int)p1, (int)p2, revealInfo.c, p3)};
       uAnimatorSet.playTogether(uAnimatorArr);
       return uAnimatorSet;
    }
    public static Animator$AnimatorListener b(c p0){
       return new a$a(p0);
    }
}

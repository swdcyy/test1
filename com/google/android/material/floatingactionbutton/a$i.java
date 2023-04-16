package com.google.android.material.floatingactionbutton.a$i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.floatingactionbutton.a$a;
import android.animation.Animator;
import gk.a;
import android.animation.ValueAnimator;

public abstract class a$i extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener	// class@001696
{
    public boolean a;
    public float b;
    public float c;
    public final a d;

    public void a$i(a p0){
       this.d = p0;
       super();
    }
    public void a$i(a p0,a$a p1){
       super(p0);
    }
    public abstract float a();
    public void onAnimationEnd(Animator p0){
       this.d.h.k(this.c);
       this.a = false;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (this.a == null) {
          this.b = this.d.h.h();
          this.c = this.a();
          this.a = true;
       }
       a$i tb = this.b;
       this.d.h.k((tb + ((this.c - tb) * p0.getAnimatedFraction())));
       return;
    }
}

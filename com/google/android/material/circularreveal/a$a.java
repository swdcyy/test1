package com.google.android.material.circularreveal.a$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;
import android.animation.Animator;

public final class a$a extends AnimatorListenerAdapter	// class@00167d
{
    public final c a;

    public void a$a(c p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.a();
    }
    public void onAnimationStart(Animator p0){
       this.a.c();
    }
}

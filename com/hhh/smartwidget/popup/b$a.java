package com.hhh.smartwidget.popup.b$a;
import android.animation.AnimatorListenerAdapter;
import com.hhh.smartwidget.popup.b;
import android.animation.Animator;
import com.hhh.smartwidget.popup.c;

public class b$a extends AnimatorListenerAdapter	// class@000595
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       this.a.b.a();
    }
}

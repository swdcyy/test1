package com.google.android.material.bottomappbar.BottomAppBar$c;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.Animator;

public class BottomAppBar$c extends AnimatorListenerAdapter	// class@00163f
{
    public final BottomAppBar a;

    public void BottomAppBar$c(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.V = null;
    }
}

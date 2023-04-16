package com.google.android.material.bottomappbar.BottomAppBar$e;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.Animator;

public class BottomAppBar$e extends AnimatorListenerAdapter	// class@001641
{
    public final BottomAppBar a;

    public void BottomAppBar$e(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.T = null;
    }
}

package com.google.android.material.bottomappbar.BottomAppBar$g;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.Animator;

public class BottomAppBar$g extends AnimatorListenerAdapter	// class@001643
{
    public final BottomAppBar a;

    public void BottomAppBar$g(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       BottomAppBar$g ta = this.a;
       ta.d0(ta.V0);
       ta = this.a;
       ta.e0(ta.W, ta.V0);
    }
}

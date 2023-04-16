package com.google.android.material.bottomappbar.BottomAppBar$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import android.animation.Animator;

public class BottomAppBar$a extends AnimatorListenerAdapter	// class@00163d
{
    public final BottomAppBar a;

    public void BottomAppBar$a(BottomAppBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       p0.U = null;
    }
}

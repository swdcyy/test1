package com.google.android.material.bottomappbar.BottomAppBar$d;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import androidx.appcompat.widget.ActionMenuView;
import android.animation.Animator;

public class BottomAppBar$d extends AnimatorListenerAdapter	// class@001640
{
    public boolean a;
    public final ActionMenuView b;
    public final int c;
    public final boolean d;
    public final BottomAppBar e;

    public void BottomAppBar$d(BottomAppBar p0,ActionMenuView p1,int p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       if (this.a == null) {
          this.e.i0(this.b, this.c, this.d);
       }
       return;
    }
}

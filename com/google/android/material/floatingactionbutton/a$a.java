package com.google.android.material.floatingactionbutton.a$a;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.floatingactionbutton.a$g;
import android.animation.Animator;
import com.google.android.material.internal.VisibilityAwareImageButton;

public class a$a extends AnimatorListenerAdapter	// class@00168e
{
    public boolean a;
    public final boolean b;
    public final a$g c;
    public final a d;

    public void a$a(a p0,boolean p1,a$g p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       a$a td = this.d;
       td.a = 0;
       td.b = null;
       if (this.a == null) {
          a u = td.u;
          a$a tb = this.b;
          int i = (tb != null)? 8: 4;
          u.c(i, tb);
          td = this.c;
          if (td != null) {
             td.p1();
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       this.d.u.c(0, this.b);
       a$a td = this.d;
       td.a = 1;
       td.b = p0;
       this.a = false;
    }
}

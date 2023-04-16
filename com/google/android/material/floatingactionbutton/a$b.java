package com.google.android.material.floatingactionbutton.a$b;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.floatingactionbutton.a$g;
import android.animation.Animator;
import com.google.android.material.internal.VisibilityAwareImageButton;

public class a$b extends AnimatorListenerAdapter	// class@00168f
{
    public final boolean a;
    public final a$g b;
    public final a c;

    public void a$b(a p0,boolean p1,a$g p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       a$b tc = this.c;
       tc.a = 0;
       tc.b = null;
       tc = this.b;
       if (tc != null) {
          tc.a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       this.c.u.c(0, this.a);
       a$b tc = this.c;
       tc.a = 2;
       tc.b = p0;
    }
}

package com.google.android.material.behavior.SwipeDismissBehavior$c;
import java.lang.Runnable;
import com.google.android.material.behavior.SwipeDismissBehavior;
import android.view.View;
import java.lang.Object;
import androidx.customview.widget.ViewDragHelper;
import a2.i0;
import com.google.android.material.behavior.SwipeDismissBehavior$b;

public class SwipeDismissBehavior$c implements Runnable	// class@001638
{
    public final View b;
    public final boolean c;
    public final SwipeDismissBehavior d;

    public void SwipeDismissBehavior$c(SwipeDismissBehavior p0,View p1,boolean p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       SwipeDismissBehavior a = this.d.a;
       if (a != null && a.continueSettling(true)) {
          i0.k0(this.b, this);
       }else if(this.c != null){
          a = this.d.b;
          if (a != null) {
             a.a(this.b);
          }
       }
       return;
    }
}

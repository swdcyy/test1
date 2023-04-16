package com.google.android.material.transformation.ExpandableBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import ak.b;
import java.util.List;
import java.lang.Object;
import a2.i0;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior$a;
import android.view.ViewTreeObserver$OnPreDrawListener;

public abstract class ExpandableBehavior extends CoordinatorLayout$Behavior	// class@0016e8
{
    public int a;

    public void ExpandableBehavior(){
       super();
       this.a = 0;
    }
    public void ExpandableBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
    }
    public final boolean c(boolean p0){
       boolean b = false;
       if (p0) {
          ExpandableBehavior ta = this.a;
          if (ta == null || ta == 2) {
             b = true;
          }
          return b;
       }else if(this.a == 1){
          b = true;
       }
       return b;
    }
    public b d(CoordinatorLayout p0,View p1){
       View view;
       List list = p0.s(p1);
       int i = list.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          view = list.get(i1);
          if (this.layoutDependsOn(p0, p1, view)) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return view;
    }
    public abstract boolean e(View p0,View p1,boolean p2,boolean p3);
    public abstract boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2);
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       if (!this.c(p2.b())) {
          return false;
       }
       int i = (p2.b())? 1: 2;
       this.a = i;
       return this.e(p2, p1, p2.b(), true);
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       if (!i0.Y(p1)) {
          b uob = this.d(p0, p1);
          if (uob != null && this.c(uob.b())) {
             p2 = (uob.b())? 1: 2;
             this.a = p2;
             p1.getViewTreeObserver().addOnPreDrawListener(new ExpandableBehavior$a(this, p1, p2, uob));
          }
       }
       return false;
    }
}

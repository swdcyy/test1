package com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.widget.ImageButton;
import android.view.ViewPropertyAnimator;
import rj.a;
import android.animation.TimeInterpolator;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior	// class@00163a
{
    public final Rect d;

    public void BottomAppBar$Behavior(){
       super();
       this.d = new Rect();
    }
    public void BottomAppBar$Behavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new Rect();
    }
    public void d(View p0){
       this.i(p0);
    }
    public void e(View p0){
       this.j(p0);
    }
    public boolean g(CoordinatorLayout p0,BottomAppBar p1,int p2){
       FloatingActionButton uFloatingAct = p1.Y();
       if (uFloatingAct != null) {
          this.k(uFloatingAct, p1);
          uFloatingAct.i(this.d);
          p1.setFabDiameter(this.d.height());
       }
       if (!p1.b0()) {
          p1.h0();
       }
       p0.J(p1, p2);
       return super.onLayoutChild(p0, p1, p2);
    }
    public boolean h(CoordinatorLayout p0,BottomAppBar p1,View p2,View p3,int p4,int p5){
       boolean b = (p1.getHideOnScroll() && super.onStartNestedScroll(p0, p1, p2, p3, p4, p5))? true: false;
       return b;
    }
    public void i(BottomAppBar p0){
       super.d(p0);
       FloatingActionButton uFloatingAct = p0.Y();
       if (uFloatingAct != null) {
          uFloatingAct.h(this.d);
          uFloatingAct.clearAnimation();
          uFloatingAct.animate().translationY(((float)(- uFloatingAct.getPaddingBottom()) + (float)(uFloatingAct.getMeasuredHeight() - this.d.height()))).setInterpolator(a.c).setDuration(175);
       }
       return;
    }
    public void j(BottomAppBar p0){
       super.e(p0);
       FloatingActionButton uFloatingAct = p0.Y();
       if (uFloatingAct != null) {
          uFloatingAct.clearAnimation();
          uFloatingAct.animate().translationY(p0.getFabTranslationY()).setInterpolator(a.d).setDuration(225);
       }
       return;
    }
    public final boolean k(FloatingActionButton p0,BottomAppBar p1){
       p0.getLayoutParams().d = 17;
       p1.R(p0);
       return true;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       return this.g(p0, p1, p2);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return this.h(p0, p1, p2, p3, p4, p5);
    }
}

package com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a;
import android.animation.Animator$AnimatorListener;
import rj.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior extends CoordinatorLayout$Behavior	// class@001635
{
    public int a;
    public int b;
    public ViewPropertyAnimator c;

    public void HideBottomViewOnScrollBehavior(){
       super();
       this.a = 0;
       this.b = 2;
    }
    public void HideBottomViewOnScrollBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 0;
       this.b = 2;
    }
    public final void c(View p0,int p1,long p2,TimeInterpolator p3){
       this.c = p0.animate().translationY((float)p1).setInterpolator(p3).setDuration(p2).setListener(new HideBottomViewOnScrollBehavior$a(this));
    }
    public void d(View p0){
       HideBottomViewOnScrollBehavior tc = this.c;
       if (tc != null) {
          tc.cancel();
          p0.clearAnimation();
       }
       this.b = 1;
       this.c(p0, this.a, 175, a.c);
       return;
    }
    public void e(View p0){
       HideBottomViewOnScrollBehavior tc = this.c;
       if (tc != null) {
          tc.cancel();
          p0.clearAnimation();
       }
       this.b = 2;
       this.c(p0, 0, 225, a.d);
       return;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       this.a = p1.getMeasuredHeight();
       return super.onLayoutChild(p0, p1, p2);
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6){
       HideBottomViewOnScrollBehavior tb = this.b;
       if (tb != 1 && p4 > 0) {
          this.d(p1);
       }else if(tb != 2 && p4 < 0){
          this.e(p1);
       }
       return;
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4){
       boolean b = (p4 == 2)? true: false;
       return b;
    }
}

package com.kds.headertabscrollview.layout.CoordinatorView$f;
import java.lang.Runnable;
import com.kds.headertabscrollview.layout.CoordinatorView;
import java.lang.Object;
import com.google.android.material.appbar.KdsReboundBehavior;
import com.kds.headertabscrollview.layout.AppBarView;
import com.google.android.material.appbar.KdsCustomAppBarLayoutBehavior;
import android.widget.LinearLayout;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.lang.Math;
import java.util.Objects;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.kds.headertabscrollview.animation.CoordinatorAnimation;
import com.google.android.material.appbar.ViewOffsetBehavior;

public final class CoordinatorView$f implements Runnable	// class@00071d
{
    public final CoordinatorView b;

    public void CoordinatorView$f(CoordinatorView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int i1;
       CoordinatorView c2;
       CoordinatorView c = this.b.C;
       int i = 0;
       if (c != null) {
          KdsReboundBehavior reboundBehav = c.getReboundBehavior();
          if (reboundBehav != null) {
             i1 = reboundBehav.G();
          label_0013 :
             CoordinatorView c1 = this.b.C;
             int measuredHeig = (c1 != null)? c1.getMeasuredHeight(): 0;
             CoordinatorView d = this.b.D;
             int measuredHeig1 = (d != null)? d.getMeasuredHeight(): 0;
             measuredHeig = (measuredHeig + measuredHeig1) - this.b.getMeasuredHeight();
             this.b.getMeasuredHeight();
             measuredHeig1 = i1 - measuredHeig;
             if (Math.abs(measuredHeig1) > 1) {
                c2 = this.b.C;
                if (c2 != null) {
                   KdsReboundBehavior reboundBehav1 = c2.getReboundBehavior();
                   if (reboundBehav1 != null) {
                      reboundBehav1.M(measuredHeig);
                   }
                }
             }
             c2 = this.b.C;
             int top = (c2 != null)? c2.getTop(): 0;
             CoordinatorView c3 = this.b.C;
             if (c3 != null) {
                KdsReboundBehavior reboundBehav2 = c3.getReboundBehavior();
                if (reboundBehav2 != null) {
                   i = reboundBehav2.b();
                }
             }
             if (((top + measuredHeig) + i) < 0) {
                d = 2;
                if (Math.abs(measuredHeig1) > d && Math.abs((i1 + measuredHeig)) > d) {
                   CoordinatorView$f tb = this.b;
                   CoordinatorView d1 = tb.D;
                   d = tb.C;
                   Objects.requireNonNull(tb);
                   if (d1 != null) {
                      tb.Z(d1);
                   }
                   if (d != null) {
                      d.p(true, true);
                   }
                   if (CoordinatorAnimation.d.c()) {
                      c = this.b.C;
                      if (c != null) {
                         c.resetPendingAction();
                      }
                      c = this.b.C;
                      if (c != null) {
                         reboundBehav = c.getReboundBehavior();
                         if (reboundBehav != null) {
                            reboundBehav.setTopAndBottomOffset((- measuredHeig));
                         }
                      }
                   }
                }
             }
          label_00b2 :
             return;
          }
       }
       i1 = 0;
       goto label_0013 ;
    }
}

package com.google.android.material.appbar.KdsHeaderBehaviorEx$a;
import java.lang.Runnable;
import com.google.android.material.appbar.KdsHeaderBehaviorEx;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import android.widget.OverScroller;
import android.widget.LinearLayout;
import sj.i;
import android.view.View;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.KdsReboundBehavior;
import android.view.ViewGroup$LayoutParams;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public class KdsHeaderBehaviorEx$a implements Runnable	// class@001626
{
    public final CoordinatorLayout b;
    public final AppBarLayout c;
    public int d;
    public final KdsHeaderBehaviorEx e;

    public void KdsHeaderBehaviorEx$a(KdsHeaderBehaviorEx p0,CoordinatorLayout p1,AppBarLayout p2,int p3){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void run(){
       if (this.c != null) {
          KdsHeaderBehaviorEx b = this.e.b;
          if (b != null) {
             if (b.computeScrollOffset()) {
                int currY = this.e.b.getCurrY();
                int i = currY - this.d;
                int bottom = this.c.getBottom();
                KdsHeaderBehaviorEx$a te = this.e;
                int i1 = (this.c.getMeasuredHeight() - this.c.getTotalScrollRange()) + te.h;
                int i2 = 0;
                if (bottom == i1) {
                   te.i.f(i2, (- i));
                }else if(bottom > 0 && (bottom + i) < i1){
                   KdsHeaderBehaviorEx$a tc = this.c;
                   te.i.setHeaderTopBottomOffset(this.b, tc, ((tc.getTop() - bottom) + i1));
                }else {
                   bottom = this.c.getTop();
                   if (bottom) {
                      KdsHeaderBehaviorEx i3 = this.e.i;
                      if (i3 instanceof KdsReboundBehavior) {
                         i2 = i3.R().getLayoutParams().height;
                      }
                   }
                   this.e.i.setHeaderTopBottomOffset(this.b, this.c, ((bottom - i2) + i));
                }
                i0.k0(this.c, this);
                this.d = currY;
             }else {
                this.e.i.o(this.b, this.c);
             }
          }
       }
       return;
    }
}

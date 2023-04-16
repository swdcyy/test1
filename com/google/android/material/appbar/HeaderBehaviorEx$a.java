package com.google.android.material.appbar.HeaderBehaviorEx$a;
import java.lang.Runnable;
import com.google.android.material.appbar.HeaderBehaviorEx;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Object;
import android.widget.OverScroller;
import android.widget.LinearLayout;
import sj.d;
import android.view.View;
import com.google.android.material.appbar.HeaderBehavior;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

public class HeaderBehaviorEx$a implements Runnable	// class@001621
{
    public final CoordinatorLayout b;
    public final AppBarLayout c;
    public int d;
    public final HeaderBehaviorEx e;

    public void HeaderBehaviorEx$a(HeaderBehaviorEx p0,CoordinatorLayout p1,AppBarLayout p2,int p3){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void run(){
       if (this.c != null) {
          HeaderBehaviorEx b = this.e.b;
          if (b != null) {
             if (b.computeScrollOffset()) {
                int currY = this.e.b.getCurrY();
                int i = currY - this.d;
                int bottom = this.c.getBottom();
                HeaderBehaviorEx$a te = this.e;
                int i1 = (this.c.getMeasuredHeight() - this.c.getTotalScrollRange()) + te.h;
                if (bottom == i1) {
                   te.i.f(0, (- i));
                }else if(bottom > 0 && (bottom + i) < i1){
                   HeaderBehaviorEx$a tc = this.c;
                   te.i.setHeaderTopBottomOffset(this.b, tc, ((tc.getTop() - bottom) + i1));
                }else {
                   te = this.c;
                   te.i.setHeaderTopBottomOffset(this.b, te, (te.getTop() + i));
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

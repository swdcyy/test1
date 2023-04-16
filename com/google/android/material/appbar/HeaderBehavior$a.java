package com.google.android.material.appbar.HeaderBehavior$a;
import java.lang.Runnable;
import com.google.android.material.appbar.HeaderBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import java.lang.Object;
import android.widget.OverScroller;
import a2.i0;

public class HeaderBehavior$a implements Runnable	// class@00161f
{
    public final CoordinatorLayout b;
    public final View c;
    public final HeaderBehavior d;

    public void HeaderBehavior$a(HeaderBehavior p0,CoordinatorLayout p1,View p2){
       this.d = p0;
       super();
       this.b = p1;
       this.c = p2;
    }
    public void run(){
       if (this.c != null) {
          HeaderBehavior scroller = this.d.scroller;
          if (scroller != null) {
             if (scroller.computeScrollOffset()) {
                HeaderBehavior$a td = this.d;
                td.setHeaderTopBottomOffset(this.b, this.c, td.scroller.getCurrY());
                i0.k0(this.c, this);
             }else {
                this.d.onFlingFinished(this.b, this.c);
             }
          }
       }
       return;
    }
}

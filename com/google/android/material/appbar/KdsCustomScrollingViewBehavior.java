package com.google.android.material.appbar.KdsCustomScrollingViewBehavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import sj.g;

public class KdsCustomScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior	// class@001625
{

    public void KdsCustomScrollingViewBehavior(){
       super();
    }
    public int h(View p0){
       if (!p0 instanceof AppBarLayout) {
          return super.h(p0);
       }
       CoordinatorLayout$Behavior uBehavior = p0.getLayoutParams().f();
       if (uBehavior instanceof g) {
          return (p0.getTotalScrollRange() - uBehavior.b());
       }
       return p0.getTotalScrollRange();
    }
}

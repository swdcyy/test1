package com.google.android.material.appbar.CustomScrollingViewBehavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import sj.b;

public class CustomScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior	// class@00161e
{

    public void CustomScrollingViewBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public int h(View p0){
       if (!p0 instanceof AppBarLayout) {
          return super.h(p0);
       }
       CoordinatorLayout$Behavior uBehavior = p0.getLayoutParams().f();
       if (uBehavior instanceof b) {
          return (p0.getTotalScrollRange() - uBehavior.b());
       }
       return p0.getTotalScrollRange();
    }
}

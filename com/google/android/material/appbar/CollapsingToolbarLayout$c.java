package com.google.android.material.appbar.CollapsingToolbarLayout$c;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.Object;
import com.google.android.material.appbar.AppBarLayout;
import a2.u0;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.CollapsingToolbarLayout$LayoutParams;
import sj.l;
import java.lang.Math;
import u1.a;
import a2.i0;
import ck.c;

public class CollapsingToolbarLayout$c implements AppBarLayout$c	// class@00161b
{
    public final CollapsingToolbarLayout b;

    public void CollapsingToolbarLayout$c(CollapsingToolbarLayout p0){
       this.b = p0;
       super();
    }
    public void Y0(AppBarLayout p0,int p1){
       CollapsingToolbarLayout$c tb = this.b;
       tb.w = p1;
       CollapsingToolbarLayout x = tb.x;
       int i = 0;
       int i1 = (x != null)? x.k(): 0;
       int childCount = this.b.getChildCount();
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = this.b.getChildAt(i2);
          CollapsingToolbarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          l ol = CollapsingToolbarLayout.h(childAt);
          CollapsingToolbarLayout$LayoutParams a = layoutParams.a;
          if (a != 1) {
             if (a == 2) {
                int i3 = - p1;
                float f = (float)i3 * layoutParams.b;
                ol.f(Math.round(f));
             }
          }else {
             int i4 = - p1;
             ol.f(a.b(i4, i, this.b.g(childAt)));
          }
          i2 = i2 + 1;
       }
       this.b.n();
       CollapsingToolbarLayout$c tb1 = this.b;
       if (tb1.p != null && i1 > 0) {
          i0.j0(tb1);
       }
       this.b.l.P(((float)Math.abs(p1) / (float)((this.b.getHeight() - i0.C(this.b)) - i1)));
       return;
    }
}

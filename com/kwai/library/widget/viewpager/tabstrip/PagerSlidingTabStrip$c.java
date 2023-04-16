package com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$c;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.HorizontalScrollView;

public class PagerSlidingTabStrip$c implements ViewPager$i	// class@000a8c
{
    public final PagerSlidingTabStrip b;

    public void PagerSlidingTabStrip$c(PagerSlidingTabStrip p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       PagerSlidingTabStrip$c tb = this.b;
       PagerSlidingTabStrip h = tb.h;
       if (h == null) {
          return;
       }
       if (tb.Y0 != null && !p0) {
          tb.t(h.getCurrentItem(), 0);
       }
       PagerSlidingTabStrip f = this.b.f;
       if (f != null) {
          f.onPageScrollStateChanged(p0);
       }
       if (p0 == 1) {
          PagerSlidingTabStrip$c tb1 = this.b;
          tb1.U = tb1.h.getCurrentItem();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       int childCount = this.b.g.getChildCount();
       PagerSlidingTabStrip$c tb = this.b;
       int i = (tb.Q != null)? 1: 0;
       if (p0 >= (childCount - i)) {
          return;
       }else {
          tb.j = p0;
          tb.k = p1;
          if (tb.Y0 != null) {
             if (tb.X0 != null) {
                float f = (float)tb.g.getChildAt(p0).getWidth();
                if (p0 < (this.b.g.getChildCount() - 1)) {
                   int i1 = p0 + 1;
                   f = (float)((this.b.g.getChildAt(i1).getLeft() + (this.b.g.getChildAt(i1).getWidth() / 2)) - (this.b.g.getChildAt(p0).getLeft() + (this.b.g.getChildAt(p0).getWidth() / 2)));
                }
                this.b.t(p0, (int)(f * p1));
             }else {
                tb.t(p0, (int)((float)tb.g.getChildAt(p0).getWidth() * p1));
             }
          }
          this.b.invalidate();
          PagerSlidingTabStrip f1 = this.b.f;
          if (f1 != null) {
             f1.onPageScrolled(p0, p1, p2);
          }
          PagerSlidingTabStrip$c tb1 = this.b;
          tb1.V = (tb1.U == p0)? true: false;
          return;
       }
    }
    public void onPageSelected(int p0){
       this.b.u(p0);
       PagerSlidingTabStrip f = this.b.f;
       if (f != null) {
          f.onPageSelected(p0);
       }
       return;
    }
}

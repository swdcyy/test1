package com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$d;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.viewpager.widget.ViewPager;
import java.lang.Float;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.HorizontalScrollView;

public class GzonePagerSlidingTabStrip$d implements ViewPager$i	// class@00185a
{
    public final GzonePagerSlidingTabStrip b;

    public void GzonePagerSlidingTabStrip$d(GzonePagerSlidingTabStrip p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       GzonePagerSlidingTabStrip$d uod = GzonePagerSlidingTabStrip$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "2")) {
          return;
       }
       uod = this.b;
       uod.H1 = p0;
       if (!p0) {
          uod.t(uod.C1.getCurrentItem(), 0);
       }
       GzonePagerSlidingTabStrip a1 = this.b.A1;
       if (a1 != null) {
          a1.onPageScrollStateChanged(p0);
       }
       if (p0 == 1) {
          GzonePagerSlidingTabStrip$d tb = this.b;
          tb.o2 = tb.C1.getCurrentItem();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       GzonePagerSlidingTabStrip$d tb;
       if (PatchProxy.isSupport(GzonePagerSlidingTabStrip$d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, GzonePagerSlidingTabStrip$d.class, "1")) {
          return;
       }
       int childCount = this.b.B1.getChildCount();
       int i = (this.b.k2 != null)? 1: 0;
       if (p0 >= (childCount - i)) {
          return;
       }else if(!Float.isNaN(p1)){
          tb = this.b;
          tb.E1 = p0;
          tb.F1 = p1;
       }
       tb = this.b;
       if (tb.u2 != null) {
          float f = (float)tb.B1.getChildAt(p0).getWidth();
          if (p0 < (this.b.B1.getChildCount() - 1)) {
             i = p0 + 1;
             f = (float)((this.b.B1.getChildAt(i).getLeft() + (this.b.B1.getChildAt(i).getWidth() / 2)) - (this.b.B1.getChildAt(p0).getLeft() + (this.b.B1.getChildAt(p0).getWidth() / 2)));
          }
          this.b.t(p0, (int)(f * p1));
       }else {
          tb.t(p0, (int)((float)tb.B1.getChildAt(p0).getWidth() * p1));
       }
       this.b.invalidate();
       GzonePagerSlidingTabStrip a1 = this.b.A1;
       if (a1 != null) {
          a1.onPageScrolled(p0, p1, p2);
       }
       GzonePagerSlidingTabStrip$d tb1 = this.b;
       tb1.p2 = (tb1.o2 == p0)? true: false;
       return;
    }
    public void onPageSelected(int p0){
       GzonePagerSlidingTabStrip$d uod = GzonePagerSlidingTabStrip$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "3")) {
          return;
       }
       uod = this.b;
       if (uod.H1 == null) {
          uod.E1 = p0;
       }
       uod.u(p0);
       GzonePagerSlidingTabStrip a1 = this.b.A1;
       if (a1 != null) {
          a1.onPageSelected(p0);
       }
       return;
    }
}

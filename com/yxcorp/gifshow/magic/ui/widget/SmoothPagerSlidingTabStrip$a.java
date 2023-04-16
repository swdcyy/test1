package com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import java.lang.Integer;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Float;

public class SmoothPagerSlidingTabStrip$a implements ViewPager$i	// class@001c4f
{
    public int b;
    public float c;
    public final SmoothPagerSlidingTabStrip d;

    public void SmoothPagerSlidingTabStrip$a(SmoothPagerSlidingTabStrip p0){
       this.d = p0;
       super();
       this.b = 0;
       this.c = 0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SmoothPagerSlidingTabStrip$a.class, "4")) {
          return;
       }
       this.d.l();
       this.c = 0;
       return;
    }
    public void onPageScrollStateChanged(int p0){
       SmoothPagerSlidingTabStrip$a uoa = SmoothPagerSlidingTabStrip$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().s("SmoothSlidingTabStrip", "onPageScrollStateChanged "+p0, objArray);
       this.b = p0;
       if (!p0) {
          this.a();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, SmoothPagerSlidingTabStrip$a.class, "1")) {
          return;
       }
       this.c = this.d.n(p0, p1);
       return;
    }
    public void onPageSelected(int p0){
       SmoothPagerSlidingTabStrip$a uoa = SmoothPagerSlidingTabStrip$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       boolean b = true;
       if (this.b == null) {
          b = false;
       }
       this.d.h(p0, this.c, b);
       if (!b || this.c - 0x3f800000 >= 0) {
          this.a();
       }
       return;
    }
}

package com.kwai.live.gzone.promotion.l$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kwai.live.gzone.promotion.l;
import android.animation.ArgbEvaluator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.live.gzone.promotion.k;
import android.content.res.ColorStateList;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;

public class l$a extends ViewPager$l	// class@000dcc
{
    public ArgbEvaluator b;
    public final l c;

    public void l$a(l p0){
       this.c = p0;
       super();
       this.b = new ArgbEvaluator();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, l$a.class, "2")) {
          return;
       }
       p2 = this.c.x.C(p0);
       int i = this.c.x.B(p0);
       if (p1 > 0) {
          p0++;
          int i1 = this.c.x.C(p0);
          p0 = this.c.x.B(p0);
          if (i1 != p2) {
             this.c.v.setTextColor(ColorStateList.valueOf(this.b.evaluate(p1, Integer.valueOf(p2), Integer.valueOf(i1)).intValue()));
             this.c.v.setIndicatorColorInt(this.b.evaluate(p1, Integer.valueOf(i), Integer.valueOf(p0)).intValue());
          }
       }else {
          this.c.v.setTextColor(ColorStateList.valueOf(p2));
          this.c.v.setIndicatorColorInt(i);
       }
       return;
    }
    public void onPageSelected(int p0){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.c.x.E(p0);
       return;
    }
}

package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import qp7.x0;
import qp7.b;
import js7.o;

public final class CollectElement$c implements ViewPager$i	// class@001496
{
    public final CollectElement b;

    public void CollectElement$c(CollectElement p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       this.b.L = p0;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(CollectElement$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, CollectElement$c.class, "1")) {
          return;
       }
       CollectElement$c tb = this.b;
       if (tb.I != tb.E && tb.L == true) {
          tb.E().j(true);
       }
       return;
    }
    public void onPageSelected(int p0){
       CollectElement$c uoc = CollectElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       CollectElement$c tb = this.b;
       if (tb.I != tb.E) {
          tb.E().j(true);
       }
       return;
    }
}

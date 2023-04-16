package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;

public class d$a extends ViewPager$l	// class@001987
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.y = p0;
       if (!p0) {
          d x = uoa.x;
          if (x != null) {
             x.run();
          }
       }
       return;
    }
}

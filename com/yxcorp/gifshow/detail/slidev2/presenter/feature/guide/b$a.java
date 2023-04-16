package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;

public class b$a extends ViewPager$l	// class@001982
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.G = p0;
       if (!p0) {
          b h = uoa.H;
          if (h != null) {
             h.run();
          }
       }
       return;
    }
}

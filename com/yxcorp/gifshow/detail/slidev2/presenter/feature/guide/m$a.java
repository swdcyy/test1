package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;

public class m$a extends ViewPager$l	// class@00199a
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       m$a uoa = m$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.B = p0;
       if (!p0) {
          m a = uoa.A;
          if (a != null) {
             a.run();
          }
       }
       return;
    }
}

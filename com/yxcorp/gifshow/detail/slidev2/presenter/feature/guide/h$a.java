package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;

public class h$a extends ViewPager$l	// class@00198f
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.J = p0;
       if (!p0) {
          h k = uoa.K;
          if (k != null) {
             k.run();
          }
       }
       return;
    }
}

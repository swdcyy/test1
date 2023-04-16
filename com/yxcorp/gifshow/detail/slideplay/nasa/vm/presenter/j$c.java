package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j$c;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import bf5.d;
import java.lang.Float;

public class j$c extends ViewPager$l	// class@00181c
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       if (PatchProxy.isSupport2(j$c.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, j$c.class, "1")) {
          return;
       }
       j$c tb = this.b;
       tb.V0 = p0;
       boolean b = (!p0 && (tb.W8() && !this.b.L.b1() - null))? true: false;
       this.b.R8(b);
       if (!b) {
          j p = this.b.p;
          if (p != null) {
             p.t();
          }
       }
       PatchProxy.onMethodExit(j$c.class, "1");
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport2(j$c.class, "2") && PatchProxy.applyVoidThreeRefsWithListener(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, j$c.class, "2")) {
          return;
       }
       p0 = 0;
       if (!p1 - p0) {
          j$c tb = this.b;
          if (tb.V0 == 2 && (tb.W8() && !this.b.L.b1() - p0)) {
             this.b.R8(true);
          }
       }
       PatchProxy.onMethodExit(j$c.class, "2");
       return;
    }
}

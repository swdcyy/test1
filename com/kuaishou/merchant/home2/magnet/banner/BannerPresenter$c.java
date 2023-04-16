package com.kuaishou.merchant.home2.magnet.banner.BannerPresenter$c;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.merchant.home2.magnet.banner.BannerPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import g9c.a;
import com.kuaishou.merchant.home2.basic.widget.ViewPagerIndicatorView;

public final class BannerPresenter$c extends ViewPager2$h	// class@0017e9
{
    public final BannerPresenter a;

    public void BannerPresenter$c(BannerPresenter p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       BannerPresenter$c uoc = BannerPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       uoc.w = p0;
       BannerPresenter a = uoc.A;
       if (a != null) {
          BannerPresenter t = uoc.t;
          if (t == null) {
             a.S("mIndicatorView");
          }
          t.b((p0 % a.getItemCount()));
       }
       return;
    }
}

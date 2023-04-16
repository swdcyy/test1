package com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter$c;
import androidx.viewpager2.widget.ViewPager2$h;
import com.kuaishou.merchant.home2.magnet.toolbar.ToolBarPagerPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;

public final class ToolBarPagerPresenter$c extends ViewPager2$h	// class@0017f9
{
    public final ToolBarPagerPresenter a;

    public void ToolBarPagerPresenter$c(ToolBarPagerPresenter p0){
       this.a = p0;
       super();
    }
    public void c(int p0){
       ToolBarPagerPresenter$c uoc = ToolBarPagerPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       ToolBarPagerPresenter t = this.a.t;
       if (t != null) {
          t.setPageIndex(p0);
       }
       return;
    }
}

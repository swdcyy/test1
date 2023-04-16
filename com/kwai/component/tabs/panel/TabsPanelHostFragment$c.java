package com.kwai.component.tabs.panel.TabsPanelHostFragment$c;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;

public class TabsPanelHostFragment$c implements ViewPager$i	// class@000b6a
{
    public final TabsPanelHostFragment b;

    public void TabsPanelHostFragment$c(TabsPanelHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(TabsPanelHostFragment$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, TabsPanelHostFragment$c.class, "1")) {
          return;
       }
       TabsPanelHostFragment$c tb = this.b;
       if (tb.R != null) {
          tb.Yh(p0);
          p0.R = false;
       }
       return;
    }
    public void onPageSelected(int p0){
       TabsPanelHostFragment$c uoc = TabsPanelHostFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.b.Yh(p0);
       return;
    }
}

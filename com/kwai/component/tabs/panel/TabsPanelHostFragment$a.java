package com.kwai.component.tabs.panel.TabsPanelHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kwai.component.tabs.panel.h;
import brd.y;

public class TabsPanelHostFragment$a extends ViewPager$l	// class@000b68
{
    public final TabsPanelHostFragment b;

    public void TabsPanelHostFragment$a(TabsPanelHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       TabsPanelHostFragment$a uoa = TabsPanelHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       uoa.M.onNext(uoa.B.get(p0));
       return;
    }
}

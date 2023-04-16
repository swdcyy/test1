package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public final class LiveLiteRecommendSideBarRootVC$b extends ViewPager$l	// class@000ae1
{
    public final LiveLiteRecommendSideBarRootVC b;

    public void LiveLiteRecommendSideBarRootVC$b(LiveLiteRecommendSideBarRootVC p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       LiveLiteRecommendSideBarRootVC$b uob = LiveLiteRecommendSideBarRootVC$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b.d3(p0);
       return;
    }
}

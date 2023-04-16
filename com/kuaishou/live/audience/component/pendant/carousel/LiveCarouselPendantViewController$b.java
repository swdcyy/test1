package com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$b;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import lv1.d;
import java.util.List;

public final class LiveCarouselPendantViewController$b extends ViewPager$l	// class@000bbb
{
    public final LiveCarouselPendantViewController b;

    public void LiveCarouselPendantViewController$b(LiveCarouselPendantViewController p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       LiveCarouselPendantViewController$b uob = LiveCarouselPendantViewController$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.b.d.size() <= 1) {
          return;
       }
       if (p0 == 1) {
          this.b.h();
       }else if(!p0){
          this.b.g();
       }
       return;
    }
    public void onPageSelected(int p0){
       LiveCarouselPendantViewController$b uob = LiveCarouselPendantViewController$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.b.e(p0);
       return;
    }
}

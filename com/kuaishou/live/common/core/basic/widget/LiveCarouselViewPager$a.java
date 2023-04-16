package com.kuaishou.live.common.core.basic.widget.LiveCarouselViewPager$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.basic.widget.LiveCarouselViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import lv1.f;
import qq5.a;
import java.util.Objects;
import androidx.viewpager.widget.ViewPager$l;

public class LiveCarouselViewPager$a implements Runnable	// class@000f12
{
    public final LiveCarouselViewPager b;

    public void LiveCarouselViewPager$a(LiveCarouselViewPager p0){
       this.b = p0;
       super();
    }
    public void run(){
       int i1;
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager$a.class, "1")) {
          return;
       }
       LiveCarouselViewPager$a tb = this.b;
       if (tb.j != null) {
          b.c0(LiveLogTag.LIVE_ACTIVITY_WIDGET_V2, "LiveCarouselViewPager SelectFirstPageRunnable run", "ItemList", tb.d);
          tb = (this.b.c.z() == null)? null: this.b.c.z().size();
          for (int i = 1; i < tb; i = i + 1) {
             LiveCarouselViewPager$a tb1 = this.b;
             tb1.j(i);
             Objects.requireNonNull(tb1);
          }
          this.b.j.onPageSelected(0);
          this.b.o();
          this.b.n();
       }
       return;
    }
}

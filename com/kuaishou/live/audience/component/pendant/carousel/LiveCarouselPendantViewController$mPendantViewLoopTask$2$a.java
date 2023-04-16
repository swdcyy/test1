package com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$mPendantViewLoopTask$2$a;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$mPendantViewLoopTask$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import e93.f;
import lv1.d;
import kotlin.jvm.internal.a;
import androidx.viewpager.widget.ViewPager;

public final class LiveCarouselPendantViewController$mPendantViewLoopTask$2$a implements Runnable	// class@000bbc
{
    public final LiveCarouselPendantViewController$mPendantViewLoopTask$2 b;

    public void LiveCarouselPendantViewController$mPendantViewLoopTask$2$a(LiveCarouselPendantViewController$mPendantViewLoopTask$2 p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselPendantViewController$mPendantViewLoopTask$2$a.class, "1")) {
          return;
       }
       LiveCarouselPendantViewController$mPendantViewLoopTask$2 this$0 = this.b.this$0;
       f.k("mPendantViewLoopTask", this, this$0, this$0.i);
       d c = this.b.this$0.c;
       a.o(c, "mLivePendantViewPager");
       d c1 = this.b.this$0.c;
       a.o(c1, "mLivePendantViewPager");
       c.setCurrentItem((c1.getCurrentItem() + 1));
       return;
    }
}

package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider$showGuide$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.SideSlideUpGuider;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import rf5.u;
import j8a.c1;
import java.lang.Runnable;
import ekd.k1;

public final class SideSlideUpGuider$showGuide$1 extends Lambda implements a	// class@00197f
{
    public final a $onPrepare;
    public final SideSlideUpGuider this$0;

    public void SideSlideUpGuider$showGuide$1(SideSlideUpGuider p0,a p1){
       this.this$0 = p0;
       this.$onPrepare = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SideSlideUpGuider$showGuide$1.class, "1")) {
          return;
       }
       SideSlideUpGuider$showGuide$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, SideSlideUpGuider.class, "5")) {
          SideSlideUpGuider h = tthis$0.h;
          if (h == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
          h.F(false, 7);
          k1.r(new c1(tthis$0), 200);
       }
       tthis$0 = this.$onPrepare;
       if (tthis$0 != null) {
          tthis$0.invoke();
       }
       return;
    }
}

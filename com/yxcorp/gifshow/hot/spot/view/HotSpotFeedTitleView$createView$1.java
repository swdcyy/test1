package com.yxcorp.gifshow.hot.spot.view.HotSpotFeedTitleView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.c;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import jva.a;
import com.yxcorp.gifshow.hot.spot.view.HotSpotFeedTitleView$createView$1$2;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.written.view.IWrittenLayout;
import ox7.e;
import ox7.e$a;
import com.yxcorp.gifshow.hot.spot.view.HotSpotFeedTitleView$createView$1$3;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomTextView;
import java.util.Objects;

public final class HotSpotFeedTitleView$createView$1 extends Lambda implements l	// class@00184d
{
    public final c this$0;

    public void HotSpotFeedTitleView$createView$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotFeedTitleView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f0617b3));
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, a.a(10));
       layoutParams.gravity = 80;
       this.this$0.W0(p0, layoutParams, HotSpotFeedTitleView$createView$1$2.INSTANCE);
       HotSpotFeedTitleView$createView$1 tthis$0 = this.this$0;
       HotSpotCustomTextView hotSpotCusto = a.c(p0, e$a.a(tthis$0, p0, null, 1, null), HotSpotFeedTitleView$createView$1$3.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto, tthis$0, c.class, "3")) {
          a.p(hotSpotCusto, "<set-?>");
          tthis$0.c = hotSpotCusto;
       }
       return;
    }
}

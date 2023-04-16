package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.d;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$1;
import android.view.ViewGroup;
import com.yxcorp.gifshow.image.KwaiImageView;
import jva.a;
import java.util.Objects;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2;
import android.widget.FrameLayout;

public final class HotSpotInterestCardItem$createView$1 extends Lambda implements l	// class@001854
{
    public final d this$0;

    public void HotSpotInterestCardItem$createView$1(d p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardItem$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotInterestCardItem$createView$1 tthis$0 = this.this$0;
       HotSpotInterestCardItem$createView$1 tthis$01 = this.this$0;
       KwaiImageView kwaiImageVie = a.d(p0, new ViewGroup$LayoutParams(tthis$01.h, tthis$01.g), HotSpotInterestCardItem$createView$1$1.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, tthis$0, d.class, "2")) {
          a.p(kwaiImageVie, "<set-?>");
          tthis$0.c = kwaiImageVie;
       }
       tthis$0 = this.this$0;
       tthis$0.j0(p0, tthis$0.a0(new FrameLayout$LayoutParams(this.this$0.i, -1), a1.d(R.dimen.arg_RES_7f07034b)), new HotSpotInterestCardItem$createView$1$2(this));
       return;
    }
}

package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import jva.d;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$3;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import jva.a;

public final class HotSpotInterestCardItem$createView$1$2 extends Lambda implements l	// class@001853
{
    public final HotSpotInterestCardItem$createView$1 this$0;

    public void HotSpotInterestCardItem$createView$1$2(HotSpotInterestCardItem$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardItem$createView$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotInterestCardItem$createView$1 this$0 = this.this$0.this$0;
       TextView textView = this$0.E(p0, new FrameLayout$LayoutParams(-1, -2), HotSpotInterestCardItem$createView$1$2$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, d.class, "4")) {
          a.p(textView, "<set-?>");
          this$0.d = textView;
       }
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 80;
       a.e(p0, layoutParams, new HotSpotInterestCardItem$createView$1$2$3(this));
       return;
    }
}

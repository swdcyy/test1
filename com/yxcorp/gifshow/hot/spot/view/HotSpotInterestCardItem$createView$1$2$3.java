package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2;
import java.lang.Object;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import qrd.l1;
import jva.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$3$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardItem$createView$1$2$3$3;

public final class HotSpotInterestCardItem$createView$1$2$3 extends Lambda implements l	// class@001852
{
    public final HotSpotInterestCardItem$createView$1$2 this$0;

    public void HotSpotInterestCardItem$createView$1$2$3(HotSpotInterestCardItem$createView$1$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PriorityLinearLayout p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardItem$createView$1$2$3.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setOrientation(0);
       HotSpotInterestCardItem$createView$1 this$0 = this.this$0.this$0.this$0;
       int i = -2;
       int i1 = -1;
       TextView textView = this$0.E(p0, new PriorityLinearLayout$LayoutParams(i, i1), HotSpotInterestCardItem$createView$1$2$3$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, uod, "6")) {
          a.p(textView, "<set-?>");
          this$0.e = textView;
       }
       this$0 = this.this$0.this$0.this$0;
       ViewGroup$MarginLayoutParams marginLayout = this$0.a0(new PriorityLinearLayout$LayoutParams(i, i1), a1.d(R.dimen.arg_RES_7f070271));
       marginLayout.a = 1;
       TextView textView1 = this$0.E(p0, marginLayout, HotSpotInterestCardItem$createView$1$2$3$3.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView1, this$0, uod, "8")) {
          a.p(textView1, "<set-?>");
          this$0.f = textView1;
       }
       return;
    }
}

package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.k;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$2;
import android.widget.TextView;

public final class HotSpotTodayMoreView$createView$1 extends Lambda implements l	// class@00188d
{
    public final k this$0;

    public void HotSpotTodayMoreView$createView$1(k p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayMoreView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       p0.setGravity(1);
       HotSpotTodayMoreView$createView$1 tthis$0 = this.this$0;
       LinearLayout linearLayout = tthis$0.V0(p0, 0, tthis$0.d1(tthis$0.K(new LinearLayout$LayoutParams(-2, -2), a1.d(R.dimen.arg_RES_7f070334)), a1.d(R.dimen.arg_RES_7f070271)), new HotSpotTodayMoreView$createView$1$1(this));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(linearLayout, tthis$0, ok, "2")) {
          a.p(linearLayout, "<set-?>");
          tthis$0.c = linearLayout;
       }
       tthis$0 = this.this$0;
       TextView textView = tthis$0.E(p0, new LinearLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f07034b)), HotSpotTodayMoreView$createView$1$2.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(textView, tthis$0, ok, "8")) {
          a.p(textView, "<set-?>");
          tthis$0.f = textView;
       }
       return;
    }
}

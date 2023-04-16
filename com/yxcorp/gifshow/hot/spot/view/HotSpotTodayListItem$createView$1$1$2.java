package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import jva.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$2$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$2$2;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$2$3;

public final class HotSpotTodayListItem$createView$1$1$2 extends Lambda implements l	// class@00187b
{
    public final HotSpotTodayListItem$createView$1$1 this$0;

    public void HotSpotTodayListItem$createView$1$1$2(HotSpotTodayListItem$createView$1$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItem$createView$1$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotTodayListItem$createView$1 this$0 = this.this$0.this$0.this$0;
       int i = -2;
       int i1 = 0x7f070271;
       TextView textView = this$0.E(p0, this$0.e(new LinearLayout$LayoutParams(i, i), a1.d(i1)), HotSpotTodayListItem$createView$1$1$2$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, oh, "4")) {
          a.p(textView, "<set-?>");
          this$0.d = textView;
       }
       this$0 = this.this$0.this$0.this$0;
       textView = this$0.E(p0, this$0.e(new LinearLayout$LayoutParams(i, i), a1.d(i1)), HotSpotTodayListItem$createView$1$1$2$2.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, oh, "6")) {
          a.p(textView, "<set-?>");
          this$0.e = textView;
       }
       this$0 = this.this$0.this$0.this$0;
       TextView textView1 = this$0.E(p0, new LinearLayout$LayoutParams(i, i), HotSpotTodayListItem$createView$1$1$2$3.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView1, this$0, oh, "8")) {
          a.p(textView1, "<set-?>");
          this$0.f = textView1;
       }
       return;
    }
}

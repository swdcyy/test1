package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import jva.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import jva.a;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$1$2;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;

public final class HotSpotTodayListItemV2$createView$2$1 extends Lambda implements l	// class@001880
{
    public final HotSpotTodayListItemV2$createView$2 this$0;

    public void HotSpotTodayListItemV2$createView$2$1(HotSpotTodayListItemV2$createView$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItemV2$createView$2$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotTodayListItemV2$createView$2 this$0 = this.this$0.this$0;
       i = 0x7f0702cc;
       KwaiImageView kwaiImageVie = a.d(p0, new FrameLayout$LayoutParams(a1.d(i), a1.d(i)), HotSpotTodayListItemV2$createView$2$1$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, this$0, oi, "2")) {
          a.p(kwaiImageVie, "<set-?>");
          this$0.c = kwaiImageVie;
       }
       this$0 = this.this$0.this$0;
       TextView textView = this$0.E(p0, new FrameLayout$LayoutParams(a1.d(i), a1.d(i)), HotSpotTodayListItemV2$createView$2$1$2.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, oi, "4")) {
          a.p(textView, "<set-?>");
          this$0.d = textView;
       }
       return;
    }
}

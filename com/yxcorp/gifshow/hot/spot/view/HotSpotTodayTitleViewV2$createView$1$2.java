package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import jva.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$2$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import lnc.a1;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$2$2;
import com.yxcorp.gifshow.image.KwaiImageView;
import jva.a;

public final class HotSpotTodayTitleViewV2$createView$1$2 extends Lambda implements l	// class@001893
{
    public final HotSpotTodayTitleViewV2$createView$1 this$0;

    public void HotSpotTodayTitleViewV2$createView$1$2(HotSpotTodayTitleViewV2$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayTitleViewV2$createView$1$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotTodayTitleViewV2$createView$1 this$0 = this.this$0.this$0;
       TextView textView = this$0.E(p0, new LinearLayout$LayoutParams(-2, -2), HotSpotTodayTitleViewV2$createView$1$2$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, om, "4")) {
          a.p(textView, "<set-?>");
          this$0.d = textView;
       }
       this$0 = this.this$0.this$0;
       KwaiImageView kwaiImageVie = a.d(p0, new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07028e), a1.d(R.dimen.arg_RES_7f0702b8)), HotSpotTodayTitleViewV2$createView$1$2$2.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, this$0, om, "2")) {
          a.p(kwaiImageVie, "<set-?>");
          this$0.c = kwaiImageVie;
       }
       return;
    }
}

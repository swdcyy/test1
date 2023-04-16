package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$4;
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
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$4$a;
import android.view.View$OnTouchListener;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$4$2;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$4$3;
import android.widget.ImageView;

public final class HotSpotTodayTitleViewV2$createView$1$4 extends Lambda implements l	// class@001897
{
    public final HotSpotTodayTitleViewV2$createView$1 this$0;

    public void HotSpotTodayTitleViewV2$createView$1$4(HotSpotTodayTitleViewV2$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayTitleViewV2$createView$1$4.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setGravity(1);
       p0.setOnTouchListener(new HotSpotTodayTitleViewV2$createView$1$4$a(p0));
       HotSpotTodayTitleViewV2$createView$1 this$0 = this.this$0.this$0;
       TextView textView = this$0.E(p0, new ViewGroup$LayoutParams(-2, -2), HotSpotTodayTitleViewV2$createView$1$4$2.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, om, "10")) {
          a.p(textView, "<set-?>");
          this$0.g = textView;
       }
       this$0 = this.this$0.this$0;
       ImageView imageView = this$0.D0(p0, new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f070283), a1.d(R.dimen.arg_RES_7f070283)), new HotSpotTodayTitleViewV2$createView$1$4$3(p0));
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(imageView, this$0, om, "12")) {
          a.p(imageView, "<set-?>");
          this$0.h = imageView;
       }
       return;
    }
}

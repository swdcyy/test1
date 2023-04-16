package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.i;
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
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$2;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import jva.a;

public final class HotSpotTodayListItemV2$createView$2 extends Lambda implements l	// class@001884
{
    public final i this$0;

    public void HotSpotTodayListItemV2$createView$2(i p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItemV2$createView$2.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       p0.setPadding(0, a1.d(R.dimen.arg_RES_7f07031b), 0, a1.d(R.dimen.arg_RES_7f070329));
       p0.setGravity(16);
       HotSpotTodayListItemV2$createView$2 tthis$0 = this.this$0;
       int i = 0x7f0702e3;
       FrameLayout uFrameLayout = tthis$0.j0(p0, tthis$0.e(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f0702cc), a1.d(R.dimen.arg_RES_7f0702cc)), a1.d(i)), new HotSpotTodayListItemV2$createView$2$1(this));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(uFrameLayout, tthis$0, i.class, "6")) {
          a.p(uFrameLayout, "<set-?>");
          tthis$0.e = uFrameLayout;
       }
       a.e(p0, this.this$0.e(new LinearLayout$LayoutParams(-2, -2), a1.d(i)), new HotSpotTodayListItemV2$createView$2$2(this));
       return;
    }
}

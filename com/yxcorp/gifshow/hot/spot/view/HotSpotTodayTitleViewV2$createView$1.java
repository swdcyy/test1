package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.m;
import java.lang.Object;
import android.widget.FrameLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$2;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleViewV2$createView$1$4;

public final class HotSpotTodayTitleViewV2$createView$1 extends Lambda implements l	// class@001898
{
    public final m this$0;

    public void HotSpotTodayTitleViewV2$createView$1(m p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(FrameLayout p0){
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayTitleViewV2$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       p0.setPadding(a1.d(R.dimen.arg_RES_7f0702ab), 0, a1.d(R.dimen.arg_RES_7f0702ab), 0);
       HotSpotTodayTitleViewV2$createView$1 tthis$0 = this.this$0;
       int i = -2;
       int i1 = 0x7f070283;
       ViewGroup$MarginLayoutParams marginLayout = tthis$0.d1(tthis$0.K(new FrameLayout$LayoutParams(-1, i), a1.d(i1)), a1.d(R.dimen.arg_RES_7f070329));
       marginLayout.gravity = 3;
       LinearLayout linearLayout = tthis$0.V0(p0, 0, marginLayout, new HotSpotTodayTitleViewV2$createView$1$2(this));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(linearLayout, tthis$0, om, "6")) {
          a.p(linearLayout, "<set-?>");
          tthis$0.e = linearLayout;
       }
       tthis$0 = this.this$0;
       marginLayout = tthis$0.d1(tthis$0.K(new FrameLayout$LayoutParams(i, i), a1.d(i1)), a1.d(R.dimen.arg_RES_7f070334));
       marginLayout.gravity = 85;
       LinearLayout linearLayout1 = tthis$0.V0(p0, 0, marginLayout, new HotSpotTodayTitleViewV2$createView$1$4(this));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(linearLayout1, tthis$0, om, "8")) {
          a.p(linearLayout1, "<set-?>");
          tthis$0.f = linearLayout1;
       }
       return;
    }
}

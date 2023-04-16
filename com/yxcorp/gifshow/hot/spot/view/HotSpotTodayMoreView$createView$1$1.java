package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import jva.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1$a;
import android.view.View$OnTouchListener;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1$2;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayMoreView$createView$1$1$3;
import android.widget.ImageView;

public final class HotSpotTodayMoreView$createView$1$1 extends Lambda implements l	// class@00188b
{
    public final HotSpotTodayMoreView$createView$1 this$0;

    public void HotSpotTodayMoreView$createView$1$1(HotSpotTodayMoreView$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayMoreView$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setGravity(1);
       p0.setOnTouchListener(new HotSpotTodayMoreView$createView$1$1$a(p0));
       HotSpotTodayMoreView$createView$1 this$0 = this.this$0.this$0;
       TextView textView = this$0.E(p0, new ViewGroup$LayoutParams(-2, -2), HotSpotTodayMoreView$createView$1$1$2.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, ok, "4")) {
          a.p(textView, "<set-?>");
          this$0.d = textView;
       }
       this$0 = this.this$0.this$0;
       ImageView imageView = this$0.D0(p0, this$0.a0(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f070283), a1.d(R.dimen.arg_RES_7f070283)), a1.d(R.dimen.arg_RES_7f0702e3)), new HotSpotTodayMoreView$createView$1$1$3(p0));
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(imageView, this$0, ok, "6")) {
          a.p(imageView, "<set-?>");
          this$0.e = imageView;
       }
       return;
    }
}

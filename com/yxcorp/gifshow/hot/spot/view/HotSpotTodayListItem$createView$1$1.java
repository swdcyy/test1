package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$1;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kwai.written.view.IWrittenLayout;
import java.util.Objects;
import jva.h;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItem$createView$1$1$2;

public final class HotSpotTodayListItem$createView$1$1 extends Lambda implements l	// class@00187c
{
    public final HotSpotTodayListItem$createView$1 this$0;

    public void HotSpotTodayListItem$createView$1$1(HotSpotTodayListItem$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListItem$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       HotSpotTodayListItem$createView$1 this$0 = this.this$0.this$0;
       int i = -1;
       int i1 = -2;
       TextView textView = this$0.E(p0, new ViewGroup$LayoutParams(i, i1), HotSpotTodayListItem$createView$1$1$1.INSTANCE);
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(textView, this$0, h.class, "2")) {
          a.p(textView, "<set-?>");
          this$0.c = textView;
       }
       this$0 = this.this$0.this$0;
       this$0.V0(p0, 0, this$0.K(new LinearLayout$LayoutParams(i, i1), a1.d(R.dimen.arg_RES_7f0702e3)), new HotSpotTodayListItem$createView$1$1$2(this));
       return;
    }
}

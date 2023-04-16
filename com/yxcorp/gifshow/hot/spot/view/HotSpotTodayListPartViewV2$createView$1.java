package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListPartViewV2$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.j;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomRecyclerView;
import jva.a;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListPartViewV2$createView$1$a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListPartViewV2$createView$1$2;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomTextView;

public final class HotSpotTodayListPartViewV2$createView$1 extends Lambda implements l	// class@001887
{
    public final j this$0;

    public void HotSpotTodayListPartViewV2$createView$1(j p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayListPartViewV2$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       HotSpotTodayListPartViewV2$createView$1 tthis$0 = this.this$0;
       HotSpotCustomRecyclerView hotSpotCusto = a.b(p0, new LinearLayout$LayoutParams(-2, -2), null, 2, null);
       hotSpotCusto.addItemDecoration(new HotSpotTodayListPartViewV2$createView$1$a());
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto, tthis$0, oj, "2")) {
          a.p(hotSpotCusto, "<set-?>");
          tthis$0.c = hotSpotCusto;
       }
       tthis$0 = this.this$0;
       HotSpotCustomTextView hotSpotCusto1 = a.c(p0, tthis$0.K(new LinearLayout$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f07034b)), a1.d(R.dimen.arg_RES_7f07033f)), HotSpotTodayListPartViewV2$createView$1$2.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto1, tthis$0, oj, "4")) {
          a.p(hotSpotCusto1, "<set-?>");
          tthis$0.d = hotSpotCusto1;
       }
       return;
    }
}

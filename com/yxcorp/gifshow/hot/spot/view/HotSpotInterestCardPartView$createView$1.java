package com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardPartView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.e;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardPartView$createView$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomTextView;
import jva.a;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotCustomRecyclerView;
import k17.b;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotInterestCardPartView$createView$1$3;

public final class HotSpotInterestCardPartView$createView$1 extends Lambda implements l	// class@001857
{
    public final e this$0;

    public void HotSpotInterestCardPartView$createView$1(e p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotInterestCardPartView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       HotSpotInterestCardPartView$createView$1 tthis$0 = this.this$0;
       int i = -1;
       int i1 = -2;
       HotSpotCustomTextView hotSpotCusto = a.c(p0, new LinearLayout$LayoutParams(i, i1), HotSpotInterestCardPartView$createView$1$1.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto, tthis$0, uoe, "4")) {
          a.p(hotSpotCusto, "<set-?>");
          tthis$0.d = hotSpotCusto;
       }
       tthis$0 = this.this$0;
       HotSpotCustomRecyclerView hotSpotCusto1 = a.b(p0, new LinearLayout$LayoutParams(i1, i1), null, 2, null);
       hotSpotCusto1.addItemDecoration(new b(0, a1.d(R.dimen.arg_RES_7f0702ab), a1.d(R.dimen.arg_RES_7f0702ab), this.this$0.f));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto1, tthis$0, uoe, "2")) {
          a.p(hotSpotCusto1, "<set-?>");
          tthis$0.c = hotSpotCusto1;
       }
       tthis$0 = this.this$0;
       HotSpotCustomTextView hotSpotCusto2 = a.c(p0, tthis$0.K(new LinearLayout$LayoutParams(i, a1.d(R.dimen.arg_RES_7f07034b)), a1.d(R.dimen.arg_RES_7f070271)), HotSpotInterestCardPartView$createView$1$3.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(hotSpotCusto2, tthis$0, uoe, "6")) {
          a.p(hotSpotCusto2, "<set-?>");
          tthis$0.e = hotSpotCusto2;
       }
       return;
    }
}

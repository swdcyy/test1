package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.g;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;

public final class HotSpotTodayFoldView$createView$1 extends Lambda implements l	// class@001876
{
    public final g this$0;

    public void HotSpotTodayFoldView$createView$1(g p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayFoldView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setGravity(81);
       HotSpotTodayFoldView$createView$1 tthis$0 = this.this$0;
       p0 = tthis$0.V0(p0, 0, tthis$0.d1(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f070344), a1.d(R.dimen.arg_RES_7f070319)), a1.d(R.dimen.arg_RES_7f070327)), new HotSpotTodayFoldView$createView$1$1(this));
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, g.class, "2")) {
          a.p(p0, "<set-?>");
          tthis$0.c = p0;
       }
       return;
    }
}

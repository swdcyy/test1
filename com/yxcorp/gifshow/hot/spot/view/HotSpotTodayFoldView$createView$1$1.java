package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1;
import java.lang.Object;
import android.widget.LinearLayout;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1$1$a;
import android.view.View$OnTouchListener;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayFoldView$createView$1$1$2;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

public final class HotSpotTodayFoldView$createView$1$1 extends Lambda implements l	// class@001875
{
    public final HotSpotTodayFoldView$createView$1 this$0;

    public void HotSpotTodayFoldView$createView$1$1(HotSpotTodayFoldView$createView$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayFoldView$createView$1$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackground(a1.f(R.drawable.arg_RES_7f080c33));
       p0.setGravity(1);
       p0.setOnTouchListener(new HotSpotTodayFoldView$createView$1$1$a(p0));
       HotSpotTodayFoldView$createView$1 this$0 = this.this$0.this$0;
       this$0.V0(p0, 0, this$0.K(new LinearLayout$LayoutParams(-2, a1.d(R.dimen.arg_RES_7f0702ef)), a1.d(R.dimen.arg_RES_7f070334)), new HotSpotTodayFoldView$createView$1$1$2(this));
       return;
    }
}

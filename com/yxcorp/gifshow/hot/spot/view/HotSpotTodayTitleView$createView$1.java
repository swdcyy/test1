package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleView$createView$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import jva.l;
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
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleView$createView$1$1;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import java.util.Objects;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayTitleView$createView$1$2;
import com.yxcorp.gifshow.image.KwaiImageView;
import jva.a;

public final class HotSpotTodayTitleView$createView$1 extends Lambda implements l	// class@001890
{
    public final l this$0;

    public void HotSpotTodayTitleView$createView$1(l p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(LinearLayout p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSpotTodayTitleView$createView$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.setBackgroundColor(a1.a(R.color.arg_RES_7f060774));
       p0.setPadding(a1.d(R.dimen.arg_RES_7f0702ab), 0, a1.d(R.dimen.arg_RES_7f0702ab), 0);
       HotSpotTodayTitleView$createView$1 tthis$0 = this.this$0;
       int i = 0x7f070283;
       TextView textView = tthis$0.E(p0, tthis$0.d1(tthis$0.K(new LinearLayout$LayoutParams(-2, -2), a1.d(i)), a1.d(R.dimen.arg_RES_7f07031b)), HotSpotTodayTitleView$createView$1$1.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(textView, tthis$0, ol, "4")) {
          a.p(textView, "<set-?>");
          tthis$0.d = textView;
       }
       tthis$0 = this.this$0;
       KwaiImageView kwaiImageVie = a.d(p0, tthis$0.d1(tthis$0.K(new LinearLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07028e), a1.d(R.dimen.arg_RES_7f0702b8)), a1.d(i)), a1.d(R.dimen.arg_RES_7f07031b)), HotSpotTodayTitleView$createView$1$2.INSTANCE);
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, tthis$0, ol, "2")) {
          a.p(kwaiImageVie, "<set-?>");
          tthis$0.c = kwaiImageVie;
       }
       return;
    }
}

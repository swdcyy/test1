package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2;
import java.lang.Object;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout;
import qrd.l1;
import jva.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.detail.view.PriorityLinearLayout$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$2$1;
import com.kwai.robust.PatchProxyResult;
import jva.a;
import com.yxcorp.gifshow.detail.view.RecoReasonTextView;
import android.content.Context;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import com.kwai.written.view.IWrittenLayout;
import com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListItemV2$createView$2$2$3;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class HotSpotTodayListItemV2$createView$2$2 extends Lambda implements l	// class@001883
{
    public final HotSpotTodayListItemV2$createView$2 this$0;

    public void HotSpotTodayListItemV2$createView$2$2(HotSpotTodayListItemV2$createView$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(PriorityLinearLayout p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, HotSpotTodayListItemV2$createView$2$2.class, "1")) {
          return;
       }
       a.p(obj1, "$receiver");
       obj1.setOrientation(0);
       obj1.setGravity(16);
       HotSpotTodayListItemV2$createView$2 this$0 = obj.this$0.this$0;
       PriorityLinearLayout$LayoutParams layoutParams = new PriorityLinearLayout$LayoutParams(-2, -2);
       HotSpotTodayListItemV2$createView$2$2$1 iNSTANCE = HotSpotTodayListItemV2$createView$2$2$1.INSTANCE;
       HotSpotTodayListItemV2$createView$2 obj2 = PatchProxy.applyThreeRefs(p0, layoutParams, iNSTANCE, null, a.class, "7");
       if (obj2 != PatchProxyResult.class) {
       }else {
          a.p(obj1, "$this$recoReasonTextView");
          a.p(layoutParams, "lparams");
          String str = "lparams";
          obj2 = PatchProxy.applyFourRefs(p0, null, layoutParams, iNSTANCE, null, a.class, "8");
          if (obj2 != PatchProxyResult.class) {
          }else {
             a.p(obj1, "$this$recoReasonTextView");
             a.p(layoutParams, str);
             obj2 = new RecoReasonTextView(p0.getContext(), null);
             if (iNSTANCE != null) {
                l1 ol1 = iNSTANCE.invoke(obj2);
             }
             obj1.addView(obj2, layoutParams);
          }
       }
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(obj2, this$0, i.class, "8")) {
          a.p(obj2, "<set-?>");
          this$0.f = obj2;
       }
       obj2 = obj.this$0.this$0;
       ViewGroup$MarginLayoutParams marginLayout = obj2.a0(new PriorityLinearLayout$LayoutParams(-2, -2), a1.d(R.dimen.arg_RES_7f07031b));
       marginLayout.a = 1;
       KwaiImageView kwaiImageVie = a.d(obj1, marginLayout, HotSpotTodayListItemV2$createView$2$2$3.INSTANCE);
       Objects.requireNonNull(obj2);
       if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, obj2, i.class, "10")) {
          a.p(kwaiImageVie, "<set-?>");
          obj2.g = kwaiImageVie;
       }
       return;
    }
}

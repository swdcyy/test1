package com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBlindDateStyleBRightPendantView;
import com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBaseBlindDateRightPendantView;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import nsd.u;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class LiveBlindDateStyleBRightPendantView extends LiveBaseBlindDateRightPendantView	// class@000f82
{
    public LinearLayout q;
    public HashMap r;

    public void LiveBlindDateStyleBRightPendantView(Context p0){
       a.p(p0, "context");
       super(p0, null, 2, null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBlindDateStyleBRightPendantView.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.a(p0);
       p0 = p0.findViewById(R.id.live_blind_date_top_layout);
       a.o(p0, "rootView.findViewById\(R.¡­ve_blind_date_top_layout\)");
       this.q = p0;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveBlindDateStyleBRightPendantView.class, "3")) {
          return;
       }
       super.d();
       ViewGroup$LayoutParams layoutParams = this.getBackgroundImageView().getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.height = a1.d(0x7f07028f);
       }
       LiveBlindDateStyleBRightPendantView tq = this.q;
       if (tq == null) {
          a.S("topContentView");
       }
       int i = 1;
       tq.setOrientation(i);
       layoutParams = tq.getLayoutParams();
       layoutParams.width = -1;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = a1.d(0x7f070295);
       }
       layoutParams = this.getTopImageView().getLayoutParams();
       if (layoutParams instanceof LinearLayout$LayoutParams) {
          int i1 = a1.d(R.dimen.arg_RES_7f070319);
          layoutParams.width = i1;
          layoutParams.height = i1;
          layoutParams.leftMargin = 0;
          layoutParams.gravity = i;
       }
       this.getGuideDescriptionTextView().setTextSize(i, 12.00f);
       this.getGuideDescriptionTextView().setLineSpacing((- (float)a1.e(2.00f)), 0x3f800000);
       this.getGuideDescriptionTextView().setMinHeight(a1.d(R.dimen.arg_RES_7f0702e8));
       layoutParams = this.getGuideDescriptionTextView().getLayoutParams();
       if (layoutParams instanceof LinearLayout$LayoutParams) {
          layoutParams.gravity = 3;
          layoutParams.topMargin = a1.d(0x7f070334);
          layoutParams.leftMargin = a1.d(0x7f070334);
          layoutParams.rightMargin = a1.d(0x7f070334);
       }
       this.getHighLightTextView().setVisibility(0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveBlindDateStyleBRightPendantView.class, "4")) {
          return;
       }
       super.e();
       ViewGroup$LayoutParams layoutParams = this.getBackgroundImageView().getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.height = a1.d(0x7f070339);
       }
       LiveBlindDateStyleBRightPendantView tq = this.q;
       if (tq == null) {
          a.S("topContentView");
       }
       int i = 0;
       tq.setOrientation(i);
       layoutParams = tq.getLayoutParams();
       layoutParams.width = -2;
       int i1 = 0x7f070334;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = a1.d(i1);
       }
       layoutParams = this.getTopImageView().getLayoutParams();
       if (layoutParams instanceof LinearLayout$LayoutParams) {
          int i2 = a1.d(R.dimen.arg_RES_7f0702df);
          layoutParams.width = i2;
          layoutParams.height = i2;
          layoutParams.leftMargin = a1.d(i1);
          layoutParams.gravity = 0x800013;
       }
       this.getGuideDescriptionTextView().setLineSpacing(0, 0x3f800000);
       this.getGuideDescriptionTextView().setTextSize(1, 10.00f);
       this.getGuideDescriptionTextView().setMinHeight(a1.d(R.dimen.arg_RES_7f0702df));
       layoutParams = this.getGuideDescriptionTextView().getLayoutParams();
       if (layoutParams instanceof LinearLayout$LayoutParams) {
          layoutParams.gravity = 0x800013;
          layoutParams.topMargin = i;
          layoutParams.leftMargin = a1.d(0x7f07031b);
          layoutParams.rightMargin = a1.d(0x7f0702b8);
       }
       this.getHighLightTextView().setVisibility(8);
       return;
    }
    public int getLayoutId$live_common_release(){
       return 0x7f0d0a78;
    }
    public int getSmallModeHeight$live_common_release(){
       Object obj = PatchProxy.apply(null, this, LiveBlindDateStyleBRightPendantView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070339);
    }
}

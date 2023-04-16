package com.kuaishou.live.common.core.component.blinddate.pendant.right.LiveBlindDateStyleARightPendantView;
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
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class LiveBlindDateStyleARightPendantView extends LiveBaseBlindDateRightPendantView	// class@000f81
{
    public View q;
    public HashMap r;

    public void LiveBlindDateStyleARightPendantView(Context p0){
       a.p(p0, "context");
       super(p0, null, 2, null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBlindDateStyleARightPendantView.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.a(p0);
       p0 = this.findViewById(R.id.live_blind_date_content_layout);
       a.o(p0, "findViewById\(R.id.live_blind_date_content_layout\)");
       this.q = p0;
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LiveBlindDateStyleARightPendantView.class, "3")) {
          return;
       }
       super.d();
       this.getBackgroundImageView().setVisibility(8);
       int i = 0;
       this.getTopImageView().setVisibility(i);
       ViewGroup$LayoutParams layoutParams = this.getBackgroundImageView().getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.height = a1.d(0x7f07028f);
       }
       LiveBlindDateStyleARightPendantView tq = this.q;
       if (tq == null) {
          a.S("contentView");
       }
       layoutParams = tq.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = a1.d(0x7f070330);
       }
       this.getGuideDescriptionTextView().setVisibility(i);
       this.getHighLightTextView().setTextSize(1, 10.00f);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveBlindDateStyleARightPendantView.class, "4")) {
          return;
       }
       super.e();
       this.getBackgroundImageView().setVisibility(0);
       int i = 8;
       this.getTopImageView().setVisibility(i);
       ViewGroup$LayoutParams layoutParams = this.getBackgroundImageView().getLayoutParams();
       if (layoutParams instanceof FrameLayout$LayoutParams) {
          layoutParams.height = a1.d(0x7f070346);
       }
       LiveBlindDateStyleARightPendantView tq = this.q;
       if (tq == null) {
          a.S("contentView");
       }
       layoutParams = tq.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = a1.d(0x7f070307);
       }
       this.getGuideDescriptionTextView().setVisibility(i);
       this.getHighLightTextView().setTextSize(1, 9.00f);
       return;
    }
    public int getLayoutId$live_common_release(){
       return 0x7f0d0a77;
    }
    public int getSmallModeHeight$live_common_release(){
       Object obj = PatchProxy.apply(null, this, LiveBlindDateStyleARightPendantView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f070346);
    }
}

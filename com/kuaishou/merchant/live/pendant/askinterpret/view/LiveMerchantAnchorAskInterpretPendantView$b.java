package com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.widget.FrameLayout;

public class LiveMerchantAnchorAskInterpretPendantView$b extends m	// class@001aab
{
    public final LiveMerchantAnchorAskInterpretPendantView c;

    public void LiveMerchantAnchorAskInterpretPendantView$b(LiveMerchantAnchorAskInterpretPendantView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretPendantView$b.class, "1")) {
          return;
       }
       this.c.b.setVisibility(8);
       LiveMerchantAnchorAskInterpretPendantView$b tc = this.c;
       if (tc.e != null) {
          tc.removeCallbacks(tc.h);
          this.c.b();
       }
       LiveMerchantAnchorAskInterpretPendantView j = this.c.j;
       if (j != null) {
          j.a(p0);
       }
       return;
    }
}

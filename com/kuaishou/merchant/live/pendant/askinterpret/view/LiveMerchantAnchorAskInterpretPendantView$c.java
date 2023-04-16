package com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$c;
import lnc.t1;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$d;

public class LiveMerchantAnchorAskInterpretPendantView$c extends t1	// class@001aac
{
    public final LiveMerchantAnchorAskInterpretPendantView a;

    public void LiveMerchantAnchorAskInterpretPendantView$c(LiveMerchantAnchorAskInterpretPendantView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretPendantView$c.class, "1")) {
          return;
       }
       this.a.c.setVisibility(8);
       LiveMerchantAnchorAskInterpretPendantView k = this.a.k;
       if (k != null) {
          k.b();
          LiveMerchantAnchorAskInterpretPendantView$c ta = this.a;
          if (ta.f == null) {
             ta.k.c();
          }
       }
       return;
    }
}

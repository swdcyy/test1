package com.kuaishou.merchant.live.pendant.askinterpret.view.b;
import lnc.t1;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$d;

public class b extends t1	// class@001ab0
{
    public final LiveMerchantAnchorAskInterpretPendantView a;

    public void b(LiveMerchantAnchorAskInterpretPendantView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       LiveMerchantAnchorAskInterpretPendantView k = this.a.k;
       if (k != null) {
          k.b();
       }
       return;
    }
}

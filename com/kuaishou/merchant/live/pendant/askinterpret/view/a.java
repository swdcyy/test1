package com.kuaishou.merchant.live.pendant.askinterpret.view.a;
import lnc.t1;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$d;
import android.view.View;

public class a extends t1	// class@001aaf
{
    public final LiveMerchantAnchorAskInterpretPendantView a;

    public void a(LiveMerchantAnchorAskInterpretPendantView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       LiveMerchantAnchorAskInterpretPendantView k = this.a.k;
       if (k != null) {
          k.b();
          this.a.k.a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.c.setVisibility(0);
       return;
    }
}

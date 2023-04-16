package com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.pendant.askinterpret.view.LiveMerchantAnchorAskInterpretPendantView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveMerchantAnchorAskInterpretPendantView$a extends m	// class@001aaa
{
    public final LiveMerchantAnchorAskInterpretPendantView c;

    public void LiveMerchantAnchorAskInterpretPendantView$a(LiveMerchantAnchorAskInterpretPendantView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorAskInterpretPendantView$a.class, "1")) {
          return;
       }
       this.c.b.setVisibility(8);
       LiveMerchantAnchorAskInterpretPendantView i = this.c.i;
       if (i != null) {
          i.a(p0);
       }
       return;
    }
}

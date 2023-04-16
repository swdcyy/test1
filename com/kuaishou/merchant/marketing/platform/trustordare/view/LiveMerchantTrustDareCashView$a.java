package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCashView$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCashView;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCashInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t84.a;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;

public final class LiveMerchantTrustDareCashView$a implements View$OnClickListener	// class@001b73
{
    public final LiveMerchantTrustDareCashView b;
    public final LiveMerchantTrustDareCashInfo c;

    public void LiveMerchantTrustDareCashView$a(LiveMerchantTrustDareCashView p0,LiveMerchantTrustDareCashInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareCashView$a.class, "1")) {
          return;
       }
       a mClickClickL = this.b.getMClickClickListener();
       if (mClickClickL != null) {
          LiveMerchantTrustDareCashView$a tc = this.c;
          String mJumpUrl = (tc != null)? tc.getMJumpUrl(): null;
          mClickClickL.a(mJumpUrl, 5);
       }
       return;
    }
}

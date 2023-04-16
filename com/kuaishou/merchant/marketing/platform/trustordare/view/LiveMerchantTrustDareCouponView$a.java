package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCouponView$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCouponView;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCouponInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t84.a;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;

public final class LiveMerchantTrustDareCouponView$a implements View$OnClickListener	// class@001b75
{
    public final LiveMerchantTrustDareCouponView b;
    public final LiveMerchantTrustDareCouponInfo c;

    public void LiveMerchantTrustDareCouponView$a(LiveMerchantTrustDareCouponView p0,LiveMerchantTrustDareCouponInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareCouponView$a.class, "1")) {
          return;
       }
       a mClickClickL = this.b.getMClickClickListener();
       if (mClickClickL != null) {
          LiveMerchantTrustDareCouponView$a tc = this.c;
          String mJumpUrl = (tc != null)? tc.getMJumpUrl(): null;
          mClickClickL.a(mJumpUrl, 2);
       }
       return;
    }
}

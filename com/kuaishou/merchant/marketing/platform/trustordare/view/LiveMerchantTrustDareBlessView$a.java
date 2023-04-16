package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBlessView$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBlessView;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareBlessInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t84.a;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;

public final class LiveMerchantTrustDareBlessView$a implements View$OnClickListener	// class@001b70
{
    public final LiveMerchantTrustDareBlessView b;
    public final LiveMerchantTrustDareBlessInfo c;

    public void LiveMerchantTrustDareBlessView$a(LiveMerchantTrustDareBlessView p0,LiveMerchantTrustDareBlessInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareBlessView$a.class, "1")) {
          return;
       }
       a mClickClickL = this.b.getMClickClickListener();
       if (mClickClickL != null) {
          LiveMerchantTrustDareBlessView$a tc = this.c;
          String mJumpUrl = (tc != null)? tc.getMJumpUrl(): null;
          mClickClickL.a(mJumpUrl, 4);
       }
       return;
    }
}

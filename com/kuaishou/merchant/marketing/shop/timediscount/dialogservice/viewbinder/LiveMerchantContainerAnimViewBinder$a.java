package com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder$a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.marketing.shop.timediscount.dialogservice.viewbinder.LiveMerchantContainerAnimViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveMerchantContainerAnimViewBinder$a implements View$OnClickListener	// class@001c21
{
    public final LiveMerchantContainerAnimViewBinder b;

    public void LiveMerchantContainerAnimViewBinder$a(LiveMerchantContainerAnimViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantContainerAnimViewBinder$a.class, "1")) {
          return;
       }
       this.b.c9();
       return;
    }
}

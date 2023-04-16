package com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;

public class MerchantLivePurchasePanelContainerFragment$a extends m	// class@0007e1
{
    public final MerchantLivePurchasePanelContainerFragment c;

    public void MerchantLivePurchasePanelContainerFragment$a(MerchantLivePurchasePanelContainerFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerFragment$a.class, "1")) {
          return;
       }
       if (this.c.Kh(3)) {
          return;
       }
       this.c.dismiss();
       return;
    }
}

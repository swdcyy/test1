package com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment$b;
import qt3.i$a;
import com.kuaishou.merchant.transaction.live.dynamic.page.MerchantLivePurchasePanelContainerV2Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class MerchantLivePurchasePanelContainerV2Fragment$b implements i$a	// class@0007ad
{
    public final MerchantLivePurchasePanelContainerV2Fragment a;

    public void MerchantLivePurchasePanelContainerV2Fragment$b(MerchantLivePurchasePanelContainerV2Fragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       MerchantLivePurchasePanelContainerV2Fragment$b uob = MerchantLivePurchasePanelContainerV2Fragment$b.class;
       Object obj = PatchProxy.applyWithListener(null, this, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       MerchantLivePurchasePanelContainerV2Fragment.Lh(this.a, 0, 1, null);
       PatchProxy.onMethodExit(uob, "1");
       return 1;
    }
}

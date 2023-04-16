package com.kuaishou.merchant.transaction.live.dynamic.opt.PurchasePanelV2PreLoader$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public final class PurchasePanelV2PreLoader$b implements g	// class@0007a9
{
    public static final PurchasePanelV2PreLoader$b b;

    static {
       PurchasePanelV2PreLoader$b.b = new PurchasePanelV2PreLoader$b();
    }
    public void PurchasePanelV2PreLoader$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PurchasePanelV2PreLoader$b.class, "1")) {
       }else {
          a.l(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "PurchasePanelV2PreLoader", "preload:Failed", p0);
       }
       return;
    }
}

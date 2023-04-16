package com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;

public final class PurchaseV2PreLoader$b implements g	// class@000914
{
    public static final PurchaseV2PreLoader$b b;

    static {
       PurchaseV2PreLoader$b.b = new PurchaseV2PreLoader$b();
    }
    public void PurchaseV2PreLoader$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PurchaseV2PreLoader$b.class, "1")) {
       }else {
          a.g(MerchantTransactionLogBiz.PURCHASE_V2, "PurchaseV2PreLoader", "preloadReqFailed:"+p0.getMessage());
       }
       return;
    }
}

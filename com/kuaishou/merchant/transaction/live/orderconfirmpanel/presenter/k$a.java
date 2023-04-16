package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k$a;
import qk4.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class k$a implements a	// class@00082d
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       if (p0.isValidSku()) {
          this.a.V8(p0);
       }
       return;
    }
    public void b(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "2")) {
          return;
       }
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, k.class, "16")) {
          k p = ta.p;
          if (p.mSelectedSku != p0) {
             p.mSelectedItemCount = 1;
             ta.V8(p0);
          }
       }
       return;
    }
}

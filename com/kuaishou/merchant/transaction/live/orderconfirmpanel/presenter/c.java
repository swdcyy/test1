package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.c;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.b;
import qk4.d;
import qk4.e;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ue4.s;

public class c extends w$b	// class@00081a
{
    public final b f;

    public void c(b p0,d p1,e p2,c p3,MerchantLivePurchasePanelResponse p4,AddressInfo p5){
       this.f = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void b(AddressInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.f.u.updateAddressInfo(p0, s.a());
       this.f.y.e(true);
       return;
    }
}

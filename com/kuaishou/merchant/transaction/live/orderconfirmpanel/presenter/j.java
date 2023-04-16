package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.j;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
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

public class j extends w$b	// class@00082c
{
    public final i f;

    public void j(i p0,d p1,e p2,c p3,MerchantLivePurchasePanelResponse p4,AddressInfo p5){
       this.f = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void b(AddressInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       i y = this.f.y;
       if (y != null) {
          MerchantLivePurchasePanelResponse mAddressInfo = y.mAddressInfo;
          if (mAddressInfo != null) {
             mAddressInfo.updateAddressInfo(p0, s.a());
             j tf = this.f;
             tf.y.mBottomTip = null;
             tf.v.e(true);
          }
       }
       return;
    }
}

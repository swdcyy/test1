package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o;
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
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public class o$a extends w$b	// class@000837
{
    public final o f;

    public void o$a(o p0,d p1,e p2,c p3,MerchantLivePurchasePanelResponse p4,AddressInfo p5){
       this.f = p0;
       super(p1, p2, p3, p4, p5);
    }
    public void b(AddressInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "1")) {
          return;
       }
       o y = this.f.y;
       if (y != null) {
          MerchantLivePurchasePanelResponse mAddressInfo = y.mAddressInfo;
          if (mAddressInfo != null) {
             mAddressInfo.updateAddressInfo(p0, s.a());
             o$a tf = this.f;
             tf.y.mBottomTip = null;
             tf.u.e(true);
          label_003c :
             return;
          }
       }
       MerchantTransactionLogBiz lIVE_PURCHAS = MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
       String str = (y == null)? "null": "notNull";
       a.h(lIVE_PURCHAS, "LiveAudienceOrderConfirmTipsPresenter", "tryLev4CreateAddress", "response", str);
       goto label_003c ;
    }
}

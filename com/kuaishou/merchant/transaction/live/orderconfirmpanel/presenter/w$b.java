package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.w$b;
import kc4.c$b;
import qk4.d;
import qk4.e;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.basic.model.AddressInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import kc4.x;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;
import p74.a;
import o74.a;
import yj4.h;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.SystemUtil;

public abstract class w$b implements c$b	// class@000845
{
    public d a;
    public e b;
    public c c;
    public MerchantLivePurchasePanelResponse d;
    public AddressInfo e;

    public void w$b(d p0,e p1,c p2,MerchantLivePurchasePanelResponse p3,AddressInfo p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public void a(AddressInfo p0){
       PageInfoReqParam pageInfoReqP;
       if (PatchProxy.applyVoidOneRefs(p0, this, w$b.class, "1")) {
          return;
       }
       MerchantTransactionLogBiz lIVE_PURCHAS = MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, x.class, "18");
       long l = (obj1 != PatchProxyResult.class)? obj1.longValue(): x.e(p0, obj);
       a.t(lIVE_PURCHAS, "PurchasePanelAddressInteractPresenter", "onAddressChanged", "addressId", Long.valueOf(l));
       if (h.a(this.c)) {
          pageInfoReqP = this.a.c();
          pageInfoReqP.reselectAddress(x.e(p0, this.e));
          this.a.d(pageInfoReqP, true);
       }else if(!x.f(this.d.mAddressInfo) || !x.f(p0)){
          this.b.c();
       }else if(a.t().d("halfPurchaseAddressChangeRefresh", false) || SystemUtil.I()){
          pageInfoReqP = this.a.c();
          pageInfoReqP.reselectAddress(x.e(p0, this.e));
          pageInfoReqP.mShouldRequest = true;
          this.a.d(pageInfoReqP, false);
       }else {
          this.b(p0);
       }
       return;
    }
    public abstract void b(AddressInfo p0);
}

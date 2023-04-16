package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo;
import mkd.a;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo$OrderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;
import java.lang.Long;

public class OrderTabItemInfo implements a, Serializable	// class@0008e2
{
    public OrderTabItemInfo$AfterReceiptDescInfo mAfterReceiptDescInfo;
    public List mItemInfos;
    public long mOid;
    public List mOrderButtonInfos;
    public OrderTabItemInfo$OrderExtra mOrderExtra;
    public OrderTabItemInfo$OrderInfo mOrderInfo;
    public OrderListLogisticsInfo mOrderListLogisticsInfo;
    public LiveShopComponentModel mPayInfo;
    public MerchantEventModel mPaySuffixEvent;
    public LiveShopComponentModel mPaySuffixInfo;
    public OrderTabItemInfo$ShopInfo mShopInfo;
    public LiveShopComponentModel mStatusInfo;
    public static final long serialVersionUID = 0xba0fee10dd8ef897;

    public void OrderTabItemInfo(){
       super();
    }
    public void afterDeserialize(){
       OrderTabItemInfo tmOrderInfo = this.mOrderInfo;
       if (tmOrderInfo != null) {
          this.mOid = tmOrderInfo.mOid;
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderTabItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mOid - p0.mOid || (!d.a(this.mOrderButtonInfos, p0.mOrderButtonInfos) || !d.a(this.mStatusInfo, p0.mStatusInfo))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, OrderTabItemInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{Long.valueOf(this.mOid)};
       return d.b(obj);
    }
}

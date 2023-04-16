package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabItemInfo$OrderInfo;
import mkd.a;
import java.io.Serializable;
import java.lang.Object;

public class OrderTabItemInfo$OrderInfo implements a, Serializable	// class@0008e0
{
    public long mBatchId;
    public int mDefaultRefreshType;
    public long mOid;
    public String mOrderDetailLink;
    public int mOrderStatus;
    public int mRespVer;
    public static final long serialVersionUID = 0xb47622905d0bc938;

    public void OrderTabItemInfo$OrderInfo(){
       super();
    }
    public void afterDeserialize(){
       if (this.mDefaultRefreshType == null) {
          this.mDefaultRefreshType = 2;
       }
       return;
    }
}

package com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionPayPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;

public class ActionPayPayloadInfo extends CashierData implements EventPayloadInfo	// class@000876
{
    public boolean ifRepay;
    public String mAttachedParams;
    public String mOrderDetailLink;
    public int mPageSource;
    public String mPayScene;
    public String mTid;
    public static final long serialVersionUID = 0x1e457e76e68245b9;

    public void ActionPayPayloadInfo(){
       super();
    }
}

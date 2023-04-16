package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabMoreInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoreInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.MerchantEventModel;
import java.lang.String;

public class OrderTabMoreInfo extends MerchantLivePurchasePanelResponse$MoreInfo	// class@0008e3
{
    public MerchantEventModel mEventModel;
    public static final long serialVersionUID = 0x34d45525195af1cf;

    public void OrderTabMoreInfo(MerchantEventModel p0,String p1){
       super(p1);
       this.mEventModel = p0;
    }
}

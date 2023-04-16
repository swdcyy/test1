package com.kuaishou.merchant.transaction.order.orderlist.tab.event.model.OrderCancelReasonResponse$CancelReasonConfig;
import java.io.Serializable;
import java.lang.Object;

public class OrderCancelReasonResponse$CancelReasonConfig implements Serializable	// class@0008c7
{
    public int mCancelReasonCode;
    public String mCancelReasonDesc;
    public boolean selected;
    public static final long serialVersionUID = 0x95e133542d332ac3;

    public void OrderCancelReasonResponse$CancelReasonConfig(){
       super();
       this.selected = false;
    }
}

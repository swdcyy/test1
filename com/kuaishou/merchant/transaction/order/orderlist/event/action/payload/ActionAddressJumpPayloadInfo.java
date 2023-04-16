package com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionAddressJumpPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;

public class ActionAddressJumpPayloadInfo implements EventPayloadInfo	// class@000871
{
    public String mAddressId;
    public long mFee;
    public HashMap mParams;
    public static final long serialVersionUID = 0xa74874abff277fbe;

    public void ActionAddressJumpPayloadInfo(){
       super();
    }
}

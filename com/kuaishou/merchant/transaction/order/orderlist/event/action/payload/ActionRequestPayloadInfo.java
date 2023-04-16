package com.kuaishou.merchant.transaction.order.orderlist.event.action.payload.ActionRequestPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;

public class ActionRequestPayloadInfo implements EventPayloadInfo	// class@000878
{
    public boolean mLegacyResponse;
    public HashMap mParams;
    public String mPath;
    public static final long serialVersionUID = 0x87b61942483aeaf6;

    public void ActionRequestPayloadInfo(){
       super();
    }
}

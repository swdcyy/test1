package com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayDialogPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;

public class DisplayDialogPayloadInfo implements EventPayloadInfo	// class@00087f
{
    public DisplayDialogPayloadInfo$Button mButton;
    public String mContent;
    public boolean mOutSideClose;
    public String mTitle;
    public static final long serialVersionUID = 0xd945a8bab4a5b138;

    public void DisplayDialogPayloadInfo(){
       super();
    }
}

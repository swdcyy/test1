package com.kuaishou.merchant.transaction.order.orderlist.event.display.payload.DisplayAlertPayloadInfo;
import com.kuaishou.merchant.transaction.order.orderlist.event.model.EventPayloadInfo;
import java.lang.Object;

public class DisplayAlertPayloadInfo implements EventPayloadInfo	// class@00087d
{
    public String mContent;
    public int mContentGravity;
    public AlertButton mLeftButton;
    public boolean mOutSideClose;
    public AlertButton mRightButton;
    public SubContentModel mSubContent;
    public String mTitle;
    public static final long serialVersionUID = 0x9a31babc9298a6f0;

    public void DisplayAlertPayloadInfo(){
       super();
    }
}

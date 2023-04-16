package com.kuaishou.merchant.transaction.order.orderlist.list.model.OrderListResponse;
import java.io.Serializable;
import java.lang.Object;

public class OrderListResponse implements Serializable	// class@000892
{
    public ServiceEntryInfo mAfterSaleInfo;
    public OrderListResponse$AnnouncementInfo mAnnouncementInfo;
    public ServiceEntryInfo mCSInfo;
    public int mDefaultTab;
    public List mOrderTabInfos;
    public OrderListResponse$PendantInfo mPendantInfo;
    public OrderListResponse$SearchInfo mSearchInfo;
    public ServiceEntryInfo mSettingInfo;
    public String orderListTransparentParam;
    public static final long serialVersionUID = 0x2e9cde35b7257ff0;

    public void OrderListResponse(){
       super();
    }
}

package com.kuaishou.merchant.transaction.order.orderlist.tab.model.OrderTabInfo;
import java.io.Serializable;
import java.lang.Object;

public class OrderTabInfo implements Serializable	// class@0008d9
{
    public List mItemInfos;
    public OrderTabInfo$OrderExtra mOrderExtra;
    public LiveShopComponentModel mPayInfo;
    public OrderTabInfo$ShopInfo mShopInfo;
    public LiveShopComponentModel mStatusInfo;
    public static final long serialVersionUID = 0xba0fee10dd8ef897;

    public void OrderTabInfo(){
       super();
    }
}

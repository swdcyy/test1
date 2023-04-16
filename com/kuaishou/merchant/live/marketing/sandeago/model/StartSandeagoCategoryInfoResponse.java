package com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoCategoryInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class StartSandeagoCategoryInfoResponse implements Serializable	// class@001a55
{
    public String mDeliveryDesc;
    public StartSandeagoCategoryInfoResponse$DeliveryDialog mDeliveryDialog;
    public int mLastSkuType;
    public int mMultiSkuShowStatus;
    public List mPropList;
    public String mRecItemIitle;
    public String mRecItemTitlePrefix;
    public List mServicePromiseList;
    public String mServicePromiseUrl;
    public List mSkuList;
    public static final long serialVersionUID = 0x1d8dec19f2378b81;

    public void StartSandeagoCategoryInfoResponse(){
       super();
       this.mMultiSkuShowStatus = 1;
       this.mLastSkuType = 1;
    }
}

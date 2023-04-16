package com.kuaishou.merchant.api.live.basic.model.MerchantLivePushConfig;
import java.io.Serializable;
import java.lang.Object;

public class MerchantLivePushConfig implements Serializable	// class@001564
{
    public MerchantAuctionConfig mAuctionConfig;
    public List mGuideTipList;
    public boolean mIsMerchantMmuAwakeEnabled;
    public static final long serialVersionUID = 0xec878225a76a8ec3;

    public void MerchantLivePushConfig(){
       super();
    }
}

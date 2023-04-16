package com.kuaishou.merchant.marketing.shop.auction.setting.model.AuctionSettingResponse;
import java.io.Serializable;
import java.lang.Object;

public class AuctionSettingResponse implements Serializable	// class@001bc2
{
    public AuctionSettingResponse$AuctionInfo mAuctionInfo;
    public String mAuctionRecordUrl;
    public List mConfigList;
    public AuctionOtherInfo mOtherInfo;
    public static final long serialVersionUID = 0xd46115b00f8fb118;

    public void AuctionSettingResponse(){
       super();
    }
}

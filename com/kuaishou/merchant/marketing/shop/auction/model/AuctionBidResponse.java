package com.kuaishou.merchant.marketing.shop.auction.model.AuctionBidResponse;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionBidResponse$MarginThresholdInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;

public class AuctionBidResponse implements Serializable	// class@001ba3
{
    public String mComment;
    public AuctionBidResponse$FansGroupThresholdInfo mFansGroupThresholdInfo;
    public AuctionBidResponse$GiftThresholdInfo mGiftThresholdInfo;
    public String mMarginThresholdInfo;
    public boolean mNeedComment;
    public int mThresholdStatus;
    public static final long serialVersionUID = 0x9918e94e24e5192e;

    public void AuctionBidResponse(){
       super();
    }
    public AuctionBidResponse$MarginThresholdInfo getMarginThresholdInfo(){
       Object obj = PatchProxy.apply(null, this, AuctionBidResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mMarginThresholdInfo)) {
          return null;
       }
       try{
          return a.a.h(this.mMarginThresholdInfo, AuctionBidResponse$MarginThresholdInfo.class);
       }catch(java.lang.Exception e0){
          return v1;
       }
    }
}

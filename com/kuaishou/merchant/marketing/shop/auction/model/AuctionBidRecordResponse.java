package com.kuaishou.merchant.marketing.shop.auction.model.AuctionBidRecordResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class AuctionBidRecordResponse implements Serializable	// class@001b9f
{
    public int mBidCount;
    public List mBidInfoList;
    public String mCursor;
    public String mRuleUrl;
    public String mStartPrice;
    public static final long serialVersionUID = 0x2835aa46263068b9;

    public void AuctionBidRecordResponse(){
       super();
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, AuctionBidRecordResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}

package com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.merchant.marketing.shop.auction.model.AuctionStartConfig$CheckRule;
import com.kwai.robust.PatchProxyResult;

public class AuctionStartConfig implements Serializable	// class@001bae
{
    public List mAuctionDuration;
    public List mAuctionThreshold;
    public AuctionStartConfig$CheckRule mCheckRule;
    public String mDelaySwitchDesc;
    public boolean mDisplayServiceFee;
    public List mPriceIncrementMode;
    public String mSelectCategoryUrl;
    public static final long serialVersionUID = 0x20da1c92460ef4fd;

    public void AuctionStartConfig(){
       super();
    }
    public void checkValid(){
       if (PatchProxy.applyVoid(null, this, AuctionStartConfig.class, "1")) {
          return;
       }
       if (q.f(this.mAuctionThreshold)) {
          throw new IllegalArgumentException("mAuctionThreshold is invalid, mAuctionThreshold="+this.mAuctionThreshold);
       }
       if (q.f(this.mAuctionDuration)) {
          throw new IllegalArgumentException("mAuctionDuration is invalid, mAuctionDuration="+this.mAuctionDuration);
       }
       if (!TextUtils.x(this.mSelectCategoryUrl)) {
          return;
       }
       throw new IllegalArgumentException("mSelectCategoryUrl is invalid, mSelectCategoryUrl="+this.mSelectCategoryUrl);
    }
    public AuctionStartConfig$CheckRule getCheckRule(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mCheckRule == null) {
          this.mCheckRule = new AuctionStartConfig$CheckRule();
       }
       return this.mCheckRule;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AuctionStartConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AuctionStartConfig{mAuctionThreshold="+this.mAuctionThreshold+", mAuctionDuration="+this.mAuctionDuration+", mDelaySwitchDesc=\'"+this.mDelaySwitchDesc+'''+", mCheckRule="+this.mCheckRule+", mSelectCategoryUrl=\'"+this.mSelectCategoryUrl+'''+'}';
    }
}

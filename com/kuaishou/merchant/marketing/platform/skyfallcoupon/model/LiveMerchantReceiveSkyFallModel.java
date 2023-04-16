package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantReceiveSkyFallModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;

public class LiveMerchantReceiveSkyFallModel implements Serializable, a	// class@001b4b
{
    public String mBuyerCouponId;
    public int mChannelType;
    public String mCouponDisplayTitle;
    public String mCouponId;
    public int mCouponPrice;
    public long mExpireTime;
    public Map mExtraMap;
    public String mJumpLink;
    public String mJumpUrl;
    public int mType;
    public String mUseConditionTitle;
    public String mUseRangeTitle;
    public static final long serialVersionUID = 0x4b7588bf03135cc8;

    public void LiveMerchantReceiveSkyFallModel(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantReceiveSkyFallModel.class, "1")) {
          return;
       }
       LiveMerchantReceiveSkyFallModel tmExtraMap = this.mExtraMap;
       if (tmExtraMap != null) {
          this.mJumpLink = tmExtraMap.get("pullYellowCarLink");
       }
       return;
    }
}

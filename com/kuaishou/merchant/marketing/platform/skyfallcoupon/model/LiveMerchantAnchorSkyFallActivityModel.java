package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantAnchorSkyFallActivityModel;
import java.io.Serializable;
import java.lang.Object;

public class LiveMerchantAnchorSkyFallActivityModel implements Serializable	// class@001b49
{
    public int mAccessLimitAmount;
    public String mActivityId;
    public String mActivitySessionId;
    public String mActivitySessionName;
    public int mActivityStatus;
    public int mActivityType;
    public String mCouponId;
    public long mCouponPrice;
    public int mCouponType;
    public String mCouponTypeName;
    public String mCouponUseTime;
    public long mEndTime;
    public int mExposureAmount;
    public long mStartTime;
    public String mUseConditionTitle;
    public static final long serialVersionUID = 0x22b36601ccb9955;

    public void LiveMerchantAnchorSkyFallActivityModel(){
       super();
       this.mActivityStatus = 2;
    }
}

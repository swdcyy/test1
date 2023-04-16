package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRewardInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareBlessInfo;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCashInfo;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCouponInfo;

public final class LiveMerchantTrustDareRewardInfo implements Serializable	// class@001b6e
{
    public LiveMerchantTrustDareBlessInfo mBlessInfo;
    public LiveMerchantTrustDareCashInfo mCashInfo;
    public LiveMerchantTrustDareCouponInfo mCouponInfo;
    public boolean mShowed;
    public int mType;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareRewardInfo(){
       super();
       this.serialVersionUID = 0xd869ed8a89a0ab9;
    }
    public final LiveMerchantTrustDareBlessInfo getMBlessInfo(){
       return this.mBlessInfo;
    }
    public final LiveMerchantTrustDareCashInfo getMCashInfo(){
       return this.mCashInfo;
    }
    public final LiveMerchantTrustDareCouponInfo getMCouponInfo(){
       return this.mCouponInfo;
    }
    public final boolean getMShowed(){
       return this.mShowed;
    }
    public final int getMType(){
       return this.mType;
    }
    public final void setMBlessInfo(LiveMerchantTrustDareBlessInfo p0){
       this.mBlessInfo = p0;
    }
    public final void setMCashInfo(LiveMerchantTrustDareCashInfo p0){
       this.mCashInfo = p0;
    }
    public final void setMCouponInfo(LiveMerchantTrustDareCouponInfo p0){
       this.mCouponInfo = p0;
    }
    public final void setMShowed(boolean p0){
       this.mShowed = p0;
    }
    public final void setMType(int p0){
       this.mType = p0;
    }
}

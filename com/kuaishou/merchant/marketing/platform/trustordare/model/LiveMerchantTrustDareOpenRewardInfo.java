package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareOpenRewardInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRewardInfo;

public final class LiveMerchantTrustDareOpenRewardInfo implements Serializable	// class@001b6c
{
    public String mJumpUrl;
    public int mMagicId;
    public LiveMerchantTrustDareRewardInfo mRewardInfo;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareOpenRewardInfo(){
       super();
       this.serialVersionUID = 0x261d358d02486d09;
       this.mJumpUrl = "";
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final int getMMagicId(){
       return this.mMagicId;
    }
    public final LiveMerchantTrustDareRewardInfo getMRewardInfo(){
       return this.mRewardInfo;
    }
    public final void setMJumpUrl(String p0){
       this.mJumpUrl = p0;
    }
    public final void setMMagicId(int p0){
       this.mMagicId = p0;
    }
    public final void setMRewardInfo(LiveMerchantTrustDareRewardInfo p0){
       this.mRewardInfo = p0;
    }
}

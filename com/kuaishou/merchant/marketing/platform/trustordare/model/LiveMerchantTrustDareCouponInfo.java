package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCouponInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;

public final class LiveMerchantTrustDareCouponInfo implements Serializable	// class@001b6b
{
    public String mButtonTitle;
    public String mCouponDes;
    public String mCouponId;
    public String mCouponSubDesc;
    public String mCouponValidDesc;
    public String mJumpUrl;
    public long mMoney;
    public LiveMerchantTrustDareRedPacketStyle mPacketStyle;
    public String mSubTitle;
    public String mTitle;
    public String mUseCondition;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareCouponInfo(){
       super();
       this.serialVersionUID = 0x15da407c68668c69;
       this.mCouponId = "";
       this.mTitle = "";
       this.mSubTitle = "";
       this.mUseCondition = "";
       this.mCouponDes = "";
       this.mCouponSubDesc = "";
       this.mCouponValidDesc = "";
       this.mButtonTitle = "";
       this.mJumpUrl = "";
    }
    public final String getMButtonTitle(){
       return this.mButtonTitle;
    }
    public final String getMCouponDes(){
       return this.mCouponDes;
    }
    public final String getMCouponId(){
       return this.mCouponId;
    }
    public final String getMCouponSubDesc(){
       return this.mCouponSubDesc;
    }
    public final String getMCouponValidDesc(){
       return this.mCouponValidDesc;
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final long getMMoney(){
       return this.mMoney;
    }
    public final LiveMerchantTrustDareRedPacketStyle getMPacketStyle(){
       return this.mPacketStyle;
    }
    public final String getMSubTitle(){
       return this.mSubTitle;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final String getMUseCondition(){
       return this.mUseCondition;
    }
    public final void setMButtonTitle(String p0){
       this.mButtonTitle = p0;
    }
    public final void setMCouponDes(String p0){
       this.mCouponDes = p0;
    }
    public final void setMCouponId(String p0){
       this.mCouponId = p0;
    }
    public final void setMCouponSubDesc(String p0){
       this.mCouponSubDesc = p0;
    }
    public final void setMCouponValidDesc(String p0){
       this.mCouponValidDesc = p0;
    }
    public final void setMJumpUrl(String p0){
       this.mJumpUrl = p0;
    }
    public final void setMMoney(long p0){
       this.mMoney = p0;
    }
    public final void setMPacketStyle(LiveMerchantTrustDareRedPacketStyle p0){
       this.mPacketStyle = p0;
    }
    public final void setMSubTitle(String p0){
       this.mSubTitle = p0;
    }
    public final void setMTitle(String p0){
       this.mTitle = p0;
    }
    public final void setMUseCondition(String p0){
       this.mUseCondition = p0;
    }
}

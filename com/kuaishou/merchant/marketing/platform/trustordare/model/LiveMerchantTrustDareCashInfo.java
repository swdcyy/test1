package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCashInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;

public final class LiveMerchantTrustDareCashInfo implements Serializable	// class@001b6a
{
    public String mButtonTitle;
    public String mDesTitle;
    public String mGuideTitle;
    public String mJumpUrl;
    public long mMoney;
    public LiveMerchantTrustDareRedPacketStyle mPacketStyle;
    public String mTitle;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareCashInfo(){
       super();
       this.serialVersionUID = 0x15da3faad9d60a69;
       this.mTitle = "";
       this.mGuideTitle = "";
       this.mDesTitle = "";
       this.mButtonTitle = "";
       this.mJumpUrl = "";
    }
    public final String getMButtonTitle(){
       return this.mButtonTitle;
    }
    public final String getMDesTitle(){
       return this.mDesTitle;
    }
    public final String getMGuideTitle(){
       return this.mGuideTitle;
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
    public final String getMTitle(){
       return this.mTitle;
    }
    public final void setMButtonTitle(String p0){
       this.mButtonTitle = p0;
    }
    public final void setMDesTitle(String p0){
       this.mDesTitle = p0;
    }
    public final void setMGuideTitle(String p0){
       this.mGuideTitle = p0;
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
    public final void setMTitle(String p0){
       this.mTitle = p0;
    }
}

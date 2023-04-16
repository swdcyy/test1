package com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$CustomLevelInfo;
import java.lang.Object;

public class RewardPanelInfoResponse$CustomLevelInfo	// class@001247
{
    public String mCornerText;
    public int mDiscountRate;
    public String mDisplayName;
    public int mExchangeRate;
    public String mIconUrl;
    public String mInputPromt;
    public int mKsCoinPerYuan;
    public String mMaxGiftHint;
    public String mMinGiftHint;
    public String mPicUrl;
    public String mRateTips;

    public void RewardPanelInfoResponse$CustomLevelInfo(){
       super();
       this.mExchangeRate = 10;
       this.mDiscountRate = -1;
       this.mKsCoinPerYuan = -1;
    }
    public boolean hasDiscount(){
       RewardPanelInfoResponse$CustomLevelInfo tmDiscountRa = this.mDiscountRate;
       boolean b = true;
       if (b > tmDiscountRa || tmDiscountRa >= this.mExchangeRate) {
          b = false;
       }
       return b;
    }
}

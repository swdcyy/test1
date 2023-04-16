package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$AfterOpen;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$AfterOpen$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$ButtonStyle;
import java.lang.String;

public final class LiveMerchantSkyFallStyleConfig$AfterOpen implements Serializable	// class@001b50
{
    public boolean mAnimationSwitch;
    public List mBottomImgUrls;
    public LiveMerchantSkyFallStyleConfig$ButtonStyle mButtonStyle;
    public List mMainTitleUrls;
    public List mMediumImgUrls;
    public String mPriceColor;
    public String mSubtitleColor;
    public List mTopImgUrl;
    public String mUseConditionTitleColor;
    public static final LiveMerchantSkyFallStyleConfig$AfterOpen$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$AfterOpen.Companion = new LiveMerchantSkyFallStyleConfig$AfterOpen$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$AfterOpen(){
       super();
       this.mPriceColor = "";
       this.mSubtitleColor = "";
       this.mUseConditionTitleColor = "";
    }
    public final boolean getMAnimationSwitch(){
       return this.mAnimationSwitch;
    }
    public final List getMBottomImgUrls(){
       return this.mBottomImgUrls;
    }
    public final LiveMerchantSkyFallStyleConfig$ButtonStyle getMButtonStyle(){
       return this.mButtonStyle;
    }
    public final List getMMainTitleUrls(){
       return this.mMainTitleUrls;
    }
    public final List getMMediumImgUrls(){
       return this.mMediumImgUrls;
    }
    public final String getMPriceColor(){
       return this.mPriceColor;
    }
    public final String getMSubtitleColor(){
       return this.mSubtitleColor;
    }
    public final List getMTopImgUrl(){
       return this.mTopImgUrl;
    }
    public final String getMUseConditionTitleColor(){
       return this.mUseConditionTitleColor;
    }
    public final void setMAnimationSwitch(boolean p0){
       this.mAnimationSwitch = p0;
    }
    public final void setMBottomImgUrls(List p0){
       this.mBottomImgUrls = p0;
    }
    public final void setMButtonStyle(LiveMerchantSkyFallStyleConfig$ButtonStyle p0){
       this.mButtonStyle = p0;
    }
    public final void setMMainTitleUrls(List p0){
       this.mMainTitleUrls = p0;
    }
    public final void setMMediumImgUrls(List p0){
       this.mMediumImgUrls = p0;
    }
    public final void setMPriceColor(String p0){
       this.mPriceColor = p0;
    }
    public final void setMSubtitleColor(String p0){
       this.mSubtitleColor = p0;
    }
    public final void setMTopImgUrl(List p0){
       this.mTopImgUrl = p0;
    }
    public final void setMUseConditionTitleColor(String p0){
       this.mUseConditionTitleColor = p0;
    }
}

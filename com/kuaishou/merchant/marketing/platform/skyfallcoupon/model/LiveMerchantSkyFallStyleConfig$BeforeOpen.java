package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$BeforeOpen;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$BeforeOpen$a;
import nsd.u;
import java.lang.Object;
import java.util.List;

public final class LiveMerchantSkyFallStyleConfig$BeforeOpen implements Serializable	// class@001b52
{
    public List mMainTitleImgUrls;
    public List mTopImgUrls;
    public static final LiveMerchantSkyFallStyleConfig$BeforeOpen$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$BeforeOpen.Companion = new LiveMerchantSkyFallStyleConfig$BeforeOpen$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$BeforeOpen(){
       super();
    }
    public final List getMMainTitleImgUrls(){
       return this.mMainTitleImgUrls;
    }
    public final List getMTopImgUrls(){
       return this.mTopImgUrls;
    }
    public final void setMMainTitleImgUrls(List p0){
       this.mMainTitleImgUrls = p0;
    }
    public final void setMTopImgUrls(List p0){
       this.mTopImgUrls = p0;
    }
}

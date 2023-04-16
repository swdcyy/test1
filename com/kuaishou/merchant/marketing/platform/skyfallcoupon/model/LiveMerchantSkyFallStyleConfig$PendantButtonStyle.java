package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantButtonStyle;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantButtonStyle$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class LiveMerchantSkyFallStyleConfig$PendantButtonStyle implements Serializable	// class@001b56
{
    public List bgImgUrls;
    public String mTitleColor;
    public static final LiveMerchantSkyFallStyleConfig$PendantButtonStyle$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$PendantButtonStyle.Companion = new LiveMerchantSkyFallStyleConfig$PendantButtonStyle$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$PendantButtonStyle(){
       super();
       this.mTitleColor = "";
    }
    public final List getBgImgUrls(){
       return this.bgImgUrls;
    }
    public final String getMTitleColor(){
       return this.mTitleColor;
    }
    public final void setBgImgUrls(List p0){
       this.bgImgUrls = p0;
    }
    public final void setMTitleColor(String p0){
       this.mTitleColor = p0;
    }
}

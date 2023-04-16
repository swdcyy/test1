package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$ButtonStyle;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$ButtonStyle$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import java.lang.String;

public final class LiveMerchantSkyFallStyleConfig$ButtonStyle implements Serializable	// class@001b54
{
    public List mButtonImgUrls;
    public String mTitle;
    public String mTitleColor;
    public static final LiveMerchantSkyFallStyleConfig$ButtonStyle$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$ButtonStyle.Companion = new LiveMerchantSkyFallStyleConfig$ButtonStyle$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$ButtonStyle(){
       super();
       this.mTitleColor = "";
       this.mTitle = "";
    }
    public final List getMButtonImgUrls(){
       return this.mButtonImgUrls;
    }
    public final String getMTitle(){
       return this.mTitle;
    }
    public final String getMTitleColor(){
       return this.mTitleColor;
    }
    public final void setMButtonImgUrls(List p0){
       this.mButtonImgUrls = p0;
    }
    public final void setMTitle(String p0){
       this.mTitle = p0;
    }
    public final void setMTitleColor(String p0){
       this.mTitleColor = p0;
    }
}

package com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantStyle;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantStyle$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import com.kuaishou.merchant.marketing.platform.skyfallcoupon.model.LiveMerchantSkyFallStyleConfig$PendantButtonStyle;
import java.lang.String;

public final class LiveMerchantSkyFallStyleConfig$PendantStyle implements Serializable	// class@001b58
{
    public List bgImgUrls;
    public LiveMerchantSkyFallStyleConfig$PendantButtonStyle pendantButtonStyle;
    public String priceColor;
    public String receivedTitle;
    public String unReceivedTitle;
    public static final LiveMerchantSkyFallStyleConfig$PendantStyle$a Companion;
    public static final long serialVersionUID;

    static {
       LiveMerchantSkyFallStyleConfig$PendantStyle.Companion = new LiveMerchantSkyFallStyleConfig$PendantStyle$a(null);
    }
    public void LiveMerchantSkyFallStyleConfig$PendantStyle(){
       super();
       this.priceColor = "";
       this.unReceivedTitle = "立即领取";
       this.receivedTitle = "去使用";
    }
    public final List getBgImgUrls(){
       return this.bgImgUrls;
    }
    public final LiveMerchantSkyFallStyleConfig$PendantButtonStyle getPendantButtonStyle(){
       return this.pendantButtonStyle;
    }
    public final String getPriceColor(){
       return this.priceColor;
    }
    public final String getReceivedTitle(){
       return this.receivedTitle;
    }
    public final String getUnReceivedTitle(){
       return this.unReceivedTitle;
    }
    public final void setBgImgUrls(List p0){
       this.bgImgUrls = p0;
    }
    public final void setPendantButtonStyle(LiveMerchantSkyFallStyleConfig$PendantButtonStyle p0){
       this.pendantButtonStyle = p0;
    }
    public final void setPriceColor(String p0){
       this.priceColor = p0;
    }
    public final void setReceivedTitle(String p0){
       this.receivedTitle = p0;
    }
    public final void setUnReceivedTitle(String p0){
       this.unReceivedTitle = p0;
    }
}

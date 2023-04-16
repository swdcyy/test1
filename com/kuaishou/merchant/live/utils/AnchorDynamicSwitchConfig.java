package com.kuaishou.merchant.live.utils.AnchorDynamicSwitchConfig;
import java.io.Serializable;
import com.kuaishou.merchant.live.utils.AnchorDynamicSwitchConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class AnchorDynamicSwitchConfig implements Serializable	// class@001adf
{
    public boolean enable;
    public String onSaleJumpLink;
    public String shopJumpLink;
    public static final AnchorDynamicSwitchConfig$a Companion;
    public static final long serialVersionUID;

    static {
       AnchorDynamicSwitchConfig.Companion = new AnchorDynamicSwitchConfig$a(null);
    }
    public void AnchorDynamicSwitchConfig(){
       super();
       this.onSaleJumpLink = "kwaimerchant://openhalfrn?bundleId=KwaishopBCommodityManager&componentName=KwaishopBOnSale&heightRatio=0.8";
       this.shopJumpLink = "kwaimerchant://openhalfrn?bundleId=KwaishopBCommodityManager&componentName=KwaishopBCommodityManager&heightRatio=1&alpha=0";
    }
    public final boolean getEnable(){
       return this.enable;
    }
    public final String getOnSaleJumpLink(){
       return this.onSaleJumpLink;
    }
    public final String getShopJumpLink(){
       return this.shopJumpLink;
    }
    public final void setEnable(boolean p0){
       this.enable = p0;
    }
    public final void setOnSaleJumpLink(String p0){
       this.onSaleJumpLink = p0;
    }
    public final void setShopJumpLink(String p0){
       this.shopJumpLink = p0;
    }
}

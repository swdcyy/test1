package com.kuaishou.merchant.live.pendant.model.DiscountPrice;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.lang.String;
import com.kuaishou.merchant.live.pendant.model.PreSellInfo;
import java.util.List;
import com.kuaishou.merchant.api.core.model.Commodity$SpikeInfo;

public final class DiscountPrice implements Serializable	// class@001abc
{
    public Commodity$IconLabel[] icon;
    public String itemId;
    public PreSellInfo preSellInfo;
    public String promotedPrice;
    public String redirectUrl;
    public List rightsList;
    public String serviceIconUrl;
    public Commodity$SpikeInfo spikeInfo;

    public void DiscountPrice(){
       super();
    }
    public final Commodity$IconLabel[] getIcon(){
       return this.icon;
    }
    public final String getItemId(){
       return this.itemId;
    }
    public final PreSellInfo getPreSellInfo(){
       return this.preSellInfo;
    }
    public final String getPromotedPrice(){
       return this.promotedPrice;
    }
    public final String getRedirectUrl(){
       return this.redirectUrl;
    }
    public final List getRightsList(){
       return this.rightsList;
    }
    public final String getServiceIconUrl(){
       return this.serviceIconUrl;
    }
    public final Commodity$SpikeInfo getSpikeInfo(){
       return this.spikeInfo;
    }
    public final void setIcon(Commodity$IconLabel[] p0){
       this.icon = p0;
    }
    public final void setItemId(String p0){
       this.itemId = p0;
    }
    public final void setPreSellInfo(PreSellInfo p0){
       this.preSellInfo = p0;
    }
    public final void setPromotedPrice(String p0){
       this.promotedPrice = p0;
    }
    public final void setRedirectUrl(String p0){
       this.redirectUrl = p0;
    }
    public final void setRightsList(List p0){
       this.rightsList = p0;
    }
    public final void setServiceIconUrl(String p0){
       this.serviceIconUrl = p0;
    }
    public final void setSpikeInfo(Commodity$SpikeInfo p0){
       this.spikeInfo = p0;
    }
}

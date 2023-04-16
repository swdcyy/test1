package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.AdBottomBannerTkData;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.AdBottomBannerTkData$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.String;

public final class AdBottomBannerTkData implements Serializable	// class@001597
{
    public PhotoAdvertisement ad;
    public String dataString;
    public Object templateData;
    public static final AdBottomBannerTkData$a Companion;
    public static final long serialVersionUID;

    static {
       AdBottomBannerTkData.Companion = new AdBottomBannerTkData$a(null);
    }
    public void AdBottomBannerTkData(){
       super();
    }
    public final PhotoAdvertisement getAd(){
       return this.ad;
    }
    public final String getDataString(){
       return this.dataString;
    }
    public final Object getTemplateData(){
       return this.templateData;
    }
    public final void setAd(PhotoAdvertisement p0){
       this.ad = p0;
    }
    public final void setDataString(String p0){
       this.dataString = p0;
    }
    public final void setTemplateData(Object p0){
       this.templateData = p0;
    }
}

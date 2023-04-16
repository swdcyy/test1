package com.kuaishou.live.ad.model.config.AdConversionStartConfig;
import java.io.Serializable;
import java.lang.Object;

public class AdConversionStartConfig implements Serializable	// class@0009e6
{
    public boolean mDisablePromotion;
    public String mTitle;
    public String mUrl;
    public static final long serialVersionUID = 0x6cef32a978b63621;

    public void AdConversionStartConfig(){
       super();
       this.mDisablePromotion = false;
    }
}

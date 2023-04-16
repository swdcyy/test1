package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig implements Serializable	// class@001029
{
    public long mLiteDelayInfosApiDelayMs;
    public long mLiveDelayInfosRequestDelayMs;
    public static final long serialVersionUID = 0x4891ac937ff64116;

    public void LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig(){
       super();
       this.mLiveDelayInfosRequestDelayMs = 5000;
       this.mLiteDelayInfosApiDelayMs = 5000;
    }
}

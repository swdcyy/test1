package com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig;
import java.io.Serializable;
import java.lang.Object;

public class NebulaLiveAudienceAdWidgetConfig implements Serializable	// class@000ae6
{
    public long mDisplayDurationMs;
    public long mFirstDisplayIntervalMs;
    public String mTitle;
    public static final long serialVersionUID = 0x4ba082a0d929cd7a;

    public void NebulaLiveAudienceAdWidgetConfig(){
       super();
       this.mFirstDisplayIntervalMs = 9000;
       this.mDisplayDurationMs = 9000;
    }
}

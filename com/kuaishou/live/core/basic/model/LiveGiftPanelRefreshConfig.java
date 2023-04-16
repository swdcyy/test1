package com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveGiftPanelRefreshConfig implements Serializable	// class@000870
{
    public long mDelayRequestMillis;
    public int mPanelRefreshMode;

    public void LiveGiftPanelRefreshConfig(){
       super();
       this.mDelayRequestMillis = 0;
       this.mPanelRefreshMode = 0;
    }
}

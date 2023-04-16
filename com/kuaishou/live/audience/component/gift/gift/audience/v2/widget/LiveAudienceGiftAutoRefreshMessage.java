package com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftAutoRefreshMessage;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceGiftAutoRefreshMessage implements Serializable	// class@000b68
{
    public boolean mEnableAutoRefreshGiftPanel;
    public long mGiftPanelMaxDelayMills;
    public boolean mRefreshImmediate;
    public long mRefreshInterval;
    public static final long serialVersionUID = 0xea8b4cd5473009c5;

    public void LiveAudienceGiftAutoRefreshMessage(){
       super();
    }
    public boolean getEnableAutoRefreshGiftPanle(){
       return this.mEnableAutoRefreshGiftPanel;
    }
    public long getGiftPanelMaxDelayMills(){
       return this.mGiftPanelMaxDelayMills;
    }
    public boolean getRefreshImmediate(){
       return this.mRefreshImmediate;
    }
    public long getRefreshInterval(){
       return this.mRefreshInterval;
    }
}

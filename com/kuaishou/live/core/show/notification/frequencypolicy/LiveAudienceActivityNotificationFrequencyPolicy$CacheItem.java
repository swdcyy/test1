package com.kuaishou.live.core.show.notification.frequencypolicy.LiveAudienceActivityNotificationFrequencyPolicy$CacheItem;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceActivityNotificationFrequencyPolicy$CacheItem implements Serializable	// class@000d49
{
    public long mBanTimestamp;
    public int mLastCount;
    public long mLastTimestamp;
    public static final long serialVersionUID = 0xb5016cbaac8cb95;

    public void LiveAudienceActivityNotificationFrequencyPolicy$CacheItem(){
       super();
       this.mLastTimestamp = 0;
       this.mBanTimestamp = 0;
       this.mLastCount = 0;
    }
}

package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveWishRoomConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveWishRoomConfig implements Serializable	// class@001087
{
    public long mDefaultPullSocialWishDurationMs;
    public int mMaxCacheWishSize;
    public float mSocialWishDisplayPercent;
    public long mWishPanelShowIntervalMillis;
    public static final long serialVersionUID = 0x6397aa285434416a;

    public void LiveConfigStartupResponse$LiveWishRoomConfig(){
       super();
       this.mDefaultPullSocialWishDurationMs = 0x493e0;
       this.mSocialWishDisplayPercent = 0.25f;
       this.mMaxCacheWishSize = 500;
       this.mWishPanelShowIntervalMillis = 0x5265c00;
    }
}

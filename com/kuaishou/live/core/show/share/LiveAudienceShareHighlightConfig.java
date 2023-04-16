package com.kuaishou.live.core.show.share.LiveAudienceShareHighlightConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveAudienceShareHighlightConfig implements Serializable	// class@001007
{
    public int mInterActivityTargetCount;
    public int mMaxShowCountInOneDay;
    public int mMaxShowCountInOneStream;
    public boolean mNeedFollow;
    public long mNeedWatchDurationMs;
    public String mShareTitle;
    public static final long serialVersionUID = 0x49c8bcaea9e06a33;

    public void LiveAudienceShareHighlightConfig(){
       super();
    }
}

package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareFeedConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveSquareFeedConfig implements Serializable	// class@00107e
{
    public int mBottomSlideGuideMaxShownCount;
    public boolean mDisableSquareSearchButton;
    public long mRecoSlideGuideIntervalMs;
    public long mRefreshLiveSquareMs;
    public long mSlideOnceGuideDelayShowMs;
    public long mSlideOnceGuideDurationMs;
    public long mSquareBannerShowMs;
    public long mSquareKeepCurrentTabDurationMs;
    public String mSquareSearchButtonScheme;
    public long mSquareSlideGuideIntervalMs;
    public static final long serialVersionUID = 0x57e3e4787afabb25;

    public void LiveConfigStartupResponse$LiveSquareFeedConfig(){
       super();
       this.mRefreshLiveSquareMs = 0xea60;
       this.mSquareBannerShowMs = 3000;
       this.mSquareSlideGuideIntervalMs = 0xf731400;
       this.mBottomSlideGuideMaxShownCount = 10;
       this.mSquareKeepCurrentTabDurationMs = 0x1b7740;
    }
}

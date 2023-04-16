package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig implements Serializable	// class@001080
{
    public long mDelayStartLoopNoticeMs;
    public boolean mDisableLiveSquareNoticeV2;
    public int mLiveSquareMaxNoticeShowCount;
    public long mLiveSquareNoticeFeedStayDurationMs;
    public long mLiveSquareNoticeShowIntervalMs;
    public long mNoticeEntranceShowDurationMs;
    public static final long serialVersionUID = 0x4e122f4ca29386ab;

    public void LiveConfigStartupResponse$LiveSquareSideBarNoticeConfig(){
       super();
       this.mLiveSquareMaxNoticeShowCount = 3;
       this.mLiveSquareNoticeShowIntervalMs = 0x927c0;
       this.mLiveSquareNoticeFeedStayDurationMs = 0x493e0;
       this.mDisableLiveSquareNoticeV2 = false;
       this.mDelayStartLoopNoticeMs = 0x927c0;
       this.mNoticeEntranceShowDurationMs = 5000;
    }
}

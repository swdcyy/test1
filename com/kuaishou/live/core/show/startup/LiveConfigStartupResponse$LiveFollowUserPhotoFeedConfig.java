package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig implements Serializable	// class@001041
{
    public boolean mDisableLiveFollow;
    public boolean mDisableLiveFollowUserPhotoFeedNotice;
    public long mFirstDelayTimeMs;
    public int mFollowUserSideBarRecoLiveNoticeCountByOneDay;
    public long mFollowUserSideBarRecoLiveNoticeShowIntervalByFollowNoticeMs;
    public long mFollowUserSideBarRecoLiveNoticeShowIntervalByRecoNoticeMs;
    public String mFollowUserSideBarRecoLiveNoticeText;
    public List mLiveChainImmediatelyRequestAnchorIdList;
    public long mLiveFollowUserPhotoFeedNoticeShowInterval;
    public static final long serialVersionUID = 0xdaa2a12d25625262;

    public void LiveConfigStartupResponse$LiveFollowUserPhotoFeedConfig(){
       super();
       this.mFirstDelayTimeMs = 5000;
       this.mLiveFollowUserPhotoFeedNoticeShowInterval = 0x493e0;
       this.mFollowUserSideBarRecoLiveNoticeShowIntervalByFollowNoticeMs = 0x493e0;
       this.mFollowUserSideBarRecoLiveNoticeShowIntervalByRecoNoticeMs = 0x493e0;
       this.mFollowUserSideBarRecoLiveNoticeCountByOneDay = 1;
       this.mFollowUserSideBarRecoLiveNoticeText = "";
    }
}

package com.kuaishou.live.lite.userstatus.LiveLiteUserStatusResponse;
import java.io.Serializable;
import java.lang.Object;

public class LiveLiteUserStatusResponse implements Serializable	// class@000b8f
{
    public long mAuthorInfoAreaExpandInfoShowMS;
    public long mAuthorInformationAreaFollowGuideDelayMs;
    public boolean mDisableLike;
    public LiveUserStatusResponse$LiveDisplayAnonymousInfo mDisplayAnonymousInfoConfig;
    public boolean mEnableAuthorInformationAreaFollowGuide;
    public LiveUserStatusResponse$ForbidCommentStatus mForbidCommentStatus;
    public boolean mGemsCollectorNeedAnonymous;
    public boolean mIsAnonymousLive;
    public boolean mIsKoi;
    public long mLiteRankHorseRaceTimes;
    public long mLiteRankMinShowMS;
    public LiteRoomVipConfig mLiteRoomVipConfig;
    public List mLiveCommentNoticeInfoList;
    public LiveLiteUserStatusResponse$LiveCommentStyle mLiveCommentStyle;
    public LiveCommentsFoldMessageConfig mLiveCommentsFoldMessageConfig;
    public LiveFansGroupInfo mLiveFansGroupInfo;
    public String mSpecifiedSubBiz;
    public static final long serialVersionUID = 0x679dd148f93fee64;

    public void LiveLiteUserStatusResponse(){
       super();
       this.mIsKoi = false;
    }
}

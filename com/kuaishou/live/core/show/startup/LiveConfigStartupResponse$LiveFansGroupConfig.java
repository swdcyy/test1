package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFansGroupConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import lnc.a1;

public class LiveConfigStartupResponse$LiveFansGroupConfig implements Serializable	// class@00103a
{
    public boolean mEnableDecreaseUnActiveDaysLimit;
    public String mFansGroupIntroductionPageH5Url;
    public String mJoinButtonText;
    public int mJoinCoinCount;
    public LiveConfigStartupResponse$LiveFansGroupFlashJoinConfig mLiveFansGroupFlashJoinConfig;
    public LiveConfigStartupResponse$LiveFansGroupSharePanelInfo mLiveFansGroupSharePanelInfo;
    public long mPullStatusMaxDelayIntervalInMs;
    public long mPullStatusRetryIntervalInMs;
    public int mShareBonus;
    public static final long serialVersionUID = 0x6ee016d84ec9bcf8;

    public void LiveConfigStartupResponse$LiveFansGroupConfig(){
       super();
       this.mFansGroupIntroductionPageH5Url = "https://app.m.kuaishou.com/live/fans-group/instruction";
       this.mJoinButtonText = a1.q(0x7f102154, 6);
       this.mJoinCoinCount = 6;
       this.mPullStatusRetryIntervalInMs = 0x2710;
       this.mPullStatusMaxDelayIntervalInMs = 0x2710;
    }
}

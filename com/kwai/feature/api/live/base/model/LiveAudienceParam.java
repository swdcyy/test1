package com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams;
import com.yxcorp.gifshow.entity.QPreInfo;

public class LiveAudienceParam	// class@000f7f
{
    public String mFormerH5Page;
    public String mFormerH5PageSource;
    public long mFragmentStartTimeMs;
    public int mIndexInAdapter;
    public String mInternalJumpSchema;
    public boolean mIsAutoPlay;
    public boolean mIsFromShare;
    public boolean mIsPlayViewReused;
    public LiveAdNeoMerchantParam mLiveAdNeoMerchantParam;
    public LiveBusinessParams mLiveBusinessParams;
    public LiveDiversionReportParam mLiveDiversionReportParam;
    public LiveFlowDiversionRepostParams mLiveFlowDiversionRepostParams;
    public int mLivePlayFragmentId;
    public int mLivePlayerReuseType;
    public String mLivePrivateAuthToken;
    public LivePrivateAutoCheckParams mLivePrivateAutoCheckParams;
    public int mLiveSlideSourceModeType;
    public int mLiveSourceType;
    public String mLiveSourceUrl;
    public int mLiveStartPlayEvent;
    public int mLiveStreamContentType;
    public String mLiveStreamId;
    public int mLiveStreamStartPlaySourceForEnterPrompt;
    public MerchantAudienceParams mMerchantAudienceParams;
    public boolean mNeedApiDowngrade;
    public LivePassThruParamExtraInfo mPassThruParamExtraInfo;
    public LiveStreamFeed mPhoto;
    public QPreInfo mPreInfo;
    public String mPushArrowRedPacketId;
    public String mRecommendReason;
    public long mRequestTvcEndTimeMs;
    public long mRequestTvcStartTimeMs;
    public SearchParams mSearchParams;
    public String mServerExpTag;
    public boolean mShouldAttachFragmentForLivePrivate;
    public boolean mShouldForceCreateLivePlayer;
    public long mStartActivityTime;
    public long mStartRenderTimeMs;
    public long mTvcRequestType;
    public long mTvcShowEndTimeMs;
    public long mTvcShowStartTimeMs;
    public String mUserStatusRequestExtraInfo;
    public static String LIVE_AUDIENCE_PARAM_KEY = "LIVE_AUDIENCE_PARAM";

    public void LiveAudienceParam(){
       super();
       this.mLivePlayerReuseType = 0;
       this.mLiveStartPlayEvent = 0;
       this.mTvcRequestType = -1;
    }
    public LiveFlowDiversionRepostParams getLiveFlowDiversionRepostParams(){
       return this.mLiveFlowDiversionRepostParams;
    }
    public long getRawStartActivityTime(){
       return this.mStartActivityTime;
    }
    public long getStartActivityTime(){
       LiveAudienceParam tmTvcShowEnd = this.mTvcShowEndTimeMs;
       if (tmTvcShowEnd > 0) {
       }else {
          tmTvcShowEnd = this.mStartActivityTime;
       }
       return tmTvcShowEnd;
    }
    public void setLiveFlowDiversionRepostParams(LiveFlowDiversionRepostParams p0){
       this.mLiveFlowDiversionRepostParams = p0;
    }
    public void setLiveStartPlayEvent(int p0){
       this.mLiveStartPlayEvent = p0;
    }
    public void setPreInfo(QPreInfo p0){
       this.mPreInfo = p0;
    }
    public void setRequestTvcEndTimeMs(long p0){
       this.mRequestTvcEndTimeMs = p0;
    }
    public void setRequestTvcStartTimeMs(long p0){
       this.mRequestTvcStartTimeMs = p0;
    }
    public void setStartActivityTime(long p0){
       this.mStartActivityTime = p0;
    }
    public void setTvcRequestType(int p0){
       this.mTvcRequestType = (long)p0;
    }
    public void setTvcShowEndTimeMs(long p0){
       this.mTvcShowEndTimeMs = p0;
    }
    public void setTvcShowStartTimeMs(long p0){
       this.mTvcShowStartTimeMs = p0;
    }
}

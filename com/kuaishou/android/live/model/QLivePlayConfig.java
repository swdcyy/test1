package com.kuaishou.android.live.model.QLivePlayConfig;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashSet;
import com.kuaishou.android.live.model.Race;
import java.util.ArrayList;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.List;
import java.lang.Number;
import java.util.Collection;
import ekd.q;

public class QLivePlayConfig implements Serializable	// class@00082b
{
    public Set DEFAULT_LIST_SET;
    public String mAttach;
    public int mAuthReason;
    public long mCourseId;
    public int mCourseTrialRemainDuration;
    public String mCustomizedCoverUrl;
    public boolean mDisableLiveStreamNewPayStyle;
    public String mDisplayLikeCount;
    public String mDisplayWatchingCount;
    public boolean mEnableNextRetry;
    public boolean mExpectFreeTraffic;
    public QLivePlayExtraInfo mExtraInfo;
    public String mGRPRTitle;
    public long mGiftComboBuffSeconds;
    public boolean mIsCdnOverload;
    public boolean mIsFromLiveMate;
    public boolean mIsGzoneCompetitionLive;
    public boolean mIsLiveShowMultiTab;
    public boolean mIsShopLive;
    public boolean mIsSpecialAccount;
    public boolean mLandscape;
    public long mLessonId;
    public long mLikeCount;
    public String mLiteAccumulatedWatchCount;
    public String mLiteDisplayWatchingCount;
    public String mLiveAccumulatedWatchCount;
    public List mLiveAdaptiveManifests;
    public QLivePlayConfig$Announcement mLiveAnnouncement;
    public LiveAudiencePaidShowConfig mLiveAudiencePaidShowConfig;
    public List mLivePolicy;
    public LiveRestartPlayerConfig mLiveRestartPlayerConfig;
    public String mLiveStreamId;
    public String mLocale;
    public List mMultiResolutionPlayUrls;
    public int mNextRetryIntervalSecond;
    public long mNoticeDisplayDuration;
    public List mNoticeList;
    public int mPatternType;
    public String mPgcRelayRoomJumpLink;
    public List mPlayUrls;
    public Race mRace;
    public String mReplaceFeedMockUserName;
    public long mRequestCostTime;
    public String mServerExpTag;
    public boolean mShouldUseHardwareDecoding;
    public List mSocketHostPorts;
    public QLivePlayConfig$Stat mStat;
    public int mStreamType;
    public List mSubStartPlayBizList;
    public int mSubType;
    public boolean mUseMerchantAudienceApi;
    public long mWatchingCount;
    public QLivePlayConfig$WatermarkInfo mWatermarkInfo;
    public List mWebRTCAdaptiveManifests;
    public static final long serialVersionUID = 0xde6eba2b9a2487e9;

    public void QLivePlayConfig(){
       super();
       this.DEFAULT_LIST_SET = new HashSet();
       this.mRace = new Race();
       this.mSocketHostPorts = this.generateDefaultList();
       this.mPlayUrls = this.generateDefaultList();
       this.mLiveAdaptiveManifests = new ArrayList();
       this.mWebRTCAdaptiveManifests = new ArrayList();
       this.mMultiResolutionPlayUrls = this.generateDefaultList();
       this.mGiftComboBuffSeconds = 60;
       this.mAttach = "";
       this.mNoticeList = this.generateDefaultList();
       this.mStreamType = 1;
       this.mNoticeDisplayDuration = 5000;
       this.mDisableLiveStreamNewPayStyle = true;
       this.mStat = new QLivePlayConfig$Stat();
       this.mCourseTrialRemainDuration = -1;
       this.mCourseId = -1;
       this.mLessonId = -1;
       this.mAuthReason = -1;
       this.mEnableNextRetry = true;
    }
    public final ArrayList generateDefaultList(){
       ArrayList obj = PatchProxy.apply(null, this, QLivePlayConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       this.DEFAULT_LIST_SET.add(obj);
       return obj;
    }
    public long getGiftComboBuffSeconds(){
       return this.mGiftComboBuffSeconds;
    }
    public Race getHorseRace(){
       return this.mRace;
    }
    public String getLiveStreamId(){
       return this.mLiveStreamId;
    }
    public String getLocale(){
       return this.mLocale;
    }
    public List getMultiResolutionPlayUrls(){
       return this.mMultiResolutionPlayUrls;
    }
    public List getPlayUrls(){
       return this.mPlayUrls;
    }
    public int getRacePolicyVersion(){
       Object obj = PatchProxy.apply(null, this, QLivePlayConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!q.f(this.getHorseRace().mRounds)) {
          return 2;
       }
       return 1;
    }
    public List getSocketHostPorts(){
       return this.mSocketHostPorts;
    }
    public boolean isGamePatternType(){
       boolean b = (this.mPatternType == 2)? true: false;
       return b;
    }
    public boolean isLandscape(){
       return this.mLandscape;
    }
    public void setLocale(String p0){
       this.mLocale = p0;
    }
    public void setSocketHostPorts(List p0){
       this.mSocketHostPorts = p0;
    }
}

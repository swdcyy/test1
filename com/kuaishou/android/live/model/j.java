package com.kuaishou.android.live.model.j;
import java.lang.Object;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Set;
import java.util.Collection;
import com.kuaishou.android.live.model.Race;
import ei5.c;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import ekd.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class j	// class@000847
{

    public void j(){
       super();
    }
    public static void a(QLivePlayConfig p0,QLivePlayConfig p1){
       QLivePlayConfig mRace;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, j.class, "1")) {
          return;
       }
       if (p1.getSocketHostPorts() != null && !p1.DEFAULT_LIST_SET.contains(p1.mSocketHostPorts)) {
          p0.mSocketHostPorts.clear();
          p0.mSocketHostPorts.addAll(p1.getSocketHostPorts());
       }
       int i = 0;
       if (j.b(p1.mRace)) {
          Object[] objArray = new Object[i];
          c.C().w("PlayConfigExt", "update race, to.mRace: "+p0.mRace, objArray);
          objArray = new Object[i];
          c.C().w("PlayConfigExt", "update race, from.mRace: "+p1.mRace, objArray);
          p0.mRace.mRounds.clear();
          mRace = p0.mRace;
          QLivePlayConfig mRace1 = p1.mRace;
          mRace.mStartTime = mRace1.mStartTime;
          mRace.mCost = mRace1.mCost;
          mRace.mSuccess = mRace1.mSuccess;
          mRace.mTag = mRace1.mTag;
          mRace.mRounds.addAll(mRace1.mRounds);
       }
       mRace = p1.mLiveStreamId;
       if (mRace != null) {
          p0.mLiveStreamId = mRace;
       }
       mRace = p1.mLocale;
       if (mRace != null) {
          p0.mLocale = mRace;
       }
       mRace = p1.mPlayUrls;
       if (mRace != null && !p1.DEFAULT_LIST_SET.contains(mRace)) {
          p0.mPlayUrls.clear();
          p0.mPlayUrls.addAll(p1.mPlayUrls);
       }
       if (p1.mLiveAdaptiveManifests != null) {
          p0.mLiveAdaptiveManifests.clear();
          p0.mLiveAdaptiveManifests.addAll(p1.mLiveAdaptiveManifests);
       }
       if (p1.mWebRTCAdaptiveManifests != null) {
          p0.mWebRTCAdaptiveManifests.clear();
          p0.mWebRTCAdaptiveManifests.addAll(p1.mWebRTCAdaptiveManifests);
       }
       p0.mLiveRestartPlayerConfig = p1.mLiveRestartPlayerConfig;
       p0.mLandscape = p1.mLandscape;
       p0.mRequestCostTime = p1.mRequestCostTime;
       p0.mGiftComboBuffSeconds = p1.mGiftComboBuffSeconds;
       Object[] objArray1 = new Object[i];
       c.C().w("PlayConfigExt", "update attach, to.mAttach: "+p0.mAttach+", from.mAttach: "+p1.mAttach, objArray1);
       p0.mAttach = p1.mAttach;
       p0.mWatchingCount = p1.mWatchingCount;
       p0.mLikeCount = p1.mLikeCount;
       p0.mDisplayWatchingCount = p1.mDisplayWatchingCount;
       mRace = p1.mLiveAccumulatedWatchCount;
       if (mRace != null) {
          p0.mLiveAccumulatedWatchCount = mRace;
       }
       mRace = p1.mDisplayLikeCount;
       if (mRace != null) {
          p0.mDisplayLikeCount = mRace;
       }
       mRace = p1.mNoticeList;
       if (mRace != null && !p1.DEFAULT_LIST_SET.contains(mRace)) {
          p0.mNoticeList = p1.mNoticeList;
       }
       p0.mStreamType = p1.mStreamType;
       mRace = p1.mMultiResolutionPlayUrls;
       if (mRace != null && !p1.DEFAULT_LIST_SET.contains(mRace)) {
          p0.mMultiResolutionPlayUrls = p1.mMultiResolutionPlayUrls;
       }
       p0.mNoticeDisplayDuration = p1.mNoticeDisplayDuration;
       p0.mDisableLiveStreamNewPayStyle = p1.mDisableLiveStreamNewPayStyle;
       p0.mStat.mClientId = p1.mStat.mClientId;
       p0.mCourseTrialRemainDuration = p1.mCourseTrialRemainDuration;
       p0.mCourseId = p1.mCourseId;
       p0.mLessonId = p1.mLessonId;
       p0.mShouldUseHardwareDecoding = p1.mShouldUseHardwareDecoding;
       p0.mAuthReason = p1.mAuthReason;
       p0.mExpectFreeTraffic = p1.mExpectFreeTraffic;
       mRace = p1.mLivePolicy;
       if (mRace != null) {
          p0.mLivePolicy = mRace;
       }
       mRace = p1.mLiveAnnouncement;
       if (mRace != null) {
          p0.mLiveAnnouncement = mRace;
       }
       mRace = p1.mExtraInfo;
       if (mRace != null) {
          p0.mExtraInfo = mRace;
       }
       mRace = p1.mServerExpTag;
       if (mRace != null) {
          p0.mServerExpTag = mRace;
       }
       p0.mPatternType = p1.mPatternType;
       p0.mIsCdnOverload = p1.mIsCdnOverload;
       p0.mUseMerchantAudienceApi = p1.mUseMerchantAudienceApi;
       p0.mIsSpecialAccount = p1.mIsSpecialAccount;
       mRace = p1.mLiveAudiencePaidShowConfig;
       if (mRace != null) {
          p0.mLiveAudiencePaidShowConfig = mRace;
       }
       p0.mIsShopLive = p1.mIsShopLive;
       mRace = p1.mWatermarkInfo;
       if (mRace != null) {
          p0.mWatermarkInfo = mRace;
       }
       p0.mReplaceFeedMockUserName = p1.mReplaceFeedMockUserName;
       p0.mIsGzoneCompetitionLive = p1.mIsGzoneCompetitionLive;
       p0.mIsFromLiveMate = p1.mIsFromLiveMate;
       p0.mSubType = p1.mSubType;
       p0.mIsLiveShowMultiTab = p1.mIsLiveShowMultiTab;
       p0.mPgcRelayRoomJumpLink = p1.mPgcRelayRoomJumpLink;
       mRace = p1.mGRPRTitle;
       if (mRace != null) {
          p0.mGRPRTitle = mRace;
       }
       if (!q.f(p1.mSubStartPlayBizList)) {
          p0.mSubStartPlayBizList = p1.mSubStartPlayBizList;
       }
       p0.mNextRetryIntervalSecond = p1.mNextRetryIntervalSecond;
       p0.mEnableNextRetry = p1.mEnableNextRetry;
       p0.mCustomizedCoverUrl = p1.mCustomizedCoverUrl;
       return;
    }
    public static boolean b(Race p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.mRounds.isEmpty())? true: false;
       return b;
    }
}

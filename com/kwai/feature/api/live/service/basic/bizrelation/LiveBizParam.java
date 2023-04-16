package com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import java.util.UUID;
import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import com.yxcorp.utility.SystemUtil;
import java.lang.IllegalArgumentException;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import java.util.List;
import java.util.Map;
import java.lang.Boolean;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;

public final class LiveBizParam	// class@001003
{
    public LiveAdNeoParam mAdNeoPendantParam;
    public long mBackEntranceDisplaySumDurationMs;
    public boolean mDisableLoadMore;
    public boolean mDisableNegativeFeedback;
    public boolean mDisablePullRefresh;
    public boolean mDisableSyncFeedPosition;
    public boolean mEnableUnFollowRemove;
    public int mEnterPlayerReuseType;
    public LivePassThruParamExtraInfo mExtraInfo;
    public boolean mHasClickReplacePageList;
    public boolean mHasExecutedRouter;
    public boolean mHasShownLiveSlideGuide;
    public boolean mHasShownLiveSourceBackEntranceAnimation;
    public boolean mHasShownMobileNetworkAlert;
    public boolean mHasShownSlideRecommendMask;
    public final Set mInterceptAutoJumpFeedSet;
    public Map mInternalJumpUrlMap;
    public boolean mIsActivityClosedBySwipeOut;
    public boolean mIsAutoEnter;
    public boolean mIsDifferentStream;
    public boolean mIsFromPush;
    public boolean mIsFromShare;
    public boolean mIsLiveSlide;
    public boolean mIsLiveSlideSquareFromScheme;
    public boolean mIsSharePlayer;
    public boolean mIsSoloLiveStream;
    public boolean mIsStatusBarSolid;
    public LiveActivityTaskInfo mLiveActivityTaskInfo;
    public String mLiveAggregationSessionId;
    public LiveAudienceParam mLiveAudienceParam;
    public int mLiveSourceType;
    public String mLiveSourceUrl;
    public LiveSquareReplaceModel mLiveSquareReplaceModel;
    public LiveStyleParams mLiveStyleParams;
    public NearbyGuideParam mNearbyGuideParam;
    public String mNoMoreText;
    public int mOpenPanelType;
    public Map mPageUrlParamMap;
    public int mPhotoDetailBizType;
    public int mPhotoDetailSource;
    public String mPlayerReuseToken;
    public QPhoto mPreviewOrLiteOriginPhoto;
    public int mReferLiveSourceType;
    public String mSeamlessEnterLiveStreamId;
    public int mSelectedIndex;
    public QPhoto mSelectedPhoto;
    public String mSelectedStreamId;
    public boolean mShouldShowNewFeedbackInProfilePage;
    public int mSlideGuideMode;
    public SlidePlayConfig mSlidePlayConfig;
    public LiveSlidePlayFeedFlowParam mSlidePlayFeedFlowParam;
    public String mSlidePlayId;
    public int mUnserializableBundleId;

    public void LiveBizParam(){
       super();
       this.mHasExecutedRouter = false;
       this.mHasShownLiveSlideGuide = false;
       this.mHasShownLiveSourceBackEntranceAnimation = false;
       this.mBackEntranceDisplaySumDurationMs = 0;
       this.mLiveStyleParams = new LiveStyleParams();
       this.mLiveAggregationSessionId = UUID.randomUUID().toString();
       this.mSlideGuideMode = 0;
       this.mPageUrlParamMap = new HashMap();
       this.mPhotoDetailSource = 0;
       this.mIsDifferentStream = true;
       this.mEnterPlayerReuseType = 0;
       this.mInternalJumpUrlMap = new HashMap();
       this.mNoMoreText = "";
       this.mInterceptAutoJumpFeedSet = new HashSet();
    }
    public static LiveBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBizParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("liveBizParam"));
    }
    public static LiveBizParam getBizParamFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBizParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelableExtra("liveBizParam"));
    }
    public void checkRequiredParam(){
       if (PatchProxy.applyVoid(null, this, LiveBizParam.class, "8")) {
          return;
       }
       if (!SystemUtil.I()) {
          return;
       }
       if (this.mLiveSourceType <= null) {
          throw new IllegalArgumentException("请添加sourceType参数");
       }
       LiveBizParam tmIsSoloLive = this.mIsSoloLiveStream;
       if (tmIsSoloLive != null && this.mSlideGuideMode != null) {
          throw new IllegalArgumentException("非上下滑直播间 无普通引导");
       }
       if (tmIsSoloLive != null) {
          LiveSlidePlayFeedFlowParam mPhotoList = this.mSlidePlayFeedFlowParam.mPhotoList;
          if (mPhotoList != null && mPhotoList.size() > 1) {
             throw new IllegalArgumentException("非上下滑直播间 photo不能大于1");
          }
       }
       return;
    }
    public String getInternalJumpUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveBizParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mInternalJumpUrlMap.get(p0);
    }
    public boolean isLocalForceShowGuide(){
       LiveBizParam obj = PatchProxy.apply(null, this, LiveBizParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNearbyGuideParam;
       boolean b = (obj != null && obj.isLocalForceShowGuide())? true: false;
       return b;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizParam.class, "3")) {
          return;
       }
       p0.putParcelable("liveBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveBizParam.class, "1")) {
          return;
       }
       p0.putExtra("liveBizParam", b.c(this));
       return;
    }
    public void setInternalJumpUrl(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBizParam.class, "6")) {
          return;
       }
       this.mInternalJumpUrlMap.put(p0, p1);
       return;
    }
}

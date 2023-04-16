package com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$a;

public class LiveSlidePlayEnterParam	// class@000fae
{
    public String mConstantLiveStreamId;
    public boolean mDisableLoadMore;
    public boolean mDisableNegativeFeedback;
    public boolean mDisablePullRefresh;
    public boolean mDisableSyncFeedPosition;
    public boolean mEnableSlidePositionChangeEvent;
    public boolean mEnableUnFollowRemove;
    public LivePassThruParamExtraInfo mExtraInfo;
    public String mFollowStackPath;
    public boolean mIsAutoEnter;
    public boolean mIsSoloLiveStream;
    public LiveAudienceParam mLiveAudienceParam;
    public Map mLiveInternalJumpUrlMap;
    public int mLiveSlidePlaySource;
    public int mLiveSourceType;
    public String mLiveSourceUrl;
    public String mLiveStreamId;
    public LiveStyleParams mLiveStyleParams;
    public String mNoMoreText;
    public int mOpenPanelType;
    public Map mPageUrlParamMap;
    public String mPath;
    public String mPcursor;
    public List mPhotoList;
    public String mPlayerReuseToken;
    public QPhoto mPreviewOrLiteOriginPhoto;
    public String mRecoLiveStreamId;
    public int mSelectedIndex;
    public QPhoto mSelectedPhoto;
    public String mSelectedStreamId;
    public boolean mShouldShowNewFeedbackInProfilePage;
    public int mSlideEnterAnimRes;
    public int mSlideGuideMode;
    public String mSlidePlayId;
    public int mUnserializableBundleId;

    public void LiveSlidePlayEnterParam(){
       super();
       this.mLiveStyleParams = new LiveStyleParams();
       this.mNoMoreText = "";
    }
    public void LiveSlidePlayEnterParam(LiveSlidePlayEnterParam$a p0){
       super();
    }
}

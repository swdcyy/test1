package com.kuaishou.android.live.model.LiveStreamModel;
import mkd.a;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kuaishou.android.live.model.LiveStreamModel$Live;
import java.lang.Enum;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.Iterator;
import yl8.b;

public class LiveStreamModel extends DefaultObservableAndSyncable implements a	// class@000823
{
    public boolean isInCommentLottery;
    public int mAdminAuthorDutyType;
    public String mAudienceCount;
    public float mAutoPlayWeight;
    public BottomEntryInfoModel mBottomEntryInfo;
    public String mCaption;
    public String mChainDisplayName;
    public boolean mChatStyle;
    public CDNUrl[] mCnyLowDeviceLiveCoverUrls;
    public LiveSimpleCoverReasonTag mCoverReasonTag;
    public List mCoverWidgets;
    public boolean mDisableComment;
    public boolean mDisableLivePreview;
    public String mDisplayAudienceCount;
    public List mDisplayDistrictRank;
    public String mDisplayLikeCount;
    public int mDisplayStyle;
    public String mDisplayText;
    public String mDisplayTotalStartPlayCount;
    public List mDisplayUsers;
    public String mDistrictRank;
    public boolean mEnableAutoPlay;
    public boolean mEnableAutoPlayVoice;
    public boolean mEnableAutoPlayWeight;
    public boolean mEnableCoverAdaptive;
    public boolean mEnableLiveFeedRerank;
    public boolean mEnableNewPreviewBottomCard;
    public LiveFeedbackSwitchModel mFeedBackSwitchInfo;
    public long mFeedDispatchTimestampMs;
    public LiveFeedFunctionShieldSwitchInfo mFunctionShieldSwitchInfo;
    public boolean mHasBet;
    public String mHotValue;
    public boolean mIsBulletOff;
    public boolean mIsFromGroupChat;
    public boolean mIsGRPRCustomized;
    public boolean mIsMusicFeed;
    public boolean mIsMusicStationAnimation;
    public boolean mIsMusicStationPK;
    public boolean mIsMusicStationRedPack;
    public boolean mIsPlayLiving;
    public String mLikeCount;
    public LiveStreamModel$LiteSideBarParam mLiteSideBarParam;
    public LiveAudienceCustomSkinConfig mLiveAudienceCustomSkinConfig;
    public LiveAudienceSkinActivityConfig mLiveAudienceSkinActivityConfig;
    public int mLiveBizType;
    public LiveCoverAnnexWrapper mLiveCoverAnnex;
    public LiveFeedCoverIcons mLiveCoverIconInfo;
    public LiveCoverRightTopDecorateInfoModel mLiveCoverRightTopDecorateInfo;
    public LiveCoverTagModel mLiveCoverTagModel;
    public long mLiveCoverWidgetUpdateIntervalMills;
    public int mLiveEndAutoJumpDelaySeconds;
    public int mLiveEndAutoJumpType;
    public LiveInfo mLiveInfo;
    public int mLiveLiteActivityFlag;
    public String mLiveLogPassthroughParams;
    public int mLiveModel;
    public String mLivePaidShowId;
    public LiveStreamFeedPlusNearByInfo mLivePlusNearByInfo;
    public LivePreviewModel mLivePreviewModel;
    public LiveStreamFeedPrivateInfo mLivePrivateInfo;
    public int mLivePrivateType;
    public LiveSimpleSkinConfig mLiveSimpleSkinConfig;
    public LiveSquareLayoutModel mLiveSquareLayoutModel;
    public LiveSquareParams mLiveSquareParams;
    public boolean mLiveSquareShouldShowHorseRaceTitle;
    public String mLiveStreamId;
    public int mLiveTrafficType;
    public int mMusicStationDescriptionType;
    public String mMusicStationLiveDescription;
    public boolean mNeedToRefreshCoverWidget;
    public int mPlcEntryAdFlag;
    public String mPlcEntryStyleData;
    public PlcEntryStyleInfo mPlcEntryStyleInfo;
    public List mPreviewCaptionRichTexts;
    public long mPreviewLiveEndCountDownSeconds;
    public String mRealTimeCoverUrl;
    public String mRecoRerankContext;
    public RecruitCardInfoModel mRecruitCardInfoModel;
    public LiveStreamFeedRecruitCardInfoV2 mRecruitCardInfoV2;
    public boolean mRedPack;
    public long mRedPackEndTime;
    public int mRerankStatus;
    public boolean mShowAccompanyIcon;
    public boolean mShowFollowGuideInfo;
    public ArrayList mSimpleAuthorMarks;
    public int mSimpleLiveAutoStartPlayDelayMs;
    public LiveStreamModel$SpecialLive mSpecialLive;
    public int mTvcType;
    public LiveStreamModel$UserCountConfig mUserCountConfig;
    public List mVerticalTypes;
    public int mVoicePartySubType;
    public String mWatchingCount;
    public static final long serialVersionUID = 0x84b4fb8498949c1;

    public void LiveStreamModel(){
       super();
       this.mLiveStreamId = "";
       this.mCaption = "";
       this.mLiveCoverWidgetUpdateIntervalMills = 0xea60;
       this.mLiveBizType = LiveStreamModel$Live.FREE_LIVE.ordinal();
       this.mCoverWidgets = new ArrayList();
       this.mAutoPlayWeight = 0xbf800000;
       this.mSimpleLiveAutoStartPlayDelayMs = -1;
       this.mShowFollowGuideInfo = false;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveStreamModel.class, "2")) {
          return;
       }
       if (!this.mAutoPlayWeight - 0xbf800000) {
          if (this.mEnableAutoPlay != null) {
             this.mAutoPlayWeight = (float)Math.random();
          }
       }else {
          this.mEnableAutoPlayWeight = true;
       }
       return;
    }
    public String getBizId(){
       return this.mLiveStreamId;
    }
    public LiveCoverWidgetModel getLiveCoverWidgetModel(int p0){
       LiveCoverWidgetModel liveCoverWid;
       if (PatchProxy.isSupport(LiveStreamModel.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveStreamModel.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(this.mCoverWidgets)) {
          return null;
       }else if(!p0){
          return this.mCoverWidgets.get(0);
       }else {
          Iterator iterator = this.mCoverWidgets.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return this.mCoverWidgets.get(0);
             }
             liveCoverWid = iterator.next();
             if (liveCoverWid.mPageType == p0) {
                break ;
             }
          }
          return liveCoverWid;
       }
    }
    public void sync(LiveStreamModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveStreamModel.class, "3")) {
          return;
       }
       this.mDisplayAudienceCount = p0.mDisplayAudienceCount;
       this.mDisplayLikeCount = p0.mDisplayLikeCount;
       this.notifyChanged();
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
}

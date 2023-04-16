package com.yxcorp.gifshow.nasa.NasaSlideParam;
import java.util.ArrayList;
import com.yxcorp.gifshow.nasa.NasaSlideParam$a;
import java.lang.Object;
import lnc.a1;
import java.lang.Boolean;
import android.content.Intent;
import com.yxcorp.gifshow.nasa.scheme.action.NasaSlideSchemeAction;
import drb.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lda.z;
import com.yxcorp.gifshow.nasa.NasaSlideParam$b;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;

public class NasaSlideParam	// class@0020c5
{
    public final int BOTTOM_BAR_HEIGHT;
    public final boolean mAllowShowFloatWidget;
    public final String mAssociatedTagName;
    public final String mAutoOpenPlcPhotoId;
    public final long mBizStartTs;
    public final boolean mCancelSlidePositionRefer;
    public final boolean mDisableAllSmoothSwipeBack;
    public final boolean mDisableShowBottomTips;
    public final boolean mDisableShowTopTips;
    public final boolean mDisableSidebarExp;
    public boolean mEnableAutoNext;
    public final boolean mEnableCameraButton;
    public final boolean mEnableCaptionOpt;
    public final boolean mEnableCoveredRegion;
    public final boolean mEnableDecSearchCollectionSecPage;
    public final boolean mEnableDecSearchKboxSlideSecPage;
    public boolean mEnableDomino;
    public final boolean mEnableDynamicLoop;
    public final boolean mEnableExitShrink;
    public final boolean mEnableFollowNewLive;
    public final boolean mEnableFollowSeamlessEnter;
    public final boolean mEnableFollowShowQuickComment;
    public final boolean mEnableFollowSlidePopupGuide;
    public final boolean mEnableFollowSlidePymiV2;
    public final boolean mEnableFollowSlideRecoFeedRecord;
    public final boolean mEnableIntensifyFollow;
    public final boolean mEnableLiveSlidePlay;
    public final boolean mEnableMilanoPullToRefresh;
    public final boolean mEnableMusicRadioBackPlay;
    public final boolean mEnableNearbySlidePopupGuide;
    public final boolean mEnableNebulaFollowSlideAutoNextPopupGuide;
    public final boolean mEnableNegativeFeedbackUnFollow;
    public final boolean mEnablePlayFriendClapAnim;
    public boolean mEnableReceiveLikeComment;
    public final boolean mEnableReplaceFeedCover;
    public final boolean mEnableSearchButton;
    public final boolean mEnableShareEntranceOpt;
    public final boolean mEnableShowBottomComponent;
    public boolean mEnableShowMarque;
    public final boolean mEnableShowProgressBar;
    public final boolean mEnableShowSmallWindow;
    public final boolean mEnableSimpleLiveSlide;
    public final boolean mEnableSlideRecord;
    public final boolean mEnableSwipeDownBack;
    public final String mEnterDetailPhotoId;
    public final String mEntrySource;
    public final boolean mForceDisablePullToRefresh;
    public final String mFromPageName;
    public final boolean mFromPoiOptimizaEntrance;
    public final boolean mFromTube;
    public boolean mFromViewerKwaiLink;
    public final CommonFeedSlideParams mHomeCommonFeedSlideParams;
    public final boolean mIsDifferentStream;
    public final boolean mIsEnabledSlideBarGuide;
    public final boolean mIsFollowAcquaintanceSlideDetail;
    public final boolean mIsFollowNasaDetail;
    public final boolean mIsFollowPushSlideDetail;
    public final boolean mIsFollowSlideNasaDetail;
    public final boolean mIsFollowStaggerDetail;
    public final boolean mIsFriendsNasaDetail;
    public final boolean mIsFriendsUpdatedNasaDetail;
    public final boolean mIsFromPhotoSlideSchema;
    public final boolean mIsHomeCommonSlideDetail;
    public final boolean mIsHotSpotAnchorRedirect;
    public final boolean mIsHotSpotNasaDetail;
    public final boolean mIsMessageNotify;
    public final boolean mIsMusicRadio;
    public final boolean mIsNewsSlideNasaDetail;
    public final boolean mIsPayCourseDetail;
    public boolean mIsRecoGuideHasShowed;
    public final boolean mIsSchoolSquare;
    public final boolean mIsShowFollowLabel;
    public final boolean mIsUserStatusNasaDetail;
    public final MessageSlideParam mMessageSlideParam;
    public final boolean mModifyOriginDataAlso;
    public final NasaCollectionSlideParam mNasaCollectionSlideParam;
    public final NasaSlideSerialParam mNasaSlideSerialParam;
    public final NasaTagInfo mNasaTagInfo;
    public final NearbyGuideParam mNearbyGuideParam;
    public final NearbyParam mNearbyParam;
    public String mNoMoreText;
    public final String mPage;
    public final Integer mPhotoCount;
    public boolean mPostFeedReadEvent;
    public final int mProfileTabId;
    public final String mProfileUserId;
    public final NasaSlideSchemeAction mSchemeAction;
    public boolean mShowViewerTab;
    public final boolean mSidebarFeedLiveTopResident;
    public final String mSourcePage;
    public final String mTubeInnerPageType;
    public final String mTubeJumpPhotoId;
    public final Long mTubeLastSeenPos;
    public final String mTubePageFrom;
    public final String mTubePageType;
    public final String mTubePhotoId;
    public String mViewedPhotoId;
    public static final NasaSlideParam NULL;
    public static final List sProcessors;

    static {
       NasaSlideParam.NULL = new NasaSlideParam();
       NasaSlideParam.sProcessors = new ArrayList();
       NasaSlideParam.doRegister();
    }
    public void NasaSlideParam(){
       super(new NasaSlideParam$a());
    }
    public void NasaSlideParam(NasaSlideParam$a p0){
       super();
       this.BOTTOM_BAR_HEIGHT = a1.d(0x7f070bf1);
       this.mPage = p0.a;
       this.mSourcePage = p0.b;
       this.mEntrySource = p0.c;
       this.mEnableDecSearchCollectionSecPage = p0.d;
       this.mEnableDecSearchKboxSlideSecPage = p0.e;
       this.mFromTube = p0.f;
       this.mTubePageType = p0.s0;
       this.mTubeInnerPageType = p0.t0;
       this.mTubePageFrom = p0.u0;
       this.mTubePhotoId = p0.v0;
       this.mTubeJumpPhotoId = p0.w0;
       this.mTubeLastSeenPos = p0.x0;
       this.mEnableSwipeDownBack = p0.g;
       this.mIsPayCourseDetail = p0.h;
       this.mIsFollowNasaDetail = p0.i;
       this.mEnableFollowNewLive = p0.l;
       this.mAllowShowFloatWidget = p0.k;
       this.mEnableFollowSeamlessEnter = p0.m;
       this.mEnableDynamicLoop = p0.n;
       this.mEnableFollowShowQuickComment = p0.o;
       this.mEnableFollowSlideRecoFeedRecord = p0.q;
       this.mEnterDetailPhotoId = p0.r;
       this.mIsFollowAcquaintanceSlideDetail = p0.s;
       this.mIsFollowPushSlideDetail = p0.t;
       this.mCancelSlidePositionRefer = p0.I;
       this.mIsFriendsNasaDetail = p0.u;
       this.mIsFriendsUpdatedNasaDetail = p0.v;
       this.mIsHomeCommonSlideDetail = p0.A;
       this.mIsNewsSlideNasaDetail = p0.w;
       this.mIsFollowSlideNasaDetail = p0.x;
       this.mIsHotSpotNasaDetail = p0.B;
       this.mIsHotSpotAnchorRedirect = p0.C;
       this.mIsUserStatusNasaDetail = p0.y;
       this.mIsFollowStaggerDetail = p0.z;
       this.mEnableFollowSlidePymiV2 = p0.D;
       this.mIsDifferentStream = p0.H;
       this.mEnableShowProgressBar = p0.M;
       this.mEnableShowSmallWindow = p0.F;
       this.mEnableLiveSlidePlay = p0.J;
       this.mDisableAllSmoothSwipeBack = p0.K;
       this.mEnableExitShrink = p0.L;
       this.mIsShowFollowLabel = p0.G;
       this.mEnableMilanoPullToRefresh = p0.O;
       this.mForceDisablePullToRefresh = p0.P;
       this.mIsMusicRadio = p0.Q;
       this.mIsSchoolSquare = p0.S;
       this.mEnableMusicRadioBackPlay = p0.R;
       this.mPhotoCount = p0.V;
       this.mNasaSlideSerialParam = p0.Y;
       this.mDisableSidebarExp = p0.a0;
       this.mEnableShowMarque = p0.e0;
       this.mModifyOriginDataAlso = p0.f0;
       this.mEnableSlideRecord = p0.g0;
       this.mEnableReceiveLikeComment = p0.h0;
       this.mFromPageName = p0.i0;
       this.mNasaTagInfo = p0.j0;
       NasaSlideParam$a k0 = p0.k0;
       boolean b = true;
       boolean b1 = (k0 != null)? k0.booleanValue(): true;
       this.mEnableSearchButton = b1;
       k0 = p0.l0;
       if (k0 != null) {
          b = k0.booleanValue();
       }
       this.mEnableCameraButton = b;
       this.mIsMessageNotify = p0.m0;
       this.mAssociatedTagName = p0.n0;
       this.mNearbyGuideParam = p0.Z;
       this.mNearbyParam = p0.d0;
       this.mMessageSlideParam = p0.K0;
       k0 = p0.c0;
       b1 = (k0 != null)? k0.booleanValue(): false;
       this.mSidebarFeedLiveTopResident = b1;
       this.mEnableNegativeFeedbackUnFollow = p0.o0;
       this.mDisableShowBottomTips = p0.p0;
       this.mDisableShowTopTips = p0.p;
       this.mEnableIntensifyFollow = p0.q0;
       this.mEnableReplaceFeedCover = p0.r0;
       this.mEnableFollowSlidePopupGuide = p0.G0;
       this.mEnableNearbySlidePopupGuide = p0.H0;
       this.mEnableNebulaFollowSlideAutoNextPopupGuide = p0.I0;
       this.mEnableAutoNext = p0.J0;
       this.mFromPoiOptimizaEntrance = p0.N;
       this.mEnableDomino = p0.y0;
       this.mIsFromPhotoSlideSchema = p0.j;
       this.mShowViewerTab = p0.z0;
       this.mFromViewerKwaiLink = p0.A0;
       this.mViewedPhotoId = p0.B0;
       k0 = p0.C0;
       if (k0 == null) {
          NasaSlideSchemeAction nasaSlideSch = a.a(null);
       }
       this.mSchemeAction = k0;
       this.mEnableShareEntranceOpt = p0.D0;
       this.mBizStartTs = p0.T;
       this.mEnableSimpleLiveSlide = p0.E0;
       this.mProfileUserId = p0.W;
       this.mProfileTabId = p0.X;
       this.mNoMoreText = p0.U;
       this.mEnablePlayFriendClapAnim = p0.F0;
       this.mIsEnabledSlideBarGuide = p0.b0;
       this.mNasaCollectionSlideParam = p0.L0;
       this.mEnableCoveredRegion = p0.M0;
       this.mHomeCommonFeedSlideParams = p0.N0;
       this.mPostFeedReadEvent = p0.O0;
       this.mAutoOpenPlcPhotoId = p0.Q0;
       this.mEnableShowBottomComponent = p0.R0;
       this.mEnableCaptionOpt = p0.P0;
       return;
    }
    public static void doRegister(){
       if (PatchProxy.applyVoid(null, null, NasaSlideParam.class, "43")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, z.class, "1")) {
          NasaSlideParam.registerProcessor(new z());
       }
       return;
    }
    public static void registerProcessor(NasaSlideParam$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NasaSlideParam.class, "42")) {
          return;
       }
       NasaSlideParam.sProcessors.add(p0);
       return;
    }
    public boolean enableDecSearchCollectionSecPage(){
       return this.mEnableDecSearchCollectionSecPage;
    }
    public boolean enableDecSearchKboxSlideSecPage(){
       return this.mEnableDecSearchKboxSlideSecPage;
    }
    public boolean enableDecSearchPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("SEARCH").equals(this.mSourcePage);
    }
    public boolean enablePlayFriendClapAnim(){
       return this.mEnablePlayFriendClapAnim;
    }
    public String getViewedPhotoId(){
       return this.mViewedPhotoId;
    }
    public boolean isChannelPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("CHANNEL").equals(this.mPage);
    }
    public boolean isCommonFeedSlidePage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("COMMON_FEED_SLIDE").equals(this.mSourcePage);
    }
    public boolean isDetailPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("DETAIL").equals(this.mPage);
    }
    public boolean isEnableDomino(){
       return this.mEnableDomino;
    }
    public boolean isEnableReceiveLikeComment(){
       return this.mEnableReceiveLikeComment;
    }
    public boolean isEnableShowMarque(){
       boolean b = (this.mEnableShowMarque != null || this.mIsUserStatusNasaDetail != null)? true: false;
       return b;
    }
    public boolean isFeaturedPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("FEATURED").equals(this.mPage);
    }
    public boolean isFollowNasaDetail(){
       return this.mIsFollowNasaDetail;
    }
    public boolean isFriendPage(){
       boolean b = (this.mIsFriendsNasaDetail != null && this.mIsFriendsUpdatedNasaDetail == null)? true: false;
       return b;
    }
    public boolean isFromChannel(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("CHANNEL").equals(this.mSourcePage);
    }
    public boolean isFromCollection(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("COLLECTION").equals(this.mSourcePage);
    }
    public boolean isFromCorona(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("CORONA").equals(this.mSourcePage);
    }
    public boolean isFromFollow(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("follow").equals(this.mSourcePage);
    }
    public boolean isFromFollowPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("follow").equals(this.mSourcePage);
    }
    public boolean isFromHistory(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("recentBrowse").equals(this.mSourcePage);
    }
    public boolean isFromHot(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("hot").equals(this.mSourcePage);
    }
    public boolean isFromIMMessage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("IM_MESSAGE").equals(this.mSourcePage);
    }
    public boolean isFromKuaiShanFriendTag(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("KS_FRIEND_TAG").equals(this.mSourcePage);
    }
    public boolean isFromLink(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("LINK").equals(this.mSourcePage);
    }
    public boolean isFromLocal(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("nearby").equals(this.mSourcePage);
    }
    public boolean isFromMagicFriendsUsing(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("MAGIC_FRIENDS_RECORD").equals(this.mSourcePage);
    }
    public boolean isFromMagicPush(){
       NasaSlideParam obj = PatchProxy.apply(null, this, NasaSlideParam.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNasaTagInfo;
       boolean b = (obj != null && obj.isFromPush())? true: false;
       return b;
    }
    public boolean isFromNearby(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!("nearby").equals(this.mSourcePage) && (("NEARBY_RANK_GATHER").equals(this.mSourcePage) || ("LOCAL_LIFESTYLE").equals(this.mSourcePage)))? true: false;
       return b;
    }
    public boolean isFromNewsEntrance(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NEWS_ENTRANCE").equals(this.mSourcePage);
    }
    public boolean isFromNoticeBox(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NOTICE_BOX").equals(this.mSourcePage);
    }
    public boolean isFromNotify(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("notify").equals(this.mSourcePage);
    }
    public boolean isFromPhotoSlideSchema(){
       return this.mIsFromPhotoSlideSchema;
    }
    public boolean isFromProfile(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("profile").equals(this.mSourcePage);
    }
    public boolean isFromProfileCollect(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isFromProfile() && this.mProfileTabId == 6)? true: false;
       return b;
    }
    public boolean isFromProfileCollection(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("c").equals(this.mSourcePage);
    }
    public boolean isFromProfileLike(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isFromProfile() && this.mProfileTabId == 3)? true: false;
       return b;
    }
    public boolean isFromProfileNews(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("PROFILE_NEWS").equals(this.mSourcePage);
    }
    public boolean isFromRNOffline(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("OFFLINE_CACHE").equals(this.mSourcePage);
    }
    public boolean isFromSchoolFindClassmates(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("SCHOOL_FIND_CLASSMATES").equals(this.mSourcePage);
    }
    public boolean isFromTag(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("tag").equals(this.mSourcePage);
    }
    public boolean isFromToCollectionCachesDialog(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("TO_CATCHE_FEEDS").equals(this.mSourcePage);
    }
    public boolean isFromTube(){
       return this.mFromTube;
    }
    public boolean isFromViewerKwaiLink(){
       return this.mFromViewerKwaiLink;
    }
    public boolean isFromWatchLater(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("WATCH_LATER").equals(this.mSourcePage);
    }
    public boolean isHomeFeatureStyle(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isFeaturedPage() || this.isNebulaFindPage())? true: false;
       return b;
    }
    public boolean isHomePage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.isHomeFeatureStyle() && (!this.isFriendPage() && (this.mIsNewsSlideNasaDetail == null && (this.mIsFollowSlideNasaDetail != null || this.mIsHomeCommonSlideDetail != null))))? true: false;
       return b;
    }
    public boolean isLocalForceShowGuide(){
       NasaSlideParam obj = PatchProxy.apply(null, this, NasaSlideParam.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNearbyGuideParam;
       boolean b = (obj != null && obj.isLocalForceShowGuide())? true: false;
       return b;
    }
    public boolean isLocalPoiPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("LOCAL_POI").equals(this.mSourcePage);
    }
    public boolean isNearbyPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("nearby").equals(this.mSourcePage);
    }
    public boolean isNebulaFindPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NEBULA_FIND").equals(this.mPage);
    }
    public boolean isRankGatherPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NEARBY_RANK_GATHER").equals(this.mSourcePage);
    }
    public boolean isSerialStyle(){
       boolean b = (this.mNasaSlideSerialParam != null)? true: false;
       return b;
    }
    public boolean isSidebarEnable(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mDisableSidebarExp == null && (!this.isChannelPage() && (!this.isRankGatherPage() && (!this.isFromTube() && (this.mIsUserStatusNasaDetail == null && (this.mIsPayCourseDetail == null && (!this.isFromIMMessage() && (!this.isFromNoticeBox() && (!this.isSerialStyle() && (!this.isTrendingPage() && this.mIsFriendsNasaDetail == null))))))))))? true: false;
       return b;
    }
    public boolean isTrendingPage(){
       Object obj = PatchProxy.apply(null, this, NasaSlideParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("TRENDING").equals(this.mPage);
    }
    public void setEnableShowMarque(boolean p0){
       this.mEnableShowMarque = p0;
    }
    public boolean shouldShowViewerTab(){
       return this.mShowViewerTab;
    }
}

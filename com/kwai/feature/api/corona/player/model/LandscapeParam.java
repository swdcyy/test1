package com.kwai.feature.api.corona.player.model.LandscapeParam;
import com.kwai.feature.api.corona.player.model.LandscapeParam$a;
import nsd.u;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashSet;
import com.kwai.feature.api.corona.player.model.PausePageState;
import com.yxcorp.gifshow.entity.QPhoto;
import android.graphics.Bitmap;
import com.kwai.feature.api.corona.player.model.CoronaVipState;
import bm5.c;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.corona.api.CoronaDetailFeedResponse;
import com.kwai.feature.api.corona.player.model.LandscapePlcClickEvent;
import com.kwai.feature.api.corona.player.model.LandscapeTubeSerialEvent;
import java.lang.Integer;
import com.kwai.feature.api.corona.player.model.ShareLogPageInfo;
import wx6.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;

public final class LandscapeParam	// class@000e23
{
    public long mChangeLandscapeBeginTime;
    public QPhoto mClickPhoto;
    public CoronaDetailFeedResponse mClusterSerialFeed;
    public String mCommercialCallback;
    public c mCoronaInstreamAdState;
    public CoronaVipState mCoronaVipState;
    public String mEnterLandscapeMode;
    public boolean mExitChangePhotoUploadVideoStateEvent;
    public ArrayList mFloatWindowPlayList;
    public String mFragmentTag;
    public String mFullTimeSessionId;
    public boolean mHasChangedPhoto;
    public boolean mImageDetailOpen;
    public boolean mJoySoundIsOpen;
    public int mLandVideoStateEventId;
    public boolean mManualSharePlayer;
    public LandscapePlcClickEvent mOutputPlcClickEvent;
    public LandscapeTubeSerialEvent mOutputTubeSerialEvent;
    public boolean mPanelIsShowed;
    public PausePageState mPausePageState;
    public long mPayCourseStartTime;
    public boolean mPayCourseTrailFinishShow;
    public QPhoto mPhoto;
    public boolean mPlayPositionTipShow;
    public Bitmap mPlayerCover;
    public float mPlayerSpeed;
    public int mRefUrlPackageId;
    public Integer mRenderType;
    public boolean mScreencastByLandscape;
    public ShareLogPageInfo mShareLogPageInfo;
    public c mSharedSession;
    public boolean mShowFloatWindowGuideDialog;
    public QPhoto mStartPhoto;
    public boolean mSyncContainerInflateSuccess;
    public boolean mSyncItemInflateSuccess;
    public boolean mSyncPlayState;
    public boolean mUseGravitySensor;
    public HashSet mVideoHasPlayedIdSet;
    public HashSet mVideoHasShowedFinRecoPanelIdSet;
    public Set mVideoPlayCompleteIdSet;
    public int startPhotoClickIndex;
    public static final LandscapeParam$a Companion;

    static {
       LandscapeParam.Companion = new LandscapeParam$a(null);
    }
    public void LandscapeParam(){
       super();
       this.startPhotoClickIndex = -1;
       this.mLandVideoStateEventId = -1;
       this.mRefUrlPackageId = -1;
       this.mFragmentTag = "";
       this.mFloatWindowPlayList = new ArrayList();
       this.mFullTimeSessionId = "";
       this.mVideoPlayCompleteIdSet = new LinkedHashSet();
       this.mVideoHasPlayedIdSet = new HashSet();
       this.mVideoHasShowedFinRecoPanelIdSet = new HashSet();
       this.mEnterLandscapeMode = "BUTTON";
       PausePageState pausePageSta = new PausePageState(false, null, null, 7, null);
       this.mPausePageState = v0;
       this.mCoronaVipState = new CoronaVipState(false, false, 3, null);
       c uoc = new c(null, false, false, false, 0, 31, null);
       this.mCoronaInstreamAdState = v0;
       this.mUseGravitySensor = true;
    }
    public void LandscapeParam(QPhoto p0){
       a.p(p0, "photo");
       super();
       this.startPhotoClickIndex = -1;
       this.mLandVideoStateEventId = -1;
       this.mRefUrlPackageId = -1;
       this.mFragmentTag = "";
       this.mFloatWindowPlayList = new ArrayList();
       this.mFullTimeSessionId = "";
       this.mVideoPlayCompleteIdSet = new LinkedHashSet();
       this.mVideoHasPlayedIdSet = new HashSet();
       this.mVideoHasShowedFinRecoPanelIdSet = new HashSet();
       this.mEnterLandscapeMode = "BUTTON";
       PausePageState pausePageSta = new PausePageState(false, null, null, 7, null);
       this.mPausePageState = v0;
       this.mCoronaVipState = new CoronaVipState(false, false, 3, null);
       c uoc = new c(null, false, false, false, 0, 31, null);
       this.mCoronaInstreamAdState = v0;
       this.mUseGravitySensor = true;
       if (TextUtils.x(r1.M1(p0.getEntity()))) {
          r1.l5(p0.getEntity(), "PORTRAIT");
       }
       this.mPhoto = p0;
       this.mStartPhoto = p0;
       return;
    }
    public final long getMChangeLandscapeBeginTime(){
       return this.mChangeLandscapeBeginTime;
    }
    public final QPhoto getMClickPhoto(){
       return this.mClickPhoto;
    }
    public final CoronaDetailFeedResponse getMClusterSerialFeed(){
       return this.mClusterSerialFeed;
    }
    public final String getMCommercialCallback(){
       return this.mCommercialCallback;
    }
    public final c getMCoronaInstreamAdState(){
       return this.mCoronaInstreamAdState;
    }
    public final CoronaVipState getMCoronaVipState(){
       return this.mCoronaVipState;
    }
    public final String getMEnterLandscapeMode(){
       return this.mEnterLandscapeMode;
    }
    public final boolean getMExitChangePhotoUploadVideoStateEvent(){
       return this.mExitChangePhotoUploadVideoStateEvent;
    }
    public final ArrayList getMFloatWindowPlayList(){
       return this.mFloatWindowPlayList;
    }
    public final String getMFragmentTag(){
       return this.mFragmentTag;
    }
    public final String getMFullTimeSessionId(){
       return this.mFullTimeSessionId;
    }
    public final boolean getMHasChangedPhoto(){
       return this.mHasChangedPhoto;
    }
    public final boolean getMImageDetailOpen(){
       return this.mImageDetailOpen;
    }
    public final boolean getMJoySoundIsOpen(){
       return this.mJoySoundIsOpen;
    }
    public final int getMLandVideoStateEventId(){
       return this.mLandVideoStateEventId;
    }
    public final boolean getMManualSharePlayer(){
       return this.mManualSharePlayer;
    }
    public final LandscapePlcClickEvent getMOutputPlcClickEvent(){
       return this.mOutputPlcClickEvent;
    }
    public final LandscapeTubeSerialEvent getMOutputTubeSerialEvent(){
       return this.mOutputTubeSerialEvent;
    }
    public final boolean getMPanelIsShowed(){
       return this.mPanelIsShowed;
    }
    public final PausePageState getMPausePageState(){
       return this.mPausePageState;
    }
    public final long getMPayCourseStartTime(){
       return this.mPayCourseStartTime;
    }
    public final boolean getMPayCourseTrailFinishShow(){
       return this.mPayCourseTrailFinishShow;
    }
    public final QPhoto getMPhoto(){
       return this.mPhoto;
    }
    public final boolean getMPlayPositionTipShow(){
       return this.mPlayPositionTipShow;
    }
    public final Bitmap getMPlayerCover(){
       return this.mPlayerCover;
    }
    public final float getMPlayerSpeed(){
       return this.mPlayerSpeed;
    }
    public final int getMRefUrlPackageId(){
       return this.mRefUrlPackageId;
    }
    public final Integer getMRenderType(){
       return this.mRenderType;
    }
    public final boolean getMScreencastByLandscape(){
       return this.mScreencastByLandscape;
    }
    public final ShareLogPageInfo getMShareLogPageInfo(){
       return this.mShareLogPageInfo;
    }
    public final c getMSharedSession(){
       return this.mSharedSession;
    }
    public final boolean getMShowFloatWindowGuideDialog(){
       return this.mShowFloatWindowGuideDialog;
    }
    public final QPhoto getMStartPhoto(){
       LandscapeParam obj = PatchProxy.apply(null, this, LandscapeParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStartPhoto;
       if (obj == null) {
          a.S("mStartPhoto");
       }
       return obj;
    }
    public final boolean getMSyncContainerInflateSuccess(){
       return this.mSyncContainerInflateSuccess;
    }
    public final boolean getMSyncItemInflateSuccess(){
       return this.mSyncItemInflateSuccess;
    }
    public final boolean getMSyncPlayState(){
       return this.mSyncPlayState;
    }
    public final boolean getMUseGravitySensor(){
       return this.mUseGravitySensor;
    }
    public final HashSet getMVideoHasPlayedIdSet(){
       return this.mVideoHasPlayedIdSet;
    }
    public final HashSet getMVideoHasShowedFinRecoPanelIdSet(){
       return this.mVideoHasShowedFinRecoPanelIdSet;
    }
    public final Set getMVideoPlayCompleteIdSet(){
       return this.mVideoPlayCompleteIdSet;
    }
    public final int getStartPhotoClickIndex(){
       return this.startPhotoClickIndex;
    }
    public final void setMChangeLandscapeBeginTime(long p0){
       this.mChangeLandscapeBeginTime = p0;
    }
    public final void setMClickPhoto(QPhoto p0){
       this.mClickPhoto = p0;
    }
    public final void setMClusterSerialFeed(CoronaDetailFeedResponse p0){
       this.mClusterSerialFeed = p0;
    }
    public final void setMCommercialCallback(String p0){
       this.mCommercialCallback = p0;
    }
    public final void setMCoronaInstreamAdState(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCoronaInstreamAdState = p0;
       return;
    }
    public final void setMCoronaVipState(CoronaVipState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mCoronaVipState = p0;
       return;
    }
    public final void setMEnterLandscapeMode(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mEnterLandscapeMode = p0;
       return;
    }
    public final void setMExitChangePhotoUploadVideoStateEvent(boolean p0){
       this.mExitChangePhotoUploadVideoStateEvent = p0;
    }
    public final void setMFloatWindowPlayList(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mFloatWindowPlayList = p0;
       return;
    }
    public final void setMFragmentTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mFragmentTag = p0;
       return;
    }
    public final void setMFullTimeSessionId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mFullTimeSessionId = p0;
       return;
    }
    public final void setMHasChangedPhoto(boolean p0){
       this.mHasChangedPhoto = p0;
    }
    public final void setMImageDetailOpen(boolean p0){
       this.mImageDetailOpen = p0;
    }
    public final void setMJoySoundIsOpen(boolean p0){
       this.mJoySoundIsOpen = p0;
    }
    public final void setMLandVideoStateEventId(int p0){
       this.mLandVideoStateEventId = p0;
    }
    public final void setMManualSharePlayer(boolean p0){
       this.mManualSharePlayer = p0;
    }
    public final void setMOutputPlcClickEvent(LandscapePlcClickEvent p0){
       this.mOutputPlcClickEvent = p0;
    }
    public final void setMOutputTubeSerialEvent(LandscapeTubeSerialEvent p0){
       this.mOutputTubeSerialEvent = p0;
    }
    public final void setMPanelIsShowed(boolean p0){
       this.mPanelIsShowed = p0;
    }
    public final void setMPausePageState(PausePageState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mPausePageState = p0;
       return;
    }
    public final void setMPayCourseStartTime(long p0){
       this.mPayCourseStartTime = p0;
    }
    public final void setMPayCourseTrailFinishShow(boolean p0){
       this.mPayCourseTrailFinishShow = p0;
    }
    public final void setMPhoto(QPhoto p0){
       this.mPhoto = p0;
    }
    public final void setMPlayPositionTipShow(boolean p0){
       this.mPlayPositionTipShow = p0;
    }
    public final void setMPlayerCover(Bitmap p0){
       this.mPlayerCover = p0;
    }
    public final void setMPlayerSpeed(float p0){
       this.mPlayerSpeed = p0;
    }
    public final void setMRefUrlPackageId(int p0){
       this.mRefUrlPackageId = p0;
    }
    public final void setMRenderType(Integer p0){
       this.mRenderType = p0;
    }
    public final void setMScreencastByLandscape(boolean p0){
       this.mScreencastByLandscape = p0;
    }
    public final void setMShareLogPageInfo(ShareLogPageInfo p0){
       this.mShareLogPageInfo = p0;
    }
    public final void setMSharedSession(c p0){
       this.mSharedSession = p0;
    }
    public final void setMShowFloatWindowGuideDialog(boolean p0){
       this.mShowFloatWindowGuideDialog = p0;
    }
    public final void setMStartPhoto(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mStartPhoto = p0;
       return;
    }
    public final void setMSyncContainerInflateSuccess(boolean p0){
       this.mSyncContainerInflateSuccess = p0;
    }
    public final void setMSyncItemInflateSuccess(boolean p0){
       this.mSyncItemInflateSuccess = p0;
    }
    public final void setMSyncPlayState(boolean p0){
       this.mSyncPlayState = p0;
    }
    public final void setMUseGravitySensor(boolean p0){
       this.mUseGravitySensor = p0;
    }
    public final void setMVideoHasPlayedIdSet(HashSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mVideoHasPlayedIdSet = p0;
       return;
    }
    public final void setMVideoHasShowedFinRecoPanelIdSet(HashSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mVideoHasShowedFinRecoPanelIdSet = p0;
       return;
    }
    public final void setMVideoPlayCompleteIdSet(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LandscapeParam.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mVideoPlayCompleteIdSet = p0;
       return;
    }
    public final void setStartPhotoClickIndex(int p0){
       this.startPhotoClickIndex = p0;
    }
}

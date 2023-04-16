package com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.io.Serializable;
import java.lang.Object;
import db1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.live.LiveAdminPrivilege;
import p91.m;
import com.kuaishou.live.basic.model.StreamType;
import com.kwai.framework.model.feed.BaseFeed;
import kg1.b;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import t02.a0;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import lp3.e;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import cf2.c;
import tx1.b;
import java.util.Objects;
import wj2.p0;

public class LiveProfileParams implements Serializable	// class@001017
{
    public boolean mAllowLiveChat;
    public String mAnchorUserId;
    public BaseFeed mBaseFeed;
    public boolean mCanOpenFullProfile;
    public int mClickType;
    public String mExpTag;
    public b mFansGroupServiceSupplier;
    public LiveFollowExtParams mFollowExtParams;
    public int mFollowSource;
    public boolean mGameLiveStreamNewVersion2Enabled;
    public boolean mIsCrossRoomPk;
    public boolean mIsCrossRoomPkOpponentAnchor;
    public boolean mIsCrossRoomPkOpponentGuest;
    public boolean mIsDarkModeEnabled;
    public boolean mIsInVoiceParty;
    public boolean mIsLiveChatGuest;
    public boolean mIsSendGiftToAudienceEnabled;
    public boolean mIsSendGuestGiftButtonEnabled;
    public boolean mIsTopFollowLayoutInRecyclerViewHeader;
    public boolean mIsVoicePartyAdmin;
    public boolean mIsVoicePartyGuest;
    public boolean mIsVoicePartyKtvSinger;
    public b mLiveAdminOperateContextParams;
    public LiveAdminPrivilege mLiveAdminPrivilege;
    public m mLiveBasicContext;
    public LiveBizParam mLiveBizParam;
    public a0 mLivePlayCallerContext;
    public LiveProfileFeedCacheManager mLiveProfileFeedCacheManager;
    public e mLiveServiceManager;
    public int mLiveSourceType;
    public x mLiveStreamIdSupplier;
    public c mLogInfoSupplier;
    public String mLogUrl;
    public String mOpponentLiveStreamId;
    public LiveApiParams$AssistantType mOriginUserAssType;
    public b mProfileExtraParams;
    public int mProfileOriginSource;
    public boolean mProfileTextClickEnabled;
    public int mProfileTextCollapsedDefaultLines;
    public boolean mShouldForceRemoveLiveFeedInPhotoList;
    public boolean mShouldHideLoading;
    public boolean mShowInteractionInfo;
    public LiveApiParams$AssistantType mTargetUserAssType;
    public String mTheaterId;
    public UserProfile mUserProfile;
    public String mVoicePartyId;
    public static final long serialVersionUID = 0xf0aacaeb1c2065cb;

    public void LiveProfileParams(){
       super();
       this.mIsCrossRoomPk = false;
       this.mIsCrossRoomPkOpponentAnchor = false;
       this.mIsCrossRoomPkOpponentGuest = false;
       this.mShowInteractionInfo = true;
    }
    public void bindAdminParams(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveProfileParams.class, "4")) {
          return;
       }
       this.mLiveAdminOperateContextParams = p0;
       p0.j(this.mAnchorUserId);
       this.mLiveAdminOperateContextParams.l(this.getLiveStreamId());
       this.mLiveAdminOperateContextParams.p(this.getUserProfile().mProfile);
       this.mLiveAdminOperateContextParams.m(this.mOriginUserAssType);
       this.mLiveAdminOperateContextParams.o(this.mTargetUserAssType);
       if (this.getUserProfile().mProfile != null && this.getUserProfile().mProfile.mExtraInfo != null) {
          this.mLiveAdminOperateContextParams.q(this.getUserProfile().mProfile.mExtraInfo.mPrivilege);
       }
       this.mLiveAdminOperateContextParams.n(StreamType.fromInt(this.mLiveBasicContext.B0()));
       return;
    }
    public String getAnchorUserId(){
       return this.mAnchorUserId;
    }
    public BaseFeed getBaseFeed(){
       return this.mBaseFeed;
    }
    public int getClickType(){
       return this.mClickType;
    }
    public String getExpTag(){
       return this.mExpTag;
    }
    public b getFansGroupServiceSupplier(){
       return this.mFansGroupServiceSupplier;
    }
    public LiveFollowExtParams getFollowExtParams(){
       return this.mFollowExtParams;
    }
    public int getFollowSource(){
       return this.mFollowSource;
    }
    public m getLiveBasicContext(){
       return this.mLiveBasicContext;
    }
    public LiveBizParam getLiveBizParam(){
       return this.mLiveBizParam;
    }
    public a0 getLivePlayCallerContext(){
       return this.mLivePlayCallerContext;
    }
    public LiveProfileFeedCacheManager getLiveProfileFeedCacheManager(){
       return this.mLiveProfileFeedCacheManager;
    }
    public e getLiveServiceManager(){
       return this.mLiveServiceManager;
    }
    public int getLiveSourceType(){
       return this.mLiveSourceType;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveProfileParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mLiveStreamIdSupplier.get();
    }
    public c getLogInfoSupplier(){
       return this.mLogInfoSupplier;
    }
    public String getLogUrl(){
       return this.mLogUrl;
    }
    public String getOpponentLiveStreamId(){
       return this.mOpponentLiveStreamId;
    }
    public LiveAdminPrivilege getOriginUserAssPrivilege(){
       return this.mLiveAdminPrivilege;
    }
    public LiveApiParams$AssistantType getOriginUserAssType(){
       return this.mOriginUserAssType;
    }
    public b getProfileExtParams(){
       return this.mProfileExtraParams;
    }
    public int getProfileOriginSource(){
       return this.mProfileOriginSource;
    }
    public int getProfileTextCollapsedDefaultLines(){
       return this.mProfileTextCollapsedDefaultLines;
    }
    public LiveApiParams$AssistantType getTargetUserAssType(){
       return this.mTargetUserAssType;
    }
    public String getTheaterId(){
       return this.mTheaterId;
    }
    public UserProfile getUserProfile(){
       return this.mUserProfile;
    }
    public String getVoicePartyId(){
       return this.mVoicePartyId;
    }
    public boolean isAllowLiveChat(){
       return this.mAllowLiveChat;
    }
    public boolean isCanOpenFullProfile(){
       return this.mCanOpenFullProfile;
    }
    public boolean isCrossRoomPk(){
       return this.mIsCrossRoomPk;
    }
    public boolean isCrossRoomPkOpponentAnchor(){
       return this.mIsCrossRoomPkOpponentAnchor;
    }
    public boolean isCrossRoomPkOpponentGuest(){
       return this.mIsCrossRoomPkOpponentGuest;
    }
    public boolean isDarkModeEnabled(){
       return this.mIsDarkModeEnabled;
    }
    public boolean isGameLiveStreamNewVersion2Enabled(){
       return this.mGameLiveStreamNewVersion2Enabled;
    }
    public boolean isInVoiceParty(){
       return this.mIsInVoiceParty;
    }
    public boolean isLiveChatGuest(){
       return this.mIsLiveChatGuest;
    }
    public boolean isProfileTextClickEnabled(){
       return this.mProfileTextClickEnabled;
    }
    public boolean isSendGiftToAudienceEnabled(){
       return this.mIsSendGiftToAudienceEnabled;
    }
    public boolean isSendGuestGiftButtonEnabled(){
       return this.mIsSendGuestGiftButtonEnabled;
    }
    public boolean isShouldForceRemoveLiveFeedInPhotoList(){
       return this.mShouldForceRemoveLiveFeedInPhotoList;
    }
    public boolean isShowInteractionInfo(){
       return this.mShowInteractionInfo;
    }
    public boolean isTopFollowLayoutInRecyclerViewHeader(){
       return this.mIsTopFollowLayoutInRecyclerViewHeader;
    }
    public boolean isVoicePartyAdmin(){
       return this.mIsVoicePartyAdmin;
    }
    public boolean isVoicePartyGuest(){
       return this.mIsVoicePartyGuest;
    }
    public boolean isVoicePartyKtvSinger(){
       return this.mIsVoicePartyKtvSinger;
    }
    public LiveProfileParams setAllowLiveChat(boolean p0){
       this.mAllowLiveChat = p0;
       return this;
    }
    public LiveProfileParams setAnchorUserId(String p0){
       this.mAnchorUserId = p0;
       return this;
    }
    public LiveProfileParams setBaseFeed(BaseFeed p0){
       this.mBaseFeed = p0;
       return this;
    }
    public LiveProfileParams setCanOpenFullProfile(boolean p0){
       this.mCanOpenFullProfile = p0;
       return this;
    }
    public LiveProfileParams setClickType(int p0){
       this.mClickType = p0;
       return this;
    }
    public LiveProfileParams setDarkModeEnabled(boolean p0){
       this.mIsDarkModeEnabled = p0;
       return this;
    }
    public LiveProfileParams setExpTag(String p0){
       this.mExpTag = p0;
       return this;
    }
    public LiveProfileParams setFansGroupServiceSupplier(b p0){
       this.mFansGroupServiceSupplier = p0;
       return this;
    }
    public LiveProfileParams setFollowExtParams(LiveFollowExtParams p0){
       this.mFollowExtParams = p0;
       return this;
    }
    public LiveProfileParams setFollowSource(int p0){
       this.mFollowSource = p0;
       return this;
    }
    public void setGameLiveStreamNewVersion2Enabled(boolean p0){
       this.mGameLiveStreamNewVersion2Enabled = p0;
    }
    public LiveProfileParams setInVoiceParty(boolean p0){
       this.mIsInVoiceParty = p0;
       return this;
    }
    public LiveProfileParams setIsCrossRoomOpponentAnchor(boolean p0){
       this.mIsCrossRoomPkOpponentAnchor = p0;
       return this;
    }
    public LiveProfileParams setIsCrossRoomOpponentGuest(boolean p0){
       this.mIsCrossRoomPkOpponentGuest = p0;
       return this;
    }
    public LiveProfileParams setIsCrossRoomPk(boolean p0){
       this.mIsCrossRoomPk = p0;
       return this;
    }
    public LiveProfileParams setIsLiveChatGuest(boolean p0){
       this.mIsLiveChatGuest = p0;
       return this;
    }
    public LiveProfileParams setIsSendGiftToAudienceEnabled(boolean p0){
       this.mIsSendGiftToAudienceEnabled = p0;
       return this;
    }
    public LiveProfileParams setIsVoicePartyAdmin(boolean p0){
       this.mIsVoicePartyAdmin = p0;
       return this;
    }
    public LiveProfileParams setIsVoicePartyGuest(boolean p0){
       this.mIsVoicePartyGuest = p0;
       return this;
    }
    public LiveProfileParams setIsVoicePartyKtvSinger(boolean p0){
       this.mIsVoicePartyKtvSinger = p0;
       return this;
    }
    public LiveProfileParams setLiveBasicContext(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveProfileParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mLiveBasicContext = p0;
       Objects.requireNonNull(p0);
       this.setLiveStreamIdSupplier(new p0(p0));
       return this;
    }
    public LiveProfileParams setLiveBizParam(LiveBizParam p0){
       this.mLiveBizParam = p0;
       return this;
    }
    public LiveProfileParams setLivePlayCallerContext(a0 p0){
       this.mLivePlayCallerContext = p0;
       return this;
    }
    public LiveProfileParams setLiveProfileFeedCacheManager(LiveProfileFeedCacheManager p0){
       this.mLiveProfileFeedCacheManager = p0;
       return this;
    }
    public LiveProfileParams setLiveServiceManager(e p0){
       this.mLiveServiceManager = p0;
       return this;
    }
    public LiveProfileParams setLiveSourceType(int p0){
       this.mLiveSourceType = p0;
       return this;
    }
    public LiveProfileParams setLiveStreamIdSupplier(x p0){
       this.mLiveStreamIdSupplier = p0;
       return this;
    }
    public LiveProfileParams setLogInfoSupplier(c p0){
       this.mLogInfoSupplier = p0;
       return this;
    }
    public LiveProfileParams setLogUrl(String p0){
       this.mLogUrl = p0;
       return this;
    }
    public LiveProfileParams setOpponentLiveStreamId(String p0){
       this.mOpponentLiveStreamId = p0;
       return this;
    }
    public LiveProfileParams setOriginUserAssPrivilege(LiveAdminPrivilege p0){
       this.mLiveAdminPrivilege = p0;
       return this;
    }
    public LiveProfileParams setOriginUserAssType(LiveApiParams$AssistantType p0){
       this.mOriginUserAssType = p0;
       return this;
    }
    public LiveProfileParams setProfileExtParams(b p0){
       this.mProfileExtraParams = p0;
       return this;
    }
    public LiveProfileParams setProfileOriginSource(int p0){
       this.mProfileOriginSource = p0;
       return this;
    }
    public LiveProfileParams setProfileTextClickEnabled(boolean p0){
       this.mProfileTextClickEnabled = p0;
       return this;
    }
    public void setProfileTextCollapsedDefaultLines(int p0){
       this.mProfileTextCollapsedDefaultLines = p0;
    }
    public LiveProfileParams setSendGuestGiftButtonEnabled(boolean p0){
       this.mIsSendGuestGiftButtonEnabled = p0;
       return this;
    }
    public LiveProfileParams setShouldForceRemoveLiveFeedInPhotoList(boolean p0){
       this.mShouldForceRemoveLiveFeedInPhotoList = p0;
       return this;
    }
    public LiveProfileParams setShouldHideLoading(boolean p0){
       this.mShouldHideLoading = p0;
       return this;
    }
    public LiveProfileParams setTargetUserAssType(LiveApiParams$AssistantType p0){
       LiveProfileParams obj = PatchProxy.applyOneRefs(p0, this, LiveProfileParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mTargetUserAssType = p0;
       obj = this.mLiveAdminOperateContextParams;
       if (obj != null) {
          obj.o(p0);
       }
       return this;
    }
    public LiveProfileParams setTheaterId(String p0){
       this.mTheaterId = p0;
       return this;
    }
    public LiveProfileParams setTopFollowLayoutInRecyclerViewHeader(boolean p0){
       this.mIsTopFollowLayoutInRecyclerViewHeader = p0;
       return this;
    }
    public LiveProfileParams setUserProfile(UserProfile p0){
       this.mUserProfile = p0;
       return this;
    }
    public LiveProfileParams setVoicePartyId(String p0){
       this.mVoicePartyId = p0;
       return this;
    }
    public boolean shouldHideLoading(){
       return this.mShouldHideLoading;
    }
    public LiveProfileParams showInteractionInfo(boolean p0){
       this.mShowInteractionInfo = p0;
       return this;
    }
}

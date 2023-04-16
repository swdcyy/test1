package com.kwai.framework.model.user.User;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.framework.model.user.UserVerifiedDetail;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.kwai.framework.model.user.FansGroupV2Info$UserInfo;
import com.kwai.framework.model.user.User$FollowStatus;
import java.util.List;
import com.kwai.framework.model.user.RichTextMeta;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.framework.model.user.OpenFriendName;
import java.lang.Number;
import yl8.b;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import java.lang.Integer;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import com.kwai.framework.model.user.UserSettingOption;

public class User extends DefaultObservableAndSyncable	// class@000bd6
{
    public String hint;
    public boolean mAccountCanceled;
    public int mAge;
    public String mAlias;
    public String mAuthorDes;
    public String mAuthorRelation;
    public String mAvatar;
    public CDNUrl[] mAvatars;
    public String mBackgroundUrl;
    public CDNUrl[] mBackgroundUrls;
    public boolean mBanned;
    public boolean mBlacked;
    public List mBottomTags;
    public String mCityStr;
    public boolean mCommentDeny;
    public UserCommonPoint mCommonPoint;
    public String mConstellation;
    public String mContactName;
    public boolean mContactRelationFriend;
    public MerchantCardEntity$CouponDetail mCouponDetail;
    public UserCoverMeta mCoverMeta;
    public String mDisplayUserName;
    public double mDistance;
    public String mDistanceInfo;
    public boolean mDownloadDeny;
    public DynamicPendant mDynamicPendant;
    public boolean mEnableGoToProfile;
    public String mExactMatchTip;
    public String mExpTag;
    public UserExtraInfo mExtraInfo;
    public int mFansCount;
    public FansGroupV2Info mFansGroupV2Info;
    public List mFansImages;
    public FansListExtraInfo mFansListExtraInfo;
    public boolean mFavorited;
    public FeedLogCtx mFeedLogCtx;
    public String mFollowActionReasonTextId;
    public String mFollowBackMessage;
    public String mFollowFavoriteTitle;
    public int mFollowFromPage;
    public String mFollowReason;
    public User$FollowStatus mFollowStatus;
    public boolean mFollowed;
    public UserFollowerRelation mFollowerRelation;
    public boolean mFriend;
    public FriendClap mFriendClap;
    public MerchantCardEntity$GoodsDetail mGoodsDetail;
    public int mGuestIntimateRelationType;
    public boolean mHasGreeted;
    public boolean mHasRemoved;
    public boolean mHasReverseRemoved;
    public boolean mHasSubscribed;
    public boolean mHasSubscribedChanged;
    public boolean mHasUnreadFeeds;
    public boolean mHaveIntimatePropose;
    public UserHeadIcon mHeadIcon;
    public String mHiddenUserDesc;
    public String mHiddenUserName;
    public String mId;
    public String mIntimateRelationName;
    public int mIntimateRelationType;
    public IntimateTag mIntimateTag;
    public String mIntimateTimeText;
    public String mIntroduction;
    public boolean mIsBanned;
    public boolean mIsDefaultHead;
    public boolean mIsFans;
    public boolean mIsHiddenUser;
    public boolean mIsIntimateRelationProfileShow;
    public boolean mIsLatestAtUser;
    public boolean mIsLiving;
    public boolean mIsNewFriend;
    public Boolean mIsOnline;
    public boolean mIsReplaced;
    public boolean mIsTkView;
    public String mKwaiId;
    public String mLiveInfo;
    public String mLiveStreamId;
    public String mLiveStreamIdEncode;
    public String mLiveStreamJumperUrl;
    public LiveTipInfo mLiveTipInfo;
    public String mLlsid;
    public RichTextMeta mMainRecoReason;
    public MemorialInfo mMemorialInfo;
    public boolean mMessageDeny;
    public String mMessageLink;
    public boolean mMissUDeny;
    public UserProfileMissUInfo mMissUInfo;
    public String mMissURecoText;
    public List mMissURelation;
    public long mMissUTime;
    public String mMobileHash;
    public String mName;
    public int mNewFansFollowBtnState;
    public NewRecommendStyleInfo mNewRecommendStyleInfo;
    public boolean mNewest;
    public String mOnlineTimeInfo;
    public OpenFriendName mOpenFriendName;
    public String mOriginString;
    public UserOwnerCount mOwnerCount;
    public String mPage;
    public int mPendantType;
    public CDNUrl[] mPendants;
    public String mPhotoInfo;
    public List mPhotoList;
    public int mPlatform;
    public String mPlatformUserName;
    public int mPosition;
    public boolean mPrivate;
    public ProfilePageInfo mProfilePageInfo;
    public String mPrsid;
    public String mRankInfo;
    public int mRelation;
    public List mRelationShipLabels;
    public long mRightExpireTime;
    public String mSearchUssid;
    public RichTextMeta mSecondaryRecoReason;
    public String mSex;
    public String mShopId;
    public FollowBottomTags$ShopInfo mShopInfo;
    public String mShopSoldAmount;
    public Boolean mShowMissYouButton;
    public boolean mShowed;
    public String mSubtitle;
    public int mSuggestReason;
    public String mTagDesc;
    public String mText;
    public String mTime;
    public String mTitleLabel;
    public int mUnreadPhotoCount;
    public List mUnshowFeedIds;
    public int mUserAge;
    public UserHintColor mUserHintColor;
    public boolean mUserMessageDeny;
    public UserStatus mUserMood;
    public UserRankData mUserRankData;
    public String mUserVipStatusText;
    public boolean mVerified;
    public UserVerifiedDetail mVerifiedDetail;
    public int mVip;
    public boolean mVisitorBeFollowed;
    public String mshopLink;
    public static final String AT = "@";
    public static final long serialVersionUID = 0x2f0707d9eac8ead3;

    public void User(){
       super();
       this.mId = "";
       this.mProfilePageInfo = new ProfilePageInfo();
       this.mBackgroundUrl = "";
       this.mPrivate = false;
       this.mFriend = false;
       this.mMobileHash = "";
       this.mBanned = false;
       this.mAccountCanceled = false;
       this.mDistance = 0xbff0000000000000;
       this.mPlatform = -1;
       this.mOwnerCount = new UserOwnerCount();
       this.mMissUDeny = true;
       this.mExactMatchTip = "";
       this.mIsOnline = Boolean.FALSE;
       this.hint = "";
       this.mPhotoInfo = "";
       this.mMessageLink = "";
       this.mIsTkView = false;
       this.mFollowReason = "";
       this.mFollowBackMessage = "";
       this.mUserAge = -1;
       this.mIsReplaced = false;
       this.mPosition = -1;
       this.mNewFansFollowBtnState = 0;
    }
    public void User(String p0,String p1,String p2,String p3,CDNUrl[] p4){
       super();
       if (p0 == null) {
          p0 = "0";
       }
       this.mId = p0;
       if (p1 == null) {
          p1 = "";
       }
       this.mName = p1;
       if (p2 == null) {
          p2 = "U";
       }
       this.mSex = p2;
       this.mAvatar = p3;
       this.mAvatars = p4;
       return;
    }
    public static boolean isYellowVerifiedType(User p0){
       p0 = p0.mVerifiedDetail;
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0.mType == 1) {
          b = true;
       }
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, User.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof User) {
          return b;
       }
       if ((this.mId).equals(p0.mId) && ((this.mName).equals(p0.mName) && (this.mSex).equals(p0.mSex))) {
          b = true;
       }
    label_003a :
       return b;
    }
    public String getAtId(){
       User obj = PatchProxy.apply(null, this, User.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPlatform;
       if (obj == null) {
          return this.mName+"\(O"+this.mId+"\)";
       }
       if (obj == 1) {
          return this.mName+"\("+this.mId+"\)";
       }
       if (obj == 2) {
          return this.mId;
       }
       if (obj == 3) {
          return this.mId;
       }
       if (obj != 4) {
          return this.mId;
       }
       return this.mName+" \(O"+this.mId+"\)";
    }
    public String getAtIdWithAt(){
       Object obj = PatchProxy.apply(null, this, User.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "@"+this.getAtId();
    }
    public String getAvatar(){
       return this.mAvatar;
    }
    public CDNUrl[] getAvatars(){
       return this.mAvatars;
    }
    public String getBackgroundUrl(){
       return this.mBackgroundUrl;
    }
    public CDNUrl[] getBackgroundUrls(){
       return this.mBackgroundUrls;
    }
    public String getBizId(){
       return this.mId;
    }
    public String getCityName(){
       User obj = PatchProxy.apply(null, this, User.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.mCityStr)) {
          return this.mCityStr;
       }
       obj = this.mExtraInfo;
       if (obj != null && !TextUtils.isEmpty(obj.mCityName)) {
          return this.mExtraInfo.mCityName;
       }
       return "";
    }
    public CharSequence getDisplayName(){
       return this.mName;
    }
    public int getFansGroupLevel(){
       User tmFansGroupV = this.mFansGroupV2Info;
       if (tmFansGroupV != null) {
          FansGroupV2Info mUserInfo = tmFansGroupV.mUserInfo;
          if (mUserInfo != null) {
             return mUserInfo.mFansGroupLevel;
          }
       }
       return 1;
    }
    public FansGroupV2Info getFansGroupV2Info(){
       return this.mFansGroupV2Info;
    }
    public boolean getFansGroupV2JoinedState(){
       User tmFansGroupV = this.mFansGroupV2Info;
       if (tmFansGroupV != null) {
          FansGroupV2Info mUserInfo = tmFansGroupV.mUserInfo;
          if (mUserInfo != null) {
             return mUserInfo.mHasJoined;
          }
       }
       return false;
    }
    public boolean getFavorited(){
       return this.mFavorited;
    }
    public String getFollowReason(){
       return this.mFollowReason;
    }
    public User$FollowStatus getFollowStatus(){
       return this.mFollowStatus;
    }
    public boolean getHasSubscried(){
       return this.mHasSubscribed;
    }
    public String getId(){
       return this.mId;
    }
    public String getKwaiId(){
       return this.mKwaiId;
    }
    public String getLlsid(){
       return this.mLlsid;
    }
    public String getMobileHash(){
       return this.mMobileHash;
    }
    public String getName(){
       return this.mName;
    }
    public int getPlatform(){
       return this.mPlatform;
    }
    public String getPlatformUserName(){
       return this.mPlatformUserName;
    }
    public List getRecoCommonFriends(){
       User tmMainRecoRe = this.mMainRecoReason;
       if (tmMainRecoRe != null) {
          return tmMainRecoRe.mShowUsers;
       }
       return null;
    }
    public int getRelation(){
       return this.mRelation;
    }
    public FeedLogCtx getSearchFeedLogCtx(){
       return this.mFeedLogCtx;
    }
    public String getSearchUssid(){
       return this.mSearchUssid;
    }
    public String getSex(){
       return this.mSex;
    }
    public String getText(){
       return this.mText;
    }
    public String getThirdPartyName(){
       User tmOpenFriend = this.mOpenFriendName;
       OpenFriendName mThirdPartyN = (tmOpenFriend != null)? tmOpenFriend.mThirdPartyName: null;
       return mThirdPartyN;
    }
    public int getThirdPartyType(){
       User tmOpenFriend = this.mOpenFriendName;
       int i = (tmOpenFriend == null)? 0: tmOpenFriend.mType;
       return i;
    }
    public int getUserType(){
       User tmProfilePag = this.mProfilePageInfo;
       if (tmProfilePag != null) {
          return tmProfilePag.mUserType;
       }
       return 0;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, User.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.mId).hashCode();
    }
    public boolean isAccountCanceled(){
       return this.mAccountCanceled;
    }
    public boolean isBanned(){
       return this.mBanned;
    }
    public boolean isBlocked(){
       return this.mBlacked;
    }
    public boolean isBlueVType(){
       User tmVerifiedDe = this.mVerifiedDetail;
       boolean b = (tmVerifiedDe != null && tmVerifiedDe.mType == 2)? true: false;
       return b;
    }
    public boolean isBlueVerifiedType(){
       boolean b;
       User tmVerifiedDe = this.mVerifiedDetail;
       if (tmVerifiedDe != null) {
          UserVerifiedDetail mType = tmVerifiedDe.mType;
          if (mType == 2 || mType == 3) {
             b = true;
          label_000f :
             return b;
          }
       }
       b = false;
       goto label_000f ;
    }
    public boolean isFemale(){
       Object obj = PatchProxy.apply(null, this, User.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("F").equals(this.mSex);
    }
    public boolean isFollowingOrFollowRequesting(){
       User tmFollowStat = this.mFollowStatus;
       boolean b = (tmFollowStat == User$FollowStatus.FOLLOWING || tmFollowStat == User$FollowStatus.FOLLOW_REQUESTING)? true: false;
       return b;
    }
    public boolean isFriend(){
       return this.mFriend;
    }
    public boolean isMale(){
       Object obj = PatchProxy.apply(null, this, User.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("M").equals(this.mSex);
    }
    public boolean isPrivate(){
       return this.mPrivate;
    }
    public boolean isVerified(){
       return this.mVerified;
    }
    public void setAlisChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, User.class, "3")) {
          return;
       }
       if (TextUtils.equals(this.mAlias, p0)) {
          return;
       }
       this.mAlias = p0;
       this.notifyChanged(this);
       this.fireSync();
       return;
    }
    public void setFansGroupV2IsShowGuidance(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, User.class, "2")) {
          return;
       }
       User tmFansGroupV = this.mFansGroupV2Info;
       if (tmFansGroupV != null) {
          FansGroupV2Info mUserInfo = tmFansGroupV.mUserInfo;
          if (mUserInfo != null) {
             mUserInfo.mShowGuidance = p0.booleanValue();
             this.fireSync();
          }
       }
       return;
    }
    public void setFansGroupV2JoinedState(Boolean p0,int p1){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, User.class, "1")) {
          return;
       }
       User tmFansGroupV = this.mFansGroupV2Info;
       if (tmFansGroupV != null) {
          FansGroupV2Info mUserInfo = tmFansGroupV.mUserInfo;
          if (mUserInfo != null) {
             mUserInfo.mHasJoined = p0.booleanValue();
             p0.mFansGroupLevel = p1;
             this.notifyChanged(this);
             this.fireSync();
          }
       }
       return;
    }
    public User setFollowStatus(User$FollowStatus p0){
       if (this.mFollowStatus == p0) {
          return this;
       }
       this.mFollowStatus = p0;
       this.notifyChanged(this);
       this.fireSync();
       return this;
    }
    public void setFriend(boolean p0){
       this.mFriend = p0;
    }
    public void setMissUStatus(boolean p0){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, User.class, "9")) {
          return;
       }
       User tmMissUInfo = this.mMissUInfo;
       if (tmMissUInfo == null) {
          return;
       }
       if (p0 == tmMissUInfo.mShowAlreadyMissUStatus) {
          return;
       }
       tmMissUInfo.mShowAlreadyMissUStatus = p0;
       if (p0) {
          this.mShowMissYouButton = Boolean.FALSE;
       }
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, User.class, "11")) {
          return;
       }
       if (p0 == null) {
          p0 = "";
       }
       if (!p0.equals(this.mName)) {
          this.mName = p0;
          this.notifyChanged();
       }
       this.fireSync();
       return;
    }
    public void setOnline(boolean p0){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, User.class, "10")) {
          return;
       }
       if (this.mIsOnline.booleanValue() == p0) {
          return;
       }
       this.mIsOnline = Boolean.valueOf(p0);
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public void setPrivate(boolean p0){
       this.mPrivate = p0;
    }
    public void setRelation(int p0){
       this.mRelation = p0;
    }
    public void setShowMissButton(boolean p0){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, User.class, "8")) {
          return;
       }
       this.mShowMissYouButton = Boolean.valueOf(p0);
       this.notifyChanged();
       this.fireSync();
       return;
    }
    public void setSpecialFocusStatus(boolean p0){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, User.class, "12")) {
          return;
       }
       int i = 0;
       if (this.mFavorited != p0) {
          this.mFavorited = p0;
          i = 1;
       }
       if (i) {
          this.notifyChanged();
       }
       this.fireSync();
       return;
    }
    public void setSubscribed(boolean p0){
       if (PatchProxy.isSupport(User.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, User.class, "4")) {
          return;
       }
       if (this.mHasSubscribed == p0) {
          return;
       }
       this.mHasSubscribed = p0;
       this.mHasSubscribedChanged = true;
       this.fireSync();
       return;
    }
    public boolean showMissYouButton(){
       User obj = PatchProxy.apply(null, this, User.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mShowMissYouButton;
       boolean b = (obj != null && obj.booleanValue())? true: false;
       return b;
    }
    public void sync(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, User.class, "17")) {
          return;
       }
       if (!TextUtils.equals(this.mId, p0.mId)) {
          return;
       }
       User user = null;
       User mFollowStatu = p0.mFollowStatus;
       User user1 = 1;
       if (this.mFollowStatus != mFollowStatu) {
          this.mFollowStatus = mFollowStatu;
          user = 1;
       }
       User tmFansGroupV = this.mFansGroupV2Info;
       if (tmFansGroupV != null) {
          mFollowStatu = p0.mFansGroupV2Info;
          if (mFollowStatu != null) {
             FansGroupV2Info mUserInfo = tmFansGroupV.mUserInfo;
             if (mUserInfo != null) {
                FansGroupV2Info mUserInfo1 = mFollowStatu.mUserInfo;
                if (mUserInfo1 != null) {
                   FansGroupV2Info$UserInfo mHasJoined = mUserInfo1.mHasJoined;
                   if (mUserInfo.mHasJoined != mHasJoined) {
                      mUserInfo.mHasJoined = mHasJoined;
                      user = 1;
                   }
                   mHasJoined = mUserInfo1.mFansGroupLevel;
                   if (mUserInfo.mFansGroupLevel != mHasJoined) {
                      mUserInfo.mFansGroupLevel = mHasJoined;
                      user = 1;
                   }
                   FansGroupV2Info$UserInfo mShowGuidanc = mUserInfo1.mShowGuidance;
                   if (mUserInfo.mShowGuidance != mShowGuidanc) {
                      mUserInfo.mShowGuidance = mShowGuidanc;
                      user = 1;
                   }
                }
             }
          }
       }
       mFollowStatu = p0.mHasSubscribed;
       if (this.mHasSubscribed != mFollowStatu) {
          this.mHasSubscribed = mFollowStatu;
          user = 1;
       }
       mFollowStatu = p0.mHasSubscribedChanged;
       if (this.mHasSubscribedChanged != mFollowStatu) {
          this.mHasSubscribedChanged = mFollowStatu;
          user = 1;
       }
       mFollowStatu = p0.mFavorited;
       if (this.mFavorited != mFollowStatu) {
          this.mFavorited = mFollowStatu;
          user = 1;
       }
       if (!TextUtils.equals(this.mName, p0.mName)) {
          this.mName = p0.mName;
          user = 1;
       }
       tmFansGroupV = this.mMissUInfo;
       if (tmFansGroupV != null) {
          mFollowStatu = p0.mMissUInfo;
          if (mFollowStatu != null) {
             UserProfileMissUInfo mShowAlready = mFollowStatu.mShowAlreadyMissUStatus;
             if (tmFansGroupV.mShowAlreadyMissUStatus != mShowAlready) {
                tmFansGroupV.mShowAlreadyMissUStatus = mShowAlready;
                user = 1;
             }
          }
       }
       if (!TextUtils.equals(this.mAlias, p0.mAlias)) {
          this.mAlias = p0.mAlias;
          user = 1;
       }
       tmFansGroupV = this.mShowMissYouButton;
       if (tmFansGroupV != null) {
          mFollowStatu = p0.mShowMissYouButton;
          if (mFollowStatu != null && !tmFansGroupV.equals(mFollowStatu)) {
             this.mShowMissYouButton = p0.mShowMissYouButton;
          label_00aa :
             if (user1 != null) {
                this.notifyChanged(this);
             }
             return;
          }
       }
       user1 = user;
       goto label_00aa ;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public void updateSettingOption(UserSettingOption p0){
       this.mPrivate = p0.isPrivacyUser;
       this.mMessageDeny = p0.isMessageDenied;
       this.mCommentDeny = p0.isCommentDenied;
       this.mDownloadDeny = p0.isDownloadDenied;
    }
}

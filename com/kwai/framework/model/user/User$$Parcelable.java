package com.kwai.framework.model.user.User$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.User$$Parcelable$a;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.framework.model.user.MemorialInfo;
import com.kwai.framework.model.user.UserFollowerRelation;
import com.kwai.framework.model.user.UserFollowerRelation$$Parcelable;
import com.kwai.framework.model.user.FriendClap;
import com.kwai.framework.model.user.FriendClap$$Parcelable;
import com.kwai.framework.model.user.DynamicPendant;
import com.kwai.framework.model.user.User$FollowStatus;
import java.lang.Class;
import java.lang.Enum;
import com.kwai.framework.model.user.UserHintColor;
import java.lang.Boolean;
import com.kwai.framework.model.user.FollowBottomTags$ShopInfo;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kwai.framework.model.user.MerchantCardEntity$GoodsDetail;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kwai.framework.model.user.UserExtraInfo$$Parcelable;
import com.kwai.framework.model.user.RichTextMeta;
import com.kwai.framework.model.user.RichTextMeta$$Parcelable;
import com.kwai.framework.model.user.UserHeadIcon;
import com.kwai.framework.model.user.UserHeadIcon$$Parcelable;
import com.kwai.framework.model.user.MerchantCardEntity$CouponDetail;
import com.kwai.framework.model.user.UserVerifiedDetail;
import com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable;
import java.util.ArrayList;
import com.kwai.framework.model.user.UserProfileMissUInfo;
import com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable;
import com.kwai.framework.model.user.ProfilePageInfo;
import com.kwai.framework.model.user.ProfilePageInfo$$Parcelable;
import com.kwai.framework.model.user.UserRelationShipLabel;
import com.kwai.framework.model.user.UserRelationShipLabel$$Parcelable;
import com.kwai.framework.model.user.OpenFriendName;
import com.kwai.framework.model.user.UserOwnerCount;
import com.kwai.framework.model.user.UserOwnerCount$$Parcelable;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.framework.model.user.UserCommonPoint;
import com.kwai.framework.model.user.UserCommonPoint$$Parcelable;
import com.kwai.framework.model.user.FansListExtraInfo;
import com.kwai.framework.model.user.FansGroupV2Info;
import com.kwai.framework.model.user.FansGroupV2Info$$Parcelable;
import com.kwai.framework.model.user.NewRecommendStyleInfo;
import com.kwai.framework.model.user.NewRecommendStyleInfo$$Parcelable;
import com.kwai.framework.model.user.FollowBottomTags;
import com.kwai.framework.model.user.UserCoverMeta;
import com.kwai.framework.model.user.UserRankData;
import com.kwai.framework.model.user.IntimateTag;
import com.kwai.framework.model.user.IntimateTag$$Parcelable;
import com.kwai.framework.model.user.UserStatus;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import org.parceler.a$c;

public class User$$Parcelable implements Parcelable, d	// class@00172e
{
    public User user$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       User$$Parcelable.CREATOR = new User$$Parcelable$a();
    }
    public void User$$Parcelable(User p0){
       super();
       this.user$$0 = p0;
    }
    public static User read(Parcel p0,a p1){
       Boolean uBoolean;
       CDNUrl[] uCDNUrlArray;
       List list1;
       ArrayList uArrayList;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          User user = new User();
          p1.f(p1.g(), user);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          user.mHasUnreadFeeds = b1;
          user.mLiveStreamIdEncode = p0.readString();
          user.mHiddenUserDesc = p0.readString();
          user.mMemorialInfo = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          user.mUserMessageDeny = b1;
          user.mMessageLink = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mPrivate = b1;
          user.mFollowerRelation = UserFollowerRelation$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsIntimateRelationProfileShow = b1;
          user.mLiveStreamId = p0.readString();
          user.mFollowBackMessage = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mFavorited = b1;
          user.mHiddenUserName = p0.readString();
          user.mFriendClap = FriendClap$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          user.mVisitorBeFollowed = b1;
          user.mText = p0.readString();
          user.mDynamicPendant = p0.readSerializable();
          user.mFansCount = p0.readInt();
          user.mOnlineTimeInfo = p0.readString();
          user.mKwaiId = p0.readString();
          user.mAlias = p0.readString();
          user.mDisplayUserName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mEnableGoToProfile = b1;
          String str = p0.readString();
          List list = null;
          User$FollowStatus uFollowStatu = (str == null)? list: Enum.valueOf(User$FollowStatus.class, str);
          user.mFollowStatus = uFollowStatu;
          user.mGuestIntimateRelationType = p0.readInt();
          user.mUserHintColor = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsHiddenUser = b1;
          user.mAuthorDes = p0.readString();
          if (p0.readInt() < 0) {
             uBoolean = list;
          }else if(p0.readInt() == 1){
             b1 = true;
          }else {
             b1 = false;
          }
          uBoolean = Boolean.valueOf(b1);
          user.mShowMissYouButton = uBoolean;
          user.mShopInfo = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          user.mAvatars = uCDNUrlArray;
          user.mPhotoInfo = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          user.mBackgroundUrls = uCDNUrlArray;
          b1 = (p0.readInt() == 1)? true: false;
          user.mMissUDeny = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mCommentDeny = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsDefaultHead = b1;
          user.mLiveInfo = p0.readString();
          user.mVip = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          user.mHasReverseRemoved = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mVerified = b1;
          user.mAuthorRelation = p0.readString();
          user.mUserAge = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          user.mAccountCanceled = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mNewest = b1;
          user.mGoodsDetail = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          user.mContactRelationFriend = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          user.mPendants = uCDNUrlArray;
          user.mAge = p0.readInt();
          user.mIntimateRelationName = p0.readString();
          user.mContactName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mFollowed = b1;
          user.mExtraInfo = UserExtraInfo$$Parcelable.read(p0, p1);
          user.mMainRecoReason = RichTextMeta$$Parcelable.read(p0, p1);
          user.mId = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mDownloadDeny = b1;
          user.mMissURecoText = p0.readString();
          user.mFollowFromPage = p0.readInt();
          user.mSecondaryRecoReason = RichTextMeta$$Parcelable.read(p0, p1);
          user.mCityStr = p0.readString();
          user.mHeadIcon = UserHeadIcon$$Parcelable.read(p0, p1);
          user.mRightExpireTime = p0.readLong();
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsLiving = b1;
          user.mCouponDetail = p0.readSerializable();
          user.mVerifiedDetail = UserVerifiedDetail$$Parcelable.read(p0, p1);
          user.mRelation = p0.readInt();
          user.mOriginString = p0.readString();
          user.mFollowActionReasonTextId = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          user.mMissURelation = list1;
          user.mIntroduction = p0.readString();
          if (p0.readInt() < 0) {
             uBoolean = list;
          }else if(p0.readInt() == 1){
             b1 = true;
          }else {
             b1 = false;
          }
          uBoolean = Boolean.valueOf(b1);
          user.mIsOnline = uBoolean;
          user.mShopSoldAmount = p0.readString();
          user.mPrsid = p0.readString();
          user.mLlsid = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mHasGreeted = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsBanned = b1;
          user.mSubtitle = p0.readString();
          user.mMissUInfo = UserProfileMissUInfo$$Parcelable.read(p0, p1);
          user.mSex = p0.readString();
          user.mProfilePageInfo = ProfilePageInfo$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          user.mFriend = b1;
          user.mExpTag = p0.readString();
          user.mSearchUssid = p0.readString();
          user.mTitleLabel = p0.readString();
          user.mTagDesc = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(UserRelationShipLabel$$Parcelable.read(p0, p1));
             }
          }
          user.mRelationShipLabels = list1;
          user.mOpenFriendName = p0.readSerializable();
          user.mPendantType = p0.readInt();
          user.mUserVipStatusText = p0.readString();
          user.mIntimateTimeText = p0.readString();
          user.mDistance = p0.readDouble();
          user.mUnreadPhotoCount = p0.readInt();
          user.mConstellation = p0.readString();
          user.mOwnerCount = UserOwnerCount$$Parcelable.read(p0, p1);
          user.mSuggestReason = p0.readInt();
          user.mPlatformUserName = p0.readString();
          user.mIntimateRelationType = p0.readInt();
          user.hint = p0.readString();
          user.mAvatar = p0.readString();
          user.mPlatform = p0.readInt();
          user.mName = p0.readString();
          user.mRankInfo = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          user.mBlacked = b1;
          user.mLiveTipInfo = p0.readSerializable();
          user.mCommonPoint = UserCommonPoint$$Parcelable.read(p0, p1);
          user.mFansListExtraInfo = p0.readSerializable();
          user.mFansGroupV2Info = FansGroupV2Info$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          user.mHaveIntimatePropose = b1;
          user.mFollowReason = p0.readString();
          user.mNewRecommendStyleInfo = NewRecommendStyleInfo$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          user.mIsFans = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          user.mBottomTags = list1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mBanned = b1;
          b1 = (p0.readInt() == 1)? true: false;
          user.mHasRemoved = b1;
          user.mBackgroundUrl = p0.readString();
          user.mCoverMeta = p0.readSerializable();
          user.mMobileHash = p0.readString();
          user.mUserRankData = p0.readSerializable();
          user.mShopId = p0.readString();
          user.mExactMatchTip = p0.readString();
          user.mIntimateTag = IntimateTag$$Parcelable.read(p0, p1);
          user.mMissUTime = p0.readLong();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          user.mUnshowFeedIds = list1;
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readString());
             }
          }
          user.mFansImages = list;
          user.mUserMood = p0.readSerializable();
          user.mshopLink = p0.readString();
          user.mDistanceInfo = p0.readString();
          user.mFeedLogCtx = p0.readSerializable();
          user.mTime = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          user.mMessageDeny = b;
          user.mLiveStreamJumperUrl = p0.readString();
          a.d(DefaultObservableAndSyncable.class, user, "mDefaultObservable", p0.readSerializable());
          p1.f(i, user);
          return user;
       }
    }
    public static void write(User p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Iterator iterator1;
       int len;
       int i1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mHasUnreadFeeds);
          p1.writeString(p0.mLiveStreamIdEncode);
          p1.writeString(p0.mHiddenUserDesc);
          p1.writeSerializable(p0.mMemorialInfo);
          p1.writeInt(p0.mUserMessageDeny);
          p1.writeString(p0.mMessageLink);
          p1.writeInt(p0.mPrivate);
          UserFollowerRelation$$Parcelable.write(p0.mFollowerRelation, p1, p2, p3);
          p1.writeInt(p0.mIsIntimateRelationProfileShow);
          p1.writeString(p0.mLiveStreamId);
          p1.writeString(p0.mFollowBackMessage);
          p1.writeInt(p0.mFavorited);
          p1.writeString(p0.mHiddenUserName);
          FriendClap$$Parcelable.write(p0.mFriendClap, p1, p2, p3);
          p1.writeInt(p0.mVisitorBeFollowed);
          p1.writeString(p0.mText);
          p1.writeSerializable(p0.mDynamicPendant);
          p1.writeInt(p0.mFansCount);
          p1.writeString(p0.mOnlineTimeInfo);
          p1.writeString(p0.mKwaiId);
          p1.writeString(p0.mAlias);
          p1.writeString(p0.mDisplayUserName);
          p1.writeInt(p0.mEnableGoToProfile);
          User mFollowStatu = p0.mFollowStatus;
          String str = (mFollowStatu == null)? null: mFollowStatu.name();
          p1.writeString(str);
          p1.writeInt(p0.mGuestIntimateRelationType);
          p1.writeSerializable(p0.mUserHintColor);
          p1.writeInt(p0.mIsHiddenUser);
          p1.writeString(p0.mAuthorDes);
          User user = 1;
          if (p0.mShowMissYouButton == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(user);
             p1.writeInt(p0.mShowMissYouButton.booleanValue());
          }
          p1.writeSerializable(p0.mShopInfo);
          mFollowStatu = p0.mAvatars;
          User user1 = null;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.length);
             mFollowStatu = p0.mAvatars;
             len = mFollowStatu.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(mFollowStatu[i1], p1, p2, p3);
             }
          }
          p1.writeString(p0.mPhotoInfo);
          mFollowStatu = p0.mBackgroundUrls;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.length);
             mFollowStatu = p0.mBackgroundUrls;
             len = mFollowStatu.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(mFollowStatu[i1], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mMissUDeny);
          p1.writeInt(p0.mCommentDeny);
          p1.writeInt(p0.mIsDefaultHead);
          p1.writeString(p0.mLiveInfo);
          p1.writeInt(p0.mVip);
          p1.writeInt(p0.mHasReverseRemoved);
          p1.writeInt(p0.mVerified);
          p1.writeString(p0.mAuthorRelation);
          p1.writeInt(p0.mUserAge);
          p1.writeInt(p0.mAccountCanceled);
          p1.writeInt(p0.mNewest);
          p1.writeSerializable(p0.mGoodsDetail);
          p1.writeInt(p0.mContactRelationFriend);
          mFollowStatu = p0.mPendants;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.length);
             mFollowStatu = p0.mPendants;
             len = mFollowStatu.length;
             for (; user1 < len; user1 = user1 + 1) {
                CDNUrl$$Parcelable.write(mFollowStatu[user1], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mAge);
          p1.writeString(p0.mIntimateRelationName);
          p1.writeString(p0.mContactName);
          p1.writeInt(p0.mFollowed);
          UserExtraInfo$$Parcelable.write(p0.mExtraInfo, p1, p2, p3);
          RichTextMeta$$Parcelable.write(p0.mMainRecoReason, p1, p2, p3);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mDownloadDeny);
          p1.writeString(p0.mMissURecoText);
          p1.writeInt(p0.mFollowFromPage);
          RichTextMeta$$Parcelable.write(p0.mSecondaryRecoReason, p1, p2, p3);
          p1.writeString(p0.mCityStr);
          UserHeadIcon$$Parcelable.write(p0.mHeadIcon, p1, p2, p3);
          p1.writeLong(p0.mRightExpireTime);
          p1.writeInt(p0.mIsLiving);
          p1.writeSerializable(p0.mCouponDetail);
          UserVerifiedDetail$$Parcelable.write(p0.mVerifiedDetail, p1, p2, p3);
          p1.writeInt(p0.mRelation);
          p1.writeString(p0.mOriginString);
          p1.writeString(p0.mFollowActionReasonTextId);
          mFollowStatu = p0.mMissURelation;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.size());
             iterator1 = p0.mMissURelation.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          p1.writeString(p0.mIntroduction);
          if (p0.mIsOnline == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(user);
             p1.writeInt(p0.mIsOnline.booleanValue());
          }
          p1.writeString(p0.mShopSoldAmount);
          p1.writeString(p0.mPrsid);
          p1.writeString(p0.mLlsid);
          p1.writeInt(p0.mHasGreeted);
          p1.writeInt(p0.mIsBanned);
          p1.writeString(p0.mSubtitle);
          UserProfileMissUInfo$$Parcelable.write(p0.mMissUInfo, p1, p2, p3);
          p1.writeString(p0.mSex);
          ProfilePageInfo$$Parcelable.write(p0.mProfilePageInfo, p1, p2, p3);
          p1.writeInt(p0.mFriend);
          p1.writeString(p0.mExpTag);
          p1.writeString(p0.mSearchUssid);
          p1.writeString(p0.mTitleLabel);
          p1.writeString(p0.mTagDesc);
          mFollowStatu = p0.mRelationShipLabels;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.size());
             iterator1 = p0.mRelationShipLabels.iterator();
             while (iterator1.hasNext()) {
                UserRelationShipLabel$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mOpenFriendName);
          p1.writeInt(p0.mPendantType);
          p1.writeString(p0.mUserVipStatusText);
          p1.writeString(p0.mIntimateTimeText);
          p1.writeDouble(p0.mDistance);
          p1.writeInt(p0.mUnreadPhotoCount);
          p1.writeString(p0.mConstellation);
          UserOwnerCount$$Parcelable.write(p0.mOwnerCount, p1, p2, p3);
          p1.writeInt(p0.mSuggestReason);
          p1.writeString(p0.mPlatformUserName);
          p1.writeInt(p0.mIntimateRelationType);
          p1.writeString(p0.hint);
          p1.writeString(p0.mAvatar);
          p1.writeInt(p0.mPlatform);
          p1.writeString(p0.mName);
          p1.writeString(p0.mRankInfo);
          p1.writeInt(p0.mBlacked);
          p1.writeSerializable(p0.mLiveTipInfo);
          UserCommonPoint$$Parcelable.write(p0.mCommonPoint, p1, p2, p3);
          p1.writeSerializable(p0.mFansListExtraInfo);
          FansGroupV2Info$$Parcelable.write(p0.mFansGroupV2Info, p1, p2, p3);
          p1.writeInt(p0.mHaveIntimatePropose);
          p1.writeString(p0.mFollowReason);
          NewRecommendStyleInfo$$Parcelable.write(p0.mNewRecommendStyleInfo, p1, p2, p3);
          p1.writeInt(p0.mIsFans);
          mFollowStatu = p0.mBottomTags;
          if (mFollowStatu == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mFollowStatu.size());
             iterator1 = p0.mBottomTags.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeInt(p0.mBanned);
          p1.writeInt(p0.mHasRemoved);
          p1.writeString(p0.mBackgroundUrl);
          p1.writeSerializable(p0.mCoverMeta);
          p1.writeString(p0.mMobileHash);
          p1.writeSerializable(p0.mUserRankData);
          p1.writeString(p0.mShopId);
          p1.writeString(p0.mExactMatchTip);
          IntimateTag$$Parcelable.write(p0.mIntimateTag, p1, p2, p3);
          p1.writeLong(p0.mMissUTime);
          User mUnshowFeedI = p0.mUnshowFeedIds;
          if (mUnshowFeedI == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mUnshowFeedI.size());
             iterator = p0.mUnshowFeedIds.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          mUnshowFeedI = p0.mFansImages;
          if (mUnshowFeedI == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mUnshowFeedI.size());
             iterator = p0.mFansImages.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeSerializable(p0.mUserMood);
          p1.writeString(p0.mshopLink);
          p1.writeString(p0.mDistanceInfo);
          p1.writeSerializable(p0.mFeedLogCtx);
          p1.writeString(p0.mTime);
          p1.writeInt(p0.mMessageDeny);
          p1.writeString(p0.mLiveStreamJumperUrl);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public User getParcel(){
       return this.user$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       User$$Parcelable.write(this.user$$0, p0, p1, new a());
    }
}

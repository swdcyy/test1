package com.kuaishou.android.live.model.LiveStreamModel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.LiveStreamModel$$Parcelable$a;
import com.kuaishou.android.live.model.LiveStreamModel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.live.model.LiveStreamFeedPrivateInfo;
import com.kuaishou.android.live.model.LiveCoverTagModel;
import com.kuaishou.android.live.model.LiveStreamModel$SpecialLive;
import com.kuaishou.android.live.model.LiveAudienceSkinActivityConfig;
import java.util.ArrayList;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveSquareLayoutModel;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag;
import com.kuaishou.android.live.model.LiveSimpleCoverReasonTag$$Parcelable;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$$Parcelable;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextModel;
import com.kuaishou.android.live.model.LiveFeedCoverIcons;
import com.kuaishou.android.live.model.LiveStreamModel$UserCountConfig;
import com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel;
import com.kuaishou.android.live.model.LiveCoverRightTopDecorateInfoModel$$Parcelable;
import com.kuaishou.android.live.model.LiveFeedbackSwitchModel;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$$Parcelable;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import com.kuaishou.android.model.recruit.RecruitCardInfoModel;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper;
import com.kuaishou.android.model.feed.LiveCoverAnnexWrapper$$Parcelable;
import com.kuaishou.android.live.model.LivePreviewModel;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.live.model.LiveSimpleSkinConfig;
import com.kuaishou.android.model.mix.BottomEntryInfoModel;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfoV2;
import com.kuaishou.android.live.model.LiveFeedFunctionShieldSwitchInfo;
import com.kuaishou.android.live.model.LiveAudienceCustomSkinConfig;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Class;
import org.parceler.a;
import java.util.List;
import java.util.Iterator;
import org.parceler.a$c;

public class LiveStreamModel$$Parcelable implements Parcelable, d	// class@000811
{
    public LiveStreamModel liveStreamModel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveStreamModel$$Parcelable.CREATOR = new LiveStreamModel$$Parcelable$a();
    }
    public void LiveStreamModel$$Parcelable(LiveStreamModel p0){
       super();
       this.liveStreamModel$$0 = p0;
    }
    public static LiveStreamModel read(Parcel p0,a p1){
       List list1;
       ArrayList uArrayList;
       CDNUrl[] uCDNUrlArray;
       int i2;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveStreamModel liveStreamMo = new LiveStreamModel();
          p1.f(p1.g(), liveStreamMo);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mRedPack = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mEnableAutoPlay = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsMusicStationAnimation = b1;
          liveStreamMo.mRecoRerankContext = p0.readString();
          liveStreamMo.mLivePrivateInfo = p0.readSerializable();
          liveStreamMo.mLivePrivateType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsFromGroupChat = b1;
          liveStreamMo.mLiveTrafficType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mEnableLiveFeedRerank = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsPlayLiving = b1;
          liveStreamMo.mLiveCoverTagModel = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mDisableLivePreview = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.isInCommentLottery = b1;
          liveStreamMo.mSpecialLive = p0.readSerializable();
          liveStreamMo.mLiveStreamId = p0.readString();
          liveStreamMo.mDistrictRank = p0.readString();
          liveStreamMo.mAdminAuthorDutyType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mHasBet = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsGRPRCustomized = b1;
          liveStreamMo.mHotValue = p0.readString();
          liveStreamMo.mLiveAudienceSkinActivityConfig = p0.readSerializable();
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                List list2 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list2);
             }
          }
          liveStreamMo.mVerticalTypes = list1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mShowFollowGuideInfo = b1;
          liveStreamMo.mLiveEndAutoJumpType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mShowAccompanyIcon = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsMusicStationPK = b1;
          liveStreamMo.mDisplayAudienceCount = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mDisableComment = b1;
          liveStreamMo.mFeedDispatchTimestampMs = p0.readLong();
          liveStreamMo.mLiveSquareLayoutModel = p0.readSerializable();
          liveStreamMo.mAudienceCount = p0.readString();
          liveStreamMo.mLikeCount = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mNeedToRefreshCoverWidget = b1;
          liveStreamMo.mWatchingCount = p0.readString();
          liveStreamMo.mLiveEndAutoJumpDelaySeconds = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mEnableCoverAdaptive = b1;
          liveStreamMo.mCoverReasonTag = LiveSimpleCoverReasonTag$$Parcelable.read(p0, p1);
          liveStreamMo.mPlcEntryAdFlag = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsMusicFeed = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsMusicStationRedPack = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(LiveCoverWidgetModel$$Parcelable.read(p0, p1));
             }
          }
          liveStreamMo.mCoverWidgets = list1;
          liveStreamMo.mLiveLiteActivityFlag = p0.readInt();
          liveStreamMo.mTvcType = p0.readInt();
          liveStreamMo.mChainDisplayName = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          liveStreamMo.mPreviewCaptionRichTexts = list1;
          liveStreamMo.mLiveCoverIconInfo = p0.readSerializable();
          liveStreamMo.mDisplayStyle = p0.readInt();
          liveStreamMo.mUserCountConfig = p0.readSerializable();
          liveStreamMo.mCaption = p0.readString();
          liveStreamMo.mMusicStationDescriptionType = p0.readInt();
          liveStreamMo.mRedPackEndTime = p0.readLong();
          liveStreamMo.mVoicePartySubType = p0.readInt();
          liveStreamMo.mLiveCoverRightTopDecorateInfo = LiveCoverRightTopDecorateInfoModel$$Parcelable.read(p0, p1);
          liveStreamMo.mFeedBackSwitchInfo = p0.readSerializable();
          liveStreamMo.mPlcEntryStyleInfo = PlcEntryStyleInfo$$Parcelable.read(p0, p1);
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(UserInfo$$Parcelable.read(p0, p1));
             }
          }
          liveStreamMo.mDisplayUsers = list1;
          liveStreamMo.mMusicStationLiveDescription = p0.readString();
          liveStreamMo.mRecruitCardInfoModel = p0.readSerializable();
          liveStreamMo.mPlcEntryStyleData = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mEnableAutoPlayVoice = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mIsBulletOff = b1;
          liveStreamMo.mLiveCoverAnnex = LiveCoverAnnexWrapper$$Parcelable.read(p0, p1);
          liveStreamMo.mLiveBizType = p0.readInt();
          liveStreamMo.mLivePreviewModel = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 < 0) {
             uArrayList = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          liveStreamMo.mSimpleAuthorMarks = uArrayList;
          b1 = p0.readInt();
          if (b1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[b1];
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveStreamMo.mCnyLowDeviceLiveCoverUrls = uCDNUrlArray;
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mLiveSquareShouldShowHorseRaceTitle = b1;
          liveStreamMo.mPreviewLiveEndCountDownSeconds = p0.readLong();
          b1 = (p0.readInt() == 1)? true: false;
          liveStreamMo.mChatStyle = b1;
          liveStreamMo.mLiveSimpleSkinConfig = p0.readSerializable();
          liveStreamMo.mBottomEntryInfo = p0.readSerializable();
          liveStreamMo.mLiveLogPassthroughParams = p0.readString();
          liveStreamMo.mRecruitCardInfoV2 = p0.readSerializable();
          liveStreamMo.mDisplayLikeCount = p0.readString();
          liveStreamMo.mDisplayText = p0.readString();
          liveStreamMo.mAutoPlayWeight = p0.readFloat();
          liveStreamMo.mLiveCoverWidgetUpdateIntervalMills = p0.readLong();
          liveStreamMo.mRealTimeCoverUrl = p0.readString();
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readString());
             }
          }
          liveStreamMo.mDisplayDistrictRank = list;
          liveStreamMo.mFunctionShieldSwitchInfo = p0.readSerializable();
          liveStreamMo.mLiveAudienceCustomSkinConfig = p0.readSerializable();
          liveStreamMo.mLivePaidShowId = p0.readString();
          liveStreamMo.mLiveModel = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          liveStreamMo.mEnableNewPreviewBottomCard = b;
          liveStreamMo.mSimpleLiveAutoStartPlayDelayMs = p0.readInt();
          liveStreamMo.mDisplayTotalStartPlayCount = p0.readString();
          liveStreamMo.mLivePlusNearByInfo = p0.readSerializable();
          a.d(DefaultObservableAndSyncable.class, liveStreamMo, "mDefaultObservable", p0.readSerializable());
          p1.f(i, liveStreamMo);
          return liveStreamMo;
       }
    }
    public static void write(LiveStreamModel p0,Parcel p1,int p2,a p3){
       Iterator iterator1;
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mRedPack);
          p1.writeInt(p0.mEnableAutoPlay);
          p1.writeInt(p0.mIsMusicStationAnimation);
          p1.writeString(p0.mRecoRerankContext);
          p1.writeSerializable(p0.mLivePrivateInfo);
          p1.writeInt(p0.mLivePrivateType);
          p1.writeInt(p0.mIsFromGroupChat);
          p1.writeInt(p0.mLiveTrafficType);
          p1.writeInt(p0.mEnableLiveFeedRerank);
          p1.writeInt(p0.mIsPlayLiving);
          p1.writeSerializable(p0.mLiveCoverTagModel);
          p1.writeInt(p0.mDisableLivePreview);
          p1.writeInt(p0.isInCommentLottery);
          p1.writeSerializable(p0.mSpecialLive);
          p1.writeString(p0.mLiveStreamId);
          p1.writeString(p0.mDistrictRank);
          p1.writeInt(p0.mAdminAuthorDutyType);
          p1.writeInt(p0.mHasBet);
          p1.writeInt(p0.mIsGRPRCustomized);
          p1.writeString(p0.mHotValue);
          p1.writeSerializable(p0.mLiveAudienceSkinActivityConfig);
          LiveStreamModel mVerticalTyp = p0.mVerticalTypes;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.size());
             iterator1 = p0.mVerticalTypes.iterator();
             while (iterator1.hasNext()) {
                Integer integer = iterator1.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          p1.writeInt(p0.mShowFollowGuideInfo);
          p1.writeInt(p0.mLiveEndAutoJumpType);
          p1.writeInt(p0.mShowAccompanyIcon);
          p1.writeInt(p0.mIsMusicStationPK);
          p1.writeString(p0.mDisplayAudienceCount);
          p1.writeInt(p0.mDisableComment);
          p1.writeLong(p0.mFeedDispatchTimestampMs);
          p1.writeSerializable(p0.mLiveSquareLayoutModel);
          p1.writeString(p0.mAudienceCount);
          p1.writeString(p0.mLikeCount);
          p1.writeInt(p0.mNeedToRefreshCoverWidget);
          p1.writeString(p0.mWatchingCount);
          p1.writeInt(p0.mLiveEndAutoJumpDelaySeconds);
          p1.writeInt(p0.mEnableCoverAdaptive);
          LiveSimpleCoverReasonTag$$Parcelable.write(p0.mCoverReasonTag, p1, p2, p3);
          p1.writeInt(p0.mPlcEntryAdFlag);
          p1.writeInt(p0.mIsMusicFeed);
          p1.writeInt(p0.mIsMusicStationRedPack);
          mVerticalTyp = p0.mCoverWidgets;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.size());
             iterator1 = p0.mCoverWidgets.iterator();
             while (iterator1.hasNext()) {
                LiveCoverWidgetModel$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mLiveLiteActivityFlag);
          p1.writeInt(p0.mTvcType);
          p1.writeString(p0.mChainDisplayName);
          mVerticalTyp = p0.mPreviewCaptionRichTexts;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.size());
             iterator1 = p0.mPreviewCaptionRichTexts.iterator();
             while (iterator1.hasNext()) {
                p1.writeSerializable(iterator1.next());
             }
          }
          p1.writeSerializable(p0.mLiveCoverIconInfo);
          p1.writeInt(p0.mDisplayStyle);
          p1.writeSerializable(p0.mUserCountConfig);
          p1.writeString(p0.mCaption);
          p1.writeInt(p0.mMusicStationDescriptionType);
          p1.writeLong(p0.mRedPackEndTime);
          p1.writeInt(p0.mVoicePartySubType);
          LiveCoverRightTopDecorateInfoModel$$Parcelable.write(p0.mLiveCoverRightTopDecorateInfo, p1, p2, p3);
          p1.writeSerializable(p0.mFeedBackSwitchInfo);
          PlcEntryStyleInfo$$Parcelable.write(p0.mPlcEntryStyleInfo, p1, p2, p3);
          mVerticalTyp = p0.mDisplayUsers;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.size());
             iterator1 = p0.mDisplayUsers.iterator();
             while (iterator1.hasNext()) {
                UserInfo$$Parcelable.write(iterator1.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mMusicStationLiveDescription);
          p1.writeSerializable(p0.mRecruitCardInfoModel);
          p1.writeString(p0.mPlcEntryStyleData);
          p1.writeInt(p0.mEnableAutoPlayVoice);
          p1.writeInt(p0.mIsBulletOff);
          LiveCoverAnnexWrapper$$Parcelable.write(p0.mLiveCoverAnnex, p1, p2, p3);
          p1.writeInt(p0.mLiveBizType);
          p1.writeSerializable(p0.mLivePreviewModel);
          mVerticalTyp = p0.mSimpleAuthorMarks;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.size());
             iterator1 = p0.mSimpleAuthorMarks.iterator();
             while (iterator1.hasNext()) {
                p1.writeString(iterator1.next());
             }
          }
          mVerticalTyp = p0.mCnyLowDeviceLiveCoverUrls;
          if (mVerticalTyp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mVerticalTyp.length);
             mVerticalTyp = p0.mCnyLowDeviceLiveCoverUrls;
             int len = mVerticalTyp.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(mVerticalTyp[i1], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mLiveSquareShouldShowHorseRaceTitle);
          p1.writeLong(p0.mPreviewLiveEndCountDownSeconds);
          p1.writeInt(p0.mChatStyle);
          p1.writeSerializable(p0.mLiveSimpleSkinConfig);
          p1.writeSerializable(p0.mBottomEntryInfo);
          p1.writeString(p0.mLiveLogPassthroughParams);
          p1.writeSerializable(p0.mRecruitCardInfoV2);
          p1.writeString(p0.mDisplayLikeCount);
          p1.writeString(p0.mDisplayText);
          p1.writeFloat(p0.mAutoPlayWeight);
          p1.writeLong(p0.mLiveCoverWidgetUpdateIntervalMills);
          p1.writeString(p0.mRealTimeCoverUrl);
          LiveStreamModel mDisplayDist = p0.mDisplayDistrictRank;
          if (mDisplayDist == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mDisplayDist.size());
             Iterator iterator = p0.mDisplayDistrictRank.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeSerializable(p0.mFunctionShieldSwitchInfo);
          p1.writeSerializable(p0.mLiveAudienceCustomSkinConfig);
          p1.writeString(p0.mLivePaidShowId);
          p1.writeInt(p0.mLiveModel);
          p1.writeInt(p0.mEnableNewPreviewBottomCard);
          p1.writeInt(p0.mSimpleLiveAutoStartPlayDelayMs);
          p1.writeString(p0.mDisplayTotalStartPlayCount);
          p1.writeSerializable(p0.mLivePlusNearByInfo);
          p1.writeSerializable(a.c(new a$c(), DefaultObservableAndSyncable.class, p0, "mDefaultObservable"));
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveStreamModel getParcel(){
       return this.liveStreamModel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveStreamModel$$Parcelable.write(this.liveStreamModel$$0, p0, p1, new a());
    }
}

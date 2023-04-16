package com.kuaishou.android.live.model.QLivePlayConfig$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.QLivePlayConfig$$Parcelable$a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.live.model.LiveAudiencePaidShowConfig;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.android.live.model.ResolutionPlayUrls;
import com.kuaishou.android.live.model.QLivePlayConfig$WatermarkInfo;
import com.kuaishou.android.live.model.QLivePlayConfig$Stat;
import java.lang.Integer;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kuaishou.android.live.model.QLivePlayConfig$Announcement;
import java.util.HashSet;
import com.kuaishou.android.live.model.QLivePlayConfig$NoticeContent;
import com.kuaishou.android.live.model.QLivePlayExtraInfo;
import com.kuaishou.android.live.model.QLivePlayExtraInfo$$Parcelable;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig$$Parcelable;
import com.kuaishou.android.live.model.Race;
import com.kuaishou.android.live.model.Race$$Parcelable;
import java.util.List;
import java.util.Iterator;
import java.util.Set;

public class QLivePlayConfig$$Parcelable implements Parcelable, d	// class@000825
{
    public QLivePlayConfig qLivePlayConfig$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       QLivePlayConfig$$Parcelable.CREATOR = new QLivePlayConfig$$Parcelable$a();
    }
    public void QLivePlayConfig$$Parcelable(QLivePlayConfig p0){
       super();
       this.qLivePlayConfig$$0 = p0;
    }
    public static QLivePlayConfig read(Parcel p0,a p1){
       List list1;
       Set set;
       int i2;
       ArrayList uArrayList;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          QLivePlayConfig qLivePlayCon = new QLivePlayConfig();
          p1.f(p1.g(), qLivePlayCon);
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mShouldUseHardwareDecoding = b1;
          qLivePlayCon.mLiteAccumulatedWatchCount = p0.readString();
          qLivePlayCon.mNoticeDisplayDuration = p0.readLong();
          qLivePlayCon.mGiftComboBuffSeconds = p0.readLong();
          qLivePlayCon.mCustomizedCoverUrl = p0.readString();
          qLivePlayCon.mLiveStreamId = p0.readString();
          qLivePlayCon.mRequestCostTime = p0.readLong();
          qLivePlayCon.mLessonId = p0.readLong();
          qLivePlayCon.mAttach = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mUseMerchantAudienceApi = b1;
          qLivePlayCon.mLikeCount = p0.readLong();
          qLivePlayCon.mLocale = p0.readString();
          qLivePlayCon.mWatchingCount = p0.readLong();
          qLivePlayCon.mLiveAudiencePaidShowConfig = p0.readSerializable();
          qLivePlayCon.mServerExpTag = p0.readString();
          qLivePlayCon.mCourseId = p0.readLong();
          qLivePlayCon.mPatternType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mLandscape = b1;
          qLivePlayCon.mReplaceFeedMockUserName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsFromLiveMate = b1;
          b1 = p0.readInt();
          List list = null;
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          qLivePlayCon.mLivePolicy = list1;
          qLivePlayCon.mLiveAccumulatedWatchCount = p0.readString();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(CDNUrl$$Parcelable.read(p0, p1));
             }
          }
          qLivePlayCon.mPlayUrls = list1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qLivePlayCon.mMultiResolutionPlayUrls = list1;
          qLivePlayCon.mWatermarkInfo = p0.readSerializable();
          qLivePlayCon.mStat = p0.readSerializable();
          qLivePlayCon.mPgcRelayRoomJumpLink = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsShopLive = b1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                List list2 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list2);
             }
          }
          qLivePlayCon.mSubStartPlayBizList = list1;
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qLivePlayCon.mWebRTCAdaptiveManifests = list1;
          qLivePlayCon.mGRPRTitle = p0.readString();
          qLivePlayCon.mLiveAnnouncement = p0.readSerializable();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
          }
          qLivePlayCon.mLiveAdaptiveManifests = list1;
          qLivePlayCon.mSubType = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             list1 = list;
          }else {
             uArrayList = new ArrayList(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
          }
          qLivePlayCon.mSocketHostPorts = list1;
          qLivePlayCon.mDisplayLikeCount = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsGzoneCompetitionLive = b1;
          qLivePlayCon.mStreamType = p0.readInt();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsSpecialAccount = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mDisableLiveStreamNewPayStyle = b1;
          qLivePlayCon.mAuthReason = p0.readInt();
          qLivePlayCon.mCourseTrialRemainDuration = p0.readInt();
          b1 = p0.readInt();
          if (b1 < 0) {
             set = list;
          }else {
             set = new HashSet(b1);
             for (i2 = 0; i2 < b1; i2 = i2 + 1) {
                set.add(p0.readSerializable());
             }
          }
          qLivePlayCon.DEFAULT_LIST_SET = set;
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(p0.readSerializable());
             }
          }
          qLivePlayCon.mNoticeList = list;
          qLivePlayCon.mExtraInfo = QLivePlayExtraInfo$$Parcelable.read(p0, p1);
          qLivePlayCon.mLiveRestartPlayerConfig = LiveRestartPlayerConfig$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsCdnOverload = b1;
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mEnableNextRetry = b1;
          qLivePlayCon.mNextRetryIntervalSecond = p0.readInt();
          qLivePlayCon.mDisplayWatchingCount = p0.readString();
          qLivePlayCon.mLiteDisplayWatchingCount = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          qLivePlayCon.mIsLiveShowMultiTab = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          qLivePlayCon.mExpectFreeTraffic = b;
          qLivePlayCon.mRace = Race$$Parcelable.read(p0, p1);
          p1.f(i, qLivePlayCon);
          return qLivePlayCon;
       }
    }
    public static void write(QLivePlayConfig p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mShouldUseHardwareDecoding);
          p1.writeString(p0.mLiteAccumulatedWatchCount);
          p1.writeLong(p0.mNoticeDisplayDuration);
          p1.writeLong(p0.mGiftComboBuffSeconds);
          p1.writeString(p0.mCustomizedCoverUrl);
          p1.writeString(p0.mLiveStreamId);
          p1.writeLong(p0.mRequestCostTime);
          p1.writeLong(p0.mLessonId);
          p1.writeString(p0.mAttach);
          p1.writeInt(p0.mUseMerchantAudienceApi);
          p1.writeLong(p0.mLikeCount);
          p1.writeString(p0.mLocale);
          p1.writeLong(p0.mWatchingCount);
          p1.writeSerializable(p0.mLiveAudiencePaidShowConfig);
          p1.writeString(p0.mServerExpTag);
          p1.writeLong(p0.mCourseId);
          p1.writeInt(p0.mPatternType);
          p1.writeInt(p0.mLandscape);
          p1.writeString(p0.mReplaceFeedMockUserName);
          p1.writeInt(p0.mIsFromLiveMate);
          QLivePlayConfig mLivePolicy = p0.mLivePolicy;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mLivePolicy.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mLiveAccumulatedWatchCount);
          mLivePolicy = p0.mPlayUrls;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mPlayUrls.iterator();
             while (iterator.hasNext()) {
                CDNUrl$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mLivePolicy = p0.mMultiResolutionPlayUrls;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mMultiResolutionPlayUrls.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeSerializable(p0.mWatermarkInfo);
          p1.writeSerializable(p0.mStat);
          p1.writeString(p0.mPgcRelayRoomJumpLink);
          p1.writeInt(p0.mIsShopLive);
          mLivePolicy = p0.mSubStartPlayBizList;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mSubStartPlayBizList.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
          mLivePolicy = p0.mWebRTCAdaptiveManifests;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mWebRTCAdaptiveManifests.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeString(p0.mGRPRTitle);
          p1.writeSerializable(p0.mLiveAnnouncement);
          mLivePolicy = p0.mLiveAdaptiveManifests;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mLiveAdaptiveManifests.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mSubType);
          mLivePolicy = p0.mSocketHostPorts;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mSocketHostPorts.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mDisplayLikeCount);
          p1.writeInt(p0.mIsGzoneCompetitionLive);
          p1.writeInt(p0.mStreamType);
          p1.writeInt(p0.mIsSpecialAccount);
          p1.writeInt(p0.mDisableLiveStreamNewPayStyle);
          p1.writeInt(p0.mAuthReason);
          p1.writeInt(p0.mCourseTrialRemainDuration);
          mLivePolicy = p0.DEFAULT_LIST_SET;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.DEFAULT_LIST_SET.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          mLivePolicy = p0.mNoticeList;
          if (mLivePolicy == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLivePolicy.size());
             iterator = p0.mNoticeList.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          QLivePlayExtraInfo$$Parcelable.write(p0.mExtraInfo, p1, p2, p3);
          LiveRestartPlayerConfig$$Parcelable.write(p0.mLiveRestartPlayerConfig, p1, p2, p3);
          p1.writeInt(p0.mIsCdnOverload);
          p1.writeInt(p0.mEnableNextRetry);
          p1.writeInt(p0.mNextRetryIntervalSecond);
          p1.writeString(p0.mDisplayWatchingCount);
          p1.writeString(p0.mLiteDisplayWatchingCount);
          p1.writeInt(p0.mIsLiveShowMultiTab);
          p1.writeInt(p0.mExpectFreeTraffic);
          Race$$Parcelable.write(p0.mRace, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public QLivePlayConfig getParcel(){
       return this.qLivePlayConfig$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       QLivePlayConfig$$Parcelable.write(this.qLivePlayConfig$$0, p0, p1, new a());
    }
}

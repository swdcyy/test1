package com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable$a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.merchant.api.core.model.MerchantAudienceParams;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.yxcorp.gifshow.entity.QPreInfo$$Parcelable;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam$$Parcelable;
import com.kuaishou.android.model.feed.SearchParams;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;
import com.kwai.feature.api.live.base.model.LiveBusinessParams$$Parcelable;
import com.kwai.feature.api.live.base.model.LivePrivateAutoCheckParams;
import com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams;
import java.lang.Class;
import org.parceler.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import com.kwai.feature.api.live.base.model.LiveDiversionReportParam;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.lang.Long;

public class LiveAudienceParam$$Parcelable implements Parcelable, d	// class@000f7d
{
    public LiveAudienceParam liveAudienceParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveAudienceParam$$Parcelable.CREATOR = new LiveAudienceParam$$Parcelable$a();
    }
    public void LiveAudienceParam$$Parcelable(LiveAudienceParam p0){
       super();
       this.liveAudienceParam$$0 = p0;
    }
    public static LiveAudienceParam read(Parcel p0,a p1){
       LiveAudienceParam liveAudience = LiveAudienceParam.class;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveAudienceParam liveAudience1 = new LiveAudienceParam();
          p1.f(p1.g(), liveAudience1);
          liveAudience1.mMerchantAudienceParams = p0.readSerializable();
          liveAudience1.mTvcShowStartTimeMs = p0.readLong();
          liveAudience1.mTvcShowEndTimeMs = p0.readLong();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          liveAudience1.mShouldAttachFragmentForLivePrivate = b1;
          b1 = (p0.readInt() == 1)? true: false;
          liveAudience1.mNeedApiDowngrade = b1;
          liveAudience1.mPreInfo = QPreInfo$$Parcelable.read(p0, p1);
          liveAudience1.mLiveStreamContentType = p0.readInt();
          liveAudience1.mLiveAdNeoMerchantParam = LiveAdNeoMerchantParam$$Parcelable.read(p0, p1);
          liveAudience1.mLivePrivateAuthToken = p0.readString();
          liveAudience1.mSearchParams = p0.readSerializable();
          liveAudience1.mLiveBusinessParams = LiveBusinessParams$$Parcelable.read(p0, p1);
          liveAudience1.mLiveSourceUrl = p0.readString();
          liveAudience1.mInternalJumpSchema = p0.readString();
          liveAudience1.mLivePrivateAutoCheckParams = p0.readSerializable();
          liveAudience1.mLiveStreamId = p0.readString();
          liveAudience1.mTvcRequestType = p0.readLong();
          a.d(liveAudience, liveAudience1, "mLiveFlowDiversionRepostParams", p0.readSerializable());
          liveAudience1.mLiveStreamStartPlaySourceForEnterPrompt = p0.readInt();
          liveAudience1.mPhoto = LiveStreamFeed$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          liveAudience1.mShouldForceCreateLivePlayer = b1;
          liveAudience1.mLiveDiversionReportParam = p0.readSerializable();
          liveAudience1.mPushArrowRedPacketId = p0.readString();
          liveAudience1.mRecommendReason = p0.readString();
          liveAudience1.mUserStatusRequestExtraInfo = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveAudience1.mIsPlayViewReused = b1;
          liveAudience1.mIndexInAdapter = p0.readInt();
          liveAudience1.mServerExpTag = p0.readString();
          liveAudience1.mPassThruParamExtraInfo = p0.readSerializable();
          liveAudience1.mLivePlayFragmentId = p0.readInt();
          liveAudience1.mFormerH5PageSource = p0.readString();
          liveAudience1.mFormerH5Page = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          liveAudience1.mIsAutoPlay = b1;
          liveAudience1.mRequestTvcStartTimeMs = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          liveAudience1.mIsFromShare = b;
          liveAudience1.mStartRenderTimeMs = p0.readLong();
          liveAudience1.mLiveStartPlayEvent = p0.readInt();
          liveAudience1.mFragmentStartTimeMs = p0.readLong();
          liveAudience1.mLiveSlideSourceModeType = p0.readInt();
          liveAudience1.mLivePlayerReuseType = p0.readInt();
          a.d(liveAudience, liveAudience1, "mStartActivityTime", Long.valueOf(p0.readLong()));
          liveAudience1.mLiveSourceType = p0.readInt();
          liveAudience1.mRequestTvcEndTimeMs = p0.readLong();
          p1.f(i, liveAudience1);
          return liveAudience1;
       }
    }
    public static void write(LiveAudienceParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mMerchantAudienceParams);
          p1.writeLong(p0.mTvcShowStartTimeMs);
          p1.writeLong(p0.mTvcShowEndTimeMs);
          p1.writeInt(p0.mShouldAttachFragmentForLivePrivate);
          p1.writeInt(p0.mNeedApiDowngrade);
          QPreInfo$$Parcelable.write(p0.mPreInfo, p1, p2, p3);
          p1.writeInt(p0.mLiveStreamContentType);
          LiveAdNeoMerchantParam$$Parcelable.write(p0.mLiveAdNeoMerchantParam, p1, p2, p3);
          p1.writeString(p0.mLivePrivateAuthToken);
          p1.writeSerializable(p0.mSearchParams);
          LiveBusinessParams$$Parcelable.write(p0.mLiveBusinessParams, p1, p2, p3);
          p1.writeString(p0.mLiveSourceUrl);
          p1.writeString(p0.mInternalJumpSchema);
          p1.writeSerializable(p0.mLivePrivateAutoCheckParams);
          p1.writeString(p0.mLiveStreamId);
          p1.writeLong(p0.mTvcRequestType);
          p1.writeSerializable(a.b(LiveFlowDiversionRepostParams.class, LiveAudienceParam.class, p0, "mLiveFlowDiversionRepostParams"));
          p1.writeInt(p0.mLiveStreamStartPlaySourceForEnterPrompt);
          LiveStreamFeed$$Parcelable.write(p0.mPhoto, p1, p2, p3);
          p1.writeInt(p0.mShouldForceCreateLivePlayer);
          p1.writeSerializable(p0.mLiveDiversionReportParam);
          p1.writeString(p0.mPushArrowRedPacketId);
          p1.writeString(p0.mRecommendReason);
          p1.writeString(p0.mUserStatusRequestExtraInfo);
          p1.writeInt(p0.mIsPlayViewReused);
          p1.writeInt(p0.mIndexInAdapter);
          p1.writeString(p0.mServerExpTag);
          p1.writeSerializable(p0.mPassThruParamExtraInfo);
          p1.writeInt(p0.mLivePlayFragmentId);
          p1.writeString(p0.mFormerH5PageSource);
          p1.writeString(p0.mFormerH5Page);
          p1.writeInt(p0.mIsAutoPlay);
          p1.writeLong(p0.mRequestTvcStartTimeMs);
          p1.writeInt(p0.mIsFromShare);
          p1.writeLong(p0.mStartRenderTimeMs);
          p1.writeInt(p0.mLiveStartPlayEvent);
          p1.writeLong(p0.mFragmentStartTimeMs);
          p1.writeInt(p0.mLiveSlideSourceModeType);
          p1.writeInt(p0.mLivePlayerReuseType);
          p1.writeLong(a.b(Long.TYPE, LiveAudienceParam.class, p0, "mStartActivityTime").longValue());
          p1.writeInt(p0.mLiveSourceType);
          p1.writeLong(p0.mRequestTvcEndTimeMs);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveAudienceParam getParcel(){
       return this.liveAudienceParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveAudienceParam$$Parcelable.write(this.liveAudienceParam$$0, p0, p1, new a());
    }
}

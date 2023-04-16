package com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveSideBarModel;
import com.kuaishou.android.live.model.VoicePartyMeta;
import com.kuaishou.android.live.model.VoicePartyMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow$$Parcelable;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LiveStreamModel$$Parcelable;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.android.live.model.LiveSquareSideBarNoticeModel;
import com.kuaishou.android.model.mix.LivePushResolution;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.kuaishou.android.model.mix.LiveMerchantFeedData$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveTrafficReportConfig;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag;
import com.kuaishou.android.model.feed.LiveAuthorHeadIdentityTag$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveCommentListModel;
import com.kwai.framework.model.ExtendableModelMap;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import java.lang.Integer;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import ha6.c;
import com.kwai.framework.model.decompose.metaext.KSModelMetaExtContainer;
import java.lang.Class;
import org.parceler.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import com.kuaishou.android.live.model.QLivePlayConfig$$Parcelable;
import com.kuaishou.android.model.feed.AccompanyInfo;
import com.kuaishou.android.model.feed.AccompanyInfo$$Parcelable;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import com.kuaishou.android.model.mix.VideoQualityInfo$$Parcelable;
import lp.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder$a;
import tl8.f;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder;
import com.kuaishou.android.model.feed.LiveFansGroupRelationInfoResponse;
import com.kuaishou.android.live.model.LiveStreamFeedSwitchInfo;
import com.kuaishou.android.model.mix.HyperTag;
import com.kuaishou.android.model.mix.HyperTag$$Parcelable;
import com.kuaishou.android.model.mix.CoronaLiveMeta;
import com.kuaishou.android.model.mix.CoronaLiveMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoronaInfo;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class LiveStreamFeed$$Parcelable implements Parcelable, d	// class@000b0e
{
    public LiveStreamFeed liveStreamFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveStreamFeed$$Parcelable.CREATOR = new LiveStreamFeed$$Parcelable$a();
    }
    public void LiveStreamFeed$$Parcelable(LiveStreamFeed p0){
       super();
       this.liveStreamFeed$$0 = p0;
    }
    public static LiveStreamFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveStreamFeed liveStreamFe = new LiveStreamFeed();
          p1.f(p1.g(), liveStreamFe);
          liveStreamFe.mLiveSideBarModel = p0.readSerializable();
          liveStreamFe.mVoicePartyMeta = VoicePartyMeta$$Parcelable.read(p0, p1);
          liveStreamFe.mCoverPicRecommendedCropWindow = CoverPicRecommendedCropWindow$$Parcelable.read(p0, p1);
          liveStreamFe.mLiveStreamModel = LiveStreamModel$$Parcelable.read(p0, p1);
          liveStreamFe.mLiveLiteElementsSwitch = p0.readSerializable();
          c uoc = null;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          liveStreamFe.mCanShowTvcTag = b;
          liveStreamFe.mLiveSquareSideBarNoticeModel = p0.readSerializable();
          liveStreamFe.mLivePushResolution = p0.readSerializable();
          liveStreamFe.mDynamicEffectMarker = p0.readSerializable();
          liveStreamFe.mMerchantData = LiveMerchantFeedData$$Parcelable.read(p0, p1);
          liveStreamFe.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          liveStreamFe.mLiveTrafficReportConfig = p0.readSerializable();
          liveStreamFe.mAuthorIdentityTag = LiveAuthorHeadIdentityTag$$Parcelable.read(p0, p1);
          liveStreamFe.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          liveStreamFe.mLiveCommentListModel = p0.readSerializable();
          liveStreamFe.mExtraMap = ExtendableModelMap$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          Integer[] integerArray = null;
          if (i1 >= 0) {
             Integer[] integerArray1 = new Integer[i1];
             for (; uoc < i1; uoc = uoc + 1) {
                Integer[] integerArray2 = (p0.readInt() < 0)? integerArray: Integer.valueOf(p0.readInt());
                integerArray1[uoc] = integerArray2;
             }
             integerArray = integerArray1;
          }
          liveStreamFe.mTypeViewList = integerArray;
          liveStreamFe.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          a.d(LiveStreamFeed.class, liveStreamFe, "metaExtContainer", new c().c(p0));
          liveStreamFe.mConfig = QLivePlayConfig$$Parcelable.read(p0, p1);
          liveStreamFe.mAccompanyInfo = AccompanyInfo$$Parcelable.read(p0, p1);
          liveStreamFe.mVideoQualityInfo = VideoQualityInfo$$Parcelable.read(p0, p1);
          liveStreamFe.mUser = new a().c(p0);
          liveStreamFe.mAd = new PhotoAdvertisementPlaceHolder$a().a(p0);
          liveStreamFe.mLiveLiteFansGroupRelationInfo = p0.readSerializable();
          liveStreamFe.mSwitchInfo = p0.readSerializable();
          liveStreamFe.mHyperTag = HyperTag$$Parcelable.read(p0, p1);
          liveStreamFe.mCoronaLiveMeta = CoronaLiveMeta$$Parcelable.read(p0, p1);
          liveStreamFe.mCoronaInfo = CoronaInfo$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, liveStreamFe, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, liveStreamFe, "dataMap", new c().d(p0));
          p1.f(i, liveStreamFe);
          return liveStreamFe;
       }
    }
    public static void write(LiveStreamFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mLiveSideBarModel);
          VoicePartyMeta$$Parcelable.write(p0.mVoicePartyMeta, p1, p2, p3);
          CoverPicRecommendedCropWindow$$Parcelable.write(p0.mCoverPicRecommendedCropWindow, p1, p2, p3);
          LiveStreamModel$$Parcelable.write(p0.mLiveStreamModel, p1, p2, p3);
          p1.writeSerializable(p0.mLiveLiteElementsSwitch);
          p1.writeInt(p0.mCanShowTvcTag);
          p1.writeSerializable(p0.mLiveSquareSideBarNoticeModel);
          p1.writeSerializable(p0.mLivePushResolution);
          p1.writeSerializable(p0.mDynamicEffectMarker);
          LiveMerchantFeedData$$Parcelable.write(p0.mMerchantData, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeSerializable(p0.mLiveTrafficReportConfig);
          LiveAuthorHeadIdentityTag$$Parcelable.write(p0.mAuthorIdentityTag, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          p1.writeSerializable(p0.mLiveCommentListModel);
          ExtendableModelMap$$Parcelable.write(p0.mExtraMap, p1, p2, p3);
          LiveStreamFeed mTypeViewLis = p0.mTypeViewList;
          if (mTypeViewLis == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTypeViewLis.length);
             mTypeViewLis = p0.mTypeViewList;
             int len = mTypeViewLis.length;
             int i2 = 0;
             while (i2 < len) {
                object oobject = mTypeViewLis[i2];
                if (oobject == null) {
                   p1.writeInt(i1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(oobject.intValue());
                }
                i2 = i2 + 1;
             }
          }
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          new c().f(p0.metaExtContainer, p1);
          QLivePlayConfig$$Parcelable.write(p0.mConfig, p1, p2, p3);
          AccompanyInfo$$Parcelable.write(p0.mAccompanyInfo, p1, p2, p3);
          VideoQualityInfo$$Parcelable.write(p0.mVideoQualityInfo, p1, p2, p3);
          new a().d(p0.mUser, p1);
          new PhotoAdvertisementPlaceHolder$a().b(p0.mAd, p1);
          p1.writeSerializable(p0.mLiveLiteFansGroupRelationInfo);
          p1.writeSerializable(p0.mSwitchInfo);
          HyperTag$$Parcelable.write(p0.mHyperTag, p1, p2, p3);
          CoronaLiveMeta$$Parcelable.write(p0.mCoronaLiveMeta, p1, p2, p3);
          CoronaInfo$$Parcelable.write(p0.mCoronaInfo, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveStreamFeed getParcel(){
       return this.liveStreamFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveStreamFeed$$Parcelable.write(this.liveStreamFeed$$0, p0, p1, new a());
    }
}

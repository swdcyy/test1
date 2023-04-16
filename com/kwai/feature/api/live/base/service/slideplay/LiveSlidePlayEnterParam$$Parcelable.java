package com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam$$Parcelable$a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayEnterParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.util.HashMap;
import xwd.b;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable;
import java.io.Serializable;
import com.kwai.feature.api.live.base.model.LivePassThruParamExtraInfo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;

public class LiveSlidePlayEnterParam$$Parcelable implements Parcelable, d	// class@000fab
{
    public LiveSlidePlayEnterParam liveSlidePlayEnterParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveSlidePlayEnterParam$$Parcelable.CREATOR = new LiveSlidePlayEnterParam$$Parcelable$a();
    }
    public void LiveSlidePlayEnterParam$$Parcelable(LiveSlidePlayEnterParam p0){
       super();
       this.liveSlidePlayEnterParam$$0 = p0;
    }
    public static LiveSlidePlayEnterParam read(Parcel p0,a p1){
       Map map;
       HashMap hashMap;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          LiveSlidePlayEnterParam liveSlidePla = a.a(LiveSlidePlayEnterParam.class, uClassArray, objArray);
          p1.f(p1.g(), liveSlidePla);
          boolean b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mEnableSlidePositionChangeEvent = b;
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mEnableUnFollowRemove = b;
          liveSlidePla.mLiveStyleParams = LiveStyleParams$$Parcelable.read(p0, p1);
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mDisableNegativeFeedback = b;
          liveSlidePla.mPreviewOrLiteOriginPhoto = QPhoto$$Parcelable.read(p0, p1);
          liveSlidePla.mLiveSourceUrl = p0.readString();
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mDisableLoadMore = b;
          liveSlidePla.mUnserializableBundleId = p0.readInt();
          b = p0.readInt();
          List list = null;
          if (b < 0) {
             map = list;
          }else {
             hashMap = new HashMap(b.a(b));
             for (i3 = 0; i3 < b; i3 = i3 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          liveSlidePla.mPageUrlParamMap = map;
          liveSlidePla.mLiveStreamId = p0.readString();
          liveSlidePla.mLiveAudienceParam = LiveAudienceParam$$Parcelable.read(p0, p1);
          liveSlidePla.mSlidePlayId = p0.readString();
          liveSlidePla.mPath = p0.readString();
          liveSlidePla.mSelectedStreamId = p0.readString();
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mDisableSyncFeedPosition = b;
          liveSlidePla.mFollowStackPath = p0.readString();
          liveSlidePla.mPlayerReuseToken = p0.readString();
          liveSlidePla.mSlideEnterAnimRes = p0.readInt();
          liveSlidePla.mRecoLiveStreamId = p0.readString();
          liveSlidePla.mConstantLiveStreamId = p0.readString();
          liveSlidePla.mExtraInfo = p0.readSerializable();
          liveSlidePla.mSlideGuideMode = p0.readInt();
          b = p0.readInt();
          if (b < 0) {
             map = list;
          }else {
             hashMap = new HashMap(b.a(b));
             for (i3 = 0; i3 < b; i3 = i3 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
          }
          liveSlidePla.mLiveInternalJumpUrlMap = map;
          liveSlidePla.mNoMoreText = p0.readString();
          b = p0.readInt();
          if (b >= 0) {
             list = new ArrayList(b);
             for (int i2 = 0; i2 < b; i2 = i2 + 1) {
                list.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          liveSlidePla.mPhotoList = list;
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mIsSoloLiveStream = b;
          liveSlidePla.mSelectedPhoto = QPhoto$$Parcelable.read(p0, p1);
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mDisablePullRefresh = b;
          liveSlidePla.mSelectedIndex = p0.readInt();
          b = (p0.readInt() == 1)? true: false;
          liveSlidePla.mIsAutoEnter = b;
          liveSlidePla.mLiveSlidePlaySource = p0.readInt();
          if (p0.readInt() == 1) {
             i1 = true;
          }
          liveSlidePla.mShouldShowNewFeedbackInProfilePage = i1;
          liveSlidePla.mPcursor = p0.readString();
          liveSlidePla.mOpenPanelType = p0.readInt();
          liveSlidePla.mLiveSourceType = p0.readInt();
          p1.f(i, liveSlidePla);
          return liveSlidePla;
       }
    }
    public static void write(LiveSlidePlayEnterParam p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       Map$Entry uEntry;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mEnableSlidePositionChangeEvent);
          p1.writeInt(p0.mEnableUnFollowRemove);
          LiveStyleParams$$Parcelable.write(p0.mLiveStyleParams, p1, p2, p3);
          p1.writeInt(p0.mDisableNegativeFeedback);
          QPhoto$$Parcelable.write(p0.mPreviewOrLiteOriginPhoto, p1, p2, p3);
          p1.writeString(p0.mLiveSourceUrl);
          p1.writeInt(p0.mDisableLoadMore);
          p1.writeInt(p0.mUnserializableBundleId);
          LiveSlidePlayEnterParam mPageUrlPara = p0.mPageUrlParamMap;
          if (mPageUrlPara == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mPageUrlParamMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeString(p0.mLiveStreamId);
          LiveAudienceParam$$Parcelable.write(p0.mLiveAudienceParam, p1, p2, p3);
          p1.writeString(p0.mSlidePlayId);
          p1.writeString(p0.mPath);
          p1.writeString(p0.mSelectedStreamId);
          p1.writeInt(p0.mDisableSyncFeedPosition);
          p1.writeString(p0.mFollowStackPath);
          p1.writeString(p0.mPlayerReuseToken);
          p1.writeInt(p0.mSlideEnterAnimRes);
          p1.writeString(p0.mRecoLiveStreamId);
          p1.writeString(p0.mConstantLiveStreamId);
          p1.writeSerializable(p0.mExtraInfo);
          p1.writeInt(p0.mSlideGuideMode);
          mPageUrlPara = p0.mLiveInternalJumpUrlMap;
          if (mPageUrlPara == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mLiveInternalJumpUrlMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          p1.writeString(p0.mNoMoreText);
          mPageUrlPara = p0.mPhotoList;
          if (mPageUrlPara == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mPageUrlPara.size());
             iterator = p0.mPhotoList.iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mIsSoloLiveStream);
          QPhoto$$Parcelable.write(p0.mSelectedPhoto, p1, p2, p3);
          p1.writeInt(p0.mDisablePullRefresh);
          p1.writeInt(p0.mSelectedIndex);
          p1.writeInt(p0.mIsAutoEnter);
          p1.writeInt(p0.mLiveSlidePlaySource);
          p1.writeInt(p0.mShouldShowNewFeedbackInProfilePage);
          p1.writeString(p0.mPcursor);
          p1.writeInt(p0.mOpenPanelType);
          p1.writeInt(p0.mLiveSourceType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveSlidePlayEnterParam getParcel(){
       return this.liveSlidePlayEnterParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveSlidePlayEnterParam$$Parcelable.write(this.liveSlidePlayEnterParam$$0, p0, p1, new a());
    }
}

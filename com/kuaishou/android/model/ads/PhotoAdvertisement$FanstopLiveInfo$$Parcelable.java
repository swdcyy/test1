package com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AutoConversionInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;
import java.lang.Class;
import java.lang.Enum;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$$Parcelable;
import java.lang.Long;
import java.util.List;
import java.util.Iterator;

public class PhotoAdvertisement$FanstopLiveInfo$$Parcelable implements Parcelable, d	// class@00093b
{
    public PhotoAdvertisement$FanstopLiveInfo fanstopLiveInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$FanstopLiveInfo$$Parcelable.CREATOR = new PhotoAdvertisement$FanstopLiveInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$FanstopLiveInfo$$Parcelable(PhotoAdvertisement$FanstopLiveInfo p0){
       super();
       this.fanstopLiveInfo$$0 = p0;
    }
    public static PhotoAdvertisement$FanstopLiveInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$FanstopLiveInfo uFanstopLive = new PhotoAdvertisement$FanstopLiveInfo();
          p1.f(p1.g(), uFanstopLive);
          uFanstopLive.mRequestApiExtData = p0.readString();
          uFanstopLive.mCreativeId = p0.readLong();
          uFanstopLive.mFansTopAwardBonusTime = p0.readLong();
          long l = 0;
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uFanstopLive.mHadEarnFansTopCoin = b;
          uFanstopLive.mCallbackParam = p0.readString();
          uFanstopLive.mLlsid = p0.readString();
          uFanstopLive.mPageId = p0.readLong();
          int i1 = p0.readInt();
          Long longx = null;
          if (i1 < 0) {
             list = longx;
          }else {
             list = new ArrayList(i1);
             for (; l < i1; l = l + 1) {
                list.add(PhotoAdvertisement$Track$$Parcelable.read(p0, p1));
             }
          }
          uFanstopLive.mTracks = list;
          uFanstopLive.mFansTopAttributeParams = p0.readString();
          uFanstopLive.mExtData = p0.readString();
          uFanstopLive.mTemplateType = p0.readInt();
          uFanstopLive.mAdData = PhotoAdvertisement$AdData$$Parcelable.read(p0, p1);
          uFanstopLive.mSourceType = p0.readInt();
          uFanstopLive.mSubPageId = p0.readLong();
          uFanstopLive.mMerchantURLParamsStr = p0.readString();
          uFanstopLive.mAutoConversionInfo = p0.readSerializable();
          String str = p0.readString();
          PhotoAdvertisement$AdGroup uAdGroup = (str == null)? longx: Enum.valueOf(PhotoAdvertisement$AdGroup.class, str);
          uFanstopLive.mAdGroup = uAdGroup;
          uFanstopLive.mFeedFlowAdNeoParam = LiveAdNeoParam$$Parcelable.read(p0, p1);
          if (p0.readInt() >= 0) {
             longx = Long.valueOf(p0.readLong());
          }
          uFanstopLive.mExpireTimestamp = longx;
          uFanstopLive.mChargeInfo = p0.readString();
          uFanstopLive.mCoverId = p0.readLong();
          uFanstopLive.mPhotoPage = p0.readString();
          p1.f(i, uFanstopLive);
          return uFanstopLive;
       }
    }
    public static void write(PhotoAdvertisement$FanstopLiveInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mRequestApiExtData);
          p1.writeLong(p0.mCreativeId);
          p1.writeLong(p0.mFansTopAwardBonusTime);
          p1.writeInt(p0.mHadEarnFansTopCoin);
          p1.writeString(p0.mCallbackParam);
          p1.writeString(p0.mLlsid);
          p1.writeLong(p0.mPageId);
          PhotoAdvertisement$FanstopLiveInfo mTracks = p0.mTracks;
          if (mTracks == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTracks.size());
             Iterator iterator = p0.mTracks.iterator();
             while (iterator.hasNext()) {
                PhotoAdvertisement$Track$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mFansTopAttributeParams);
          p1.writeString(p0.mExtData);
          p1.writeInt(p0.mTemplateType);
          PhotoAdvertisement$AdData$$Parcelable.write(p0.mAdData, p1, p2, p3);
          p1.writeInt(p0.mSourceType);
          p1.writeLong(p0.mSubPageId);
          p1.writeString(p0.mMerchantURLParamsStr);
          p1.writeSerializable(p0.mAutoConversionInfo);
          mTracks = p0.mAdGroup;
          String str = (mTracks == null)? null: mTracks.name();
          p1.writeString(str);
          LiveAdNeoParam$$Parcelable.write(p0.mFeedFlowAdNeoParam, p1, p2, p3);
          if (p0.mExpireTimestamp == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mExpireTimestamp.longValue());
          }
          p1.writeString(p0.mChargeInfo);
          p1.writeLong(p0.mCoverId);
          p1.writeString(p0.mPhotoPage);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$FanstopLiveInfo getParcel(){
       return this.fanstopLiveInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$FanstopLiveInfo$$Parcelable.write(this.fanstopLiveInfo$$0, p0, p1, new a());
    }
}

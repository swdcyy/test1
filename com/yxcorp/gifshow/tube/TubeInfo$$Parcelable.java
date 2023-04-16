package com.yxcorp.gifshow.tube.TubeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.tube.ExtraParams;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo$$Parcelable;
import java.util.ArrayList;
import com.yxcorp.gifshow.tube.TubeChannelInfo;
import com.yxcorp.gifshow.tube.TubeChannelInfo$$Parcelable;
import com.yxcorp.gifshow.tube.TubeDateInfo;
import com.yxcorp.gifshow.tube.TubeDateInfo$$Parcelable;
import com.yxcorp.gifshow.tube.TubeRankInfo;
import com.yxcorp.gifshow.tube.TubeRankInfo$$Parcelable;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import com.yxcorp.gifshow.tube.TubeContentTag;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;
import com.yxcorp.gifshow.tube.TubePurchaseInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TubeInfo$$Parcelable implements Parcelable, d	// class@001e17
{
    public TubeInfo tubeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeInfo$$Parcelable.CREATOR = new TubeInfo$$Parcelable$a();
    }
    public void TubeInfo$$Parcelable(TubeInfo p0){
       super();
       this.tubeInfo$$0 = p0;
    }
    public static TubeInfo read(Parcel p0,a p1){
       List list1;
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
          TubeInfo tubeInfo = new TubeInfo();
          p1.f(p1.g(), tubeInfo);
          tubeInfo.mExtraParams = p0.readSerializable();
          tubeInfo.mAreaInfo = TubeViewAreaInfo$$Parcelable.read(p0, p1);
          boolean i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list1.add(TubeChannelInfo$$Parcelable.read(p0, p1));
             }
          }
          tubeInfo.mMultipleChannels = list1;
          tubeInfo.mBizType = p0.readInt();
          tubeInfo.recommendReason = p0.readString();
          tubeInfo.mTubeDateInfo = TubeDateInfo$$Parcelable.read(p0, p1);
          tubeInfo.mDescription = p0.readString();
          tubeInfo.mLastEpisodeName = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.isSubscribed = i1;
          tubeInfo.serverExpTag = p0.readString();
          tubeInfo.onLineTime = p0.readString();
          tubeInfo.mViewCount = p0.readLong();
          tubeInfo.expTag = p0.readString();
          tubeInfo.logPosOffset = p0.readInt();
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.mCanReserved = i1;
          tubeInfo.mFirstPhotoDescription = p0.readString();
          tubeInfo.mSubscribeCount = p0.readLong();
          tubeInfo.logLabel = p0.readString();
          tubeInfo.mTubeRankInfo = TubeRankInfo$$Parcelable.read(p0, p1);
          tubeInfo.mPosition = p0.readInt();
          tubeInfo.mLatestEpisode = TubeEpisodeInfo$$Parcelable.read(p0, p1);
          tubeInfo.mTotalEpisodeCountIgnoreStatus = p0.readLong();
          tubeInfo.llsid = p0.readString();
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.isFinished = i1;
          tubeInfo.mUser = User$$Parcelable.read(p0, p1);
          tubeInfo.mTubeId = p0.readString();
          tubeInfo.mChannel = TubeChannelInfo$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.isLandscape = i1;
          tubeInfo.mLastSeenEpisode = TubeEpisodeInfo$$Parcelable.read(p0, p1);
          tubeInfo.mTubeContentTag = p0.readSerializable();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          tubeInfo.mCoverUrls = uCDNUrlArray;
          tubeInfo.mFirstEpisode = TubeEpisodeInfo$$Parcelable.read(p0, p1);
          tubeInfo.mPurchaseInfo = TubePurchaseInfo$$Parcelable.read(p0, p1);
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.mIsReserved = i1;
          tubeInfo.mTotalEpisodeCount = p0.readLong();
          i1 = (p0.readInt() == 1)? true: false;
          tubeInfo.isOffline = i1;
          tubeInfo.mName = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(TubeChannelInfo$$Parcelable.read(p0, p1));
             }
          }
          tubeInfo.mChannels = list;
          if (p0.readInt() == 1) {
             b = true;
          }
          tubeInfo.mShowed = b;
          p1.f(i, tubeInfo);
          return tubeInfo;
       }
    }
    public static void write(TubeInfo p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeSerializable(p0.mExtraParams);
          TubeViewAreaInfo$$Parcelable.write(p0.mAreaInfo, p1, p2, p3);
          TubeInfo mMultipleCha = p0.mMultipleChannels;
          if (mMultipleCha == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMultipleCha.size());
             iterator = p0.mMultipleChannels.iterator();
             while (iterator.hasNext()) {
                TubeChannelInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mBizType);
          p1.writeString(p0.recommendReason);
          TubeDateInfo$$Parcelable.write(p0.mTubeDateInfo, p1, p2, p3);
          p1.writeString(p0.mDescription);
          p1.writeString(p0.mLastEpisodeName);
          p1.writeInt(p0.isSubscribed);
          p1.writeString(p0.serverExpTag);
          p1.writeString(p0.onLineTime);
          p1.writeLong(p0.mViewCount);
          p1.writeString(p0.expTag);
          p1.writeInt(p0.logPosOffset);
          p1.writeInt(p0.mCanReserved);
          p1.writeString(p0.mFirstPhotoDescription);
          p1.writeLong(p0.mSubscribeCount);
          p1.writeString(p0.logLabel);
          TubeRankInfo$$Parcelable.write(p0.mTubeRankInfo, p1, p2, p3);
          p1.writeInt(p0.mPosition);
          TubeEpisodeInfo$$Parcelable.write(p0.mLatestEpisode, p1, p2, p3);
          p1.writeLong(p0.mTotalEpisodeCountIgnoreStatus);
          p1.writeString(p0.llsid);
          p1.writeInt(p0.isFinished);
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeString(p0.mTubeId);
          TubeChannelInfo$$Parcelable.write(p0.mChannel, p1, p2, p3);
          p1.writeInt(p0.isLandscape);
          TubeEpisodeInfo$$Parcelable.write(p0.mLastSeenEpisode, p1, p2, p3);
          p1.writeSerializable(p0.mTubeContentTag);
          mMultipleCha = p0.mCoverUrls;
          if (mMultipleCha == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMultipleCha.length);
             mMultipleCha = p0.mCoverUrls;
             int len = mMultipleCha.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mMultipleCha[i2], p1, p2, p3);
             }
          }
          TubeEpisodeInfo$$Parcelable.write(p0.mFirstEpisode, p1, p2, p3);
          TubePurchaseInfo$$Parcelable.write(p0.mPurchaseInfo, p1, p2, p3);
          p1.writeInt(p0.mIsReserved);
          p1.writeLong(p0.mTotalEpisodeCount);
          p1.writeInt(p0.isOffline);
          p1.writeString(p0.mName);
          mMultipleCha = p0.mChannels;
          if (mMultipleCha == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mMultipleCha.size());
             iterator = p0.mChannels.iterator();
             while (iterator.hasNext()) {
                TubeChannelInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mShowed);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeInfo getParcel(){
       return this.tubeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeInfo$$Parcelable.write(this.tubeInfo$$0, p0, p1, new a());
    }
}

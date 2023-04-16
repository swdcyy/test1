package com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo$$Parcelable$a;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.io.Serializable;
import com.kuaishou.live.core.show.topic.api.LiveTopicActivityInfo;

public class LiveTopicHeaderInfo$$Parcelable implements Parcelable, d	// class@0011e3
{
    public LiveTopicHeaderInfo liveTopicHeaderInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicHeaderInfo$$Parcelable.CREATOR = new LiveTopicHeaderInfo$$Parcelable$a();
    }
    public void LiveTopicHeaderInfo$$Parcelable(LiveTopicHeaderInfo p0){
       super();
       this.liveTopicHeaderInfo$$0 = p0;
    }
    public static LiveTopicHeaderInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicHeaderInfo liveTopicHea = new LiveTopicHeaderInfo();
          p1.f(p1.g(), liveTopicHea);
          liveTopicHea.mTopicDescription = p0.readString();
          boolean i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          boolean b = false;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicHea.mBackgroundUrls = uCDNUrlArray1;
          liveTopicHea.mTopicName = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicHea.mTopicCoverUrls = uCDNUrlArray;
          liveTopicHea.mWatchCountDescription = p0.readString();
          long l = 1;
          i1 = (p0.readInt() == l)? true: false;
          liveTopicHea.mNeedShowJoinButton = i1;
          liveTopicHea.mTopicActivityInfo = p0.readSerializable();
          i1 = (p0.readInt() == l)? true: false;
          liveTopicHea.mNeedShowFollowButton = i1;
          if (p0.readInt() == l) {
             b = true;
          }
          liveTopicHea.mIsFollowing = b;
          liveTopicHea.mTopicId = p0.readLong();
          p1.f(i, liveTopicHea);
          return liveTopicHea;
       }
    }
    public static void write(LiveTopicHeaderInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTopicDescription);
          LiveTopicHeaderInfo mBackgroundU = p0.mBackgroundUrls;
          int i2 = 0;
          if (mBackgroundU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundU.length);
             mBackgroundU = p0.mBackgroundUrls;
             int len = mBackgroundU.length;
             for (int i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundU[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTopicName);
          mBackgroundU = p0.mTopicCoverUrls;
          if (mBackgroundU == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBackgroundU.length);
             mBackgroundU = p0.mTopicCoverUrls;
             i1 = mBackgroundU.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mBackgroundU[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mWatchCountDescription);
          p1.writeInt(p0.mNeedShowJoinButton);
          p1.writeSerializable(p0.mTopicActivityInfo);
          p1.writeInt(p0.mNeedShowFollowButton);
          p1.writeInt(p0.mIsFollowing);
          p1.writeLong(p0.mTopicId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicHeaderInfo getParcel(){
       return this.liveTopicHeaderInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicHeaderInfo$$Parcelable.write(this.liveTopicHeaderInfo$$0, p0, p1, new a());
    }
}

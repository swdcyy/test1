package com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo$$Parcelable$a;
import com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class LiveTopicItemInfo$$Parcelable implements Parcelable, d	// class@0011e6
{
    public LiveTopicItemInfo liveTopicItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicItemInfo$$Parcelable.CREATOR = new LiveTopicItemInfo$$Parcelable$a();
    }
    public void LiveTopicItemInfo$$Parcelable(LiveTopicItemInfo p0){
       super();
       this.liveTopicItemInfo$$0 = p0;
    }
    public static LiveTopicItemInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray1;
       int i3;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicItemInfo liveTopicIte = new LiveTopicItemInfo();
          p1.f(p1.g(), liveTopicIte);
          int i1 = p0.readInt();
          CDNUrl[] uCDNUrlArray = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicIte.mTopicBackgroundCdnUrls = uCDNUrlArray1;
          liveTopicIte.mFollowCountDescription = p0.readString();
          i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray1 = uCDNUrlArray;
          }else {
             uCDNUrlArray1 = new CDNUrl[i1];
             for (i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray1[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicIte.mTopicIconCdnUrls = uCDNUrlArray1;
          liveTopicIte.mTopicName = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             uCDNUrlArray = new CDNUrl[i1];
             for (; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicIte.mTopicCoverUrls = uCDNUrlArray;
          liveTopicIte.mWatchCountDescription = p0.readString();
          liveTopicIte.mTopicId = p0.readLong();
          p1.f(i, liveTopicIte);
          return liveTopicIte;
       }
    }
    public static void write(LiveTopicItemInfo p0,Parcel p1,int p2,a p3){
       int len;
       int i3;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveTopicItemInfo mTopicBackgr = p0.mTopicBackgroundCdnUrls;
          int i2 = 0;
          if (mTopicBackgr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicBackgr.length);
             mTopicBackgr = p0.mTopicBackgroundCdnUrls;
             len = mTopicBackgr.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mTopicBackgr[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mFollowCountDescription);
          mTopicBackgr = p0.mTopicIconCdnUrls;
          if (mTopicBackgr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicBackgr.length);
             mTopicBackgr = p0.mTopicIconCdnUrls;
             len = mTopicBackgr.length;
             for (i3 = 0; i3 < len; i3 = i3 + 1) {
                CDNUrl$$Parcelable.write(mTopicBackgr[i3], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTopicName);
          mTopicBackgr = p0.mTopicCoverUrls;
          if (mTopicBackgr == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicBackgr.length);
             mTopicBackgr = p0.mTopicCoverUrls;
             i1 = mTopicBackgr.length;
             for (; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTopicBackgr[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mWatchCountDescription);
          p1.writeLong(p0.mTopicId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicItemInfo getParcel(){
       return this.liveTopicItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicItemInfo$$Parcelable.write(this.liveTopicItemInfo$$0, p0, p1, new a());
    }
}

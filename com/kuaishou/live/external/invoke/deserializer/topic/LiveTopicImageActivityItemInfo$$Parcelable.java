package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo$$Parcelable$a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;

public class LiveTopicImageActivityItemInfo$$Parcelable implements Parcelable, d	// class@001b81
{
    public LiveTopicImageActivityItemInfo liveTopicImageActivityItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicImageActivityItemInfo$$Parcelable.CREATOR = new LiveTopicImageActivityItemInfo$$Parcelable$a();
    }
    public void LiveTopicImageActivityItemInfo$$Parcelable(LiveTopicImageActivityItemInfo p0){
       super();
       this.liveTopicImageActivityItemInfo$$0 = p0;
    }
    public static LiveTopicImageActivityItemInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicImageActivityItemInfo liveTopicIma = new LiveTopicImageActivityItemInfo();
          p1.f(p1.g(), liveTopicIma);
          int i1 = p0.readInt();
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          liveTopicIma.mTopicActivityCoverUrls = uCDNUrlArray;
          liveTopicIma.mActivityType = p0.readInt();
          liveTopicIma.mTopicActivityJumpUrl = p0.readString();
          liveTopicIma.mTopicActivityId = p0.readString();
          p1.f(i, liveTopicIma);
          return liveTopicIma;
       }
    }
    public static void write(LiveTopicImageActivityItemInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveTopicImageActivityItemInfo mTopicActivi = p0.mTopicActivityCoverUrls;
          if (mTopicActivi == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicActivi.length);
             mTopicActivi = p0.mTopicActivityCoverUrls;
             i1 = mTopicActivi.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTopicActivi[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.mActivityType);
          p1.writeString(p0.mTopicActivityJumpUrl);
          p1.writeString(p0.mTopicActivityId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicImageActivityItemInfo getParcel(){
       return this.liveTopicImageActivityItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicImageActivityItemInfo$$Parcelable.write(this.liveTopicImageActivityItemInfo$$0, p0, p1, new a());
    }
}

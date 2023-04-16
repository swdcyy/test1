package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable$a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable implements Parcelable, d	// class@001b86
{
    public LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo liveActivityImageTextListInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable.CREATOR = new LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable$a();
    }
    public void LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable(LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo p0){
       super();
       this.liveActivityImageTextListInfo$$0 = p0;
    }
    public static LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo liveActivity = new LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo();
          p1.f(p1.g(), liveActivity);
          liveActivity.mContent = p0.readString();
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
          liveActivity.mIconUrls = uCDNUrlArray;
          p1.f(i, liveActivity);
          return liveActivity;
       }
    }
    public static void write(LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo mIconUrls = p0.mIconUrls;
          if (mIconUrls == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mIconUrls.length);
             p0 = p0.mIconUrls;
             i = p0.length;
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                CDNUrl$$Parcelable.write(p0[i1], p1, p2, p3);
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo getParcel(){
       return this.liveActivityImageTextListInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable.write(this.liveActivityImageTextListInfo$$0, p0, p1, new a());
    }
}

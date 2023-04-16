package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$$Parcelable$a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import java.util.ArrayList;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import java.util.List;
import java.util.Iterator;

public class LiveTopicImageTextListActivityItemInfo$$Parcelable implements Parcelable, d	// class@001b84
{
    public LiveTopicImageTextListActivityItemInfo liveTopicImageTextListActivityItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicImageTextListActivityItemInfo$$Parcelable.CREATOR = new LiveTopicImageTextListActivityItemInfo$$Parcelable$a();
    }
    public void LiveTopicImageTextListActivityItemInfo$$Parcelable(LiveTopicImageTextListActivityItemInfo p0){
       super();
       this.liveTopicImageTextListActivityItemInfo$$0 = p0;
    }
    public static LiveTopicImageTextListActivityItemInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicImageTextListActivityItemInfo liveTopicIma = new LiveTopicImageTextListActivityItemInfo();
          p1.f(p1.g(), liveTopicIma);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             uCDNUrlArray = list;
          }else {
             uCDNUrlArray = new CDNUrl[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                uCDNUrlArray[i3] = CDNUrl$$Parcelable.read(p0, p1);
             }
          }
          liveTopicIma.mTopicActivityIconUrls = uCDNUrlArray;
          liveTopicIma.mTopicActivityContent = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable.read(p0, p1));
             }
          }
          liveTopicIma.mActivityInfoList = list;
          liveTopicIma.mActivityType = p0.readInt();
          liveTopicIma.mTopicActivityJumpUrl = p0.readString();
          liveTopicIma.mTopicActivityId = p0.readString();
          p1.f(i, liveTopicIma);
          return liveTopicIma;
       }
    }
    public static void write(LiveTopicImageTextListActivityItemInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveTopicImageTextListActivityItemInfo mTopicActivi = p0.mTopicActivityIconUrls;
          if (mTopicActivi == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicActivi.length);
             mTopicActivi = p0.mTopicActivityIconUrls;
             int len = mTopicActivi.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTopicActivi[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTopicActivityContent);
          mTopicActivi = p0.mActivityInfoList;
          if (mTopicActivi == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicActivi.size());
             Iterator iterator = p0.mActivityInfoList.iterator();
             while (iterator.hasNext()) {
                LiveTopicImageTextListActivityItemInfo$LiveActivityImageTextListInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
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
    public LiveTopicImageTextListActivityItemInfo getParcel(){
       return this.liveTopicImageTextListActivityItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicImageTextListActivityItemInfo$$Parcelable.write(this.liveTopicImageTextListActivityItemInfo$$0, p0, p1, new a());
    }
}

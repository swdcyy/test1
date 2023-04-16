package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo$$Parcelable$a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;

public class LiveTopicTextActivityItemInfo$$Parcelable implements Parcelable, d	// class@001b8a
{
    public LiveTopicTextActivityItemInfo liveTopicTextActivityItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicTextActivityItemInfo$$Parcelable.CREATOR = new LiveTopicTextActivityItemInfo$$Parcelable$a();
    }
    public void LiveTopicTextActivityItemInfo$$Parcelable(LiveTopicTextActivityItemInfo p0){
       super();
       this.liveTopicTextActivityItemInfo$$0 = p0;
    }
    public static LiveTopicTextActivityItemInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          LiveTopicTextActivityItemInfo liveTopicTex = new LiveTopicTextActivityItemInfo();
          p1.f(p1.g(), liveTopicTex);
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
          liveTopicTex.mTopicActivityIconUrls = uCDNUrlArray;
          liveTopicTex.mTopicActivityTime = p0.readString();
          liveTopicTex.mTopicActivityContent = p0.readString();
          liveTopicTex.mActivityType = p0.readInt();
          liveTopicTex.mTopicActivityJumpUrl = p0.readString();
          liveTopicTex.mTopicActivityId = p0.readString();
          p1.f(i, liveTopicTex);
          return liveTopicTex;
       }
    }
    public static void write(LiveTopicTextActivityItemInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveTopicTextActivityItemInfo mTopicActivi = p0.mTopicActivityIconUrls;
          if (mTopicActivi == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTopicActivi.length);
             mTopicActivi = p0.mTopicActivityIconUrls;
             i1 = mTopicActivi.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTopicActivi[i2], p1, p2, p3);
             }
          }
          p1.writeString(p0.mTopicActivityTime);
          p1.writeString(p0.mTopicActivityContent);
          p1.writeInt(p0.mActivityType);
          p1.writeString(p0.mTopicActivityJumpUrl);
          p1.writeString(p0.mTopicActivityId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicTextActivityItemInfo getParcel(){
       return this.liveTopicTextActivityItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicTextActivityItemInfo$$Parcelable.write(this.liveTopicTextActivityItemInfo$$0, p0, p1, new a());
    }
}

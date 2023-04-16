package com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo$$Parcelable$a;
import com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveSimpleTopicInfo$$Parcelable implements Parcelable, d	// class@0011df
{
    public LiveSimpleTopicInfo liveSimpleTopicInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveSimpleTopicInfo$$Parcelable.CREATOR = new LiveSimpleTopicInfo$$Parcelable$a();
    }
    public void LiveSimpleTopicInfo$$Parcelable(LiveSimpleTopicInfo p0){
       super();
       this.liveSimpleTopicInfo$$0 = p0;
    }
    public static LiveSimpleTopicInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveSimpleTopicInfo liveSimpleTo = new LiveSimpleTopicInfo();
          p1.f(p1.g(), liveSimpleTo);
          liveSimpleTo.mTopicName = p0.readString();
          liveSimpleTo.mTopicId = p0.readLong();
          p1.f(i, liveSimpleTo);
          return liveSimpleTo;
       }
    }
    public static void write(LiveSimpleTopicInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTopicName);
          p1.writeLong(p0.mTopicId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveSimpleTopicInfo getParcel(){
       return this.liveSimpleTopicInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveSimpleTopicInfo$$Parcelable.write(this.liveSimpleTopicInfo$$0, p0, p1, new a());
    }
}

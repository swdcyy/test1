package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$$Parcelable$a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$a;

public class LiveTopicActivityBasicItemInfo$$Parcelable implements Parcelable, d	// class@001b7d
{
    public LiveTopicActivityBasicItemInfo liveTopicActivityBasicItemInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveTopicActivityBasicItemInfo$$Parcelable.CREATOR = new LiveTopicActivityBasicItemInfo$$Parcelable$a();
    }
    public void LiveTopicActivityBasicItemInfo$$Parcelable(LiveTopicActivityBasicItemInfo p0){
       super();
       this.liveTopicActivityBasicItemInfo$$0 = p0;
    }
    public static LiveTopicActivityBasicItemInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveTopicActivityBasicItemInfo liveTopicAct = new LiveTopicActivityBasicItemInfo$a().c(p0);
          p1.f(i, liveTopicAct);
          return liveTopicAct;
       }
    }
    public static void write(LiveTopicActivityBasicItemInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          new LiveTopicActivityBasicItemInfo$a().d(p0, p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveTopicActivityBasicItemInfo getParcel(){
       return this.liveTopicActivityBasicItemInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveTopicActivityBasicItemInfo$$Parcelable.write(this.liveTopicActivityBasicItemInfo$$0, p0, p1, new a());
    }
}

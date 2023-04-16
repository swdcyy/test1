package com.kuaishou.android.model.feed.LiveStreamFeedWrapper$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;

public class LiveStreamFeedWrapper$$Parcelable implements Parcelable, d	// class@000b16
{
    public LiveStreamFeedWrapper liveStreamFeedWrapper$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveStreamFeedWrapper$$Parcelable.CREATOR = new LiveStreamFeedWrapper$$Parcelable$a();
    }
    public void LiveStreamFeedWrapper$$Parcelable(LiveStreamFeedWrapper p0){
       super();
       this.liveStreamFeedWrapper$$0 = p0;
    }
    public static LiveStreamFeedWrapper read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveStreamFeedWrapper liveStreamFe = new LiveStreamFeedWrapper();
          p1.f(p1.g(), liveStreamFe);
          liveStreamFe.mEntity = LiveStreamFeed$$Parcelable.read(p0, p1);
          p1.f(i, liveStreamFe);
          return liveStreamFe;
       }
    }
    public static void write(LiveStreamFeedWrapper p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          LiveStreamFeed$$Parcelable.write(p0.mEntity, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveStreamFeedWrapper getParcel(){
       return this.liveStreamFeedWrapper$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveStreamFeedWrapper$$Parcelable.write(this.liveStreamFeedWrapper$$0, p0, p1, new a());
    }
}

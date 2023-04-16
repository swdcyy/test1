package com.kuaishou.android.model.feed.LiveInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.LiveInfo$$Parcelable$a;
import com.kuaishou.android.model.feed.LiveInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class LiveInfo$$Parcelable implements Parcelable, d	// class@000b0a
{
    public LiveInfo liveInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveInfo$$Parcelable.CREATOR = new LiveInfo$$Parcelable$a();
    }
    public void LiveInfo$$Parcelable(LiveInfo p0){
       super();
       this.liveInfo$$0 = p0;
    }
    public static LiveInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveInfo liveInfo = new LiveInfo();
          p1.f(p1.g(), liveInfo);
          liveInfo.mColor = p0.readString();
          liveInfo.mContent = p0.readString();
          liveInfo.mIconUrl = p0.readString();
          liveInfo.mType = p0.readInt();
          p1.f(i, liveInfo);
          return liveInfo;
       }
    }
    public static void write(LiveInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mColor);
          p1.writeString(p0.mContent);
          p1.writeString(p0.mIconUrl);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveInfo getParcel(){
       return this.liveInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveInfo$$Parcelable.write(this.liveInfo$$0, p0, p1, new a());
    }
}

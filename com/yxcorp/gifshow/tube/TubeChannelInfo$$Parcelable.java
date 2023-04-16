package com.yxcorp.gifshow.tube.TubeChannelInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeChannelInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeChannelInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeChannelInfo$$Parcelable implements Parcelable, d	// class@001e04
{
    public TubeChannelInfo tubeChannelInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeChannelInfo$$Parcelable.CREATOR = new TubeChannelInfo$$Parcelable$a();
    }
    public void TubeChannelInfo$$Parcelable(TubeChannelInfo p0){
       super();
       this.tubeChannelInfo$$0 = p0;
    }
    public static TubeChannelInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeChannelInfo tubeChannelI = new TubeChannelInfo();
          p1.f(p1.g(), tubeChannelI);
          tubeChannelI.channelAlias = p0.readString();
          tubeChannelI.channelIconUrl = p0.readString();
          tubeChannelI.actionUrl = p0.readString();
          tubeChannelI.channelName = p0.readString();
          tubeChannelI.channelId = p0.readString();
          tubeChannelI.parentId = p0.readString();
          tubeChannelI.channelIndex = p0.readString();
          p1.f(i, tubeChannelI);
          return tubeChannelI;
       }
    }
    public static void write(TubeChannelInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.channelAlias);
          p1.writeString(p0.channelIconUrl);
          p1.writeString(p0.actionUrl);
          p1.writeString(p0.channelName);
          p1.writeString(p0.channelId);
          p1.writeString(p0.parentId);
          p1.writeString(p0.channelIndex);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeChannelInfo getParcel(){
       return this.tubeChannelInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeChannelInfo$$Parcelable.write(this.tubeChannelInfo$$0, p0, p1, new a());
    }
}

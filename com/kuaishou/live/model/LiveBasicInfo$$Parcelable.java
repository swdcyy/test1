package com.kuaishou.live.model.LiveBasicInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.model.LiveBasicInfo$$Parcelable$a;
import com.kuaishou.live.model.LiveBasicInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.live.model.LiveBasicInfo$LongConnectInfo;
import com.kuaishou.live.model.LiveBasicInfo$LiveStreamPlayerInfo;

public class LiveBasicInfo$$Parcelable implements Parcelable, d	// class@000cec
{
    public LiveBasicInfo liveBasicInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveBasicInfo$$Parcelable.CREATOR = new LiveBasicInfo$$Parcelable$a();
    }
    public void LiveBasicInfo$$Parcelable(LiveBasicInfo p0){
       super();
       this.liveBasicInfo$$0 = p0;
    }
    public static LiveBasicInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          LiveBasicInfo liveBasicInf = new LiveBasicInfo();
          p1.f(p1.g(), liveBasicInf);
          liveBasicInf.mPatternType = p0.readInt();
          liveBasicInf.mLiveStreamId = p0.readString();
          liveBasicInf.mLongConnectInfo = p0.readSerializable();
          liveBasicInf.mStreamType = p0.readInt();
          liveBasicInf.mLiveStreamPlayerInfo = p0.readSerializable();
          p1.f(i, liveBasicInf);
          return liveBasicInf;
       }
    }
    public static void write(LiveBasicInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mPatternType);
          p1.writeString(p0.mLiveStreamId);
          p1.writeSerializable(p0.mLongConnectInfo);
          p1.writeInt(p0.mStreamType);
          p1.writeSerializable(p0.mLiveStreamPlayerInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveBasicInfo getParcel(){
       return this.liveBasicInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveBasicInfo$$Parcelable.write(this.liveBasicInfo$$0, p0, p1, new a());
    }
}

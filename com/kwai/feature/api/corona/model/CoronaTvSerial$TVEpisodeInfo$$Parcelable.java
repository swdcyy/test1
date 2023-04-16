package com.kwai.feature.api.corona.model.CoronaTvSerial$TVEpisodeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaTvSerial$TVEpisodeInfo$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaTvSerial$TVEpisodeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class CoronaTvSerial$TVEpisodeInfo$$Parcelable implements Parcelable, d	// class@000e0e
{
    public CoronaTvSerial$TVEpisodeInfo tVEpisodeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaTvSerial$TVEpisodeInfo$$Parcelable.CREATOR = new CoronaTvSerial$TVEpisodeInfo$$Parcelable$a();
    }
    public void CoronaTvSerial$TVEpisodeInfo$$Parcelable(CoronaTvSerial$TVEpisodeInfo p0){
       super();
       this.tVEpisodeInfo$$0 = p0;
    }
    public static CoronaTvSerial$TVEpisodeInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          CoronaTvSerial$TVEpisodeInfo tVEpisodeInf = new CoronaTvSerial$TVEpisodeInfo();
          p1.f(p1.g(), tVEpisodeInf);
          tVEpisodeInf.mNumber = p0.readInt();
          tVEpisodeInf.mId = p0.readString();
          tVEpisodeInf.mName = p0.readString();
          tVEpisodeInf.mExtParams = p0.readString();
          p1.f(i, tVEpisodeInf);
          return tVEpisodeInf;
       }
    }
    public static void write(CoronaTvSerial$TVEpisodeInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mNumber);
          p1.writeString(p0.mId);
          p1.writeString(p0.mName);
          p1.writeString(p0.mExtParams);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaTvSerial$TVEpisodeInfo getParcel(){
       return this.tVEpisodeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaTvSerial$TVEpisodeInfo$$Parcelable.write(this.tVEpisodeInfo$$0, p0, p1, new a());
    }
}

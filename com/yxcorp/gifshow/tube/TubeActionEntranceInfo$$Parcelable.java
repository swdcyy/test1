package com.yxcorp.gifshow.tube.TubeActionEntranceInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeActionEntranceInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeActionEntranceInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeActionEntranceInfo$$Parcelable implements Parcelable, d	// class@001dfb
{
    public TubeActionEntranceInfo tubeActionEntranceInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeActionEntranceInfo$$Parcelable.CREATOR = new TubeActionEntranceInfo$$Parcelable$a();
    }
    public void TubeActionEntranceInfo$$Parcelable(TubeActionEntranceInfo p0){
       super();
       this.tubeActionEntranceInfo$$0 = p0;
    }
    public static TubeActionEntranceInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeActionEntranceInfo tubeActionEn = new TubeActionEntranceInfo();
          p1.f(p1.g(), tubeActionEn);
          tubeActionEn.entranceIconUrl = p0.readString();
          tubeActionEn.actionUrl = p0.readString();
          tubeActionEn.entranceName = p0.readString();
          p1.f(i, tubeActionEn);
          return tubeActionEn;
       }
    }
    public static void write(TubeActionEntranceInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.entranceIconUrl);
          p1.writeString(p0.actionUrl);
          p1.writeString(p0.entranceName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeActionEntranceInfo getParcel(){
       return this.tubeActionEntranceInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeActionEntranceInfo$$Parcelable.write(this.tubeActionEntranceInfo$$0, p0, p1, new a());
    }
}

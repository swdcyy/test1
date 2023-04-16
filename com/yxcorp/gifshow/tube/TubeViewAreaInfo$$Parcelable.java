package com.yxcorp.gifshow.tube.TubeViewAreaInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeViewAreaInfo$$Parcelable implements Parcelable, d	// class@001e28
{
    public TubeViewAreaInfo tubeViewAreaInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeViewAreaInfo$$Parcelable.CREATOR = new TubeViewAreaInfo$$Parcelable$a();
    }
    public void TubeViewAreaInfo$$Parcelable(TubeViewAreaInfo p0){
       super();
       this.tubeViewAreaInfo$$0 = p0;
    }
    public static TubeViewAreaInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          TubeViewAreaInfo tubeViewArea = new TubeViewAreaInfo();
          p1.f(p1.g(), tubeViewArea);
          tubeViewArea.areaIndex = p0.readInt();
          tubeViewArea.areaId = p0.readString();
          tubeViewArea.areaName = p0.readString();
          tubeViewArea.areaType = p0.readInt();
          tubeViewArea.posInArea = p0.readInt();
          tubeViewArea.areaBlockType = p0.readString();
          tubeViewArea.areaTitle = p0.readString();
          p1.f(i, tubeViewArea);
          return tubeViewArea;
       }
    }
    public static void write(TubeViewAreaInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.areaIndex);
          p1.writeString(p0.areaId);
          p1.writeString(p0.areaName);
          p1.writeInt(p0.areaType);
          p1.writeInt(p0.posInArea);
          p1.writeString(p0.areaBlockType);
          p1.writeString(p0.areaTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeViewAreaInfo getParcel(){
       return this.tubeViewAreaInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeViewAreaInfo$$Parcelable.write(this.tubeViewAreaInfo$$0, p0, p1, new a());
    }
}

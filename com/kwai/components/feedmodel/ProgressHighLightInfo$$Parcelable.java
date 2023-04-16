package com.kwai.components.feedmodel.ProgressHighLightInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.ProgressHighLightInfo$$Parcelable$a;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class ProgressHighLightInfo$$Parcelable implements Parcelable, d	// class@000c32
{
    public ProgressHighLightInfo progressHighLightInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ProgressHighLightInfo$$Parcelable.CREATOR = new ProgressHighLightInfo$$Parcelable$a();
    }
    public void ProgressHighLightInfo$$Parcelable(ProgressHighLightInfo p0){
       super();
       this.progressHighLightInfo$$0 = p0;
    }
    public static ProgressHighLightInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ProgressHighLightInfo progressHigh = new ProgressHighLightInfo();
          p1.f(p1.g(), progressHigh);
          progressHigh.mDisplayText = p0.readString();
          progressHigh.mHighLightPos = p0.readInt();
          progressHigh.mType = p0.readInt();
          p1.f(i, progressHigh);
          return progressHigh;
       }
    }
    public static void write(ProgressHighLightInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDisplayText);
          p1.writeInt(p0.mHighLightPos);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ProgressHighLightInfo getParcel(){
       return this.progressHighLightInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ProgressHighLightInfo$$Parcelable.write(this.progressHighLightInfo$$0, p0, p1, new a());
    }
}

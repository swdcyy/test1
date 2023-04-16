package com.yxcorp.gifshow.tube.TubeEntryInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.TubeEntryInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.TubeEntryInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class TubeEntryInfo$$Parcelable implements Parcelable, d	// class@001e0e
{
    public TubeEntryInfo tubeEntryInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TubeEntryInfo$$Parcelable.CREATOR = new TubeEntryInfo$$Parcelable$a();
    }
    public void TubeEntryInfo$$Parcelable(TubeEntryInfo p0){
       super();
       this.tubeEntryInfo$$0 = p0;
    }
    public static TubeEntryInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TubeEntryInfo tubeEntryInf = new TubeEntryInfo();
          p1.f(p1.g(), tubeEntryInf);
          tubeEntryInf.mHandpickTubeIds = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          tubeEntryInf.mHasEntry = b;
          tubeEntryInf.mKoi = p0.readString();
          tubeEntryInf.mPageType = p0.readString();
          p1.f(i, tubeEntryInf);
          return tubeEntryInf;
       }
    }
    public static void write(TubeEntryInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mHandpickTubeIds);
          p1.writeInt(p0.mHasEntry);
          p1.writeString(p0.mKoi);
          p1.writeString(p0.mPageType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TubeEntryInfo getParcel(){
       return this.tubeEntryInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TubeEntryInfo$$Parcelable.write(this.tubeEntryInfo$$0, p0, p1, new a());
    }
}

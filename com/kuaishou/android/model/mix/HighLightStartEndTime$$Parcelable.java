package com.kuaishou.android.model.mix.HighLightStartEndTime$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.HighLightStartEndTime$$Parcelable$a;
import com.kuaishou.android.model.mix.HighLightStartEndTime;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Long;

public class HighLightStartEndTime$$Parcelable implements Parcelable, d	// class@000c98
{
    public HighLightStartEndTime highLightStartEndTime$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HighLightStartEndTime$$Parcelable.CREATOR = new HighLightStartEndTime$$Parcelable$a();
    }
    public void HighLightStartEndTime$$Parcelable(HighLightStartEndTime p0){
       super();
       this.highLightStartEndTime$$0 = p0;
    }
    public static HighLightStartEndTime read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HighLightStartEndTime highLightSta = new HighLightStartEndTime();
          p1.f(p1.g(), highLightSta);
          Long longx = null;
          Long longx1 = (p0.readInt() < 0)? longx: Long.valueOf(p0.readLong());
          highLightSta.mEnd = longx1;
          if (p0.readInt() >= 0) {
             longx = Long.valueOf(p0.readLong());
          }
          highLightSta.mStart = longx;
          p1.f(i, highLightSta);
          return highLightSta;
       }
    }
    public static void write(HighLightStartEndTime p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          if (p0.mEnd == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mEnd.longValue());
          }
          if (p0.mStart == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mStart.longValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HighLightStartEndTime getParcel(){
       return this.highLightStartEndTime$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HighLightStartEndTime$$Parcelable.write(this.highLightStartEndTime$$0, p0, p1, new a());
    }
}

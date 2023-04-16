package com.kwai.components.feedmodel.HotSpotInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.HotSpotInfo$$Parcelable$a;
import com.kwai.components.feedmodel.HotSpotInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Long;

public class HotSpotInfo$$Parcelable implements Parcelable, d	// class@000c15
{
    public HotSpotInfo hotSpotInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       HotSpotInfo$$Parcelable.CREATOR = new HotSpotInfo$$Parcelable$a();
    }
    public void HotSpotInfo$$Parcelable(HotSpotInfo p0){
       super();
       this.hotSpotInfo$$0 = p0;
    }
    public static HotSpotInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          HotSpotInfo hotSpotInfo = new HotSpotInfo();
          p1.f(p1.g(), hotSpotInfo);
          hotSpotInfo.recoReason = p0.readString();
          Long longx = (p0.readInt() < 0)? null: Long.valueOf(p0.readLong());
          hotSpotInfo.mWordId = longx;
          p1.f(i, hotSpotInfo);
          return hotSpotInfo;
       }
    }
    public static void write(HotSpotInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.recoReason);
          if (p0.mWordId == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeLong(p0.mWordId.longValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public HotSpotInfo getParcel(){
       return this.hotSpotInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       HotSpotInfo$$Parcelable.write(this.hotSpotInfo$$0, p0, p1, new a());
    }
}

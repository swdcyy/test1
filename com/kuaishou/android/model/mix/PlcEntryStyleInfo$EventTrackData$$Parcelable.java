package com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$$Parcelable;

public class PlcEntryStyleInfo$EventTrackData$$Parcelable implements Parcelable, d	// class@000d88
{
    public PlcEntryStyleInfo$EventTrackData eventTrackData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$EventTrackData$$Parcelable.CREATOR = new PlcEntryStyleInfo$EventTrackData$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$EventTrackData$$Parcelable(PlcEntryStyleInfo$EventTrackData p0){
       super();
       this.eventTrackData$$0 = p0;
    }
    public static PlcEntryStyleInfo$EventTrackData read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PlcEntryStyleInfo$EventTrackData uEventTrackD = new PlcEntryStyleInfo$EventTrackData();
          p1.f(p1.g(), uEventTrackD);
          uEventTrackD.mAdEventTrackData = PlcEntryStyleInfo$AdEventTrackData$$Parcelable.read(p0, p1);
          uEventTrackD.mKsOrderId = p0.readString();
          uEventTrackD.mPhotoPage = p0.readString();
          p1.f(i, uEventTrackD);
          return uEventTrackD;
       }
    }
    public static void write(PlcEntryStyleInfo$EventTrackData p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PlcEntryStyleInfo$AdEventTrackData$$Parcelable.write(p0.mAdEventTrackData, p1, p2, p3);
          p1.writeString(p0.mKsOrderId);
          p1.writeString(p0.mPhotoPage);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$EventTrackData getParcel(){
       return this.eventTrackData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$EventTrackData$$Parcelable.write(this.eventTrackData$$0, p0, p1, new a());
    }
}

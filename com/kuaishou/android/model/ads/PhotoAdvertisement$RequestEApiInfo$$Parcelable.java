package com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo;

public class PhotoAdvertisement$RequestEApiInfo$$Parcelable implements Parcelable, d	// class@0009f6
{
    public PhotoAdvertisement$RequestEApiInfo requestEApiInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$RequestEApiInfo$$Parcelable.CREATOR = new PhotoAdvertisement$RequestEApiInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$RequestEApiInfo$$Parcelable(PhotoAdvertisement$RequestEApiInfo p0){
       super();
       this.requestEApiInfo$$0 = p0;
    }
    public static PhotoAdvertisement$RequestEApiInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$RequestEApiInfo requestEApiI = new PhotoAdvertisement$RequestEApiInfo();
          p1.f(p1.g(), requestEApiI);
          requestEApiI.mServerExtData = p0.readString();
          requestEApiI.mCardStyleInfo = p0.readSerializable();
          requestEApiI.mDelayMs = p0.readLong();
          requestEApiI.mType = p0.readInt();
          p1.f(i, requestEApiI);
          return requestEApiI;
       }
    }
    public static void write(PhotoAdvertisement$RequestEApiInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mServerExtData);
          p1.writeSerializable(p0.mCardStyleInfo);
          p1.writeLong(p0.mDelayMs);
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$RequestEApiInfo getParcel(){
       return this.requestEApiInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$RequestEApiInfo$$Parcelable.write(this.requestEApiInfo$$0, p0, p1, new a());
    }
}

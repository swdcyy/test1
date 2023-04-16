package com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TrackStringAction$$Parcelable implements Parcelable, d	// class@000a44
{
    public PhotoAdvertisement$TrackStringAction trackStringAction$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TrackStringAction$$Parcelable.CREATOR = new PhotoAdvertisement$TrackStringAction$$Parcelable$a();
    }
    public void PhotoAdvertisement$TrackStringAction$$Parcelable(PhotoAdvertisement$TrackStringAction p0){
       super();
       this.trackStringAction$$0 = p0;
    }
    public static PhotoAdvertisement$TrackStringAction read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TrackStringAction trackStringA = new PhotoAdvertisement$TrackStringAction();
          p1.f(p1.g(), trackStringA);
          trackStringA.mUrl = p0.readString();
          trackStringA.mType = p0.readString();
          p1.f(i, trackStringA);
          return trackStringA;
       }
    }
    public static void write(PhotoAdvertisement$TrackStringAction p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$TrackStringAction getParcel(){
       return this.trackStringAction$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TrackStringAction$$Parcelable.write(this.trackStringAction$$0, p0, p1, new a());
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable implements Parcelable, d	// class@000947
{
    public PhotoAdvertisement$HalfLandingHeaderLabel halfLandingHeaderLabel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable.CREATOR = new PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable$a();
    }
    public void PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable(PhotoAdvertisement$HalfLandingHeaderLabel p0){
       super();
       this.halfLandingHeaderLabel$$0 = p0;
    }
    public static PhotoAdvertisement$HalfLandingHeaderLabel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$HalfLandingHeaderLabel halfLandingH = new PhotoAdvertisement$HalfLandingHeaderLabel();
          p1.f(p1.g(), halfLandingH);
          halfLandingH.mText = p0.readString();
          p1.f(i, halfLandingH);
          return halfLandingH;
       }
    }
    public static void write(PhotoAdvertisement$HalfLandingHeaderLabel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$HalfLandingHeaderLabel getParcel(){
       return this.halfLandingHeaderLabel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable.write(this.halfLandingHeaderLabel$$0, p0, p1, new a());
    }
}

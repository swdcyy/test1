package com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$StrongStyle$$Parcelable implements Parcelable, d	// class@000a22
{
    public PhotoAdvertisement$StrongStyle strongStyle$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$StrongStyle$$Parcelable.CREATOR = new PhotoAdvertisement$StrongStyle$$Parcelable$a();
    }
    public void PhotoAdvertisement$StrongStyle$$Parcelable(PhotoAdvertisement$StrongStyle p0){
       super();
       this.strongStyle$$0 = p0;
    }
    public static PhotoAdvertisement$StrongStyle read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$StrongStyle strongStyle = new PhotoAdvertisement$StrongStyle();
          p1.f(p1.g(), strongStyle);
          strongStyle.mPictureUrl = p0.readString();
          p1.f(i, strongStyle);
          return strongStyle;
       }
    }
    public static void write(PhotoAdvertisement$StrongStyle p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPictureUrl);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$StrongStyle getParcel(){
       return this.strongStyle$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$StrongStyle$$Parcelable.write(this.strongStyle$$0, p0, p1, new a());
    }
}

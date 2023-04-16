package com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$WeakStyle$$Parcelable implements Parcelable, d	// class@000a5d
{
    public PhotoAdvertisement$WeakStyle weakStyle$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$WeakStyle$$Parcelable.CREATOR = new PhotoAdvertisement$WeakStyle$$Parcelable$a();
    }
    public void PhotoAdvertisement$WeakStyle$$Parcelable(PhotoAdvertisement$WeakStyle p0){
       super();
       this.weakStyle$$0 = p0;
    }
    public static PhotoAdvertisement$WeakStyle read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$WeakStyle weakStyle = new PhotoAdvertisement$WeakStyle();
          p1.f(p1.g(), weakStyle);
          weakStyle.mPictureUrl = p0.readString();
          p1.f(i, weakStyle);
          return weakStyle;
       }
    }
    public static void write(PhotoAdvertisement$WeakStyle p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$WeakStyle getParcel(){
       return this.weakStyle$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$WeakStyle$$Parcelable.write(this.weakStyle$$0, p0, p1, new a());
    }
}

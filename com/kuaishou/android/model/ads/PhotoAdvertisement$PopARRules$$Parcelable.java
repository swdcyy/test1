package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$PopARRules$$Parcelable implements Parcelable, d	// class@0009d0
{
    public PhotoAdvertisement$PopARRules popARRules$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PopARRules$$Parcelable.CREATOR = new PhotoAdvertisement$PopARRules$$Parcelable$a();
    }
    public void PhotoAdvertisement$PopARRules$$Parcelable(PhotoAdvertisement$PopARRules p0){
       super();
       this.popARRules$$0 = p0;
    }
    public static PhotoAdvertisement$PopARRules read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PopARRules popARRules = new PhotoAdvertisement$PopARRules();
          p1.f(p1.g(), popARRules);
          popARRules.mContent = p0.readString();
          popARRules.mTitle = p0.readString();
          p1.f(i, popARRules);
          return popARRules;
       }
    }
    public static void write(PhotoAdvertisement$PopARRules p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PopARRules getParcel(){
       return this.popARRules$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PopARRules$$Parcelable.write(this.popARRules$$0, p0, p1, new a());
    }
}

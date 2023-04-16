package com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AppInfoLink$$Parcelable implements Parcelable, d	// class@0008c3
{
    public PhotoAdvertisement$AppInfoLink appInfoLink$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AppInfoLink$$Parcelable.CREATOR = new PhotoAdvertisement$AppInfoLink$$Parcelable$a();
    }
    public void PhotoAdvertisement$AppInfoLink$$Parcelable(PhotoAdvertisement$AppInfoLink p0){
       super();
       this.appInfoLink$$0 = p0;
    }
    public static PhotoAdvertisement$AppInfoLink read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$AppInfoLink uAppInfoLink = new PhotoAdvertisement$AppInfoLink();
          p1.f(p1.g(), uAppInfoLink);
          uAppInfoLink.mLinkUrl = p0.readString();
          uAppInfoLink.mLinkText = p0.readString();
          p1.f(i, uAppInfoLink);
          return uAppInfoLink;
       }
    }
    public static void write(PhotoAdvertisement$AppInfoLink p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mLinkUrl);
          p1.writeString(p0.mLinkText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AppInfoLink getParcel(){
       return this.appInfoLink$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AppInfoLink$$Parcelable.write(this.appInfoLink$$0, p0, p1, new a());
    }
}

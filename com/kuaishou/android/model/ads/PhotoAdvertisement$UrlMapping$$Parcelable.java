package com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$UrlMapping$$Parcelable implements Parcelable, d	// class@000a55
{
    public PhotoAdvertisement$UrlMapping urlMapping$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$UrlMapping$$Parcelable.CREATOR = new PhotoAdvertisement$UrlMapping$$Parcelable$a();
    }
    public void PhotoAdvertisement$UrlMapping$$Parcelable(PhotoAdvertisement$UrlMapping p0){
       super();
       this.urlMapping$$0 = p0;
    }
    public static PhotoAdvertisement$UrlMapping read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$UrlMapping urlMapping = new PhotoAdvertisement$UrlMapping();
          p1.f(p1.g(), urlMapping);
          urlMapping.mUrl = p0.readString();
          urlMapping.mPlaceholder = p0.readString();
          urlMapping.mTitle = p0.readString();
          p1.f(i, urlMapping);
          return urlMapping;
       }
    }
    public static void write(PhotoAdvertisement$UrlMapping p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeString(p0.mPlaceholder);
          p1.writeString(p0.mTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$UrlMapping getParcel(){
       return this.urlMapping$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$UrlMapping$$Parcelable.write(this.urlMapping$$0, p0, p1, new a());
    }
}

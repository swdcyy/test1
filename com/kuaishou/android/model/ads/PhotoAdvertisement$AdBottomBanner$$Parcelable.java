package com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AdBottomBanner$$Parcelable implements Parcelable, d	// class@00088c
{
    public PhotoAdvertisement$AdBottomBanner adBottomBanner$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdBottomBanner$$Parcelable.CREATOR = new PhotoAdvertisement$AdBottomBanner$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdBottomBanner$$Parcelable(PhotoAdvertisement$AdBottomBanner p0){
       super();
       this.adBottomBanner$$0 = p0;
    }
    public static PhotoAdvertisement$AdBottomBanner read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$AdBottomBanner uAdBottomBan = new PhotoAdvertisement$AdBottomBanner();
          p1.f(p1.g(), uAdBottomBan);
          uAdBottomBan.mTemplateId = p0.readString();
          p1.f(i, uAdBottomBan);
          return uAdBottomBan;
       }
    }
    public static void write(PhotoAdvertisement$AdBottomBanner p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdBottomBanner getParcel(){
       return this.adBottomBanner$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdBottomBanner$$Parcelable.write(this.adBottomBanner$$0, p0, p1, new a());
    }
}

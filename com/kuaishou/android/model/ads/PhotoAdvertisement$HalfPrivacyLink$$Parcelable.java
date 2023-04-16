package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$HalfPrivacyLink$$Parcelable implements Parcelable, d	// class@000953
{
    public PhotoAdvertisement$HalfPrivacyLink halfPrivacyLink$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HalfPrivacyLink$$Parcelable.CREATOR = new PhotoAdvertisement$HalfPrivacyLink$$Parcelable$a();
    }
    public void PhotoAdvertisement$HalfPrivacyLink$$Parcelable(PhotoAdvertisement$HalfPrivacyLink p0){
       super();
       this.halfPrivacyLink$$0 = p0;
    }
    public static PhotoAdvertisement$HalfPrivacyLink read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$HalfPrivacyLink halfPrivacyL = new PhotoAdvertisement$HalfPrivacyLink();
          p1.f(p1.g(), halfPrivacyL);
          halfPrivacyL.mLinkUrl = p0.readString();
          halfPrivacyL.mLinkText = p0.readString();
          p1.f(i, halfPrivacyL);
          return halfPrivacyL;
       }
    }
    public static void write(PhotoAdvertisement$HalfPrivacyLink p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$HalfPrivacyLink getParcel(){
       return this.halfPrivacyLink$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HalfPrivacyLink$$Parcelable.write(this.halfPrivacyLink$$0, p0, p1, new a());
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ExtraDisplayTag$$Parcelable implements Parcelable, d	// class@00092b
{
    public PhotoAdvertisement$ExtraDisplayTag extraDisplayTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ExtraDisplayTag$$Parcelable.CREATOR = new PhotoAdvertisement$ExtraDisplayTag$$Parcelable$a();
    }
    public void PhotoAdvertisement$ExtraDisplayTag$$Parcelable(PhotoAdvertisement$ExtraDisplayTag p0){
       super();
       this.extraDisplayTag$$0 = p0;
    }
    public static PhotoAdvertisement$ExtraDisplayTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ExtraDisplayTag uExtraDispla = new PhotoAdvertisement$ExtraDisplayTag();
          p1.f(p1.g(), uExtraDispla);
          uExtraDispla.mUrl = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          uExtraDispla.mCanClick = b;
          uExtraDispla.mText = p0.readString();
          p1.f(i, uExtraDispla);
          return uExtraDispla;
       }
    }
    public static void write(PhotoAdvertisement$ExtraDisplayTag p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mUrl);
          p1.writeInt(p0.mCanClick);
          p1.writeString(p0.mText);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ExtraDisplayTag getParcel(){
       return this.extraDisplayTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ExtraDisplayTag$$Parcelable.write(this.extraDisplayTag$$0, p0, p1, new a());
    }
}

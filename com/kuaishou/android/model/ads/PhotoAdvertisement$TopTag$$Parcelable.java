package com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TopTag$$Parcelable implements Parcelable, d	// class@000a38
{
    public PhotoAdvertisement$TopTag topTag$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TopTag$$Parcelable.CREATOR = new PhotoAdvertisement$TopTag$$Parcelable$a();
    }
    public void PhotoAdvertisement$TopTag$$Parcelable(PhotoAdvertisement$TopTag p0){
       super();
       this.topTag$$0 = p0;
    }
    public static PhotoAdvertisement$TopTag read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TopTag topTag = new PhotoAdvertisement$TopTag();
          p1.f(p1.g(), topTag);
          topTag.mText = p0.readString();
          p1.f(i, topTag);
          return topTag;
       }
    }
    public static void write(PhotoAdvertisement$TopTag p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$TopTag getParcel(){
       return this.topTag$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TopTag$$Parcelable.write(this.topTag$$0, p0, p1, new a());
    }
}

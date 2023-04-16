package com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$HintMapping$$Parcelable implements Parcelable, d	// class@00095b
{
    public PhotoAdvertisement$HintMapping hintMapping$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$HintMapping$$Parcelable.CREATOR = new PhotoAdvertisement$HintMapping$$Parcelable$a();
    }
    public void PhotoAdvertisement$HintMapping$$Parcelable(PhotoAdvertisement$HintMapping p0){
       super();
       this.hintMapping$$0 = p0;
    }
    public static PhotoAdvertisement$HintMapping read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$HintMapping hintMapping = new PhotoAdvertisement$HintMapping();
          p1.f(p1.g(), hintMapping);
          hintMapping.mPlaceholder = p0.readString();
          hintMapping.mClick = p0.readString();
          p1.f(i, hintMapping);
          return hintMapping;
       }
    }
    public static void write(PhotoAdvertisement$HintMapping p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPlaceholder);
          p1.writeString(p0.mClick);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$HintMapping getParcel(){
       return this.hintMapping$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$HintMapping$$Parcelable.write(this.hintMapping$$0, p0, p1, new a());
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AxisDirection$$Parcelable implements Parcelable, d	// class@0008cd
{
    public PhotoAdvertisement$AxisDirection axisDirection$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AxisDirection$$Parcelable.CREATOR = new PhotoAdvertisement$AxisDirection$$Parcelable$a();
    }
    public void PhotoAdvertisement$AxisDirection$$Parcelable(PhotoAdvertisement$AxisDirection p0){
       super();
       this.axisDirection$$0 = p0;
    }
    public static PhotoAdvertisement$AxisDirection read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$AxisDirection uAxisDirecti = new PhotoAdvertisement$AxisDirection();
          p1.f(p1.g(), uAxisDirecti);
          uAxisDirecti.mRotateDegree = p0.readInt();
          uAxisDirecti.mRotateDirection = p0.readInt();
          p1.f(i, uAxisDirecti);
          return uAxisDirecti;
       }
    }
    public static void write(PhotoAdvertisement$AxisDirection p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mRotateDegree);
          p1.writeInt(p0.mRotateDirection);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AxisDirection getParcel(){
       return this.axisDirection$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AxisDirection$$Parcelable.write(this.axisDirection$$0, p0, p1, new a());
    }
}

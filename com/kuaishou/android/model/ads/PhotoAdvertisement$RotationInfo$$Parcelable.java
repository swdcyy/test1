package com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$$Parcelable;

public class PhotoAdvertisement$RotationInfo$$Parcelable implements Parcelable, d	// class@000a00
{
    public PhotoAdvertisement$RotationInfo rotationInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$RotationInfo$$Parcelable.CREATOR = new PhotoAdvertisement$RotationInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$RotationInfo$$Parcelable(PhotoAdvertisement$RotationInfo p0){
       super();
       this.rotationInfo$$0 = p0;
    }
    public static PhotoAdvertisement$RotationInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$RotationInfo rotationInfo = new PhotoAdvertisement$RotationInfo();
          p1.f(p1.g(), rotationInfo);
          rotationInfo.mXAxisDirection = PhotoAdvertisement$AxisDirection$$Parcelable.read(p0, p1);
          rotationInfo.mRotateEnableDelayTimeMs = p0.readInt();
          rotationInfo.mTitle = p0.readString();
          rotationInfo.mYAxisDirection = PhotoAdvertisement$AxisDirection$$Parcelable.read(p0, p1);
          rotationInfo.mZAxisDirection = PhotoAdvertisement$AxisDirection$$Parcelable.read(p0, p1);
          rotationInfo.mSubTitle = p0.readString();
          p1.f(i, rotationInfo);
          return rotationInfo;
       }
    }
    public static void write(PhotoAdvertisement$RotationInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          PhotoAdvertisement$AxisDirection$$Parcelable.write(p0.mXAxisDirection, p1, p2, p3);
          p1.writeInt(p0.mRotateEnableDelayTimeMs);
          p1.writeString(p0.mTitle);
          PhotoAdvertisement$AxisDirection$$Parcelable.write(p0.mYAxisDirection, p1, p2, p3);
          PhotoAdvertisement$AxisDirection$$Parcelable.write(p0.mZAxisDirection, p1, p2, p3);
          p1.writeString(p0.mSubTitle);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$RotationInfo getParcel(){
       return this.rotationInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$RotationInfo$$Parcelable.write(this.rotationInfo$$0, p0, p1, new a());
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ShakeInfo$$Parcelable implements Parcelable, d	// class@000a18
{
    public PhotoAdvertisement$ShakeInfo shakeInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ShakeInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ShakeInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ShakeInfo$$Parcelable(PhotoAdvertisement$ShakeInfo p0){
       super();
       this.shakeInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ShakeInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PhotoAdvertisement$ShakeInfo shakeInfo = new PhotoAdvertisement$ShakeInfo();
          p1.f(p1.g(), shakeInfo);
          shakeInfo.mAccelerationThreshold = p0.readInt();
          shakeInfo.mSubtitle = p0.readString();
          shakeInfo.mTitle = p0.readString();
          shakeInfo.mShakeEnableDelayTimeMs = p0.readInt();
          shakeInfo.mTriggerCount = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          shakeInfo.mClickDisabled = b;
          p1.f(i, shakeInfo);
          return shakeInfo;
       }
    }
    public static void write(PhotoAdvertisement$ShakeInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mAccelerationThreshold);
          p1.writeString(p0.mSubtitle);
          p1.writeString(p0.mTitle);
          p1.writeInt(p0.mShakeEnableDelayTimeMs);
          p1.writeInt(p0.mTriggerCount);
          p1.writeInt(p0.mClickDisabled);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ShakeInfo getParcel(){
       return this.shakeInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ShakeInfo$$Parcelable.write(this.shakeInfo$$0, p0, p1, new a());
    }
}

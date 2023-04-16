package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$PrivacyAppInfo$$Parcelable implements Parcelable, d	// class@0009e2
{
    public PhotoAdvertisement$PrivacyAppInfo privacyAppInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$PrivacyAppInfo$$Parcelable.CREATOR = new PhotoAdvertisement$PrivacyAppInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$PrivacyAppInfo$$Parcelable(PhotoAdvertisement$PrivacyAppInfo p0){
       super();
       this.privacyAppInfo$$0 = p0;
    }
    public static PhotoAdvertisement$PrivacyAppInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$PrivacyAppInfo privacyAppIn = new PhotoAdvertisement$PrivacyAppInfo();
          p1.f(p1.g(), privacyAppIn);
          privacyAppIn.mPackageSize = p0.readDouble();
          privacyAppIn.mAppVersion = p0.readString();
          privacyAppIn.mDeveloper = p0.readString();
          privacyAppIn.mAppName = p0.readString();
          privacyAppIn.mUpdateTime = p0.readLong();
          p1.f(i, privacyAppIn);
          return privacyAppIn;
       }
    }
    public static void write(PhotoAdvertisement$PrivacyAppInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeDouble(p0.mPackageSize);
          p1.writeString(p0.mAppVersion);
          p1.writeString(p0.mDeveloper);
          p1.writeString(p0.mAppName);
          p1.writeLong(p0.mUpdateTime);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$PrivacyAppInfo getParcel(){
       return this.privacyAppInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$PrivacyAppInfo$$Parcelable.write(this.privacyAppInfo$$0, p0, p1, new a());
    }
}

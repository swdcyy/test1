package com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$InterceptInfo$$Parcelable implements Parcelable, d	// class@00096f
{
    public PhotoAdvertisement$InterceptInfo interceptInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$InterceptInfo$$Parcelable.CREATOR = new PhotoAdvertisement$InterceptInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$InterceptInfo$$Parcelable(PhotoAdvertisement$InterceptInfo p0){
       super();
       this.interceptInfo$$0 = p0;
    }
    public static PhotoAdvertisement$InterceptInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$InterceptInfo interceptInf = new PhotoAdvertisement$InterceptInfo();
          p1.f(p1.g(), interceptInf);
          interceptInf.mContent = p0.readString();
          interceptInf.mDelayShowMs = p0.readLong();
          interceptInf.mLottieUrl = p0.readString();
          interceptInf.mActionBar = p0.readString();
          interceptInf.mSpeedUpTimeMs = p0.readLong();
          interceptInf.mToast = p0.readString();
          p1.f(i, interceptInf);
          return interceptInf;
       }
    }
    public static void write(PhotoAdvertisement$InterceptInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mContent);
          p1.writeLong(p0.mDelayShowMs);
          p1.writeString(p0.mLottieUrl);
          p1.writeString(p0.mActionBar);
          p1.writeLong(p0.mSpeedUpTimeMs);
          p1.writeString(p0.mToast);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$InterceptInfo getParcel(){
       return this.interceptInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$InterceptInfo$$Parcelable.write(this.interceptInfo$$0, p0, p1, new a());
    }
}

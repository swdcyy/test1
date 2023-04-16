package com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$ConvertInfo$$Parcelable implements Parcelable, d	// class@0008ef
{
    public PhotoAdvertisement$ConvertInfo convertInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$ConvertInfo$$Parcelable.CREATOR = new PhotoAdvertisement$ConvertInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$ConvertInfo$$Parcelable(PhotoAdvertisement$ConvertInfo p0){
       super();
       this.convertInfo$$0 = p0;
    }
    public static PhotoAdvertisement$ConvertInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$ConvertInfo uConvertInfo = new PhotoAdvertisement$ConvertInfo();
          p1.f(p1.g(), uConvertInfo);
          uConvertInfo.mConvertType = p0.readInt();
          uConvertInfo.mConvertId = p0.readInt();
          p1.f(i, uConvertInfo);
          return uConvertInfo;
       }
    }
    public static void write(PhotoAdvertisement$ConvertInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mConvertType);
          p1.writeInt(p0.mConvertId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$ConvertInfo getParcel(){
       return this.convertInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$ConvertInfo$$Parcelable.write(this.convertInfo$$0, p0, p1, new a());
    }
}

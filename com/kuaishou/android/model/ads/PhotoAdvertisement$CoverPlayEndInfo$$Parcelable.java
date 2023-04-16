package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverPlayEndInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$CoverPlayEndInfo$$Parcelable implements Parcelable, d	// class@00090b
{
    public PhotoAdvertisement$CoverPlayEndInfo coverPlayEndInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$CoverPlayEndInfo$$Parcelable.CREATOR = new PhotoAdvertisement$CoverPlayEndInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$CoverPlayEndInfo$$Parcelable(PhotoAdvertisement$CoverPlayEndInfo p0){
       super();
       this.coverPlayEndInfo$$0 = p0;
    }
    public static PhotoAdvertisement$CoverPlayEndInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$CoverPlayEndInfo uCoverPlayEn = new PhotoAdvertisement$CoverPlayEndInfo();
          p1.f(p1.g(), uCoverPlayEn);
          uCoverPlayEn.mTemplateId = p0.readString();
          p1.f(i, uCoverPlayEn);
          return uCoverPlayEn;
       }
    }
    public static void write(PhotoAdvertisement$CoverPlayEndInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTemplateId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$CoverPlayEndInfo getParcel(){
       return this.coverPlayEndInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$CoverPlayEndInfo$$Parcelable.write(this.coverPlayEndInfo$$0, p0, p1, new a());
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$NovelCardInfo$$Parcelable implements Parcelable, d	// class@0009b8
{
    public PhotoAdvertisement$NovelCardInfo novelCardInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$NovelCardInfo$$Parcelable.CREATOR = new PhotoAdvertisement$NovelCardInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$NovelCardInfo$$Parcelable(PhotoAdvertisement$NovelCardInfo p0){
       super();
       this.novelCardInfo$$0 = p0;
    }
    public static PhotoAdvertisement$NovelCardInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$NovelCardInfo novelCardInf = new PhotoAdvertisement$NovelCardInfo();
          p1.f(p1.g(), novelCardInf);
          novelCardInf.mTemplateId = p0.readString();
          p1.f(i, novelCardInf);
          return novelCardInf;
       }
    }
    public static void write(PhotoAdvertisement$NovelCardInfo p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$NovelCardInfo getParcel(){
       return this.novelCardInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$NovelCardInfo$$Parcelable.write(this.novelCardInfo$$0, p0, p1, new a());
    }
}

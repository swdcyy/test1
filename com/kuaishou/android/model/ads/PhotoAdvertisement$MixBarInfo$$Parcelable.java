package com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$MixBarInfo$$Parcelable implements Parcelable, d	// class@0009a4
{
    public PhotoAdvertisement$MixBarInfo mixBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$MixBarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$MixBarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$MixBarInfo$$Parcelable(PhotoAdvertisement$MixBarInfo p0){
       super();
       this.mixBarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$MixBarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$MixBarInfo mixBarInfo = new PhotoAdvertisement$MixBarInfo();
          p1.f(p1.g(), mixBarInfo);
          mixBarInfo.mTemplateId = p0.readString();
          p1.f(i, mixBarInfo);
          return mixBarInfo;
       }
    }
    public static void write(PhotoAdvertisement$MixBarInfo p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$MixBarInfo getParcel(){
       return this.mixBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$MixBarInfo$$Parcelable.write(this.mixBarInfo$$0, p0, p1, new a());
    }
}

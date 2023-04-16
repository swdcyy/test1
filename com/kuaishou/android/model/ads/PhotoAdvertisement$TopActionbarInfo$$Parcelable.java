package com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$TopActionbarInfo$$Parcelable implements Parcelable, d	// class@000a34
{
    public PhotoAdvertisement$TopActionbarInfo topActionbarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$TopActionbarInfo$$Parcelable.CREATOR = new PhotoAdvertisement$TopActionbarInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$TopActionbarInfo$$Parcelable(PhotoAdvertisement$TopActionbarInfo p0){
       super();
       this.topActionbarInfo$$0 = p0;
    }
    public static PhotoAdvertisement$TopActionbarInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$TopActionbarInfo topActionbar = new PhotoAdvertisement$TopActionbarInfo();
          p1.f(p1.g(), topActionbar);
          topActionbar.mTemplateId = p0.readString();
          p1.f(i, topActionbar);
          return topActionbar;
       }
    }
    public static void write(PhotoAdvertisement$TopActionbarInfo p0,Parcel p1,int p2,a p3){
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
    public PhotoAdvertisement$TopActionbarInfo getParcel(){
       return this.topActionbarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$TopActionbarInfo$$Parcelable.write(this.topActionbarInfo$$0, p0, p1, new a());
    }
}

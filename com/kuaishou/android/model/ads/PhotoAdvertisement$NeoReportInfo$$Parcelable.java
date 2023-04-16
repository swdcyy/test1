package com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$NeoReportInfo$$Parcelable implements Parcelable, d	// class@0009b4
{
    public PhotoAdvertisement$NeoReportInfo neoReportInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$NeoReportInfo$$Parcelable.CREATOR = new PhotoAdvertisement$NeoReportInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$NeoReportInfo$$Parcelable(PhotoAdvertisement$NeoReportInfo p0){
       super();
       this.neoReportInfo$$0 = p0;
    }
    public static PhotoAdvertisement$NeoReportInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$NeoReportInfo neoReportInf = new PhotoAdvertisement$NeoReportInfo();
          p1.f(p1.g(), neoReportInf);
          neoReportInf.mType = p0.readInt();
          p1.f(i, neoReportInf);
          return neoReportInf;
       }
    }
    public static void write(PhotoAdvertisement$NeoReportInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$NeoReportInfo getParcel(){
       return this.neoReportInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$NeoReportInfo$$Parcelable.write(this.neoReportInfo$$0, p0, p1, new a());
    }
}

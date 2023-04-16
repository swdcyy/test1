package com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$DownloadInfo$$Parcelable implements Parcelable, d	// class@00091f
{
    public PhotoAdvertisement$DownloadInfo downloadInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$DownloadInfo$$Parcelable.CREATOR = new PhotoAdvertisement$DownloadInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$DownloadInfo$$Parcelable(PhotoAdvertisement$DownloadInfo p0){
       super();
       this.downloadInfo$$0 = p0;
    }
    public static PhotoAdvertisement$DownloadInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$DownloadInfo uDownloadInf = new PhotoAdvertisement$DownloadInfo();
          p1.f(p1.g(), uDownloadInf);
          uDownloadInf.mDownloadIcon = p0.readString();
          uDownloadInf.mDownloadTitle = p0.readString();
          uDownloadInf.mDownloadPhaseType = p0.readInt();
          p1.f(i, uDownloadInf);
          return uDownloadInf;
       }
    }
    public static void write(PhotoAdvertisement$DownloadInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mDownloadIcon);
          p1.writeString(p0.mDownloadTitle);
          p1.writeInt(p0.mDownloadPhaseType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$DownloadInfo getParcel(){
       return this.downloadInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$DownloadInfo$$Parcelable.write(this.downloadInfo$$0, p0, p1, new a());
    }
}

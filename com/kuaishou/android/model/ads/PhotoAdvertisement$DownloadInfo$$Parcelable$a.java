package com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DownloadInfo;

public class PhotoAdvertisement$DownloadInfo$$Parcelable$a implements Parcelable$Creator	// class@00091e
{

    public void PhotoAdvertisement$DownloadInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$DownloadInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$DownloadInfo$$Parcelable(PhotoAdvertisement$DownloadInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$DownloadInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$DownloadInfo$$Parcelable[] uDownloadInf = new PhotoAdvertisement$DownloadInfo$$Parcelable[p0];
       return uDownloadInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

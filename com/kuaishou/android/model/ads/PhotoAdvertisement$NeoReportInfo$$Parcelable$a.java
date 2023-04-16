package com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NeoReportInfo;

public class PhotoAdvertisement$NeoReportInfo$$Parcelable$a implements Parcelable$Creator	// class@0009b3
{

    public void PhotoAdvertisement$NeoReportInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$NeoReportInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$NeoReportInfo$$Parcelable(PhotoAdvertisement$NeoReportInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$NeoReportInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$NeoReportInfo$$Parcelable[] neoReportInf = new PhotoAdvertisement$NeoReportInfo$$Parcelable[p0];
       return neoReportInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

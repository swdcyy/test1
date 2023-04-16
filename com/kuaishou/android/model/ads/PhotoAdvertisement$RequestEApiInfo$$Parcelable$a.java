package com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;

public class PhotoAdvertisement$RequestEApiInfo$$Parcelable$a implements Parcelable$Creator	// class@0009f5
{

    public void PhotoAdvertisement$RequestEApiInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$RequestEApiInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$RequestEApiInfo$$Parcelable(PhotoAdvertisement$RequestEApiInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$RequestEApiInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$RequestEApiInfo$$Parcelable[] requestEApiI = new PhotoAdvertisement$RequestEApiInfo$$Parcelable[p0];
       return requestEApiI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

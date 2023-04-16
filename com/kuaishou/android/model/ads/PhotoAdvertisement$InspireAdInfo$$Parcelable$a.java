package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;

public class PhotoAdvertisement$InspireAdInfo$$Parcelable$a implements Parcelable$Creator	// class@000962
{

    public void PhotoAdvertisement$InspireAdInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$InspireAdInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$InspireAdInfo$$Parcelable(PhotoAdvertisement$InspireAdInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$InspireAdInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$InspireAdInfo$$Parcelable[] inspireAdInf = new PhotoAdvertisement$InspireAdInfo$$Parcelable[p0];
       return inspireAdInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

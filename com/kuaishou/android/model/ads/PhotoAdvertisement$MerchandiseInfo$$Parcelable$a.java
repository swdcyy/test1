package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo;

public class PhotoAdvertisement$MerchandiseInfo$$Parcelable$a implements Parcelable$Creator	// class@000997
{

    public void PhotoAdvertisement$MerchandiseInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$MerchandiseInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$MerchandiseInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$MerchandiseInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$MerchandiseInfo$$Parcelable[] merchandiseI = new PhotoAdvertisement$MerchandiseInfo$$Parcelable[p0];
       return merchandiseI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

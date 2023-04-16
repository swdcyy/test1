package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo;

public class PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable$a implements Parcelable$Creator	// class@00099d
{

    public void PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable[] merchandiseI = new PhotoAdvertisement$MerchandiseInfo$MerchandiseItemInfo$$Parcelable[p0];
       return merchandiseI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

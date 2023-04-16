package com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MerchandiseInfo$DiscountInfo;

public class PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable$a implements Parcelable$Creator	// class@000999
{

    public void PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable(PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable[] merchandiseI = new PhotoAdvertisement$MerchandiseInfo$DiscountInfo$$Parcelable[p0];
       return merchandiseI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

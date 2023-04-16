package com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CouponInfo;

public class PhotoAdvertisement$CouponInfo$$Parcelable$a implements Parcelable$Creator	// class@0008f6
{

    public void PhotoAdvertisement$CouponInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CouponInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CouponInfo$$Parcelable(PhotoAdvertisement$CouponInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CouponInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CouponInfo$$Parcelable[] uCouponInfo$ = new PhotoAdvertisement$CouponInfo$$Parcelable[p0];
       return uCouponInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

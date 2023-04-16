package com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SmallShopConfig;

public class PhotoAdvertisement$SmallShopConfig$$Parcelable$a implements Parcelable$Creator	// class@000a1d
{

    public void PhotoAdvertisement$SmallShopConfig$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$SmallShopConfig$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$SmallShopConfig$$Parcelable(PhotoAdvertisement$SmallShopConfig$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$SmallShopConfig$$Parcelable[] b(int p0){
       PhotoAdvertisement$SmallShopConfig$$Parcelable[] smallShopCon = new PhotoAdvertisement$SmallShopConfig$$Parcelable[p0];
       return smallShopCon;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

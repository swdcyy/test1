package com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LiveGoodsInfo;

public class PhotoAdvertisement$LiveGoodsInfo$$Parcelable$a implements Parcelable$Creator	// class@000993
{

    public void PhotoAdvertisement$LiveGoodsInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$LiveGoodsInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$LiveGoodsInfo$$Parcelable(PhotoAdvertisement$LiveGoodsInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$LiveGoodsInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$LiveGoodsInfo$$Parcelable[] liveGoodsInf = new PhotoAdvertisement$LiveGoodsInfo$$Parcelable[p0];
       return liveGoodsInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

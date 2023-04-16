package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo;

public class PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable$a implements Parcelable$Creator	// class@000893
{

    public void PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable(PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable[] uAdCacheStra = new PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable[p0];
       return uAdCacheStra;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

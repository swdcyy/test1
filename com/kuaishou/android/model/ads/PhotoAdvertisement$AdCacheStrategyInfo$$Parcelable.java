package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCacheStrategyInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable implements Parcelable, d	// class@000894
{
    public PhotoAdvertisement$AdCacheStrategyInfo adCacheStrategyInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable.CREATOR = new PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable$a();
    }
    public void PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable(PhotoAdvertisement$AdCacheStrategyInfo p0){
       super();
       this.adCacheStrategyInfo$$0 = p0;
    }
    public static PhotoAdvertisement$AdCacheStrategyInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          PhotoAdvertisement$AdCacheStrategyInfo uAdCacheStra = new PhotoAdvertisement$AdCacheStrategyInfo();
          p1.f(p1.g(), uAdCacheStra);
          uAdCacheStra.mScore = p0.readLong();
          uAdCacheStra.mCacheTime = p0.readInt();
          uAdCacheStra.mGroupType = p0.readInt();
          p1.f(i, uAdCacheStra);
          return uAdCacheStra;
       }
    }
    public static void write(PhotoAdvertisement$AdCacheStrategyInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mScore);
          p1.writeInt(p0.mCacheTime);
          p1.writeInt(p0.mGroupType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PhotoAdvertisement$AdCacheStrategyInfo getParcel(){
       return this.adCacheStrategyInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PhotoAdvertisement$AdCacheStrategyInfo$$Parcelable.write(this.adCacheStrategyInfo$$0, p0, p1, new a());
    }
}
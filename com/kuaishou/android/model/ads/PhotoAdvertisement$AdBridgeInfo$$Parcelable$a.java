package com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBridgeInfo;

public class PhotoAdvertisement$AdBridgeInfo$$Parcelable$a implements Parcelable$Creator	// class@00088f
{

    public void PhotoAdvertisement$AdBridgeInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdBridgeInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdBridgeInfo$$Parcelable(PhotoAdvertisement$AdBridgeInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdBridgeInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdBridgeInfo$$Parcelable[] uAdBridgeInf = new PhotoAdvertisement$AdBridgeInfo$$Parcelable[p0];
       return uAdBridgeInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

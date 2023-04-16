package com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ShakeInfo;

public class PhotoAdvertisement$ShakeInfo$$Parcelable$a implements Parcelable$Creator	// class@000a17
{

    public void PhotoAdvertisement$ShakeInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ShakeInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ShakeInfo$$Parcelable(PhotoAdvertisement$ShakeInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ShakeInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ShakeInfo$$Parcelable[] shakeInfo$$P = new PhotoAdvertisement$ShakeInfo$$Parcelable[p0];
       return shakeInfo$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

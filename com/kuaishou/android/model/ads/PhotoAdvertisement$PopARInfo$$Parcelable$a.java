package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARInfo;

public class PhotoAdvertisement$PopARInfo$$Parcelable$a implements Parcelable$Creator	// class@0009c7
{

    public void PhotoAdvertisement$PopARInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopARInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopARInfo$$Parcelable(PhotoAdvertisement$PopARInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopARInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopARInfo$$Parcelable[] popARInfo$$P = new PhotoAdvertisement$PopARInfo$$Parcelable[p0];
       return popARInfo$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

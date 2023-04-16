package com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTag;

public class PhotoAdvertisement$TopTag$$Parcelable$a implements Parcelable$Creator	// class@000a37
{

    public void PhotoAdvertisement$TopTag$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TopTag$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TopTag$$Parcelable(PhotoAdvertisement$TopTag$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TopTag$$Parcelable[] b(int p0){
       PhotoAdvertisement$TopTag$$Parcelable[] topTag$$Parc = new PhotoAdvertisement$TopTag$$Parcelable[p0];
       return topTag$$Parc;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

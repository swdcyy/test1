package com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;

public class PhotoAdvertisement$WeakStyle$$Parcelable$a implements Parcelable$Creator	// class@000a5c
{

    public void PhotoAdvertisement$WeakStyle$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$WeakStyle$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$WeakStyle$$Parcelable(PhotoAdvertisement$WeakStyle$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$WeakStyle$$Parcelable[] b(int p0){
       PhotoAdvertisement$WeakStyle$$Parcelable[] weakStyle$$P = new PhotoAdvertisement$WeakStyle$$Parcelable[p0];
       return weakStyle$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

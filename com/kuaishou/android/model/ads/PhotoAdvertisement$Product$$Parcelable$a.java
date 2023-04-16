package com.kuaishou.android.model.ads.PhotoAdvertisement$Product$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Product;

public class PhotoAdvertisement$Product$$Parcelable$a implements Parcelable$Creator	// class@0009ed
{

    public void PhotoAdvertisement$Product$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$Product$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$Product$$Parcelable(PhotoAdvertisement$Product$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$Product$$Parcelable[] b(int p0){
       PhotoAdvertisement$Product$$Parcelable[] product$$Par = new PhotoAdvertisement$Product$$Parcelable[p0];
       return product$$Par;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

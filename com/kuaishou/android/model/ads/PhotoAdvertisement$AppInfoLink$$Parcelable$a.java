package com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppInfoLink;

public class PhotoAdvertisement$AppInfoLink$$Parcelable$a implements Parcelable$Creator	// class@0008c2
{

    public void PhotoAdvertisement$AppInfoLink$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AppInfoLink$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AppInfoLink$$Parcelable(PhotoAdvertisement$AppInfoLink$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AppInfoLink$$Parcelable[] b(int p0){
       PhotoAdvertisement$AppInfoLink$$Parcelable[] uAppInfoLink = new PhotoAdvertisement$AppInfoLink$$Parcelable[p0];
       return uAppInfoLink;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

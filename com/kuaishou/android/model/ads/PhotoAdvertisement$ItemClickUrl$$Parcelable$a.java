package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrl;

public class PhotoAdvertisement$ItemClickUrl$$Parcelable$a implements Parcelable$Creator	// class@00097a
{

    public void PhotoAdvertisement$ItemClickUrl$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ItemClickUrl$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ItemClickUrl$$Parcelable(PhotoAdvertisement$ItemClickUrl$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ItemClickUrl$$Parcelable[] b(int p0){
       PhotoAdvertisement$ItemClickUrl$$Parcelable[] itemClickUrl = new PhotoAdvertisement$ItemClickUrl$$Parcelable[p0];
       return itemClickUrl;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

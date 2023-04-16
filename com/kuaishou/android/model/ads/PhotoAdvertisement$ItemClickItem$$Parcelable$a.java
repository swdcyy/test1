package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickItem;

public class PhotoAdvertisement$ItemClickItem$$Parcelable$a implements Parcelable$Creator	// class@000976
{

    public void PhotoAdvertisement$ItemClickItem$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ItemClickItem$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ItemClickItem$$Parcelable(PhotoAdvertisement$ItemClickItem$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ItemClickItem$$Parcelable[] b(int p0){
       PhotoAdvertisement$ItemClickItem$$Parcelable[] itemClickIte = new PhotoAdvertisement$ItemClickItem$$Parcelable[p0];
       return itemClickIte;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickUrlGroup;

public class PhotoAdvertisement$ItemClickUrlGroup$$Parcelable$a implements Parcelable$Creator	// class@00097e
{

    public void PhotoAdvertisement$ItemClickUrlGroup$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ItemClickUrlGroup$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ItemClickUrlGroup$$Parcelable(PhotoAdvertisement$ItemClickUrlGroup$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ItemClickUrlGroup$$Parcelable[] b(int p0){
       PhotoAdvertisement$ItemClickUrlGroup$$Parcelable[] itemClickUrl = new PhotoAdvertisement$ItemClickUrlGroup$$Parcelable[p0];
       return itemClickUrl;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

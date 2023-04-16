package com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Layout;

public class PhotoAdvertisement$Layout$$Parcelable$a implements Parcelable$Creator	// class@00098f
{

    public void PhotoAdvertisement$Layout$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$Layout$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$Layout$$Parcelable(PhotoAdvertisement$Layout$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$Layout$$Parcelable[] b(int p0){
       PhotoAdvertisement$Layout$$Parcelable[] layout$$Parc = new PhotoAdvertisement$Layout$$Parcelable[p0];
       return layout$$Parc;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

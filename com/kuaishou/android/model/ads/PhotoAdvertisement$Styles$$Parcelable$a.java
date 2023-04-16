package com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Styles;

public class PhotoAdvertisement$Styles$$Parcelable$a implements Parcelable$Creator	// class@000a25
{

    public void PhotoAdvertisement$Styles$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$Styles$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$Styles$$Parcelable(PhotoAdvertisement$Styles$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$Styles$$Parcelable[] b(int p0){
       PhotoAdvertisement$Styles$$Parcelable[] styles$$Parc = new PhotoAdvertisement$Styles$$Parcelable[p0];
       return styles$$Parc;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

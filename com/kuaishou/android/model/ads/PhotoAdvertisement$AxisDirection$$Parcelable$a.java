package com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AxisDirection;

public class PhotoAdvertisement$AxisDirection$$Parcelable$a implements Parcelable$Creator	// class@0008cc
{

    public void PhotoAdvertisement$AxisDirection$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AxisDirection$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AxisDirection$$Parcelable(PhotoAdvertisement$AxisDirection$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AxisDirection$$Parcelable[] b(int p0){
       PhotoAdvertisement$AxisDirection$$Parcelable[] uAxisDirecti = new PhotoAdvertisement$AxisDirection$$Parcelable[p0];
       return uAxisDirecti;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

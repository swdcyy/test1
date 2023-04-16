package com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;

public class PhotoAdvertisement$H5ControlInfo$$Parcelable$a implements Parcelable$Creator	// class@00093e
{

    public void PhotoAdvertisement$H5ControlInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$H5ControlInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$H5ControlInfo$$Parcelable(PhotoAdvertisement$H5ControlInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$H5ControlInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$H5ControlInfo$$Parcelable[] h5ControlInf = new PhotoAdvertisement$H5ControlInfo$$Parcelable[p0];
       return h5ControlInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

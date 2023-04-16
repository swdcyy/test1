package com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ConvertInfo;

public class PhotoAdvertisement$ConvertInfo$$Parcelable$a implements Parcelable$Creator	// class@0008ee
{

    public void PhotoAdvertisement$ConvertInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ConvertInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ConvertInfo$$Parcelable(PhotoAdvertisement$ConvertInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ConvertInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ConvertInfo$$Parcelable[] uConvertInfo = new PhotoAdvertisement$ConvertInfo$$Parcelable[p0];
       return uConvertInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

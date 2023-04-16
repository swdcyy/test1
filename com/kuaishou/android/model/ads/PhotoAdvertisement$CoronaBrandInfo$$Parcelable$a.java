package com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoronaBrandInfo;

public class PhotoAdvertisement$CoronaBrandInfo$$Parcelable$a implements Parcelable$Creator	// class@0008f2
{

    public void PhotoAdvertisement$CoronaBrandInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoronaBrandInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoronaBrandInfo$$Parcelable(PhotoAdvertisement$CoronaBrandInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoronaBrandInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoronaBrandInfo$$Parcelable[] uCoronaBrand = new PhotoAdvertisement$CoronaBrandInfo$$Parcelable[p0];
       return uCoronaBrand;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

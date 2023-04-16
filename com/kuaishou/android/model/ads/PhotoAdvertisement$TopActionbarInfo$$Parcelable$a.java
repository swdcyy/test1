package com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopActionbarInfo;

public class PhotoAdvertisement$TopActionbarInfo$$Parcelable$a implements Parcelable$Creator	// class@000a33
{

    public void PhotoAdvertisement$TopActionbarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TopActionbarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TopActionbarInfo$$Parcelable(PhotoAdvertisement$TopActionbarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TopActionbarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TopActionbarInfo$$Parcelable[] topActionbar = new PhotoAdvertisement$TopActionbarInfo$$Parcelable[p0];
       return topActionbar;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

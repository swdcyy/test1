package com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InstreamAdBarInfo;

public class PhotoAdvertisement$InstreamAdBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000966
{

    public void PhotoAdvertisement$InstreamAdBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$InstreamAdBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$InstreamAdBarInfo$$Parcelable(PhotoAdvertisement$InstreamAdBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$InstreamAdBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$InstreamAdBarInfo$$Parcelable[] instreamAdBa = new PhotoAdvertisement$InstreamAdBarInfo$$Parcelable[p0];
       return instreamAdBa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

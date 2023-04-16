package com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;

public class PhotoAdvertisement$ActionbarInfo$$Parcelable$a implements Parcelable$Creator	// class@000883
{

    public void PhotoAdvertisement$ActionbarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ActionbarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ActionbarInfo$$Parcelable(PhotoAdvertisement$ActionbarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ActionbarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ActionbarInfo$$Parcelable[] uActionbarIn = new PhotoAdvertisement$ActionbarInfo$$Parcelable[p0];
       return uActionbarIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

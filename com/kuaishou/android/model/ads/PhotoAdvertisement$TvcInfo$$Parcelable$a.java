package com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TvcInfo;

public class PhotoAdvertisement$TvcInfo$$Parcelable$a implements Parcelable$Creator	// class@000a4f
{

    public void PhotoAdvertisement$TvcInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TvcInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TvcInfo$$Parcelable(PhotoAdvertisement$TvcInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TvcInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TvcInfo$$Parcelable[] tvcInfo$$Par = new PhotoAdvertisement$TvcInfo$$Parcelable[p0];
       return tvcInfo$$Par;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

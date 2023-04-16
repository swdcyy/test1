package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;

public class PhotoAdvertisement$AdWebCardInfo$$Parcelable$a implements Parcelable$Creator	// class@0008ba
{

    public void PhotoAdvertisement$AdWebCardInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdWebCardInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdWebCardInfo$$Parcelable(PhotoAdvertisement$AdWebCardInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdWebCardInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdWebCardInfo$$Parcelable[] uAdWebCardIn = new PhotoAdvertisement$AdWebCardInfo$$Parcelable[p0];
       return uAdWebCardIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

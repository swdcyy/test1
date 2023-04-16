package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;

public class PhotoAdvertisement$ExtraDisplayInfo$$Parcelable$a implements Parcelable$Creator	// class@000926
{

    public void PhotoAdvertisement$ExtraDisplayInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ExtraDisplayInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ExtraDisplayInfo$$Parcelable(PhotoAdvertisement$ExtraDisplayInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ExtraDisplayInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ExtraDisplayInfo$$Parcelable[] uExtraDispla = new PhotoAdvertisement$ExtraDisplayInfo$$Parcelable[p0];
       return uExtraDispla;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

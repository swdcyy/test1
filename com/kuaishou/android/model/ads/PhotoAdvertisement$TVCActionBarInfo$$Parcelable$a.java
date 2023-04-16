package com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TVCActionBarInfo;

public class PhotoAdvertisement$TVCActionBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000a29
{

    public void PhotoAdvertisement$TVCActionBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TVCActionBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TVCActionBarInfo$$Parcelable(PhotoAdvertisement$TVCActionBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TVCActionBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TVCActionBarInfo$$Parcelable[] tVCActionBar = new PhotoAdvertisement$TVCActionBarInfo$$Parcelable[p0];
       return tVCActionBar;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

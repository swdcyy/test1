package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;

public class PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable$a implements Parcelable$Creator	// class@000a0f
{

    public void PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable(PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable[] searchSuspen = new PhotoAdvertisement$SearchSuspendedBallInfo$$Parcelable[p0];
       return searchSuspen;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

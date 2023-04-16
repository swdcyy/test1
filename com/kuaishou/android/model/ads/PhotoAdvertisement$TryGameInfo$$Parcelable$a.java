package com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TryGameInfo;

public class PhotoAdvertisement$TryGameInfo$$Parcelable$a implements Parcelable$Creator	// class@000a4b
{

    public void PhotoAdvertisement$TryGameInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TryGameInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TryGameInfo$$Parcelable(PhotoAdvertisement$TryGameInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TryGameInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TryGameInfo$$Parcelable[] tryGameInfo$ = new PhotoAdvertisement$TryGameInfo$$Parcelable[p0];
       return tryGameInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARWinInfo;

public class PhotoAdvertisement$PopARWinInfo$$Parcelable$a implements Parcelable$Creator	// class@0009d3
{

    public void PhotoAdvertisement$PopARWinInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopARWinInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopARWinInfo$$Parcelable(PhotoAdvertisement$PopARWinInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopARWinInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopARWinInfo$$Parcelable[] popARWinInfo = new PhotoAdvertisement$PopARWinInfo$$Parcelable[p0];
       return popARWinInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;

public class PhotoAdvertisement$PlayEndInfo$$Parcelable$a implements Parcelable$Creator	// class@0009bf
{

    public void PhotoAdvertisement$PlayEndInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PlayEndInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PlayEndInfo$$Parcelable(PhotoAdvertisement$PlayEndInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PlayEndInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PlayEndInfo$$Parcelable[] playEndInfo$ = new PhotoAdvertisement$PlayEndInfo$$Parcelable[p0];
       return playEndInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

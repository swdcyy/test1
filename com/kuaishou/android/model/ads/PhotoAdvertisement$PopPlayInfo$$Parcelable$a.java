package com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopPlayInfo;

public class PhotoAdvertisement$PopPlayInfo$$Parcelable$a implements Parcelable$Creator	// class@0009d7
{

    public void PhotoAdvertisement$PopPlayInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopPlayInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopPlayInfo$$Parcelable(PhotoAdvertisement$PopPlayInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopPlayInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopPlayInfo$$Parcelable[] popPlayInfo$ = new PhotoAdvertisement$PopPlayInfo$$Parcelable[p0];
       return popPlayInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$MixBarInfo;

public class PhotoAdvertisement$MixBarInfo$$Parcelable$a implements Parcelable$Creator	// class@0009a3
{

    public void PhotoAdvertisement$MixBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$MixBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$MixBarInfo$$Parcelable(PhotoAdvertisement$MixBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$MixBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$MixBarInfo$$Parcelable[] mixBarInfo$$ = new PhotoAdvertisement$MixBarInfo$$Parcelable[p0];
       return mixBarInfo$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

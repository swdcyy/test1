package com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TopTagInfo;

public class PhotoAdvertisement$TopTagInfo$$Parcelable$a implements Parcelable$Creator	// class@000a3b
{

    public void PhotoAdvertisement$TopTagInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TopTagInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TopTagInfo$$Parcelable(PhotoAdvertisement$TopTagInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TopTagInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$TopTagInfo$$Parcelable[] topTagInfo$$ = new PhotoAdvertisement$TopTagInfo$$Parcelable[p0];
       return topTagInfo$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

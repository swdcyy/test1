package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchExtraInfo;

public class PhotoAdvertisement$SearchExtraInfo$$Parcelable$a implements Parcelable$Creator	// class@000a0b
{

    public void PhotoAdvertisement$SearchExtraInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$SearchExtraInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$SearchExtraInfo$$Parcelable(PhotoAdvertisement$SearchExtraInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$SearchExtraInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$SearchExtraInfo$$Parcelable[] searchExtraI = new PhotoAdvertisement$SearchExtraInfo$$Parcelable[p0];
       return searchExtraI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

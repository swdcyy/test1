package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;

public class PhotoAdvertisement$NegativeMenuInfo$$Parcelable$a implements Parcelable$Creator	// class@0009ab
{

    public void PhotoAdvertisement$NegativeMenuInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$NegativeMenuInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$NegativeMenuInfo$$Parcelable(PhotoAdvertisement$NegativeMenuInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$NegativeMenuInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$NegativeMenuInfo$$Parcelable[] negativeMenu = new PhotoAdvertisement$NegativeMenuInfo$$Parcelable[p0];
       return negativeMenu;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

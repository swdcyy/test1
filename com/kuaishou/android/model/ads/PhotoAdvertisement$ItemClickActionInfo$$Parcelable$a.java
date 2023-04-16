package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;

public class PhotoAdvertisement$ItemClickActionInfo$$Parcelable$a implements Parcelable$Creator	// class@000972
{

    public void PhotoAdvertisement$ItemClickActionInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ItemClickActionInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ItemClickActionInfo$$Parcelable(PhotoAdvertisement$ItemClickActionInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ItemClickActionInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ItemClickActionInfo$$Parcelable[] itemClickAct = new PhotoAdvertisement$ItemClickActionInfo$$Parcelable[p0];
       return itemClickAct;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

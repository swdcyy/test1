package com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppDetailInfo;

public class PhotoAdvertisement$AppDetailInfo$$Parcelable$a implements Parcelable$Creator	// class@0008be
{

    public void PhotoAdvertisement$AppDetailInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AppDetailInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AppDetailInfo$$Parcelable(PhotoAdvertisement$AppDetailInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AppDetailInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AppDetailInfo$$Parcelable[] uAppDetailIn = new PhotoAdvertisement$AppDetailInfo$$Parcelable[p0];
       return uAppDetailIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

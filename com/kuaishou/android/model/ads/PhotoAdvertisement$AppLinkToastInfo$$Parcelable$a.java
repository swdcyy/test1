package com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AppLinkToastInfo;

public class PhotoAdvertisement$AppLinkToastInfo$$Parcelable$a implements Parcelable$Creator	// class@0008c6
{

    public void PhotoAdvertisement$AppLinkToastInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AppLinkToastInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AppLinkToastInfo$$Parcelable(PhotoAdvertisement$AppLinkToastInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AppLinkToastInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AppLinkToastInfo$$Parcelable[] uAppLinkToas = new PhotoAdvertisement$AppLinkToastInfo$$Parcelable[p0];
       return uAppLinkToas;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

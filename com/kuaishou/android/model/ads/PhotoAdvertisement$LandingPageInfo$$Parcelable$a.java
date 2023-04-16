package com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$LandingPageInfo;

public class PhotoAdvertisement$LandingPageInfo$$Parcelable$a implements Parcelable$Creator	// class@00098a
{

    public void PhotoAdvertisement$LandingPageInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$LandingPageInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$LandingPageInfo$$Parcelable(PhotoAdvertisement$LandingPageInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$LandingPageInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$LandingPageInfo$$Parcelable[] landingPageI = new PhotoAdvertisement$LandingPageInfo$$Parcelable[p0];
       return landingPageI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

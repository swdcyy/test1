package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;

public class PhotoAdvertisement$HalfLandingPageInfo$$Parcelable$a implements Parcelable$Creator	// class@00094a
{

    public void PhotoAdvertisement$HalfLandingPageInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HalfLandingPageInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HalfLandingPageInfo$$Parcelable(PhotoAdvertisement$HalfLandingPageInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HalfLandingPageInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$HalfLandingPageInfo$$Parcelable[] halfLandingP = new PhotoAdvertisement$HalfLandingPageInfo$$Parcelable[p0];
       return halfLandingP;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

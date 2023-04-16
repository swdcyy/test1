package com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ProfileBottomBannerInfo;

public class PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable$a implements Parcelable$Creator	// class@0009f1
{

    public void PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable(PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable[] profileBotto = new PhotoAdvertisement$ProfileBottomBannerInfo$$Parcelable[p0];
       return profileBotto;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

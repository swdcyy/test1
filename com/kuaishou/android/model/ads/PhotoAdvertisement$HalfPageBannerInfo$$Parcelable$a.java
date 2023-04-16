package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPageBannerInfo;

public class PhotoAdvertisement$HalfPageBannerInfo$$Parcelable$a implements Parcelable$Creator	// class@00094e
{

    public void PhotoAdvertisement$HalfPageBannerInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HalfPageBannerInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HalfPageBannerInfo$$Parcelable(PhotoAdvertisement$HalfPageBannerInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HalfPageBannerInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$HalfPageBannerInfo$$Parcelable[] halfPageBann = new PhotoAdvertisement$HalfPageBannerInfo$$Parcelable[p0];
       return halfPageBann;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

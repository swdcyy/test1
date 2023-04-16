package com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdBottomBanner;

public class PhotoAdvertisement$AdBottomBanner$$Parcelable$a implements Parcelable$Creator	// class@00088b
{

    public void PhotoAdvertisement$AdBottomBanner$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdBottomBanner$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdBottomBanner$$Parcelable(PhotoAdvertisement$AdBottomBanner$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdBottomBanner$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdBottomBanner$$Parcelable[] uAdBottomBan = new PhotoAdvertisement$AdBottomBanner$$Parcelable[p0];
       return uAdBottomBan;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

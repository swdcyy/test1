package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingData;

public class PhotoAdvertisement$HalfLandingData$$Parcelable$a implements Parcelable$Creator	// class@000942
{

    public void PhotoAdvertisement$HalfLandingData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HalfLandingData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HalfLandingData$$Parcelable(PhotoAdvertisement$HalfLandingData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HalfLandingData$$Parcelable[] b(int p0){
       PhotoAdvertisement$HalfLandingData$$Parcelable[] halfLandingD = new PhotoAdvertisement$HalfLandingData$$Parcelable[p0];
       return halfLandingD;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

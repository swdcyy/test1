package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingHeaderLabel;

public class PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable$a implements Parcelable$Creator	// class@000946
{

    public void PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable(PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable[] b(int p0){
       PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable[] halfLandingH = new PhotoAdvertisement$HalfLandingHeaderLabel$$Parcelable[p0];
       return halfLandingH;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

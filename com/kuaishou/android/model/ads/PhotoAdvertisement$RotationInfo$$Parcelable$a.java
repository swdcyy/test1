package com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RotationInfo;

public class PhotoAdvertisement$RotationInfo$$Parcelable$a implements Parcelable$Creator	// class@0009ff
{

    public void PhotoAdvertisement$RotationInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$RotationInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$RotationInfo$$Parcelable(PhotoAdvertisement$RotationInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$RotationInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$RotationInfo$$Parcelable[] rotationInfo = new PhotoAdvertisement$RotationInfo$$Parcelable[p0];
       return rotationInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfPrivacyLink;

public class PhotoAdvertisement$HalfPrivacyLink$$Parcelable$a implements Parcelable$Creator	// class@000952
{

    public void PhotoAdvertisement$HalfPrivacyLink$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HalfPrivacyLink$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HalfPrivacyLink$$Parcelable(PhotoAdvertisement$HalfPrivacyLink$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HalfPrivacyLink$$Parcelable[] b(int p0){
       PhotoAdvertisement$HalfPrivacyLink$$Parcelable[] halfPrivacyL = new PhotoAdvertisement$HalfPrivacyLink$$Parcelable[p0];
       return halfPrivacyL;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

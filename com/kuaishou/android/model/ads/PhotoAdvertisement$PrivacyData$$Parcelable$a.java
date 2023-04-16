package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyData;

public class PhotoAdvertisement$PrivacyData$$Parcelable$a implements Parcelable$Creator	// class@0009e5
{

    public void PhotoAdvertisement$PrivacyData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PrivacyData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PrivacyData$$Parcelable(PhotoAdvertisement$PrivacyData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PrivacyData$$Parcelable[] b(int p0){
       PhotoAdvertisement$PrivacyData$$Parcelable[] privacyData$ = new PhotoAdvertisement$PrivacyData$$Parcelable[p0];
       return privacyData$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

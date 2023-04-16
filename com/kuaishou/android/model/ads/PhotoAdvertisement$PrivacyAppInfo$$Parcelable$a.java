package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyAppInfo;

public class PhotoAdvertisement$PrivacyAppInfo$$Parcelable$a implements Parcelable$Creator	// class@0009e1
{

    public void PhotoAdvertisement$PrivacyAppInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PrivacyAppInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PrivacyAppInfo$$Parcelable(PhotoAdvertisement$PrivacyAppInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PrivacyAppInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PrivacyAppInfo$$Parcelable[] privacyAppIn = new PhotoAdvertisement$PrivacyAppInfo$$Parcelable[p0];
       return privacyAppIn;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

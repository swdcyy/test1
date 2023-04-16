package com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PrivacyOption;

public class PhotoAdvertisement$PrivacyOption$$Parcelable$a implements Parcelable$Creator	// class@0009e9
{

    public void PhotoAdvertisement$PrivacyOption$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PrivacyOption$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PrivacyOption$$Parcelable(PhotoAdvertisement$PrivacyOption$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PrivacyOption$$Parcelable[] b(int p0){
       PhotoAdvertisement$PrivacyOption$$Parcelable[] privacyOptio = new PhotoAdvertisement$PrivacyOption$$Parcelable[p0];
       return privacyOptio;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

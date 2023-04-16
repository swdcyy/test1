package com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdGroup;

public class PhotoAdvertisement$AdGroup$$Parcelable$a implements Parcelable$Creator	// class@0008a5
{

    public void PhotoAdvertisement$AdGroup$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdGroup$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdGroup$$Parcelable(PhotoAdvertisement$AdGroup$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdGroup$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdGroup$$Parcelable[] uAdGroup$$Pa = new PhotoAdvertisement$AdGroup$$Parcelable[p0];
       return uAdGroup$$Pa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

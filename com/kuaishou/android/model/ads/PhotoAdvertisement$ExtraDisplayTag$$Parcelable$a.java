package com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;

public class PhotoAdvertisement$ExtraDisplayTag$$Parcelable$a implements Parcelable$Creator	// class@00092a
{

    public void PhotoAdvertisement$ExtraDisplayTag$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ExtraDisplayTag$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ExtraDisplayTag$$Parcelable(PhotoAdvertisement$ExtraDisplayTag$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ExtraDisplayTag$$Parcelable[] b(int p0){
       PhotoAdvertisement$ExtraDisplayTag$$Parcelable[] uExtraDispla = new PhotoAdvertisement$ExtraDisplayTag$$Parcelable[p0];
       return uExtraDispla;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

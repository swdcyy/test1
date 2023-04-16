package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverUrl;

public class PhotoAdvertisement$CoverUrl$$Parcelable$a implements Parcelable$Creator	// class@000916
{

    public void PhotoAdvertisement$CoverUrl$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverUrl$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverUrl$$Parcelable(PhotoAdvertisement$CoverUrl$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverUrl$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverUrl$$Parcelable[] uCoverUrl$$P = new PhotoAdvertisement$CoverUrl$$Parcelable[p0];
       return uCoverUrl$$P;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

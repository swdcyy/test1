package com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InterceptInfo;

public class PhotoAdvertisement$InterceptInfo$$Parcelable$a implements Parcelable$Creator	// class@00096e
{

    public void PhotoAdvertisement$InterceptInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$InterceptInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$InterceptInfo$$Parcelable(PhotoAdvertisement$InterceptInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$InterceptInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$InterceptInfo$$Parcelable[] interceptInf = new PhotoAdvertisement$InterceptInfo$$Parcelable[p0];
       return interceptInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

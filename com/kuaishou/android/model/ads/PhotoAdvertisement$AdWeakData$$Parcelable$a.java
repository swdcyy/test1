package com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWeakData;

public class PhotoAdvertisement$AdWeakData$$Parcelable$a implements Parcelable$Creator	// class@0008b6
{

    public void PhotoAdvertisement$AdWeakData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdWeakData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdWeakData$$Parcelable(PhotoAdvertisement$AdWeakData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdWeakData$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdWeakData$$Parcelable[] uAdWeakData$ = new PhotoAdvertisement$AdWeakData$$Parcelable[p0];
       return uAdWeakData$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

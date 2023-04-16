package com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;

public class PhotoAdvertisement$StrongStyle$$Parcelable$a implements Parcelable$Creator	// class@000a21
{

    public void PhotoAdvertisement$StrongStyle$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$StrongStyle$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$StrongStyle$$Parcelable(PhotoAdvertisement$StrongStyle$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$StrongStyle$$Parcelable[] b(int p0){
       PhotoAdvertisement$StrongStyle$$Parcelable[] strongStyle$ = new PhotoAdvertisement$StrongStyle$$Parcelable[p0];
       return strongStyle$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;

public class PhotoAdvertisement$InspireAction$$Parcelable$a implements Parcelable$Creator	// class@00095e
{

    public void PhotoAdvertisement$InspireAction$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$InspireAction$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$InspireAction$$Parcelable(PhotoAdvertisement$InspireAction$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$InspireAction$$Parcelable[] b(int p0){
       PhotoAdvertisement$InspireAction$$Parcelable[] inspireActio = new PhotoAdvertisement$InspireAction$$Parcelable[p0];
       return inspireActio;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

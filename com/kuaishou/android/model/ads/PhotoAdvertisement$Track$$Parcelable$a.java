package com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$Track;

public class PhotoAdvertisement$Track$$Parcelable$a implements Parcelable$Creator	// class@000a3f
{

    public void PhotoAdvertisement$Track$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$Track$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$Track$$Parcelable(PhotoAdvertisement$Track$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$Track$$Parcelable[] b(int p0){
       PhotoAdvertisement$Track$$Parcelable[] track$$Parce = new PhotoAdvertisement$Track$$Parcelable[p0];
       return track$$Parce;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

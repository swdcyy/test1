package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;

public class PhotoAdvertisement$NegativeMenu$$Parcelable$a implements Parcelable$Creator	// class@0009a7
{

    public void PhotoAdvertisement$NegativeMenu$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$NegativeMenu$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$NegativeMenu$$Parcelable(PhotoAdvertisement$NegativeMenu$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$NegativeMenu$$Parcelable[] b(int p0){
       PhotoAdvertisement$NegativeMenu$$Parcelable[] negativeMenu = new PhotoAdvertisement$NegativeMenu$$Parcelable[p0];
       return negativeMenu;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

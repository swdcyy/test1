package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRules;

public class PhotoAdvertisement$PopARRules$$Parcelable$a implements Parcelable$Creator	// class@0009cf
{

    public void PhotoAdvertisement$PopARRules$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopARRules$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopARRules$$Parcelable(PhotoAdvertisement$PopARRules$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopARRules$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopARRules$$Parcelable[] popARRules$$ = new PhotoAdvertisement$PopARRules$$Parcelable[p0];
       return popARRules$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

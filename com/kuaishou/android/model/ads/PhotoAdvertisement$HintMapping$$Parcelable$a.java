package com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HintMapping;

public class PhotoAdvertisement$HintMapping$$Parcelable$a implements Parcelable$Creator	// class@00095a
{

    public void PhotoAdvertisement$HintMapping$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$HintMapping$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$HintMapping$$Parcelable(PhotoAdvertisement$HintMapping$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$HintMapping$$Parcelable[] b(int p0){
       PhotoAdvertisement$HintMapping$$Parcelable[] hintMapping$ = new PhotoAdvertisement$HintMapping$$Parcelable[p0];
       return hintMapping$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

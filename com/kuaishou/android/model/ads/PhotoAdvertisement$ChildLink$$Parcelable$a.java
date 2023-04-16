package com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLink;

public class PhotoAdvertisement$ChildLink$$Parcelable$a implements Parcelable$Creator	// class@0008d4
{

    public void PhotoAdvertisement$ChildLink$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ChildLink$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ChildLink$$Parcelable(PhotoAdvertisement$ChildLink$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ChildLink$$Parcelable[] b(int p0){
       PhotoAdvertisement$ChildLink$$Parcelable[] uChildLink$$ = new PhotoAdvertisement$ChildLink$$Parcelable[p0];
       return uChildLink$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

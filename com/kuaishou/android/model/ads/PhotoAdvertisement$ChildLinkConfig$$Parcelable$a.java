package com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ChildLinkConfig;

public class PhotoAdvertisement$ChildLinkConfig$$Parcelable$a implements Parcelable$Creator	// class@0008d8
{

    public void PhotoAdvertisement$ChildLinkConfig$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$ChildLinkConfig$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$ChildLinkConfig$$Parcelable(PhotoAdvertisement$ChildLinkConfig$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$ChildLinkConfig$$Parcelable[] b(int p0){
       PhotoAdvertisement$ChildLinkConfig$$Parcelable[] uChildLinkCo = new PhotoAdvertisement$ChildLinkConfig$$Parcelable[p0];
       return uChildLinkCo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

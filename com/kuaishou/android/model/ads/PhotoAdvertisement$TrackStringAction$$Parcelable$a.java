package com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TrackStringAction;

public class PhotoAdvertisement$TrackStringAction$$Parcelable$a implements Parcelable$Creator	// class@000a43
{

    public void PhotoAdvertisement$TrackStringAction$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$TrackStringAction$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$TrackStringAction$$Parcelable(PhotoAdvertisement$TrackStringAction$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$TrackStringAction$$Parcelable[] b(int p0){
       PhotoAdvertisement$TrackStringAction$$Parcelable[] trackStringA = new PhotoAdvertisement$TrackStringAction$$Parcelable[p0];
       return trackStringA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

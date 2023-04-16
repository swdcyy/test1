package com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$VideoClipInfo;

public class PhotoAdvertisement$VideoClipInfo$$Parcelable$a implements Parcelable$Creator	// class@000a58
{

    public void PhotoAdvertisement$VideoClipInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$VideoClipInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$VideoClipInfo$$Parcelable(PhotoAdvertisement$VideoClipInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$VideoClipInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$VideoClipInfo$$Parcelable[] videoClipInf = new PhotoAdvertisement$VideoClipInfo$$Parcelable[p0];
       return videoClipInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

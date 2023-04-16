package com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopShowVideoInfo;

public class PhotoAdvertisement$PopShowVideoInfo$$Parcelable$a implements Parcelable$Creator	// class@0009db
{

    public void PhotoAdvertisement$PopShowVideoInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopShowVideoInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopShowVideoInfo$$Parcelable(PhotoAdvertisement$PopShowVideoInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopShowVideoInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopShowVideoInfo$$Parcelable[] popShowVideo = new PhotoAdvertisement$PopShowVideoInfo$$Parcelable[p0];
       return popShowVideo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

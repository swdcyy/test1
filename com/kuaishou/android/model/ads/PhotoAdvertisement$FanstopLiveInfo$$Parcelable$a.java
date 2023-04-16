package com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;

public class PhotoAdvertisement$FanstopLiveInfo$$Parcelable$a implements Parcelable$Creator	// class@00093a
{

    public void PhotoAdvertisement$FanstopLiveInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$FanstopLiveInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$FanstopLiveInfo$$Parcelable(PhotoAdvertisement$FanstopLiveInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$FanstopLiveInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$FanstopLiveInfo$$Parcelable[] uFanstopLive = new PhotoAdvertisement$FanstopLiveInfo$$Parcelable[p0];
       return uFanstopLive;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

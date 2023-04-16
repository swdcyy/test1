package com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$DanmakuInfo;

public class PhotoAdvertisement$DanmakuInfo$$Parcelable$a implements Parcelable$Creator	// class@00091a
{

    public void PhotoAdvertisement$DanmakuInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$DanmakuInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$DanmakuInfo$$Parcelable(PhotoAdvertisement$DanmakuInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$DanmakuInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$DanmakuInfo$$Parcelable[] uDanmakuInfo = new PhotoAdvertisement$DanmakuInfo$$Parcelable[p0];
       return uDanmakuInfo;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

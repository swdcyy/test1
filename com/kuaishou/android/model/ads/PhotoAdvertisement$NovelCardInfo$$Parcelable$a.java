package com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;

public class PhotoAdvertisement$NovelCardInfo$$Parcelable$a implements Parcelable$Creator	// class@0009b7
{

    public void PhotoAdvertisement$NovelCardInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$NovelCardInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$NovelCardInfo$$Parcelable(PhotoAdvertisement$NovelCardInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$NovelCardInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$NovelCardInfo$$Parcelable[] novelCardInf = new PhotoAdvertisement$NovelCardInfo$$Parcelable[p0];
       return novelCardInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

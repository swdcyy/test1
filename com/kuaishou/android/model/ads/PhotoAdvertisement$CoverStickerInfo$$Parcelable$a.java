package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverStickerInfo;

public class PhotoAdvertisement$CoverStickerInfo$$Parcelable$a implements Parcelable$Creator	// class@000912
{

    public void PhotoAdvertisement$CoverStickerInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverStickerInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverStickerInfo$$Parcelable(PhotoAdvertisement$CoverStickerInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverStickerInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverStickerInfo$$Parcelable[] uCoverSticke = new PhotoAdvertisement$CoverStickerInfo$$Parcelable[p0];
       return uCoverSticke;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

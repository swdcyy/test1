package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverSticker;

public class PhotoAdvertisement$CoverSticker$$Parcelable$a implements Parcelable$Creator	// class@00090e
{

    public void PhotoAdvertisement$CoverSticker$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverSticker$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverSticker$$Parcelable(PhotoAdvertisement$CoverSticker$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverSticker$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverSticker$$Parcelable[] uCoverSticke = new PhotoAdvertisement$CoverSticker$$Parcelable[p0];
       return uCoverSticke;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

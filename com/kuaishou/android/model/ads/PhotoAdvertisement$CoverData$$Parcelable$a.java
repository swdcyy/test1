package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverData;

public class PhotoAdvertisement$CoverData$$Parcelable$a implements Parcelable$Creator	// class@0008fe
{

    public void PhotoAdvertisement$CoverData$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverData$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverData$$Parcelable(PhotoAdvertisement$CoverData$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverData$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverData$$Parcelable[] uCoverData$$ = new PhotoAdvertisement$CoverData$$Parcelable[p0];
       return uCoverData$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

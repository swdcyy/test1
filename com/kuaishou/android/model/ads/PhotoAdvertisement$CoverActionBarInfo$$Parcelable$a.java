package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverActionBarInfo;

public class PhotoAdvertisement$CoverActionBarInfo$$Parcelable$a implements Parcelable$Creator	// class@0008fa
{

    public void PhotoAdvertisement$CoverActionBarInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverActionBarInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverActionBarInfo$$Parcelable(PhotoAdvertisement$CoverActionBarInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverActionBarInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverActionBarInfo$$Parcelable[] uCoverAction = new PhotoAdvertisement$CoverActionBarInfo$$Parcelable[p0];
       return uCoverAction;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CoverMediaInfo;

public class PhotoAdvertisement$CoverMediaInfo$$Parcelable$a implements Parcelable$Creator	// class@000906
{

    public void PhotoAdvertisement$CoverMediaInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CoverMediaInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CoverMediaInfo$$Parcelable(PhotoAdvertisement$CoverMediaInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CoverMediaInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CoverMediaInfo$$Parcelable[] uCoverMediaI = new PhotoAdvertisement$CoverMediaInfo$$Parcelable[p0];
       return uCoverMediaI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PendantInfo;

public class PhotoAdvertisement$PendantInfo$$Parcelable$a implements Parcelable$Creator	// class@0009bb
{

    public void PhotoAdvertisement$PendantInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PendantInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PendantInfo$$Parcelable(PhotoAdvertisement$PendantInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PendantInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PendantInfo$$Parcelable[] pendantInfo$ = new PhotoAdvertisement$PendantInfo$$Parcelable[p0];
       return pendantInfo$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBrandInfo;

public class PhotoAdvertisement$SearchBrandInfo$$Parcelable$a implements Parcelable$Creator	// class@000a07
{

    public void PhotoAdvertisement$SearchBrandInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$SearchBrandInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$SearchBrandInfo$$Parcelable(PhotoAdvertisement$SearchBrandInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$SearchBrandInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$SearchBrandInfo$$Parcelable[] searchBrandI = new PhotoAdvertisement$SearchBrandInfo$$Parcelable[p0];
       return searchBrandI;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchBigvLive;

public class PhotoAdvertisement$SearchBigvLive$$Parcelable$a implements Parcelable$Creator	// class@000a03
{

    public void PhotoAdvertisement$SearchBigvLive$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$SearchBigvLive$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$SearchBigvLive$$Parcelable(PhotoAdvertisement$SearchBigvLive$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$SearchBigvLive$$Parcelable[] b(int p0){
       PhotoAdvertisement$SearchBigvLive$$Parcelable[] searchBigvLi = new PhotoAdvertisement$SearchBigvLive$$Parcelable[p0];
       return searchBigvLi;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

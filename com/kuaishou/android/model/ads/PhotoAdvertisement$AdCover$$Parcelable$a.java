package com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCover;

public class PhotoAdvertisement$AdCover$$Parcelable$a implements Parcelable$Creator	// class@00089b
{

    public void PhotoAdvertisement$AdCover$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdCover$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdCover$$Parcelable(PhotoAdvertisement$AdCover$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdCover$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdCover$$Parcelable[] uAdCover$$Pa = new PhotoAdvertisement$AdCover$$Parcelable[p0];
       return uAdCover$$Pa;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

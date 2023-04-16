package com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$UrlMapping;

public class PhotoAdvertisement$UrlMapping$$Parcelable$a implements Parcelable$Creator	// class@000a54
{

    public void PhotoAdvertisement$UrlMapping$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$UrlMapping$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$UrlMapping$$Parcelable(PhotoAdvertisement$UrlMapping$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$UrlMapping$$Parcelable[] b(int p0){
       PhotoAdvertisement$UrlMapping$$Parcelable[] urlMapping$$ = new PhotoAdvertisement$UrlMapping$$Parcelable[p0];
       return urlMapping$$;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

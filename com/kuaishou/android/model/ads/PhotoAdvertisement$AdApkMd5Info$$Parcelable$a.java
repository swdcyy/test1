package com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdApkMd5Info;

public class PhotoAdvertisement$AdApkMd5Info$$Parcelable$a implements Parcelable$Creator	// class@000887
{

    public void PhotoAdvertisement$AdApkMd5Info$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdApkMd5Info$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdApkMd5Info$$Parcelable(PhotoAdvertisement$AdApkMd5Info$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdApkMd5Info$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdApkMd5Info$$Parcelable[] uAdApkMd5Inf = new PhotoAdvertisement$AdApkMd5Info$$Parcelable[p0];
       return uAdApkMd5Inf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

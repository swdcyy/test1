package com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;

public class PhotoAdvertisement$AdRerankInfo$$Parcelable$a implements Parcelable$Creator	// class@0008ae
{

    public void PhotoAdvertisement$AdRerankInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdRerankInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdRerankInfo$$Parcelable(PhotoAdvertisement$AdRerankInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdRerankInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdRerankInfo$$Parcelable[] uAdRerankInf = new PhotoAdvertisement$AdRerankInfo$$Parcelable[p0];
       return uAdRerankInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

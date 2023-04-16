package com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CaptionAdvertisementInfo;

public class PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable$a implements Parcelable$Creator	// class@0008d0
{

    public void PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable(PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable[] uCaptionAdve = new PhotoAdvertisement$CaptionAdvertisementInfo$$Parcelable[p0];
       return uCaptionAdve;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdLabelType;

public class PhotoAdvertisement$AdLabelType$$Parcelable$a implements Parcelable$Creator	// class@0008a9
{

    public void PhotoAdvertisement$AdLabelType$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$AdLabelType$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$AdLabelType$$Parcelable(PhotoAdvertisement$AdLabelType$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$AdLabelType$$Parcelable[] b(int p0){
       PhotoAdvertisement$AdLabelType$$Parcelable[] uAdLabelType = new PhotoAdvertisement$AdLabelType$$Parcelable[p0];
       return uAdLabelType;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

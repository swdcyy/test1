package com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;

public class PhotoAdvertisement$NegativeReason$$Parcelable$a implements Parcelable$Creator	// class@0009af
{

    public void PhotoAdvertisement$NegativeReason$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$NegativeReason$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$NegativeReason$$Parcelable(PhotoAdvertisement$NegativeReason$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$NegativeReason$$Parcelable[] b(int p0){
       PhotoAdvertisement$NegativeReason$$Parcelable[] negativeReas = new PhotoAdvertisement$NegativeReason$$Parcelable[p0];
       return negativeReas;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

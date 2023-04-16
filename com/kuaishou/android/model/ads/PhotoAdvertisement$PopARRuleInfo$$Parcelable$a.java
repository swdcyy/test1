package com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PopARRuleInfo;

public class PhotoAdvertisement$PopARRuleInfo$$Parcelable$a implements Parcelable$Creator	// class@0009cb
{

    public void PhotoAdvertisement$PopARRuleInfo$$Parcelable$a(){
       super();
    }
    public PhotoAdvertisement$PopARRuleInfo$$Parcelable a(Parcel p0){
       return new PhotoAdvertisement$PopARRuleInfo$$Parcelable(PhotoAdvertisement$PopARRuleInfo$$Parcelable.read(p0, new a()));
    }
    public PhotoAdvertisement$PopARRuleInfo$$Parcelable[] b(int p0){
       PhotoAdvertisement$PopARRuleInfo$$Parcelable[] popARRuleInf = new PhotoAdvertisement$PopARRuleInfo$$Parcelable[p0];
       return popARRuleInf;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

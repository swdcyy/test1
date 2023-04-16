package com.yxcorp.gifshow.ad.detail.AdDetailBizParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.ad.detail.AdDetailBizParam$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.ad.detail.AdDetailBizParam;

public class AdDetailBizParam$$Parcelable$a implements Parcelable$Creator	// class@001538
{

    public void AdDetailBizParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new AdDetailBizParam$$Parcelable(AdDetailBizParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       AdDetailBizParam$$Parcelable[] $ParcelableA = new AdDetailBizParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

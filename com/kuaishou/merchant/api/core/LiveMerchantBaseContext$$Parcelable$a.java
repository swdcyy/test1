package com.kuaishou.merchant.api.core.LiveMerchantBaseContext$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class LiveMerchantBaseContext$$Parcelable$a implements Parcelable$Creator	// class@0014fc
{

    public void LiveMerchantBaseContext$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveMerchantBaseContext$$Parcelable(LiveMerchantBaseContext$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveMerchantBaseContext$$Parcelable[] $ParcelableA = new LiveMerchantBaseContext$$Parcelable[p0];
       return $ParcelableA;
    }
}

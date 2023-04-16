package com.kuaishou.merchant.api.core.model.MerchantInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.core.model.MerchantInfo$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.core.model.MerchantInfo;

public class MerchantInfo$$Parcelable$a implements Parcelable$Creator	// class@001529
{

    public void MerchantInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MerchantInfo$$Parcelable(MerchantInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MerchantInfo$$Parcelable[] $ParcelableA = new MerchantInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

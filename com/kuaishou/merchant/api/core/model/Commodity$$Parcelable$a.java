package com.kuaishou.merchant.api.core.model.Commodity$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.merchant.api.core.model.Commodity$$Parcelable;
import xwd.a;
import com.kuaishou.merchant.api.core.model.Commodity;

public class Commodity$$Parcelable$a implements Parcelable$Creator	// class@001511
{

    public void Commodity$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new Commodity$$Parcelable(Commodity$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       Commodity$$Parcelable[] $ParcelableA = new Commodity$$Parcelable[p0];
       return $ParcelableA;
    }
}

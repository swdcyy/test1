package com.oplus.ocs.base.common.Feature$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.oplus.ocs.base.common.Feature;

public final class Feature$1 implements Parcelable$Creator	// class@000ab8
{

    public void Feature$1(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       return new Feature(p0);
    }
    public final Object[] newArray(int p0){
       Feature[] uFeatureArra = new Feature[p0];
       return uFeatureArra;
    }
}

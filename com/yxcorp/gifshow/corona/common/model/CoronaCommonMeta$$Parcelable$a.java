package com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaCommonMeta;

public class CoronaCommonMeta$$Parcelable$a implements Parcelable$Creator	// class@001203
{

    public void CoronaCommonMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaCommonMeta$$Parcelable(CoronaCommonMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaCommonMeta$$Parcelable[] $ParcelableA = new CoronaCommonMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

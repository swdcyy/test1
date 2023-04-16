package com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;

public class CoronaZoneFeed$$Parcelable$a implements Parcelable$Creator	// class@00122d
{

    public void CoronaZoneFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaZoneFeed$$Parcelable(CoronaZoneFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaZoneFeed$$Parcelable[] $ParcelableA = new CoronaZoneFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

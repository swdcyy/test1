package com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;

public class CoronaZoneContent$$Parcelable$a implements Parcelable$Creator	// class@001229
{

    public void CoronaZoneContent$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaZoneContent$$Parcelable(CoronaZoneContent$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaZoneContent$$Parcelable[] $ParcelableA = new CoronaZoneContent$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaTubeFeed;

public class CoronaTubeFeed$$Parcelable$a implements Parcelable$Creator	// class@001223
{

    public void CoronaTubeFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTubeFeed$$Parcelable(CoronaTubeFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTubeFeed$$Parcelable[] $ParcelableA = new CoronaTubeFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

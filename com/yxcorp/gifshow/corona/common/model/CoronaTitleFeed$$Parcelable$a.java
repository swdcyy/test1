package com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleFeed;

public class CoronaTitleFeed$$Parcelable$a implements Parcelable$Creator	// class@001220
{

    public void CoronaTitleFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTitleFeed$$Parcelable(CoronaTitleFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTitleFeed$$Parcelable[] $ParcelableA = new CoronaTitleFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

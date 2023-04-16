package com.yxcorp.gifshow.model.LocationInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.LocationInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.LocationInfo;

public final class LocationInfo$$Parcelable$a implements Parcelable$Creator	// class@001e3f
{

    public void LocationInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LocationInfo$$Parcelable(LocationInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LocationInfo$$Parcelable[] $ParcelableA = new LocationInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

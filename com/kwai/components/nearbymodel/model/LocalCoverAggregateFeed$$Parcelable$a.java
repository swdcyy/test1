package com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.LocalCoverAggregateFeed;

public class LocalCoverAggregateFeed$$Parcelable$a implements Parcelable$Creator	// class@000c6f
{

    public void LocalCoverAggregateFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LocalCoverAggregateFeed$$Parcelable(LocalCoverAggregateFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LocalCoverAggregateFeed$$Parcelable[] $ParcelableA = new LocalCoverAggregateFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

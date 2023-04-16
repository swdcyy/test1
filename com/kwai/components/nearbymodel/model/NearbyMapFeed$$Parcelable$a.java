package com.kwai.components.nearbymodel.model.NearbyMapFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.NearbyMapFeed;

public class NearbyMapFeed$$Parcelable$a implements Parcelable$Creator	// class@000c9f
{

    public void NearbyMapFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NearbyMapFeed$$Parcelable(NearbyMapFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NearbyMapFeed$$Parcelable[] $ParcelableA = new NearbyMapFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.components.nearbymodel.model.CityHotSpotFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.CityHotSpotFeed$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.CityHotSpotFeed;

public class CityHotSpotFeed$$Parcelable$a implements Parcelable$Creator	// class@000c69
{

    public void CityHotSpotFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CityHotSpotFeed$$Parcelable(CityHotSpotFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CityHotSpotFeed$$Parcelable[] $ParcelableA = new CityHotSpotFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

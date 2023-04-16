package com.kwai.components.nearbymodel.model.CityHotSpotMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.CityHotSpotMeta$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.CityHotSpotMeta;

public class CityHotSpotMeta$$Parcelable$a implements Parcelable$Creator	// class@000c6c
{

    public void CityHotSpotMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CityHotSpotMeta$$Parcelable(CityHotSpotMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CityHotSpotMeta$$Parcelable[] $ParcelableA = new CityHotSpotMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.components.nearbymodel.model.NearbyCommonMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.NearbyCommonMeta;

public class NearbyCommonMeta$$Parcelable$a implements Parcelable$Creator	// class@000c93
{

    public void NearbyCommonMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NearbyCommonMeta$$Parcelable(NearbyCommonMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NearbyCommonMeta$$Parcelable[] $ParcelableA = new NearbyCommonMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

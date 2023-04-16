package com.kwai.components.nearbymodel.model.BoundaryMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.BoundaryMeta$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.BoundaryMeta;

public class BoundaryMeta$$Parcelable$a implements Parcelable$Creator	// class@000c62
{

    public void BoundaryMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BoundaryMeta$$Parcelable(BoundaryMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BoundaryMeta$$Parcelable[] $ParcelableA = new BoundaryMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

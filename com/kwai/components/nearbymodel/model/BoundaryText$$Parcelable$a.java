package com.kwai.components.nearbymodel.model.BoundaryText$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.BoundaryText$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.BoundaryText;

public class BoundaryText$$Parcelable$a implements Parcelable$Creator	// class@000c66
{

    public void BoundaryText$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BoundaryText$$Parcelable(BoundaryText$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BoundaryText$$Parcelable[] $ParcelableA = new BoundaryText$$Parcelable[p0];
       return $ParcelableA;
    }
}

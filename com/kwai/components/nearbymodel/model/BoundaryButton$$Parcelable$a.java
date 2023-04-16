package com.kwai.components.nearbymodel.model.BoundaryButton$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.BoundaryButton$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.BoundaryButton;

public class BoundaryButton$$Parcelable$a implements Parcelable$Creator	// class@000c5e
{

    public void BoundaryButton$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BoundaryButton$$Parcelable(BoundaryButton$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BoundaryButton$$Parcelable[] $ParcelableA = new BoundaryButton$$Parcelable[p0];
       return $ParcelableA;
    }
}

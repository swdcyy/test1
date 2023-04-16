package com.kwai.components.nearbymodel.model.BoundaryBlankCard$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard$$Parcelable;
import xwd.a;
import com.kwai.components.nearbymodel.model.BoundaryBlankCard;

public class BoundaryBlankCard$$Parcelable$a implements Parcelable$Creator	// class@000c5a
{

    public void BoundaryBlankCard$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BoundaryBlankCard$$Parcelable(BoundaryBlankCard$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BoundaryBlankCard$$Parcelable[] $ParcelableA = new BoundaryBlankCard$$Parcelable[p0];
       return $ParcelableA;
    }
}

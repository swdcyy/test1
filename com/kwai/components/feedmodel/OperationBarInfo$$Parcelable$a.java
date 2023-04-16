package com.kwai.components.feedmodel.OperationBarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.OperationBarInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.OperationBarInfo;

public class OperationBarInfo$$Parcelable$a implements Parcelable$Creator	// class@000c1c
{

    public void OperationBarInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new OperationBarInfo$$Parcelable(OperationBarInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       OperationBarInfo$$Parcelable[] $ParcelableA = new OperationBarInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

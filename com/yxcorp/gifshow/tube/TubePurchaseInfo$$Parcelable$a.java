package com.yxcorp.gifshow.tube.TubePurchaseInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubePurchaseInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubePurchaseInfo;

public class TubePurchaseInfo$$Parcelable$a implements Parcelable$Creator	// class@001e1c
{

    public void TubePurchaseInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubePurchaseInfo$$Parcelable(TubePurchaseInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubePurchaseInfo$$Parcelable[] $ParcelableA = new TubePurchaseInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

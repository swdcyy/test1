package com.yxcorp.gifshow.tube.TubeDateInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeDateInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeDateInfo;

public class TubeDateInfo$$Parcelable$a implements Parcelable$Creator	// class@001e09
{

    public void TubeDateInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeDateInfo$$Parcelable(TubeDateInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeDateInfo$$Parcelable[] $ParcelableA = new TubeDateInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

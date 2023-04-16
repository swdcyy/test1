package com.yxcorp.gifshow.tube.TubeInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeInfo;

public class TubeInfo$$Parcelable$a implements Parcelable$Creator	// class@001e16
{

    public void TubeInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeInfo$$Parcelable(TubeInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeInfo$$Parcelable[] $ParcelableA = new TubeInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

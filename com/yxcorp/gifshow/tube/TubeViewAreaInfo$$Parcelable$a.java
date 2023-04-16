package com.yxcorp.gifshow.tube.TubeViewAreaInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeViewAreaInfo;

public class TubeViewAreaInfo$$Parcelable$a implements Parcelable$Creator	// class@001e27
{

    public void TubeViewAreaInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeViewAreaInfo$$Parcelable(TubeViewAreaInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeViewAreaInfo$$Parcelable[] $ParcelableA = new TubeViewAreaInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

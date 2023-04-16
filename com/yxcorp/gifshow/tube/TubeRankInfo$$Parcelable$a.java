package com.yxcorp.gifshow.tube.TubeRankInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeRankInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeRankInfo;

public class TubeRankInfo$$Parcelable$a implements Parcelable$Creator	// class@001e20
{

    public void TubeRankInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeRankInfo$$Parcelable(TubeRankInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeRankInfo$$Parcelable[] $ParcelableA = new TubeRankInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

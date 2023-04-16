package com.yxcorp.gifshow.entity.TrendingInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.entity.TrendingInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.entity.TrendingInfo;

public class TrendingInfo$$Parcelable$a implements Parcelable$Creator	// class@000d81
{

    public void TrendingInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TrendingInfo$$Parcelable(TrendingInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TrendingInfo$$Parcelable[] $ParcelableA = new TrendingInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

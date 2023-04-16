package com.yxcorp.gifshow.tube.TubeChannelInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeChannelInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeChannelInfo;

public class TubeChannelInfo$$Parcelable$a implements Parcelable$Creator	// class@001e03
{

    public void TubeChannelInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeChannelInfo$$Parcelable(TubeChannelInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeChannelInfo$$Parcelable[] $ParcelableA = new TubeChannelInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

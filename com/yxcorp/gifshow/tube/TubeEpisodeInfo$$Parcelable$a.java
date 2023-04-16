package com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeEpisodeInfo;

public class TubeEpisodeInfo$$Parcelable$a implements Parcelable$Creator	// class@001e11
{

    public void TubeEpisodeInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeEpisodeInfo$$Parcelable(TubeEpisodeInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeEpisodeInfo$$Parcelable[] $ParcelableA = new TubeEpisodeInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

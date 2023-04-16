package com.yxcorp.gifshow.tube.TubeTopicInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeTopicInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeTopicInfo;

public class TubeTopicInfo$$Parcelable$a implements Parcelable$Creator	// class@001e24
{

    public void TubeTopicInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeTopicInfo$$Parcelable(TubeTopicInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeTopicInfo$$Parcelable[] $ParcelableA = new TubeTopicInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

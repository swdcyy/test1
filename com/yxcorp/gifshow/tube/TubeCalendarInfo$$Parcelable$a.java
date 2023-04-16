package com.yxcorp.gifshow.tube.TubeCalendarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeCalendarInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeCalendarInfo;

public class TubeCalendarInfo$$Parcelable$a implements Parcelable$Creator	// class@001e00
{

    public void TubeCalendarInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeCalendarInfo$$Parcelable(TubeCalendarInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeCalendarInfo$$Parcelable[] $ParcelableA = new TubeCalendarInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

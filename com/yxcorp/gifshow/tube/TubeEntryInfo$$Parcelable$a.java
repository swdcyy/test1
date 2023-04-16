package com.yxcorp.gifshow.tube.TubeEntryInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.TubeEntryInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.TubeEntryInfo;

public class TubeEntryInfo$$Parcelable$a implements Parcelable$Creator	// class@001e0d
{

    public void TubeEntryInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new TubeEntryInfo$$Parcelable(TubeEntryInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       TubeEntryInfo$$Parcelable[] $ParcelableA = new TubeEntryInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

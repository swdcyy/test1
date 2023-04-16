package com.kwai.components.feedmodel.ProgressHighLightInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.ProgressHighLightInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.ProgressHighLightInfo;

public class ProgressHighLightInfo$$Parcelable$a implements Parcelable$Creator	// class@000c31
{

    public void ProgressHighLightInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ProgressHighLightInfo$$Parcelable(ProgressHighLightInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ProgressHighLightInfo$$Parcelable[] $ParcelableA = new ProgressHighLightInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.components.feedmodel.HotSpotInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.HotSpotInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.HotSpotInfo;

public class HotSpotInfo$$Parcelable$a implements Parcelable$Creator	// class@000c14
{

    public void HotSpotInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HotSpotInfo$$Parcelable(HotSpotInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HotSpotInfo$$Parcelable[] $ParcelableA = new HotSpotInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

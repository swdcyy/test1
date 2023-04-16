package com.kwai.components.feedmodel.BottomEntryInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.BottomEntryInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.BottomEntryInfo;

public class BottomEntryInfo$$Parcelable$a implements Parcelable$Creator	// class@000c10
{

    public void BottomEntryInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new BottomEntryInfo$$Parcelable(BottomEntryInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       BottomEntryInfo$$Parcelable[] $ParcelableA = new BottomEntryInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

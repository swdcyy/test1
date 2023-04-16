package com.kwai.components.feedmodel.SummaryInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.SummaryInfo$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.SummaryInfo;

public class SummaryInfo$$Parcelable$a implements Parcelable$Creator	// class@000c41
{

    public void SummaryInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SummaryInfo$$Parcelable(SummaryInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SummaryInfo$$Parcelable[] $ParcelableA = new SummaryInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

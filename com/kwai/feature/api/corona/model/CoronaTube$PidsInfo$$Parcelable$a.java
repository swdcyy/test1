package com.kwai.feature.api.corona.model.CoronaTube$PidsInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.corona.model.CoronaTube$PidsInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.corona.model.CoronaTube$PidsInfo;

public class CoronaTube$PidsInfo$$Parcelable$a implements Parcelable$Creator	// class@000dfc
{

    public void CoronaTube$PidsInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTube$PidsInfo$$Parcelable(CoronaTube$PidsInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTube$PidsInfo$$Parcelable[] pidsInfo$$Pa = new CoronaTube$PidsInfo$$Parcelable[p0];
       return pidsInfo$$Pa;
    }
}

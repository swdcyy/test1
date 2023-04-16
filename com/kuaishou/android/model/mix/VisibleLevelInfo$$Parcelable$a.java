package com.kuaishou.android.model.mix.VisibleLevelInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.VisibleLevelInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.VisibleLevelInfo;

public class VisibleLevelInfo$$Parcelable$a implements Parcelable$Creator	// class@000e32
{

    public void VisibleLevelInfo$$Parcelable$a(){
       super();
    }
    public VisibleLevelInfo$$Parcelable a(Parcel p0){
       return new VisibleLevelInfo$$Parcelable(VisibleLevelInfo$$Parcelable.read(p0, new a()));
    }
    public VisibleLevelInfo$$Parcelable[] b(int p0){
       VisibleLevelInfo$$Parcelable[] $ParcelableA = new VisibleLevelInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.mix.CoronaInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoronaInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoronaInfo;

public class CoronaInfo$$Parcelable$a implements Parcelable$Creator	// class@000c0f
{

    public void CoronaInfo$$Parcelable$a(){
       super();
    }
    public CoronaInfo$$Parcelable a(Parcel p0){
       return new CoronaInfo$$Parcelable(CoronaInfo$$Parcelable.read(p0, new a()));
    }
    public CoronaInfo$$Parcelable[] b(int p0){
       CoronaInfo$$Parcelable[] $ParcelableA = new CoronaInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

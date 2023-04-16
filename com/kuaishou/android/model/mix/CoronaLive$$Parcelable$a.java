package com.kuaishou.android.model.mix.CoronaLive$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoronaLive$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoronaLive;

public class CoronaLive$$Parcelable$a implements Parcelable$Creator	// class@000c13
{

    public void CoronaLive$$Parcelable$a(){
       super();
    }
    public CoronaLive$$Parcelable a(Parcel p0){
       return new CoronaLive$$Parcelable(CoronaLive$$Parcelable.read(p0, new a()));
    }
    public CoronaLive$$Parcelable[] b(int p0){
       CoronaLive$$Parcelable[] $ParcelableA = new CoronaLive$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

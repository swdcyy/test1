package com.kuaishou.android.model.mix.CoronaLiveMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoronaLiveMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoronaLiveMeta;

public class CoronaLiveMeta$$Parcelable$a implements Parcelable$Creator	// class@000c16
{

    public void CoronaLiveMeta$$Parcelable$a(){
       super();
    }
    public CoronaLiveMeta$$Parcelable a(Parcel p0){
       return new CoronaLiveMeta$$Parcelable(CoronaLiveMeta$$Parcelable.read(p0, new a()));
    }
    public CoronaLiveMeta$$Parcelable[] b(int p0){
       CoronaLiveMeta$$Parcelable[] $ParcelableA = new CoronaLiveMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

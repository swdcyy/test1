package com.kuaishou.android.model.mix.CoronaModelMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoronaModelMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoronaModelMeta;

public class CoronaModelMeta$$Parcelable$a implements Parcelable$Creator	// class@000c1a
{

    public void CoronaModelMeta$$Parcelable$a(){
       super();
    }
    public CoronaModelMeta$$Parcelable a(Parcel p0){
       return new CoronaModelMeta$$Parcelable(CoronaModelMeta$$Parcelable.read(p0, new a()));
    }
    public CoronaModelMeta$$Parcelable[] b(int p0){
       CoronaModelMeta$$Parcelable[] $ParcelableA = new CoronaModelMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

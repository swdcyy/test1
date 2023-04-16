package com.kuaishou.android.model.mix.TubeMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.TubeMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.TubeMeta;

public class TubeMeta$$Parcelable$a implements Parcelable$Creator	// class@000e1d
{

    public void TubeMeta$$Parcelable$a(){
       super();
    }
    public TubeMeta$$Parcelable a(Parcel p0){
       return new TubeMeta$$Parcelable(TubeMeta$$Parcelable.read(p0, new a()));
    }
    public TubeMeta$$Parcelable[] b(int p0){
       TubeMeta$$Parcelable[] $ParcelableA = new TubeMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.model.mix.CoverMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CoverMeta;

public class CoverMeta$$Parcelable$a implements Parcelable$Creator	// class@000c3b
{

    public void CoverMeta$$Parcelable$a(){
       super();
    }
    public CoverMeta$$Parcelable a(Parcel p0){
       return new CoverMeta$$Parcelable(CoverMeta$$Parcelable.read(p0, new a()));
    }
    public CoverMeta$$Parcelable[] b(int p0){
       CoverMeta$$Parcelable[] $ParcelableA = new CoverMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

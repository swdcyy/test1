package com.kuaishou.android.model.mix.HyperTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HyperTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HyperTag;

public class HyperTag$$Parcelable$a implements Parcelable$Creator	// class@000ca9
{

    public void HyperTag$$Parcelable$a(){
       super();
    }
    public HyperTag$$Parcelable a(Parcel p0){
       return new HyperTag$$Parcelable(HyperTag$$Parcelable.read(p0, new a()));
    }
    public HyperTag$$Parcelable[] b(int p0){
       HyperTag$$Parcelable[] $ParcelableA = new HyperTag$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

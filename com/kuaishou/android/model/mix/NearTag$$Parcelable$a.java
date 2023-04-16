package com.kuaishou.android.model.mix.NearTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.NearTag$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.NearTag;

public class NearTag$$Parcelable$a implements Parcelable$Creator	// class@000d27
{

    public void NearTag$$Parcelable$a(){
       super();
    }
    public NearTag$$Parcelable a(Parcel p0){
       return new NearTag$$Parcelable(NearTag$$Parcelable.read(p0, new a()));
    }
    public NearTag$$Parcelable[] b(int p0){
       NearTag$$Parcelable[] $ParcelableA = new NearTag$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

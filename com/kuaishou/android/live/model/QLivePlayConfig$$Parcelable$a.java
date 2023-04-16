package com.kuaishou.android.live.model.QLivePlayConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.QLivePlayConfig$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.QLivePlayConfig;

public class QLivePlayConfig$$Parcelable$a implements Parcelable$Creator	// class@000824
{

    public void QLivePlayConfig$$Parcelable$a(){
       super();
    }
    public QLivePlayConfig$$Parcelable a(Parcel p0){
       return new QLivePlayConfig$$Parcelable(QLivePlayConfig$$Parcelable.read(p0, new a()));
    }
    public QLivePlayConfig$$Parcelable[] b(int p0){
       QLivePlayConfig$$Parcelable[] $ParcelableA = new QLivePlayConfig$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.kuaishou.android.live.model.QLivePlayExtraInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.QLivePlayExtraInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.QLivePlayExtraInfo;

public class QLivePlayExtraInfo$$Parcelable$a implements Parcelable$Creator	// class@00082c
{

    public void QLivePlayExtraInfo$$Parcelable$a(){
       super();
    }
    public QLivePlayExtraInfo$$Parcelable a(Parcel p0){
       return new QLivePlayExtraInfo$$Parcelable(QLivePlayExtraInfo$$Parcelable.read(p0, new a()));
    }
    public QLivePlayExtraInfo$$Parcelable[] b(int p0){
       QLivePlayExtraInfo$$Parcelable[] $ParcelableA = new QLivePlayExtraInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

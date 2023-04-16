package com.kuaishou.live.model.LiveBasicInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.model.LiveBasicInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.model.LiveBasicInfo;

public final class LiveBasicInfo$$Parcelable$a implements Parcelable$Creator	// class@000ceb
{

    public void LiveBasicInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveBasicInfo$$Parcelable(LiveBasicInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveBasicInfo$$Parcelable[] $ParcelableA = new LiveBasicInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

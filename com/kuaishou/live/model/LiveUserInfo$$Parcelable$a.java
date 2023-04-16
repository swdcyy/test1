package com.kuaishou.live.model.LiveUserInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.model.LiveUserInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.model.LiveUserInfo;

public final class LiveUserInfo$$Parcelable$a implements Parcelable$Creator	// class@000cf0
{

    public void LiveUserInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveUserInfo$$Parcelable(LiveUserInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveUserInfo$$Parcelable[] $ParcelableA = new LiveUserInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

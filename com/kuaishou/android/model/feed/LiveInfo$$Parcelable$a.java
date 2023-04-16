package com.kuaishou.android.model.feed.LiveInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveInfo;

public class LiveInfo$$Parcelable$a implements Parcelable$Creator	// class@000b09
{

    public void LiveInfo$$Parcelable$a(){
       super();
    }
    public LiveInfo$$Parcelable a(Parcel p0){
       return new LiveInfo$$Parcelable(LiveInfo$$Parcelable.read(p0, new a()));
    }
    public LiveInfo$$Parcelable[] b(int p0){
       LiveInfo$$Parcelable[] $ParcelableA = new LiveInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

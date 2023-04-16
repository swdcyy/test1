package com.kuaishou.android.model.feed.AggregateLiveStreamFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed;

public class AggregateLiveStreamFeed$$Parcelable$a implements Parcelable$Creator	// class@000ad2
{

    public void AggregateLiveStreamFeed$$Parcelable$a(){
       super();
    }
    public AggregateLiveStreamFeed$$Parcelable a(Parcel p0){
       return new AggregateLiveStreamFeed$$Parcelable(AggregateLiveStreamFeed$$Parcelable.read(p0, new a()));
    }
    public AggregateLiveStreamFeed$$Parcelable[] b(int p0){
       AggregateLiveStreamFeed$$Parcelable[] $ParcelableA = new AggregateLiveStreamFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

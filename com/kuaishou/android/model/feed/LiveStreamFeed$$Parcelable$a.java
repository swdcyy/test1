package com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;

public class LiveStreamFeed$$Parcelable$a implements Parcelable$Creator	// class@000b0d
{

    public void LiveStreamFeed$$Parcelable$a(){
       super();
    }
    public LiveStreamFeed$$Parcelable a(Parcel p0){
       return new LiveStreamFeed$$Parcelable(LiveStreamFeed$$Parcelable.read(p0, new a()));
    }
    public LiveStreamFeed$$Parcelable[] b(int p0){
       LiveStreamFeed$$Parcelable[] $ParcelableA = new LiveStreamFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

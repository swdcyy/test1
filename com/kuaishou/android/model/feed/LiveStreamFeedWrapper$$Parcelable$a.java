package com.kuaishou.android.model.feed.LiveStreamFeedWrapper$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public class LiveStreamFeedWrapper$$Parcelable$a implements Parcelable$Creator	// class@000b15
{

    public void LiveStreamFeedWrapper$$Parcelable$a(){
       super();
    }
    public LiveStreamFeedWrapper$$Parcelable a(Parcel p0){
       return new LiveStreamFeedWrapper$$Parcelable(LiveStreamFeedWrapper$$Parcelable.read(p0, new a()));
    }
    public LiveStreamFeedWrapper$$Parcelable[] b(int p0){
       LiveStreamFeedWrapper$$Parcelable[] $ParcelableA = new LiveStreamFeedWrapper$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

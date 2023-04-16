package com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;

public class LiveTopicHeaderInfo$$Parcelable$a implements Parcelable$Creator	// class@0011e2
{

    public void LiveTopicHeaderInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveTopicHeaderInfo$$Parcelable(LiveTopicHeaderInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveTopicHeaderInfo$$Parcelable[] $ParcelableA = new LiveTopicHeaderInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

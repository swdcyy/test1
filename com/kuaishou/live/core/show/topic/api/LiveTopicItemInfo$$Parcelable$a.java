package com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.core.show.topic.api.LiveTopicItemInfo;

public class LiveTopicItemInfo$$Parcelable$a implements Parcelable$Creator	// class@0011e5
{

    public void LiveTopicItemInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveTopicItemInfo$$Parcelable(LiveTopicItemInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveTopicItemInfo$$Parcelable[] $ParcelableA = new LiveTopicItemInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

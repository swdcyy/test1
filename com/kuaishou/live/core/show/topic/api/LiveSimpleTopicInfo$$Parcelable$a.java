package com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.core.show.topic.api.LiveSimpleTopicInfo;

public class LiveSimpleTopicInfo$$Parcelable$a implements Parcelable$Creator	// class@0011de
{

    public void LiveSimpleTopicInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveSimpleTopicInfo$$Parcelable(LiveSimpleTopicInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveSimpleTopicInfo$$Parcelable[] $ParcelableA = new LiveSimpleTopicInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

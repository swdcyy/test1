package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicImageActivityItemInfo;

public class LiveTopicImageActivityItemInfo$$Parcelable$a implements Parcelable$Creator	// class@001b80
{

    public void LiveTopicImageActivityItemInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveTopicImageActivityItemInfo$$Parcelable(LiveTopicImageActivityItemInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveTopicImageActivityItemInfo$$Parcelable[] $ParcelableA = new LiveTopicImageActivityItemInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

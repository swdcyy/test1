package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicActivityBasicItemInfo;

public class LiveTopicActivityBasicItemInfo$$Parcelable$a implements Parcelable$Creator	// class@001b7c
{

    public void LiveTopicActivityBasicItemInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveTopicActivityBasicItemInfo$$Parcelable(LiveTopicActivityBasicItemInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveTopicActivityBasicItemInfo$$Parcelable[] $ParcelableA = new LiveTopicActivityBasicItemInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo$$Parcelable;
import xwd.a;
import com.kuaishou.live.external.invoke.deserializer.topic.LiveTopicTextActivityItemInfo;

public class LiveTopicTextActivityItemInfo$$Parcelable$a implements Parcelable$Creator	// class@001b89
{

    public void LiveTopicTextActivityItemInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveTopicTextActivityItemInfo$$Parcelable(LiveTopicTextActivityItemInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveTopicTextActivityItemInfo$$Parcelable[] $ParcelableA = new LiveTopicTextActivityItemInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

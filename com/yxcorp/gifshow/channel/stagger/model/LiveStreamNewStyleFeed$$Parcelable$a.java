package com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.channel.stagger.model.LiveStreamNewStyleFeed;

public class LiveStreamNewStyleFeed$$Parcelable$a implements Parcelable$Creator	// class@00106f
{

    public void LiveStreamNewStyleFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveStreamNewStyleFeed$$Parcelable(LiveStreamNewStyleFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveStreamNewStyleFeed$$Parcelable[] $ParcelableA = new LiveStreamNewStyleFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

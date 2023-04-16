package com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.follow.stagger.data.FollowLiveSubscribeInfo;

public class FollowLiveSubscribeInfo$$Parcelable$a implements Parcelable$Creator	// class@001166
{

    public void FollowLiveSubscribeInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FollowLiveSubscribeInfo$$Parcelable(FollowLiveSubscribeInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FollowLiveSubscribeInfo$$Parcelable[] $ParcelableA = new FollowLiveSubscribeInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kuaishou.android.model.mix.FeedFriendEntranceInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FeedFriendEntranceInfo;

public class FeedFriendEntranceInfo$$Parcelable$a implements Parcelable$Creator	// class@000c76
{

    public void FeedFriendEntranceInfo$$Parcelable$a(){
       super();
    }
    public FeedFriendEntranceInfo$$Parcelable a(Parcel p0){
       return new FeedFriendEntranceInfo$$Parcelable(FeedFriendEntranceInfo$$Parcelable.read(p0, new a()));
    }
    public FeedFriendEntranceInfo$$Parcelable[] b(int p0){
       FeedFriendEntranceInfo$$Parcelable[] $ParcelableA = new FeedFriendEntranceInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

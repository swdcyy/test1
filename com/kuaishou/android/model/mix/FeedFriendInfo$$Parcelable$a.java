package com.kuaishou.android.model.mix.FeedFriendInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FeedFriendInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FeedFriendInfo;

public class FeedFriendInfo$$Parcelable$a implements Parcelable$Creator	// class@000c7a
{

    public void FeedFriendInfo$$Parcelable$a(){
       super();
    }
    public FeedFriendInfo$$Parcelable a(Parcel p0){
       return new FeedFriendInfo$$Parcelable(FeedFriendInfo$$Parcelable.read(p0, new a()));
    }
    public FeedFriendInfo$$Parcelable[] b(int p0){
       FeedFriendInfo$$Parcelable[] $ParcelableA = new FeedFriendInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

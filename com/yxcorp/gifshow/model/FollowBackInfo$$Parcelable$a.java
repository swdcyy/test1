package com.yxcorp.gifshow.model.FollowBackInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.FollowBackInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.FollowBackInfo;

public class FollowBackInfo$$Parcelable$a implements Parcelable$Creator	// class@001e15
{

    public void FollowBackInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FollowBackInfo$$Parcelable(FollowBackInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FollowBackInfo$$Parcelable[] $ParcelableA = new FollowBackInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.yxcorp.gifshow.model.FriendsUseInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.FriendsUseInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.FriendsUseInfo;

public class FriendsUseInfo$$Parcelable$a implements Parcelable$Creator	// class@001e1d
{

    public void FriendsUseInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FriendsUseInfo$$Parcelable(FriendsUseInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FriendsUseInfo$$Parcelable[] $ParcelableA = new FriendsUseInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

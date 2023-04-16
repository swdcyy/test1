package com.kwai.framework.model.user.UserFollowerRelation$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserFollowerRelation$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserFollowerRelation;

public class UserFollowerRelation$$Parcelable$a implements Parcelable$Creator	// class@001754
{

    public void UserFollowerRelation$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserFollowerRelation$$Parcelable(UserFollowerRelation$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserFollowerRelation$$Parcelable[] $ParcelableA = new UserFollowerRelation$$Parcelable[p0];
       return $ParcelableA;
    }
}

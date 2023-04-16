package com.yxcorp.gifshow.profile.model.UserProfileLog$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.model.UserProfileLog$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.model.UserProfileLog;

public class UserProfileLog$$Parcelable$a implements Parcelable$Creator	// class@0013c5
{

    public void UserProfileLog$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileLog$$Parcelable(UserProfileLog$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileLog$$Parcelable[] $ParcelableA = new UserProfileLog$$Parcelable[p0];
       return $ParcelableA;
    }
}

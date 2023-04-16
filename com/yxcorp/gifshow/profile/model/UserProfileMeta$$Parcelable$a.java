package com.yxcorp.gifshow.profile.model.UserProfileMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.model.UserProfileMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.model.UserProfileMeta;

public class UserProfileMeta$$Parcelable$a implements Parcelable$Creator	// class@0013c8
{

    public void UserProfileMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileMeta$$Parcelable(UserProfileMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileMeta$$Parcelable[] $ParcelableA = new UserProfileMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

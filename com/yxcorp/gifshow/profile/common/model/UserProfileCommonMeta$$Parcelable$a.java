package com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.common.model.UserProfileCommonMeta;

public class UserProfileCommonMeta$$Parcelable$a implements Parcelable$Creator	// class@0012df
{

    public void UserProfileCommonMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileCommonMeta$$Parcelable(UserProfileCommonMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileCommonMeta$$Parcelable[] $ParcelableA = new UserProfileCommonMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

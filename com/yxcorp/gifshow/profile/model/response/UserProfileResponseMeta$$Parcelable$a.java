package com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.model.response.UserProfileResponseMeta;

public class UserProfileResponseMeta$$Parcelable$a implements Parcelable$Creator	// class@0013ef
{

    public void UserProfileResponseMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileResponseMeta$$Parcelable(UserProfileResponseMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileResponseMeta$$Parcelable[] $ParcelableA = new UserProfileResponseMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

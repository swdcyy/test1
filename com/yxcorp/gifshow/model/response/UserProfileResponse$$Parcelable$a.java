package com.yxcorp.gifshow.model.response.UserProfileResponse$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.response.UserProfileResponse$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.response.UserProfileResponse;

public class UserProfileResponse$$Parcelable$a implements Parcelable$Creator	// class@001f69
{

    public void UserProfileResponse$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileResponse$$Parcelable(UserProfileResponse$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileResponse$$Parcelable[] $ParcelableA = new UserProfileResponse$$Parcelable[p0];
       return $ParcelableA;
    }
}

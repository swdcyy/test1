package com.kwai.framework.model.user.UserProfile$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserProfile$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserProfile;

public class UserProfile$$Parcelable$a implements Parcelable$Creator	// class@001764
{

    public void UserProfile$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfile$$Parcelable(UserProfile$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfile$$Parcelable[] $ParcelableA = new UserProfile$$Parcelable[p0];
       return $ParcelableA;
    }
}

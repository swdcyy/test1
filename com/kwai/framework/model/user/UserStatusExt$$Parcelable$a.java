package com.kwai.framework.model.user.UserStatusExt$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserStatusExt$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserStatusExt;

public class UserStatusExt$$Parcelable$a implements Parcelable$Creator	// class@001777
{

    public void UserStatusExt$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserStatusExt$$Parcelable(UserStatusExt$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserStatusExt$$Parcelable[] $ParcelableA = new UserStatusExt$$Parcelable[p0];
       return $ParcelableA;
    }
}

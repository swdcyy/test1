package com.kwai.framework.model.user.UserOwnerCount$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserOwnerCount$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserOwnerCount;

public class UserOwnerCount$$Parcelable$a implements Parcelable$Creator	// class@001760
{

    public void UserOwnerCount$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserOwnerCount$$Parcelable(UserOwnerCount$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserOwnerCount$$Parcelable[] $ParcelableA = new UserOwnerCount$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.framework.model.user.UserHeadIcon$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserHeadIcon$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserHeadIcon;

public class UserHeadIcon$$Parcelable$a implements Parcelable$Creator	// class@001757
{

    public void UserHeadIcon$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserHeadIcon$$Parcelable(UserHeadIcon$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserHeadIcon$$Parcelable[] $ParcelableA = new UserHeadIcon$$Parcelable[p0];
       return $ParcelableA;
    }
}

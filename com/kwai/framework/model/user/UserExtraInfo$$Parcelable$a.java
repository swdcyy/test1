package com.kwai.framework.model.user.UserExtraInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserExtraInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserExtraInfo;

public class UserExtraInfo$$Parcelable$a implements Parcelable$Creator	// class@001742
{

    public void UserExtraInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserExtraInfo$$Parcelable(UserExtraInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserExtraInfo$$Parcelable[] $ParcelableA = new UserExtraInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

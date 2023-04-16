package com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserProfileMissUInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserProfileMissUInfo;

public class UserProfileMissUInfo$$Parcelable$a implements Parcelable$Creator	// class@001767
{

    public void UserProfileMissUInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserProfileMissUInfo$$Parcelable(UserProfileMissUInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserProfileMissUInfo$$Parcelable[] $ParcelableA = new UserProfileMissUInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

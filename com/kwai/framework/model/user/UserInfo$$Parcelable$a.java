package com.kwai.framework.model.user.UserInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserInfo;

public class UserInfo$$Parcelable$a implements Parcelable$Creator	// class@00175c
{

    public void UserInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserInfo$$Parcelable(UserInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserInfo$$Parcelable[] $ParcelableA = new UserInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

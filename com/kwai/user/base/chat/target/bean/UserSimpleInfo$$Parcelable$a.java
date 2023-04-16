package com.kwai.user.base.chat.target.bean.UserSimpleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo$$Parcelable;
import xwd.a;
import com.kwai.user.base.chat.target.bean.UserSimpleInfo;

public class UserSimpleInfo$$Parcelable$a implements Parcelable$Creator	// class@00197d
{

    public void UserSimpleInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserSimpleInfo$$Parcelable(UserSimpleInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserSimpleInfo$$Parcelable[] $ParcelableA = new UserSimpleInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

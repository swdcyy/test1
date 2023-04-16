package com.kwai.framework.model.user.UserExtraInfo$Truncate$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserExtraInfo$Truncate$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserExtraInfo$Truncate;

public class UserExtraInfo$Truncate$$Parcelable$a implements Parcelable$Creator	// class@00174c
{

    public void UserExtraInfo$Truncate$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserExtraInfo$Truncate$$Parcelable(UserExtraInfo$Truncate$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserExtraInfo$Truncate$$Parcelable[] truncate$$Pa = new UserExtraInfo$Truncate$$Parcelable[p0];
       return truncate$$Pa;
    }
}

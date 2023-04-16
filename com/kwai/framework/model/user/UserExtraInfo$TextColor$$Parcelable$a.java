package com.kwai.framework.model.user.UserExtraInfo$TextColor$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserExtraInfo$TextColor$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserExtraInfo$TextColor;

public class UserExtraInfo$TextColor$$Parcelable$a implements Parcelable$Creator	// class@001748
{

    public void UserExtraInfo$TextColor$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserExtraInfo$TextColor$$Parcelable(UserExtraInfo$TextColor$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserExtraInfo$TextColor$$Parcelable[] textColor$$P = new UserExtraInfo$TextColor$$Parcelable[p0];
       return textColor$$P;
    }
}

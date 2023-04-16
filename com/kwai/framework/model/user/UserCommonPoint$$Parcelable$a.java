package com.kwai.framework.model.user.UserCommonPoint$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserCommonPoint$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserCommonPoint;

public class UserCommonPoint$$Parcelable$a implements Parcelable$Creator	// class@001737
{

    public void UserCommonPoint$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserCommonPoint$$Parcelable(UserCommonPoint$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserCommonPoint$$Parcelable[] $ParcelableA = new UserCommonPoint$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.framework.model.user.UserCertificationTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserCertificationTag$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserCertificationTag;

public class UserCertificationTag$$Parcelable$a implements Parcelable$Creator	// class@001734
{

    public void UserCertificationTag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserCertificationTag$$Parcelable(UserCertificationTag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserCertificationTag$$Parcelable[] $ParcelableA = new UserCertificationTag$$Parcelable[p0];
       return $ParcelableA;
    }
}

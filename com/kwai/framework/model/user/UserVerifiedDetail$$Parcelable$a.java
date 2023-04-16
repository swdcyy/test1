package com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserVerifiedDetail$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserVerifiedDetail;

public class UserVerifiedDetail$$Parcelable$a implements Parcelable$Creator	// class@00177a
{

    public void UserVerifiedDetail$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserVerifiedDetail$$Parcelable(UserVerifiedDetail$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserVerifiedDetail$$Parcelable[] $ParcelableA = new UserVerifiedDetail$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.framework.model.user.User$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.User$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.User;

public class User$$Parcelable$a implements Parcelable$Creator	// class@00172d
{

    public void User$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new User$$Parcelable(User$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       User$$Parcelable[] $ParcelableA = new User$$Parcelable[p0];
       return $ParcelableA;
    }
}

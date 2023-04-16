package com.kwai.framework.model.user.User$FollowStatus$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.User$FollowStatus$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.User$FollowStatus;

public class User$FollowStatus$$Parcelable$a implements Parcelable$Creator	// class@00172f
{

    public void User$FollowStatus$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new User$FollowStatus$$Parcelable(User$FollowStatus$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       User$FollowStatus$$Parcelable[] uFollowStatu = new User$FollowStatus$$Parcelable[p0];
       return uFollowStatu;
    }
}

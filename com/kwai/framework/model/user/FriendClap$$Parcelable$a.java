package com.kwai.framework.model.user.FriendClap$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.FriendClap$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.FriendClap;

public class FriendClap$$Parcelable$a implements Parcelable$Creator	// class@0016f8
{

    public void FriendClap$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FriendClap$$Parcelable(FriendClap$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FriendClap$$Parcelable[] $ParcelableA = new FriendClap$$Parcelable[p0];
       return $ParcelableA;
    }
}

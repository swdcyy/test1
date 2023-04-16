package com.kwai.framework.model.user.UserRelationShipLabel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.UserRelationShipLabel$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.UserRelationShipLabel;

public class UserRelationShipLabel$$Parcelable$a implements Parcelable$Creator	// class@00176e
{

    public void UserRelationShipLabel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UserRelationShipLabel$$Parcelable(UserRelationShipLabel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UserRelationShipLabel$$Parcelable[] $ParcelableA = new UserRelationShipLabel$$Parcelable[p0];
       return $ParcelableA;
    }
}

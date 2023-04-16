package com.kwai.framework.model.user.ProfilePageInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.ProfilePageInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.ProfilePageInfo;

public class ProfilePageInfo$$Parcelable$a implements Parcelable$Creator	// class@001712
{

    public void ProfilePageInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ProfilePageInfo$$Parcelable(ProfilePageInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ProfilePageInfo$$Parcelable[] $ParcelableA = new ProfilePageInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

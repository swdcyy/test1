package com.kwai.feature.api.social.profile.model.ProfileParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.profile.model.ProfileParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;

public class ProfileParam$$Parcelable$a implements Parcelable$Creator	// class@0011ac
{

    public void ProfileParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ProfileParam$$Parcelable(ProfileParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ProfileParam$$Parcelable[] $ParcelableA = new ProfileParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

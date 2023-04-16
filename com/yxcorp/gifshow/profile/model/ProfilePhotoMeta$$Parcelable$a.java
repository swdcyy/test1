package com.yxcorp.gifshow.profile.model.ProfilePhotoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.profile.model.ProfilePhotoMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.profile.model.ProfilePhotoMeta;

public class ProfilePhotoMeta$$Parcelable$a implements Parcelable$Creator	// class@0013a9
{

    public void ProfilePhotoMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ProfilePhotoMeta$$Parcelable(ProfilePhotoMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ProfilePhotoMeta$$Parcelable[] $ParcelableA = new ProfilePhotoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

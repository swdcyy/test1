package com.kwai.feature.api.social.followStagger.model.FollowVideoMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.followStagger.model.FollowVideoMeta$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.followStagger.model.FollowVideoMeta;

public class FollowVideoMeta$$Parcelable$a implements Parcelable$Creator	// class@0010d7
{

    public void FollowVideoMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FollowVideoMeta$$Parcelable(FollowVideoMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FollowVideoMeta$$Parcelable[] $ParcelableA = new FollowVideoMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

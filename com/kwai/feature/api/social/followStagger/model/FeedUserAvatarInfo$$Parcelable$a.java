package com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;

public class FeedUserAvatarInfo$$Parcelable$a implements Parcelable$Creator	// class@0010d2
{

    public void FeedUserAvatarInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FeedUserAvatarInfo$$Parcelable(FeedUserAvatarInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FeedUserAvatarInfo$$Parcelable[] $ParcelableA = new FeedUserAvatarInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

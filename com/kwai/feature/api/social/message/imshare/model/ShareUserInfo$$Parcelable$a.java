package com.kwai.feature.api.social.message.imshare.model.ShareUserInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.ShareUserInfo;

public class ShareUserInfo$$Parcelable$a implements Parcelable$Creator	// class@00116b
{

    public void ShareUserInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareUserInfo$$Parcelable(ShareUserInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareUserInfo$$Parcelable[] $ParcelableA = new ShareUserInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

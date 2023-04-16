package com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.ShareGroupInfo;

public class ShareGroupInfo$$Parcelable$a implements Parcelable$Creator	// class@00115e
{

    public void ShareGroupInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareGroupInfo$$Parcelable(ShareGroupInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareGroupInfo$$Parcelable[] $ParcelableA = new ShareGroupInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

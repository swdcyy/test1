package com.kwai.feature.api.social.message.imshare.model.ShareIMInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.ShareIMInfo;

public class ShareIMInfo$$Parcelable$a implements Parcelable$Creator	// class@001161
{

    public void ShareIMInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareIMInfo$$Parcelable(ShareIMInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareIMInfo$$Parcelable[] $ParcelableA = new ShareIMInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

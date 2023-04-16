package com.kwai.feature.api.social.message.imshare.model.SharePosInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;

public class SharePosInfo$$Parcelable$a implements Parcelable$Creator	// class@001168
{

    public void SharePosInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SharePosInfo$$Parcelable(SharePosInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SharePosInfo$$Parcelable[] $ParcelableA = new SharePosInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

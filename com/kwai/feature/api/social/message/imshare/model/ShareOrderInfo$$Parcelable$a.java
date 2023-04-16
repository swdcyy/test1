package com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.imshare.model.ShareOrderInfo;

public class ShareOrderInfo$$Parcelable$a implements Parcelable$Creator	// class@001165
{

    public void ShareOrderInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ShareOrderInfo$$Parcelable(ShareOrderInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ShareOrderInfo$$Parcelable[] $ParcelableA = new ShareOrderInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

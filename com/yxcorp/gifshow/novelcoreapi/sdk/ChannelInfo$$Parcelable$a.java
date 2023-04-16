package com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.novelcoreapi.sdk.ChannelInfo;

public class ChannelInfo$$Parcelable$a implements Parcelable$Creator	// class@0021bc
{

    public void ChannelInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ChannelInfo$$Parcelable(ChannelInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ChannelInfo$$Parcelable[] $ParcelableA = new ChannelInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

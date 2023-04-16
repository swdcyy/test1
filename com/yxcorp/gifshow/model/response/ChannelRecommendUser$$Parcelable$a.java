package com.yxcorp.gifshow.model.response.ChannelRecommendUser$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.response.ChannelRecommendUser;

public class ChannelRecommendUser$$Parcelable$a implements Parcelable$Creator	// class@001f1c
{

    public void ChannelRecommendUser$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ChannelRecommendUser$$Parcelable(ChannelRecommendUser$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ChannelRecommendUser$$Parcelable[] $ParcelableA = new ChannelRecommendUser$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.yxcorp.gifshow.model.response.HotChannelColumn$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.response.HotChannelColumn$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.response.HotChannelColumn;

public class HotChannelColumn$$Parcelable$a implements Parcelable$Creator	// class@001f38
{

    public void HotChannelColumn$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new HotChannelColumn$$Parcelable(HotChannelColumn$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       HotChannelColumn$$Parcelable[] $ParcelableA = new HotChannelColumn$$Parcelable[p0];
       return $ParcelableA;
    }
}

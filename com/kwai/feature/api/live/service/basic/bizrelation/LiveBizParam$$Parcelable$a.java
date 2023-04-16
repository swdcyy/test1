package com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;

public class LiveBizParam$$Parcelable$a implements Parcelable$Creator	// class@001001
{

    public void LiveBizParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveBizParam$$Parcelable(LiveBizParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveBizParam$$Parcelable[] $ParcelableA = new LiveBizParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;

public class LivePlaybackParam$$Parcelable$a implements Parcelable$Creator	// class@001005
{

    public void LivePlaybackParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LivePlaybackParam$$Parcelable(LivePlaybackParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LivePlaybackParam$$Parcelable[] $ParcelableA = new LivePlaybackParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

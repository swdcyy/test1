package com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.live.base.model.LiveAudienceParam$$Parcelable;
import xwd.a;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;

public class LiveAudienceParam$$Parcelable$a implements Parcelable$Creator	// class@000f7c
{

    public void LiveAudienceParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveAudienceParam$$Parcelable(LiveAudienceParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveAudienceParam$$Parcelable[] $ParcelableA = new LiveAudienceParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

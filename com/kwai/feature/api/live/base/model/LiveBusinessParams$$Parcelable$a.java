package com.kwai.feature.api.live.base.model.LiveBusinessParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.live.base.model.LiveBusinessParams$$Parcelable;
import xwd.a;
import com.kwai.feature.api.live.base.model.LiveBusinessParams;

public class LiveBusinessParams$$Parcelable$a implements Parcelable$Creator	// class@000f80
{

    public void LiveBusinessParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveBusinessParams$$Parcelable(LiveBusinessParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveBusinessParams$$Parcelable[] $ParcelableA = new LiveBusinessParams$$Parcelable[p0];
       return $ParcelableA;
    }
}

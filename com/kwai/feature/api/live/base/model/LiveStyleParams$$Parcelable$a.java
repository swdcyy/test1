package com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.live.base.model.LiveStyleParams$$Parcelable;
import xwd.a;
import com.kwai.feature.api.live.base.model.LiveStyleParams;

public class LiveStyleParams$$Parcelable$a implements Parcelable$Creator	// class@000f90
{

    public void LiveStyleParams$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new LiveStyleParams$$Parcelable(LiveStyleParams$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       LiveStyleParams$$Parcelable[] $ParcelableA = new LiveStyleParams$$Parcelable[p0];
       return $ParcelableA;
    }
}

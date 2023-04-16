package com.kwai.video.waynelive.quality.LiveQualityItem$$Parcelable$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.video.waynelive.quality.LiveQualityItem$$Parcelable;
import xwd.a;
import com.kwai.video.waynelive.quality.LiveQualityItem;

public final class LiveQualityItem$$Parcelable$1 implements Parcelable$Creator	// class@000e14
{

    public void LiveQualityItem$$Parcelable$1(){
       super();
    }
    public LiveQualityItem$$Parcelable createFromParcel(Parcel p0){
       return new LiveQualityItem$$Parcelable(LiveQualityItem$$Parcelable.read(p0, new a()));
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public LiveQualityItem$$Parcelable[] newArray(int p0){
       LiveQualityItem$$Parcelable[] $ParcelableA = new LiveQualityItem$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}

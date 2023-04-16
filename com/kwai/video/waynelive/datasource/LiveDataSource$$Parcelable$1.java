package com.kwai.video.waynelive.datasource.LiveDataSource$$Parcelable$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.video.waynelive.datasource.LiveDataSource$$Parcelable;
import xwd.a;
import com.kwai.video.waynelive.datasource.LiveDataSource;

public final class LiveDataSource$$Parcelable$1 implements Parcelable$Creator	// class@000de3
{

    public void LiveDataSource$$Parcelable$1(){
       super();
    }
    public LiveDataSource$$Parcelable createFromParcel(Parcel p0){
       return new LiveDataSource$$Parcelable(LiveDataSource$$Parcelable.read(p0, new a()));
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public LiveDataSource$$Parcelable[] newArray(int p0){
       LiveDataSource$$Parcelable[] $ParcelableA = new LiveDataSource$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}

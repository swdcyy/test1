package com.kuaishou.android.live.model.LiveStreamModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.LiveStreamModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.LiveStreamModel;

public class LiveStreamModel$$Parcelable$a implements Parcelable$Creator	// class@000810
{

    public void LiveStreamModel$$Parcelable$a(){
       super();
    }
    public LiveStreamModel$$Parcelable a(Parcel p0){
       return new LiveStreamModel$$Parcelable(LiveStreamModel$$Parcelable.read(p0, new a()));
    }
    public LiveStreamModel$$Parcelable[] b(int p0){
       LiveStreamModel$$Parcelable[] $ParcelableA = new LiveStreamModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

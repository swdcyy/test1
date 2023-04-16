package com.kuaishou.android.live.model.LiveRestartPlayerConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.LiveRestartPlayerConfig;

public class LiveRestartPlayerConfig$$Parcelable$a implements Parcelable$Creator	// class@0007f8
{

    public void LiveRestartPlayerConfig$$Parcelable$a(){
       super();
    }
    public LiveRestartPlayerConfig$$Parcelable a(Parcel p0){
       return new LiveRestartPlayerConfig$$Parcelable(LiveRestartPlayerConfig$$Parcelable.read(p0, new a()));
    }
    public LiveRestartPlayerConfig$$Parcelable[] b(int p0){
       LiveRestartPlayerConfig$$Parcelable[] $ParcelableA = new LiveRestartPlayerConfig$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

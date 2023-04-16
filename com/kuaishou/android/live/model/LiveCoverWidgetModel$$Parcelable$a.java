package com.kuaishou.android.live.model.LiveCoverWidgetModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.LiveCoverWidgetModel$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.LiveCoverWidgetModel;

public class LiveCoverWidgetModel$$Parcelable$a implements Parcelable$Creator	// class@0007ea
{

    public void LiveCoverWidgetModel$$Parcelable$a(){
       super();
    }
    public LiveCoverWidgetModel$$Parcelable a(Parcel p0){
       return new LiveCoverWidgetModel$$Parcelable(LiveCoverWidgetModel$$Parcelable.read(p0, new a()));
    }
    public LiveCoverWidgetModel$$Parcelable[] b(int p0){
       LiveCoverWidgetModel$$Parcelable[] $ParcelableA = new LiveCoverWidgetModel$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

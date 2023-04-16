package com.kuaishou.android.model.mix.HotspotParams$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HotspotParams$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HotspotParams;

public class HotspotParams$$Parcelable$a implements Parcelable$Creator	// class@000ca6
{

    public void HotspotParams$$Parcelable$a(){
       super();
    }
    public HotspotParams$$Parcelable a(Parcel p0){
       return new HotspotParams$$Parcelable(HotspotParams$$Parcelable.read(p0, new a()));
    }
    public HotspotParams$$Parcelable[] b(int p0){
       HotspotParams$$Parcelable[] $ParcelableA = new HotspotParams$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

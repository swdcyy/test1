package com.kuaishou.android.model.mix.HighLightStartEndTime$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.HighLightStartEndTime$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.HighLightStartEndTime;

public class HighLightStartEndTime$$Parcelable$a implements Parcelable$Creator	// class@000c97
{

    public void HighLightStartEndTime$$Parcelable$a(){
       super();
    }
    public HighLightStartEndTime$$Parcelable a(Parcel p0){
       return new HighLightStartEndTime$$Parcelable(HighLightStartEndTime$$Parcelable.read(p0, new a()));
    }
    public HighLightStartEndTime$$Parcelable[] b(int p0){
       HighLightStartEndTime$$Parcelable[] $ParcelableA = new HighLightStartEndTime$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

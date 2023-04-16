package com.kuaishou.android.model.mix.SameFrameInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.SameFrameInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.SameFrameInfo;

public class SameFrameInfo$$Parcelable$a implements Parcelable$Creator	// class@000de8
{

    public void SameFrameInfo$$Parcelable$a(){
       super();
    }
    public SameFrameInfo$$Parcelable a(Parcel p0){
       return new SameFrameInfo$$Parcelable(SameFrameInfo$$Parcelable.read(p0, new a()));
    }
    public SameFrameInfo$$Parcelable[] b(int p0){
       SameFrameInfo$$Parcelable[] $ParcelableA = new SameFrameInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

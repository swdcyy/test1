package com.kuaishou.android.model.ads.BrokenFrameInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.BrokenFrameInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.BrokenFrameInfo;

public class BrokenFrameInfo$$Parcelable$a implements Parcelable$Creator	// class@000854
{

    public void BrokenFrameInfo$$Parcelable$a(){
       super();
    }
    public BrokenFrameInfo$$Parcelable a(Parcel p0){
       return new BrokenFrameInfo$$Parcelable(BrokenFrameInfo$$Parcelable.read(p0, new a()));
    }
    public BrokenFrameInfo$$Parcelable[] b(int p0){
       BrokenFrameInfo$$Parcelable[] $ParcelableA = new BrokenFrameInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

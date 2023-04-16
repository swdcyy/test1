package com.kuaishou.android.model.ads.FallingEggsInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.ads.FallingEggsInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.ads.FallingEggsInfo;

public class FallingEggsInfo$$Parcelable$a implements Parcelable$Creator	// class@000857
{

    public void FallingEggsInfo$$Parcelable$a(){
       super();
    }
    public FallingEggsInfo$$Parcelable a(Parcel p0){
       return new FallingEggsInfo$$Parcelable(FallingEggsInfo$$Parcelable.read(p0, new a()));
    }
    public FallingEggsInfo$$Parcelable[] b(int p0){
       FallingEggsInfo$$Parcelable[] $ParcelableA = new FallingEggsInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

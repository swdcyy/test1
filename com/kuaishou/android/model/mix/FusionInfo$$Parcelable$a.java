package com.kuaishou.android.model.mix.FusionInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FusionInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FusionInfo;

public class FusionInfo$$Parcelable$a implements Parcelable$Creator	// class@000c8f
{

    public void FusionInfo$$Parcelable$a(){
       super();
    }
    public FusionInfo$$Parcelable a(Parcel p0){
       return new FusionInfo$$Parcelable(FusionInfo$$Parcelable.read(p0, new a()));
    }
    public FusionInfo$$Parcelable[] b(int p0){
       FusionInfo$$Parcelable[] $ParcelableA = new FusionInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

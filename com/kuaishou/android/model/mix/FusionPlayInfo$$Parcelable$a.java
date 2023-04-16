package com.kuaishou.android.model.mix.FusionPlayInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.FusionPlayInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.FusionPlayInfo;

public class FusionPlayInfo$$Parcelable$a implements Parcelable$Creator	// class@000c93
{

    public void FusionPlayInfo$$Parcelable$a(){
       super();
    }
    public FusionPlayInfo$$Parcelable a(Parcel p0){
       return new FusionPlayInfo$$Parcelable(FusionPlayInfo$$Parcelable.read(p0, new a()));
    }
    public FusionPlayInfo$$Parcelable[] b(int p0){
       FusionPlayInfo$$Parcelable[] $ParcelableA = new FusionPlayInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

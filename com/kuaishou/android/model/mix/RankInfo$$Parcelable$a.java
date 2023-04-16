package com.kuaishou.android.model.mix.RankInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.RankInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.RankInfo;

public class RankInfo$$Parcelable$a implements Parcelable$Creator	// class@000dda
{

    public void RankInfo$$Parcelable$a(){
       super();
    }
    public RankInfo$$Parcelable a(Parcel p0){
       return new RankInfo$$Parcelable(RankInfo$$Parcelable.read(p0, new a()));
    }
    public RankInfo$$Parcelable[] b(int p0){
       RankInfo$$Parcelable[] $ParcelableA = new RankInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

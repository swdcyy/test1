package com.kuaishou.android.model.mix.MMUSimilarSearchInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;

public class MMUSimilarSearchInfo$$Parcelable$a implements Parcelable$Creator	// class@000d16
{

    public void MMUSimilarSearchInfo$$Parcelable$a(){
       super();
    }
    public MMUSimilarSearchInfo$$Parcelable a(Parcel p0){
       return new MMUSimilarSearchInfo$$Parcelable(MMUSimilarSearchInfo$$Parcelable.read(p0, new a()));
    }
    public MMUSimilarSearchInfo$$Parcelable[] b(int p0){
       MMUSimilarSearchInfo$$Parcelable[] $ParcelableA = new MMUSimilarSearchInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

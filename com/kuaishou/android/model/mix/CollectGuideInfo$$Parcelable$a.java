package com.kuaishou.android.model.mix.CollectGuideInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CollectGuideInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CollectGuideInfo;

public class CollectGuideInfo$$Parcelable$a implements Parcelable$Creator	// class@000beb
{

    public void CollectGuideInfo$$Parcelable$a(){
       super();
    }
    public CollectGuideInfo$$Parcelable a(Parcel p0){
       return new CollectGuideInfo$$Parcelable(CollectGuideInfo$$Parcelable.read(p0, new a()));
    }
    public CollectGuideInfo$$Parcelable[] b(int p0){
       CollectGuideInfo$$Parcelable[] $ParcelableA = new CollectGuideInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

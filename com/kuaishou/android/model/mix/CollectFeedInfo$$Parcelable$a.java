package com.kuaishou.android.model.mix.CollectFeedInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.mix.CollectFeedInfo$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.mix.CollectFeedInfo;

public class CollectFeedInfo$$Parcelable$a implements Parcelable$Creator	// class@000be7
{

    public void CollectFeedInfo$$Parcelable$a(){
       super();
    }
    public CollectFeedInfo$$Parcelable a(Parcel p0){
       return new CollectFeedInfo$$Parcelable(CollectFeedInfo$$Parcelable.read(p0, new a()));
    }
    public CollectFeedInfo$$Parcelable[] b(int p0){
       CollectFeedInfo$$Parcelable[] $ParcelableA = new CollectFeedInfo$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

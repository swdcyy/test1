package com.kuaishou.android.model.feed.TubeRecommendFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.model.feed.TubeRecommendFeed$$Parcelable;
import xwd.a;
import com.kuaishou.android.model.feed.TubeRecommendFeed;

public class TubeRecommendFeed$$Parcelable$a implements Parcelable$Creator	// class@000b75
{

    public void TubeRecommendFeed$$Parcelable$a(){
       super();
    }
    public TubeRecommendFeed$$Parcelable a(Parcel p0){
       return new TubeRecommendFeed$$Parcelable(TubeRecommendFeed$$Parcelable.read(p0, new a()));
    }
    public TubeRecommendFeed$$Parcelable[] b(int p0){
       TubeRecommendFeed$$Parcelable[] $ParcelableA = new TubeRecommendFeed$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}

package com.yxcorp.gifshow.follow.common.model.RecommendUserFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.follow.common.model.RecommendUserFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.follow.common.model.RecommendUserFeed;

public class RecommendUserFeed$$Parcelable$a implements Parcelable$Creator	// class@00106d
{

    public void RecommendUserFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RecommendUserFeed$$Parcelable(RecommendUserFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RecommendUserFeed$$Parcelable[] $ParcelableA = new RecommendUserFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

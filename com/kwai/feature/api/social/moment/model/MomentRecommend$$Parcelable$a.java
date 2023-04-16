package com.kwai.feature.api.social.moment.model.MomentRecommend$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.moment.model.MomentRecommend$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.moment.model.MomentRecommend;

public class MomentRecommend$$Parcelable$a implements Parcelable$Creator	// class@00118d
{

    public void MomentRecommend$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MomentRecommend$$Parcelable(MomentRecommend$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MomentRecommend$$Parcelable[] $ParcelableA = new MomentRecommend$$Parcelable[p0];
       return $ParcelableA;
    }
}

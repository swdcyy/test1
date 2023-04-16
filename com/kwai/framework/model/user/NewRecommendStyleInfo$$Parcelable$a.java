package com.kwai.framework.model.user.NewRecommendStyleInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.NewRecommendStyleInfo$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.NewRecommendStyleInfo;

public class NewRecommendStyleInfo$$Parcelable$a implements Parcelable$Creator	// class@001704
{

    public void NewRecommendStyleInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NewRecommendStyleInfo$$Parcelable(NewRecommendStyleInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NewRecommendStyleInfo$$Parcelable[] $ParcelableA = new NewRecommendStyleInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

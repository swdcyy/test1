package com.yxcorp.gifshow.model.config.FeedNegativeFeedback$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback;

public class FeedNegativeFeedback$$Parcelable$a implements Parcelable$Creator	// class@001ebe
{

    public void FeedNegativeFeedback$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new FeedNegativeFeedback$$Parcelable(FeedNegativeFeedback$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       FeedNegativeFeedback$$Parcelable[] $ParcelableA = new FeedNegativeFeedback$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.component.photo.reduce.model.NegativeFeedbackConfig$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.component.photo.reduce.model.NegativeFeedbackConfig$$Parcelable;
import xwd.a;
import com.kwai.component.photo.reduce.model.NegativeFeedbackConfig;

public class NegativeFeedbackConfig$$Parcelable$a implements Parcelable$Creator	// class@000af5
{

    public void NegativeFeedbackConfig$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NegativeFeedbackConfig$$Parcelable(NegativeFeedbackConfig$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NegativeFeedbackConfig$$Parcelable[] $ParcelableA = new NegativeFeedbackConfig$$Parcelable[p0];
       return $ParcelableA;
    }
}

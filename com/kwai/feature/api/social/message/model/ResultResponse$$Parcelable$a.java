package com.kwai.feature.api.social.message.model.ResultResponse$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.message.model.ResultResponse$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.message.model.ResultResponse;

public class ResultResponse$$Parcelable$a implements Parcelable$Creator	// class@001175
{

    public void ResultResponse$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ResultResponse$$Parcelable(ResultResponse$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ResultResponse$$Parcelable[] $ParcelableA = new ResultResponse$$Parcelable[p0];
       return $ParcelableA;
    }
}

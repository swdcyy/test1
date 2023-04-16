package com.kwai.feature.api.social.moment.model.MomentModel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.feature.api.social.moment.model.MomentModel$$Parcelable;
import xwd.a;
import com.kwai.feature.api.social.moment.model.MomentModel;

public class MomentModel$$Parcelable$a implements Parcelable$Creator	// class@001188
{

    public void MomentModel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new MomentModel$$Parcelable(MomentModel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       MomentModel$$Parcelable[] $ParcelableA = new MomentModel$$Parcelable[p0];
       return $ParcelableA;
    }
}

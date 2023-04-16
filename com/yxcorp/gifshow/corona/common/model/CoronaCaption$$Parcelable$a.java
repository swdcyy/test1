package com.yxcorp.gifshow.corona.common.model.CoronaCaption$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption;

public class CoronaCaption$$Parcelable$a implements Parcelable$Creator	// class@001200
{

    public void CoronaCaption$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaCaption$$Parcelable(CoronaCaption$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaCaption$$Parcelable[] $ParcelableA = new CoronaCaption$$Parcelable[p0];
       return $ParcelableA;
    }
}

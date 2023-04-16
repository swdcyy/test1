package com.yxcorp.gifshow.follow.common.model.RealtimeMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.follow.common.model.RealtimeMeta;

public class RealtimeMeta$$Parcelable$a implements Parcelable$Creator	// class@001062
{

    public void RealtimeMeta$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new RealtimeMeta$$Parcelable(RealtimeMeta$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       RealtimeMeta$$Parcelable[] $ParcelableA = new RealtimeMeta$$Parcelable[p0];
       return $ParcelableA;
    }
}

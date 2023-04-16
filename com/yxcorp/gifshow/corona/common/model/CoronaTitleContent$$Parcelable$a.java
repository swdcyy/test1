package com.yxcorp.gifshow.corona.common.model.CoronaTitleContent$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.corona.common.model.CoronaTitleContent;

public class CoronaTitleContent$$Parcelable$a implements Parcelable$Creator	// class@00121d
{

    public void CoronaTitleContent$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaTitleContent$$Parcelable(CoronaTitleContent$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaTitleContent$$Parcelable[] $ParcelableA = new CoronaTitleContent$$Parcelable[p0];
       return $ParcelableA;
    }
}

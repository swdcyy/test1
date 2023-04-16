package com.kwai.framework.model.common.Distance$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.common.Distance$$Parcelable;
import xwd.a;
import com.kwai.framework.model.common.Distance;

public class Distance$$Parcelable$a implements Parcelable$Creator	// class@00168b
{

    public void Distance$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new Distance$$Parcelable(Distance$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       Distance$$Parcelable[] $ParcelableA = new Distance$$Parcelable[p0];
       return $ParcelableA;
    }
}

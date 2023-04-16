package com.yxcorp.gifshow.follow.common.model.PymiBarFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;

public class PymiBarFeed$$Parcelable$a implements Parcelable$Creator	// class@00105b
{

    public void PymiBarFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new PymiBarFeed$$Parcelable(PymiBarFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       PymiBarFeed$$Parcelable[] $ParcelableA = new PymiBarFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

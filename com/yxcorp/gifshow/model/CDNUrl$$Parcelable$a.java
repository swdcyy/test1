package com.yxcorp.gifshow.model.CDNUrl$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.CDNUrl;

public final class CDNUrl$$Parcelable$a implements Parcelable$Creator	// class@001df0
{

    public void CDNUrl$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CDNUrl$$Parcelable(CDNUrl$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CDNUrl$$Parcelable[] $ParcelableA = new CDNUrl$$Parcelable[p0];
       return $ParcelableA;
    }
}

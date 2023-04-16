package com.yxcorp.gifshow.detail.model.meta.OnlineStateTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag;

public class OnlineStateTag$$Parcelable$a implements Parcelable$Creator	// class@0015a6
{

    public void OnlineStateTag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new OnlineStateTag$$Parcelable(OnlineStateTag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       OnlineStateTag$$Parcelable[] $ParcelableA = new OnlineStateTag$$Parcelable[p0];
       return $ParcelableA;
    }
}

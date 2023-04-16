package com.kwai.framework.model.user.IntimateTag$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.user.IntimateTag$$Parcelable;
import xwd.a;
import com.kwai.framework.model.user.IntimateTag;

public class IntimateTag$$Parcelable$a implements Parcelable$Creator	// class@0016fc
{

    public void IntimateTag$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new IntimateTag$$Parcelable(IntimateTag$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       IntimateTag$$Parcelable[] $ParcelableA = new IntimateTag$$Parcelable[p0];
       return $ParcelableA;
    }
}

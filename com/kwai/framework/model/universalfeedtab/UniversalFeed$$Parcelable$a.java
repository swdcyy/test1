package com.kwai.framework.model.universalfeedtab.UniversalFeed$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.universalfeedtab.UniversalFeed$$Parcelable;
import xwd.a;
import com.kwai.framework.model.universalfeedtab.UniversalFeed;

public class UniversalFeed$$Parcelable$a implements Parcelable$Creator	// class@0016d4
{

    public void UniversalFeed$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new UniversalFeed$$Parcelable(UniversalFeed$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       UniversalFeed$$Parcelable[] $ParcelableA = new UniversalFeed$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.kwai.framework.model.ExtendableModelMap$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.framework.model.ExtendableModelMap$$Parcelable;
import xwd.a;
import com.kwai.framework.model.ExtendableModelMap;

public class ExtendableModelMap$$Parcelable$a implements Parcelable$Creator	// class@001685
{

    public void ExtendableModelMap$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new ExtendableModelMap$$Parcelable(ExtendableModelMap$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       ExtendableModelMap$$Parcelable[] $ParcelableA = new ExtendableModelMap$$Parcelable[p0];
       return $ParcelableA;
    }
}

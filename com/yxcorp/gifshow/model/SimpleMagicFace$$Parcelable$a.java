package com.yxcorp.gifshow.model.SimpleMagicFace$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.model.SimpleMagicFace$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;

public class SimpleMagicFace$$Parcelable$a implements Parcelable$Creator	// class@001e8f
{

    public void SimpleMagicFace$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SimpleMagicFace$$Parcelable(SimpleMagicFace$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SimpleMagicFace$$Parcelable[] $ParcelableA = new SimpleMagicFace$$Parcelable[p0];
       return $ParcelableA;
    }
}

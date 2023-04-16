package com.yxcorp.gifshow.nasa.NasaSlideParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.nasa.NasaSlideParam$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;

public class NasaSlideParam$$Parcelable$a implements Parcelable$Creator	// class@0020c1
{

    public void NasaSlideParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NasaSlideParam$$Parcelable(NasaSlideParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NasaSlideParam$$Parcelable[] $ParcelableA = new NasaSlideParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

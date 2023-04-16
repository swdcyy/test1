package com.yxcorp.gifshow.nasa.NasaSlideSerialParam$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;

public class NasaSlideSerialParam$$Parcelable$a implements Parcelable$Creator	// class@0020c6
{

    public void NasaSlideSerialParam$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new NasaSlideSerialParam$$Parcelable(NasaSlideSerialParam$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       NasaSlideSerialParam$$Parcelable[] $ParcelableA = new NasaSlideSerialParam$$Parcelable[p0];
       return $ParcelableA;
    }
}

package com.yxcorp.gifshow.tube.SerialPhoto$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.SerialPhoto$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.SerialPhoto;

public class SerialPhoto$$Parcelable$a implements Parcelable$Creator	// class@001df1
{

    public void SerialPhoto$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SerialPhoto$$Parcelable(SerialPhoto$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SerialPhoto$$Parcelable[] $ParcelableA = new SerialPhoto$$Parcelable[p0];
       return $ParcelableA;
    }
}

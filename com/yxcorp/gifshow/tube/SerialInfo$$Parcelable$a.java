package com.yxcorp.gifshow.tube.SerialInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.SerialInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.SerialInfo;

public class SerialInfo$$Parcelable$a implements Parcelable$Creator	// class@001de1
{

    public void SerialInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new SerialInfo$$Parcelable(SerialInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       SerialInfo$$Parcelable[] $ParcelableA = new SerialInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

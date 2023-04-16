package com.yxcorp.gifshow.tube.StandardSerialInfo$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.yxcorp.gifshow.tube.StandardSerialInfo$$Parcelable;
import xwd.a;
import com.yxcorp.gifshow.tube.StandardSerialInfo;

public class StandardSerialInfo$$Parcelable$a implements Parcelable$Creator	// class@001df6
{

    public void StandardSerialInfo$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new StandardSerialInfo$$Parcelable(StandardSerialInfo$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       StandardSerialInfo$$Parcelable[] $ParcelableA = new StandardSerialInfo$$Parcelable[p0];
       return $ParcelableA;
    }
}

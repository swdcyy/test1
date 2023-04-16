package com.kwai.corona.startup.model.CoronaChannel$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.corona.startup.model.CoronaChannel$$Parcelable;
import xwd.a;
import com.kwai.corona.startup.model.CoronaChannel;

public class CoronaChannel$$Parcelable$a implements Parcelable$Creator	// class@000ce7
{

    public void CoronaChannel$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new CoronaChannel$$Parcelable(CoronaChannel$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       CoronaChannel$$Parcelable[] $ParcelableA = new CoronaChannel$$Parcelable[p0];
       return $ParcelableA;
    }
}
